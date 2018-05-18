package com.voicebase.sample.batch.test;

import com.voicebase.sample.batch.CSVBatchParser;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

public class BatchProcessingTest {
    @Test
    @Ignore("Re-enable to test Batch CSV parsing")
    public void testBatchUpload() throws IOException {
        final String csvPath = "example.csv";
        final String fileColumn = "filename";
        final String externalIdColumn = "external_id";
        final String prefix = "media-";
        final String postfix = ".wav";
        CSVBatchParser batchParser = new CSVBatchParser(csvPath, fileColumn, externalIdColumn, prefix, postfix);
        batchParser.parse();
    }
}
