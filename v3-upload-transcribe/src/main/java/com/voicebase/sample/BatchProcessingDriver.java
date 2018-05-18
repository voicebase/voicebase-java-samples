package com.voicebase.sample;

import com.voicebase.sample.batch.BatchProcessing;
import com.voicebase.sample.batch.BatchProcessingItem;
import com.voicebase.sample.batch.CSVBatchParser;
import com.voicebase.sample.parallelism.ParallelOperations;
import com.voicebase.sample.v3client.VoiceBaseV3MinimalClient;
import com.voicebase.sample.v3client.VoicebaseV3MinimalClientImpl;
import org.apache.commons.cli.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@SpringBootApplication
@Configuration
public class BatchProcessingDriver implements CommandLineRunner, ApplicationContextAware {

    @Bean(name = "uploadTaskExecutor")
    public Executor uploadTaskExecutor() {
        return new ConcurrentTaskExecutor(
                Executors.newFixedThreadPool(4)
        );
    }

    @Bean(name = "pollTaskExecutor")
    public Executor pollTaskExecutor() {
        return new ConcurrentTaskExecutor(
                Executors.newFixedThreadPool(4)
        );
    }

    @Bean(name = "parallelOperations")
    public ParallelOperations parallelOperations() {
        return new ParallelOperations();
    }

    @Bean(name = "voicebase")
    public VoiceBaseV3MinimalClient voicebase(@Value("${token}") final String voicebaseBearerToken) {
        logger.info("Initializing client with token={}", voicebaseBearerToken);
        return new VoicebaseV3MinimalClientImpl(voicebaseBearerToken);
    }

    @Bean(name = "batchProcessing")
    public BatchProcessing batchProcessing() {
        return new BatchProcessing();
    }

    @Override
    public void run(String ...args) {

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

            batchProcessing()
                    .withItems(items)
                    .withCustomVocabulary(customVocabulary)
                    .withPciRedaction(enablePciRedaction)
                    .withCallback(callbackUrl)
                    .upload()
                    .poll()
                    .download();

            logger.info("Batch processing flow completed. Exiting Spring application (exit code 0)...");

            SpringApplication.exit(applicationContext, (ExitCodeGenerator) () -> 0);


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

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    protected ApplicationContext applicationContext;

    public static void main(String [] args) throws Exception {
        logger.info("Starting up... {}", String.join(", ", args));
        SpringApplication.run(BatchProcessingDriver.class, args);
        logger.info("Exited Spring application... exiting main()");
        System.exit(0);
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
