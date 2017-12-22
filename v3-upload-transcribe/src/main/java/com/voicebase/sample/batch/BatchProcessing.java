package com.voicebase.sample.batch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.voicebase.sample.parallelism.ParallelOperations;
import com.voicebase.sample.v3client.helpers.ApiException;
import com.voicebase.sample.v3client.helpers.RFC3339DateFormat;
import com.voicebase.sample.v3client.VoiceBaseV3MinimalClient;
import com.voicebase.sample.v3client.VoicebaseV3MinimalClientImpl;
import com.voicebase.sample.v3client.model.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * The BatchProcessing class takes a small batch of work through the basic steps of:
 *   - upload() - upload media and metadata to VoiceBase for processing
 *   - poll() - poll for completing of the work
 *   - download() - download results
 */
public class BatchProcessing {

    public BatchProcessing(final List<BatchProcessingItem> items) {
        this(items, DEFAULT_MAX_ITERATIONS, DEFAULT_SLEEP_BETWEEN_ITERATIONS_MS);
    }

    public BatchProcessing(final List<BatchProcessingItem> items,
                           final int maxIterations,
                           final long sleepBetweenIterationsMs) {
        this.items = items;
        this.maxIterations = maxIterations;
        this.sleepBetweenIterationsMs = sleepBetweenIterationsMs;

        this.itemsToPoll = new HashSet<>(items.size());
        this.itemsToDownload = new HashSet<>(items.size());
        this.itemsCompleted = new HashSet<>(items.size());
        this.itemsFailed = new HashSet<>(items.size());

        this.configuration = ConfigurationUtil.createVbDefaultConfiguration();

        this.state = BatchState.INITIALIZED;
    }

    public BatchProcessing withCustomVocabulary(final String customVocabularyName) {
        ConfigurationUtil.addCustomVocabulary(configuration, customVocabularyName);

        return this;
    }

    public BatchProcessing withCallback(final String callbackUrl) {
        ConfigurationUtil.addCallback(configuration, callbackUrl);

        return this;
    }

    public BatchProcessing withPciRedaction(final boolean enablePciRedaction) {
        if (enablePciRedaction) {
            ConfigurationUtil.addPciRedaction(configuration);
        }

        return this;
    }

    public BatchProcessing upload()  {
        if (state != BatchState.INITIALIZED) {
            throw new IllegalStateException();
        }

        try {
            log("upload() using configuration: ", objectMapper.writeValueAsString(configuration));
        } catch (Throwable t) { }

        try {
            final List<Future<BatchProcessingState>> uploadFutures = new ArrayList<>(items.size());

            // Start all uploads in parallel (subject to the uploadItem's executor pool size

            for (BatchProcessingItem item : items) {
                log("upload() uploading filename: ", item.getFilename());
                Future<BatchProcessingState> stateFuture = parallelOperations.uploadItem(item, configuration);
                uploadFutures.add(stateFuture);
            }

            // Await all uploads to complete before proceeding

            for (Future<BatchProcessingState> future : uploadFutures) {
                BatchProcessingState state = future.get();
                log("upload() uploaded mediaId for filename: ", state.getMediaId(), state.getItem().getFilename());
                itemsToPoll.add(state);
            }

        } catch (ApiException | InterruptedException | ExecutionException e) {
            log( "Failing to due Exception:", e.toString());
            state = BatchState.FAILED;
            throw new RuntimeException(e);
        }

        state = BatchState.UPLOADED;
        return this;
    }

    public BatchProcessing poll() {
        if (state != BatchState.UPLOADED) {
            throw new IllegalStateException();
        }

        // Need a secondary collection since we cannot remove from the uploaded map while iterating through it
        final Map<BatchProcessingState, BatchProcessingState> stateChanges = new HashMap<>();

        for (int iteration = 0; (! itemsToPoll.isEmpty()) && (iteration < maxIterations); iteration++) {

            for (BatchProcessingState state : itemsToPoll) {
                try {
                    BatchProcessingState newState = pollItem(state);

                    if (newState != state) {
                        stateChanges.put(state, newState);
                    }
                } catch (ApiException ae) {
                    log("poll() caught an exception for mediaId (continuing)", state.getMediaId());
                }
            }

            // Need to do this because we cannot modify a collection while iterating through it
            for (Map.Entry<BatchProcessingState, BatchProcessingState> stateChange: stateChanges.entrySet()) {
                BatchProcessingState oldState = stateChange.getKey();
                BatchProcessingState newState = stateChange.getValue();

                itemsToPoll.remove(oldState);

                switch (newState.getMediaStatus()) {
                    case FINISHED:
                        itemsToDownload.add(newState);
                        break;
                    case FAILED:
                        itemsFailed.add(newState);
                        break;
                    default:
                        itemsToPoll.add(newState);
                }
            }

            stateChanges.clear();
        }

        // If the itemsToPoll set is not empty, that means that we exceeded attempts on at least one - fail the batch
        if (! itemsToPoll.isEmpty()) {
            state = BatchState.FAILED;
            throw new RuntimeException("Exceeded attempts to finish all work");
        }

        state = BatchState.POLLED;
        return this;
    }

