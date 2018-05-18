package com.voicebase.sample.batch;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.voicebase.sample.v3client.model.VbMedia;

public class ResultsWriter {
    public ResultsWriter() {
        objectMapper = new ObjectMapper();
    }

    public BatchProcessingItem writeResults(BatchProcessingItem item, VbMedia media) {
        return null;
    }

    protected ObjectMapper objectMapper;
}