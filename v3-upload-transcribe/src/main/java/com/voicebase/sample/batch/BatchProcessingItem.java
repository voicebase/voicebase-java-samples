package com.voicebase.sample.batch;

import java.util.Map;

public interface BatchProcessingItem {
    public String getFilename();
    public String getExternalId();
    public Map<String, String> getMetadataAttributes();
}