    public BatchProcessing download() {
        if (state != BatchState.POLLED) {
            throw new IllegalStateException();
        }

        state = BatchState.DOWNLOADED;
        return this;
    }



    protected BatchProcessingState pollItem(BatchProcessingState initialState) throws ApiException {
        final String mediaId = initialState.getMediaId();
        final VbStatusEnum initialStatus = initialState.getMediaStatus();

        final VbMedia media = voicebase.getMediaById(mediaId);
        final VbStatusEnum currentStatus = media.getStatus();

        // Generate a new state only if the media status has changed
        return (currentStatus != initialStatus) ? initialState.withStatus(currentStatus) : initialState;
    }

    protected BatchProcessingState downloadItem(BatchProcessingState initialState) throws ApiException {
        final String mediaId = initialState.getMediaId();
        final VbMedia media = voicebase.getMediaById(mediaId);

        if (media.getStatus() != VbStatusEnum.FINISHED) {
            throw new IllegalStateException();
        }


        return null;
    }

    protected static void log(String ...args) {
        // TODO: replace with a real logger, such as SLF4J
        System.out.println(String.join(" ", args));
    }

    protected static final ObjectMapper createObjectMapper() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        objectMapper.setDateFormat(new RFC3339DateFormat());
        objectMapper.registerModule(new JavaTimeModule());

        return objectMapper;
    }

    protected enum BatchState {
      INITIALIZED, UPLOADED, POLLED, DOWNLOADED, FAILED
    }

    protected BatchState state;

    @Autowired
    protected VoiceBaseV3MinimalClient voicebase;

    @Autowired
    protected ParallelOperations parallelOperations;

    protected final List<BatchProcessingItem> items;

    protected final Set<BatchProcessingState> itemsToPoll;

    protected final Set<BatchProcessingState> itemsToDownload;

    protected final Set<BatchProcessingState> itemsCompleted;

    protected final Set<BatchProcessingState> itemsFailed;

    protected final VbConfiguration configuration;

    protected final int maxIterations;

    protected final long sleepBetweenIterationsMs;

    protected static int DEFAULT_MAX_ITERATIONS = 1000;

    protected static long DEFAULT_SLEEP_BETWEEN_ITERATIONS_MS = 5000;

    protected static final ObjectMapper objectMapper = createObjectMapper();

    protected static class ConfigurationUtil {

        public static VbConfiguration createVbDefaultConfiguration() {
            final VbConfiguration configuration = new VbConfiguration();
            final VbKnowledgeConfiguration knowledge = new VbKnowledgeConfiguration();
            knowledge.enableDiscovery(true);
            configuration.setKnowledge(knowledge);

            return configuration;
        }

        public static void addCustomVocabulary(final VbConfiguration configuration, final String customVocabularyName) {
            if (customVocabularyName != null) {
                configuration.addVocabulariesItem(
                        new VbVocabularyConfiguration()
                                .vocabularyName(customVocabularyName)
                                .scripts(null)
                                .terms(null)
                );
            }
        }

        public static void addCallback(final VbConfiguration configuration, final String callbackUrl) {
            if (callbackUrl != null) {

                final VbCallbackConfiguration callback = new VbCallbackConfiguration().url(callbackUrl).include(null);

                if (configuration.getPublish() == null) {
                    configuration.setPublish(new VbPublishConfiguration());
                }

                final VbPublishConfiguration publish = configuration.getPublish();

                if (publish.getCallbacks() == null) {
                    publish.setCallbacks(new ArrayList<>());
                }

                final List<VbCallbackConfiguration> callbacks = publish.getCallbacks();

                callbacks.add(callback);
            }
        }

        public static void addPciRedaction(final VbConfiguration configuration) {
            final VbDetectorConfiguration pciDetector = new VbDetectorConfiguration()
                    .detectorName("PCI")
                    .addParametersItem(
                            new VbParameter().parameter("detectionLevel").value("probableNumbers")
                    )
                    .redactor(
                            new VbRedactorConfiguration()
                            .transcript(new VbTranscriptRedactorConfiguration().replacement("*"))
                            .audio(new VbAudioRedactorConfiguration().tone(270).gain(0.5f))
                    );

            if (configuration.getPrediction() == null) {
                configuration.setPrediction(new VbPredictionConfiguration());
            }

            final VbPredictionConfiguration prediction = configuration.getPrediction();

            if (prediction.getDetectors() == null) {
                prediction.setDetectors(new ArrayList<>());
            }

            prediction.addDetectorsItem(pciDetector);
        }

    }

}
