package com.voicebase.sample.batch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


public class CSVBatchParser {

    public CSVBatchParser(final String csvFilename,
                          final String mediaFilenameField) {
        this(csvFilename, mediaFilenameField, null, null, null);
    }

    public CSVBatchParser(final String csvFilename,
                          final String mediaFilenameField,
                          final String externalIdField) {
        this(csvFilename, mediaFilenameField, externalIdField, null, null);
    }

    public CSVBatchParser(final String csvFilename,
                          final String filenameField,
                          final String externalIdField,
                          final String filenamePrefix,
                          final String filenamePostfix) {

        this.csvFilename = csvFilename;
        this.mediaFilenameField = filenameField;
        this.externalIdField = externalIdField;
        this.filenamePrefix = filenamePrefix;
        this.filenamePostfix = filenamePostfix;
    }

    public List<BatchProcessingItem> parse() throws IOException {
        try (
                final Reader fileReader = new FileReader(new File(csvFilename));
                final Reader reader = new BufferedReader(fileReader);
                final CSVParser csvParser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)
        ) {

            final List<CSVRecord> records = csvParser.getRecords();
            final List<BatchProcessingItem> batchProcessingItems = new ArrayList<>(records.size());

            for (CSVRecord record : records) {
                Map<String, String> row = record.toMap();

                final String mediaFilename = getMediaFilename(row);

                final String externalId = getExternalId(row);

                final BatchProcessingItem item = new BatchProcessingItemImpl(mediaFilename, externalId, row);
                batchProcessingItems.add(item);
            }

            return batchProcessingItems;
        }
    }

    protected String getMediaFilename(final Map<String, String> row) {
        if (! row.containsKey(mediaFilenameField)) {
            throw new IllegalArgumentException("Row does not contain key: " + mediaFilenameField);
        }

        final String mediaFilename = new StringBuilder()
                .append(filenamePrefix != null ? filenamePrefix : "")
                .append(row.get(mediaFilenameField))
                .append(filenamePostfix != null ? filenamePostfix : "")
                .toString();

        return mediaFilename;
    }

    protected String getExternalId(final Map<String, String> row) {
        if (externalIdField == null) {
            return null;
        }

        if (! row.containsKey(externalIdField)) {
            throw new IllegalArgumentException("Row does not contain key: " + externalIdField);
        }

        final String externalId = row.get(externalIdField);

        return externalId;
    }

    protected final String csvFilename;
    protected final String mediaFilenameField;
    protected final String externalIdField;
    protected final String filenamePrefix;
    protected final String filenamePostfix;
}
