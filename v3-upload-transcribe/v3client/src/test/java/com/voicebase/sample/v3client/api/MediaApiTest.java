/*
 * Voicebase V3 API
 * APIs for speech recognition and speech analytics, powering insights every business needs.
 *
 * OpenAPI spec version: 3.0.1
 * Contact: support@voicebase.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.voicebase.sample.v3client.api;

import com.voicebase.sample.v3client.ApiException;
import java.io.File;
import java.time.OffsetDateTime;
import com.voicebase.sample.v3client.model.VbErrorResponse;
import com.voicebase.sample.v3client.model.VbJob;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbMediaQueryResponse;
import com.voicebase.sample.v3client.model.VbMetadata;
import com.voicebase.sample.v3client.model.VbStream;
import com.voicebase.sample.v3client.model.VbStreams;
import com.voicebase.sample.v3client.model.VbTranscript;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for MediaApi
 */
@Ignore
public class MediaApiTest {

    private final MediaApi api = new MediaApi();

    
    /**
     * Delete a media, transcripts and analytics results
     *
     * Delete this media
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMediaByIdTest() throws ApiException {
        String mediaId = null;
        api.deleteMediaById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve transcript and analytical results from a media record
     *
     * Retrieve analytical results from a previously uploaded media
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMediaByIdTest() throws ApiException {
        String mediaId = null;
        java.util.List<String> includeAlternateFormat = null;
        VbMedia response = api.getMediaById(mediaId, includeAlternateFormat);

        // TODO: test validations
    }
    
    /**
     * Retrieve metadata associated with a media record
     *
     * Retrieve the media metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataByIdTest() throws ApiException {
        String mediaId = null;
        VbMetadata response = api.getMetadataById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve processing progress
     *
     * Retrieve processing progress for a given media
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProgressByIdTest() throws ApiException {
        String mediaId = null;
        VbJob response = api.getProgressById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Downloads the media identified by the stream name
     *
     * Returns a redirect to the named media stream
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamByMediaIdAndNameTest() throws ApiException {
        String mediaId = null;
        String streamName = null;
        VbStream response = api.getStreamByMediaIdAndName(mediaId, streamName);

        // TODO: test validations
    }
    
    /**
     * List streams
     *
     * Get list of available media URLs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStreamsByIdTest() throws ApiException {
        String mediaId = null;
        VbStreams response = api.getStreamsById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve DFXP transcript
     *
     * Retrieve the transcript from a given media in DFXP format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubtitleDfxpByIdTest() throws ApiException {
        String mediaId = null;
        String response = api.getSubtitleDfxpById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve WEBVTT transcript
     *
     * Retrieve the transcript from a given media in WEBVTT format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubtitleWebVttByIdTest() throws ApiException {
        String mediaId = null;
        String response = api.getSubtitleWebVttById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve SRT transcript
     *
     * Retrieve the transcript from a given media in SRT (subtitles) format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubtitlesByIdTest() throws ApiException {
        String mediaId = null;
        String response = api.getSubtitlesById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve text transcript
     *
     * Retrieve the transcript from a given media in plain text format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTextByIdTest() throws ApiException {
        String mediaId = null;
        String response = api.getTextById(mediaId);

        // TODO: test validations
    }
    
    /**
     * Retrieve transcript
     *
     * Retrieve the transcript from a given media
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTranscriptTest() throws ApiException {
        String mediaId = null;
        java.util.List<String> includeAlternateFormat = null;
        VbTranscript response = api.getTranscript(mediaId, includeAlternateFormat);

        // TODO: test validations
    }
    
    /**
     * List media records
     *
     * Retrieve a list of media previously uploaded that match a criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mediaQueryTest() throws ApiException {
        String query = null;
        String externalId = null;
        String before = null;
        String after = null;
        java.util.List<String> extendedFilter = null;
        OffsetDateTime onOrAfterDate = null;
        OffsetDateTime onOrBeforeDate = null;
        String sortOrder = null;
        Integer limit = null;
        VbMediaQueryResponse response = api.mediaQuery(query, externalId, before, after, extendedFilter, onOrAfterDate, onOrBeforeDate, sortOrder, limit);

        // TODO: test validations
    }
    
    /**
     * Upload a media file for transcription and analysis
     *
     * Upload new new media to the service as an attachment or from a url
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMediaTest() throws ApiException {
        File media = null;
        String mediaUrl = null;
        String _configuration = null;
        String metadata = null;
        String transcript = null;
        VbMedia response = api.postMedia(media, mediaUrl, _configuration, metadata, transcript);

        // TODO: test validations
    }
    
    /**
     * Align a transcript and re-run the job
     *
     * Upload a transcript to the service as an attachment for alignment and re-running of the job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postMediaByIdTest() throws ApiException {
        String mediaId = null;
        String _configuration = null;
        String metadata = null;
        String transcript = null;
        VbMedia response = api.postMediaById(mediaId, _configuration, metadata, transcript);

        // TODO: test validations
    }
    
    /**
     * Update media metadata
     *
     * Set or update the media metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setMetadataByIdTest() throws ApiException {
        String mediaId = null;
        VbMetadata metadata = null;
        VbMetadata response = api.setMetadataById(mediaId, metadata);

        // TODO: test validations
    }
    
}
