package com.voicebase.sample.parallelism;

import com.voicebase.sample.batch.BatchProcessingItem;
import com.voicebase.sample.batch.BatchProcessingState;
import com.voicebase.sample.batch.BatchProcessingStateImpl;
import com.voicebase.sample.v3client.helpers.ApiException;
import com.voicebase.sample.v3client.VoiceBaseV3MinimalClient;
import com.voicebase.sample.v3client.model.VbConfiguration;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Future;

public class ParallelOperations {

    @Async("uploadTaskExecutor")
    public Future<BatchProcessingState> uploadItem(
            final BatchProcessingItem item,
            VbConfiguration configuration) throws ApiException {

        final File mediaFile = new File(item.getFilename());

        final VbMetadata metadata = new VbMetadata();
        final String externalId = item.getExternalId();
        final Map<String, String> metadataAttributes = item.getMetadataAttributes();

        if (externalId != null) {
            metadata.externalId(externalId);
        }

        metadata.extended(Collections.unmodifiableMap(metadataAttributes));

        logger.info("uploadItem() uploading filename = '{}', externalId = '{}'", item.getFilename(), externalId);

        final VbMedia media = voicebase.postMedia(mediaFile, configuration, metadata);
        logger.info("uploadItem() media = {}", media.toString());

        return new AsyncResult<>(
                new BatchProcessingStateImpl(item, media.getMediaId(), media.getStatus())
        );
    }

    @Autowired
    @Qualifier("voicebase")
    VoiceBaseV3MinimalClient voicebase;

    final static Logger logger = LoggerFactory.getLogger(ParallelOperations.class);
}
