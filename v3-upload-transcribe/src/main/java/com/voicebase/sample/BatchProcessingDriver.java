package com.voicebase.sample;

import com.voicebase.sample.batch.BatchProcessing;
import com.voicebase.sample.batch.BatchProcessingItem;
import com.voicebase.sample.batch.CSVBatchParser;
import com.voicebase.sample.config.ParallelExecutorConfig;
import com.voicebase.sample.config.VoiceBaseClientConfig;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
@Configuration
@Import({
        VoiceBaseClientConfig.class, ParallelExecutorConfig.class
})
public class BatchProcessingDriver implements CommandLineRunner {

    @Override
    public void run(String ...args) {
        logger.info("Starting with args: ", args);

        try {
            final CommandLineParser parser = new DefaultParser();
            final CommandLine cmd = parser.parse(OPTIONS, args);

            final String csvFile = cmd.getOptionValue(CSV_FILE);
            final String mediaFileColumn = cmd.getOptionValue(MEDIA_FILE_COLUMN);
            final String externalIdColumn = cmd.getOptionValue(EXTERNAL_ID_COLUMN);
            final String voicebaseBearerToken = cmd.getOptionValue(TOKEN);
            final String prefix = cmd.getOptionValue(PREFIX);
            final String postfix = cmd.getOptionValue(POSTFIX);
            final String customVocabulary = cmd.getOptionValue(CUSTOM_VOCABULARY);
            final String callbackUrl = cmd.getOptionValue(CALLBACK);
            final boolean enablePciRedaction = cmd.hasOption(PCI_REDACTION);

            final CSVBatchParser csvBatchParser = new CSVBatchParser(
                    csvFile, mediaFileColumn, externalIdColumn, prefix, postfix
            );

            final List<BatchProcessingItem> items = csvBatchParser.parse();

            SpringApplication.run(BatchProcessing.class, args);

            final BatchProcessing batchProcessing = new BatchProcessing(items)
                    .withCustomVocabulary(customVocabulary)
                    .withPciRedaction(enablePciRedaction)
                    .withCallback(callbackUrl)
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

    public static void main(String [] args) throws Exception {
        logger.info("Starting up...");
        SpringApplication.run(BatchProcessingDriver.class, args);
        logger.info("After start up...");
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
    protected static final String CUSTOM_VOCABULARY = "custom-vocabulary";
    protected static final String PCI_REDACTION = "pci-redaction";
    protected static final String CALLBACK = "callback";


    protected final static Options OPTIONS = new Options()
            .addRequiredOption("c", CSV_FILE, true, "CSV file path")
            .addRequiredOption("m", MEDIA_FILE_COLUMN, true, "media file column")
            .addRequiredOption("t", TOKEN, true, "VoiceBase Bearer Token")
            .addOption("e", EXTERNAL_ID_COLUMN, true, "external id column")
            .addOption("p", PREFIX, true, "media filename prefix")
            .addOption("P", POSTFIX, true, "media filename postfix")
            .addOption("V", CUSTOM_VOCABULARY, true, "name of custom vocabulary")
            .addOption("r", PCI_REDACTION, false, "enable PCI Redaction")
            .addOption("C", CALLBACK, true, "Callback url");

    protected final static Logger logger = LoggerFactory.getLogger(BatchProcessingDriver.class);
}
