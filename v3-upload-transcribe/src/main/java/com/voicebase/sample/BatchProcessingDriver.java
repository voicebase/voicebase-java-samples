package com.voicebase.sample;

import com.voicebase.sample.batch.BatchProcessing;
import com.voicebase.sample.batch.BatchProcessingItem;
import com.voicebase.sample.batch.CSVBatchParser;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.List;

public class BatchProcessingDriver {
    public static void main(String [] args) {
        log("Starting with args: ", String.join(" ", args));

        try {
            final CommandLineParser parser = new DefaultParser();
            final CommandLine cmd = parser.parse(OPTIONS, args);

            final String csvFile = cmd.getOptionValue(CSV_FILE);
            final String mediaFileColumn = cmd.getOptionValue(MEDIA_FILE_COLUMN);
            final String externalIdColumn = cmd.getOptionValue(EXTERNAL_ID_COLUMN);
            final String voicebaseBearerToken = cmd.getOptionValue(TOKEN);
            final String prefix = cmd.getOptionValue(PREFIX);
            final String postfix = cmd.getOptionValue(POSTFIX);

            final CSVBatchParser csvBatchParser = new CSVBatchParser(
                    csvFile, mediaFileColumn, externalIdColumn, prefix, postfix
            );

            final List<BatchProcessingItem> items = csvBatchParser.parse();

            final BatchProcessing batchProcessing = new BatchProcessing(items, voicebaseBearerToken)
                    .upload()
                    .poll()
                    .download();

        } catch (IOException ioe) {

            log(ioe.getMessage());
            System.exit( 255);
            return;

        } catch (ParseException pe) {

            log(pe.getMessage());

            new HelpFormatter().printHelp("Batch Processing Driver", OPTIONS);

            System.exit(1);
            return;
        }
    }



    protected static void log(String ...args) {
        System.out.println(String.join(" ", args));
    }

    protected static final String CSV_FILE = "csv-file";
    protected static final String MEDIA_FILE_COLUMN = "media-file-column";
    protected static final String PREFIX = "prefix";
    protected static final String POSTFIX = "postfix";
    protected static final String EXTERNAL_ID_COLUMN = "external-id-column";
    protected static final String TOKEN = "token";

    protected final static Options OPTIONS = new Options()
            .addRequiredOption("c", CSV_FILE, true, "CSV file path")
            .addRequiredOption("m", MEDIA_FILE_COLUMN, true, "media file column")
            .addRequiredOption("t", TOKEN, true, "VoiceBase Bearer Token")
            .addOption("e", EXTERNAL_ID_COLUMN, true, "external id column")
            .addOption("p", PREFIX, true, "media filename prefix")
            .addOption("P", POSTFIX, true, "media filename postfix");
}
