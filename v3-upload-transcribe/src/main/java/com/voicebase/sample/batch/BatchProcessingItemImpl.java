package com.voicebase.sample.batch;

import java.util.Map;

public class BatchProcessingItemImpl implements BatchProcessingItem {

    public BatchProcessingItemImpl(final String filename) {
        this(filename, null, null);
    }

    public BatchProcessingItemImpl(final String filename, final String externalId) {
        this(filename, externalId, null);
    }

    public BatchProcessingItemImpl(final String filename, final Map<String, String> metadataAttributes) {
        this(filename, null, metadataAttributes);
    }

    public BatchProcessingItemImpl(final String filename,
                                   final String externalId,
                                   final Map<String, String> metadataAttributes) {
        this.filename = filename;
        this.externalId = externalId;
        this.metadataAttributes = metadataAttributes;
    }


    @Override
    public String getFilename() {
        return filename;
    }

    @Override
    public String getExternalId() {
        return externalId;
    }

    @Override
    public Map<String, String> getMetadataAttributes() {
        return metadataAttributes;
    }

    protected final String filename;

    protected final String externalId;

    protected final Map<String, String> metadataAttributes;
}
