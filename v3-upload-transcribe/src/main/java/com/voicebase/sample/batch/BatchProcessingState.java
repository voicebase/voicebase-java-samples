package com.voicebase.sample.batch;

import com.voicebase.sample.v3client.model.VbStatusEnum;

public interface BatchProcessingState {
    BatchProcessingState withMediaId(final String mediaId);
    BatchProcessingState withStatus(final VbStatusEnum status);
    BatchProcessingState withResultsPath(final String resultsPath);
    BatchProcessingState withMediaIdAndStatus(final String mediaId, final VbStatusEnum status);
    BatchProcessingState withStatusAndResultsPath(final VbStatusEnum status, final String resultsPath);

    String getMediaId();
    VbStatusEnum getMediaStatus();
    BatchProcessingItem getItem();
}
