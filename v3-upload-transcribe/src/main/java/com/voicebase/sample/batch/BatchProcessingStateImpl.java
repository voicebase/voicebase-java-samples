package com.voicebase.sample.batch;

import com.voicebase.sample.v3client.model.VbStatusEnum;

public class BatchProcessingStateImpl implements BatchProcessingState {

    public BatchProcessingStateImpl(final BatchProcessingItem item) {
        this(item, null, null, null);
    }

    public BatchProcessingStateImpl(final BatchProcessingItem item, final String mediaId) {
        this(item, mediaId, null, null);
    }

    public BatchProcessingStateImpl(final BatchProcessingItem item, final VbStatusEnum status) {
        this(item, null, status, null);
    }

    public BatchProcessingStateImpl(final BatchProcessingItem item, final VbStatusEnum status, final String resultsPath) {
        this(item, null, status, resultsPath);
    }

    public BatchProcessingStateImpl(final BatchProcessingItem item, final String mediaId, final VbStatusEnum status) {
        this(item, mediaId, status, null);
    }

    public BatchProcessingStateImpl(final BatchProcessingItem item, final String mediaId, final VbStatusEnum status, final String resultsPath) {
        this.item = item;
        this.mediaId = mediaId;
        this.status = status;
        this.resultsPath = resultsPath;
    }


    @Override
    public BatchProcessingState withMediaId(String newMediaId) {
        return new BatchProcessingStateImpl(item, newMediaId, status, resultsPath);
    }

    @Override
    public BatchProcessingState withStatus(VbStatusEnum newStatus) {
        return new BatchProcessingStateImpl(item, mediaId, newStatus, resultsPath);
    }

    @Override
    public BatchProcessingState withResultsPath(String newResultsPath) {
        return new BatchProcessingStateImpl(item, mediaId, status, newResultsPath);
    }

    @Override
    public BatchProcessingState withMediaIdAndStatus(String newMediaId, VbStatusEnum newStatus) {
        return new BatchProcessingStateImpl(item, newMediaId, newStatus, resultsPath);
    }

    @Override
    public BatchProcessingState withStatusAndResultsPath(VbStatusEnum newStatus, String newResultsPath) {
        return new BatchProcessingStateImpl(item, mediaId, newStatus, newResultsPath);
    }

    @Override
    public String getMediaId() {
        return mediaId;
    }

    @Override
    public VbStatusEnum getMediaStatus() {
        return status;
    }

    @Override
    public BatchProcessingItem getItem() {
        return item;
    }

    protected final BatchProcessingItem item;
    protected final String mediaId;
    protected final VbStatusEnum status;
    protected final String resultsPath;


}
