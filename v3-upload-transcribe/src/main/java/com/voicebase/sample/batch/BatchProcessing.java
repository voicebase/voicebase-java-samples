package com.voicebase.sample.batch;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sample.v3client.VoiceBaseV3MinimalClient;
import com.voicebase.sample.v3client.VoicebaseV3MinimalClientImpl;
import com.voicebase.sample.v3client.model.*;

import java.io.File;
import java.util.*;

/**
 * The BatchProcessing class takes a small batch of work through the basic steps of:
 *   - upload() - upload media and metadata to VoiceBase for processing
 *   - poll() - poll for completing of the work
 *   - download() - download results
 */
public class BatchProcessing {

    public BatchProcessing(final List<BatchProcessingItem> items, final String voicebaseBearerToken) {
        this(items, voicebaseBearerToken, DEFAULT_MAX_ITERATIONS, DEFAULT_SLEEP_BETWEEN_ITERATIONS_MS);
    }

    public BatchProcessing(final List<BatchProcessingItem> items,
                           final String voicebaseBearerToken,
                           final int maxIterations,
                           final long sleepBetweenIterationsMs) {
        this.items = items;
        this.voicebaseBearerToken = voicebaseBearerToken;
        this.maxIterations = maxIterations;
        this.sleepBetweenIterationsMs = sleepBetweenIterationsMs;

        this.uploadedItemsByMediaId = new HashMap<>(items.size());
        this.polledItemsByMediaId = new HashMap<>(items.size());

        this.voicebase = new VoicebaseV3MinimalClientImpl(voicebaseBearerToken);

        this.state = BatchProcessingState.INITIALIZED;
    }

    public BatchProcessing upload()  {
        if (state != BatchProcessingState.INITIALIZED) {
            throw new IllegalStateException();
        }

        try {
            for (BatchProcessingItem item : items) {
                log("upload() uploading filename: ", item.getFilename());
                String mediaId = uploadItem(item);
                log("upload() uploaded mediaId for filename: ", mediaId, item.getFilename());
                uploadedItemsByMediaId.put(mediaId, item);
            }
        } catch (ApiException ae) {
            state = BatchProcessingState.FAILED;
            throw new RuntimeException(ae);
        }

        state = BatchProcessingState.UPLOADED;
        return this;
    }

    public BatchProcessing poll() {
        if (state != BatchProcessingState.UPLOADED) {
            throw new IllegalStateException();
        }

        // Need a secondary collection since we cannot remove from the uploaded map while iterating through it
        final Set<String> completedMediaId = new HashSet<>();
        for (int iteration = 0; (! uploadedItemsByMediaId.isEmpty()) && (iteration < maxIterations); iteration++) {

            for (Map.Entry<String, BatchProcessingItem> entry : uploadedItemsByMediaId.entrySet()) {
                String mediaId = entry.getKey();
                BatchProcessingItem item = entry.getValue();
                if (pollItem(mediaId)) {
                    completedMediaId.add(mediaId);
                    polledItemsByMediaId.put(mediaId, item);
                }
            }

            for (String mediaId: completedMediaId) {
                polledItemsByMediaId.remove(mediaId);
            }

            completedMediaId.clear();
        }

        if (! uploadedItemsByMediaId.isEmpty()) {
            state = BatchProcessingState.FAILED;
            throw new RuntimeException("Exceeded attempts to finish all work");
        }

        state = BatchProcessingState.POLLED;
        return this;
    }

    public BatchProcessing download() {
        if (state != BatchProcessingState.POLLED) {
            throw new IllegalStateException();
        }

        state = BatchProcessingState.DOWNLOADED;
        return this;
    }

    protected String uploadItem(BatchProcessingItem item) throws ApiException {
        final File mediaFile = new File(item.getFilename());

        final VbMetadata metadata = new VbMetadata();
        final String externalId = item.getExternalId();
        final Map<String, String> metadataAttributes = item.getMetadataAttributes();

        if (externalId != null) {
            metadata.externalId(externalId);
        }

        metadata.extended(Collections.unmodifiableMap(metadataAttributes));

        final VbMedia media = voicebase.postMedia(mediaFile, DEFAULT_CONFIGURATION, metadata);
        log("uploadItem() media = ", media.toString());
        return media.getMediaId();
    }

    protected boolean pollItem(String mediaId) {
        return false;
    }

    protected String downloadItem(BatchProcessingItem item) {
        return null;
    }

    protected static void log(String ...args) {
        // TODO: replace with a real logger, such as SLF4J
        System.out.println(String.join(" ", args));
    }

    protected static VbConfiguration createVbDefaultConfiguration() {
        final VbConfiguration configuration = new VbConfiguration();
        final VbKnowledgeConfiguration knowledge = new VbKnowledgeConfiguration();
        knowledge.enableDiscovery(true);
        configuration.setKnowledge(knowledge);

        return configuration;
    }

    protected enum BatchProcessingState {
      INITIALIZED, UPLOADED, POLLED, DOWNLOADED, FAILED
    }

    protected BatchProcessingState state;

    protected final VoiceBaseV3MinimalClient voicebase;

    protected final List<BatchProcessingItem> items;

    protected final Map<String, BatchProcessingItem> uploadedItemsByMediaId;

    protected final Map<String, BatchProcessingItem> polledItemsByMediaId;

    protected final String voicebaseBearerToken;

    protected final int maxIterations;

    protected final long sleepBetweenIterationsMs;



    protected static VbConfiguration DEFAULT_CONFIGURATION = createVbDefaultConfiguration();

    protected static int DEFAULT_MAX_ITERATIONS = 1000;

    protected static long DEFAULT_SLEEP_BETWEEN_ITERATIONS_MS = 5000;
}
