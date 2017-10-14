package com.voicebase.sample.v3client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.voicebase.sample.v3client.model.VbConfiguration;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbMetadata;
import jersey.repackaged.com.google.common.base.Preconditions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class VoicebaseV3MinimalClientImpl implements VoiceBaseV3MinimalClient {

    public VoicebaseV3MinimalClientImpl() {
        initialize(null);
    }

    public VoicebaseV3MinimalClientImpl(String bearerToken) {
        initialize(bearerToken);
    }

    @Override
    public VbMedia getMediaById(String mediaId) throws ApiException {
        Preconditions.checkNotNull(mediaId);

        checkThatBearerTokenIsNotNull();
        return getMediaById(mediaId, null);
    }

    @Override
    public VbMedia getMediaById(String mediaId, List<String> includeAlternateFormat) throws ApiException {
        checkThatBearerTokenIsNotNull();

        try {

            final String url = VOICEBASE_V3_MEDIA_SLASH + mediaId;
            final ObjectMapper objectMapper = this.objectMapper;

            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
                HttpGet httpGet = new HttpGet(url);
                httpGet.setHeader(AUTHORIZATION, this.authorizationHeader);

                VbMedia response = httpClient.execute(httpGet, new VoiceBaseResponseHandler<>(VbMedia.class));

                /*VbMedia media = httpClient.execute(httpGet, new ResponseHandler<VbMedia>() {
                    @Override
                    public VbMedia handleResponse(HttpResponse httpResponse) throws IOException {
                        final StatusLine statusLine = httpResponse.getStatusLine();
                        if (statusLine.getStatusCode() > 300) {
                            throw new IOException(Integer.toString(statusLine.getStatusCode()));
                        }
                        final HttpEntity httpEntity = httpResponse.getEntity();
                        if (httpEntity == null) {
                            throw new IOException("Received an empty response");
                        }
                        final String responseJson = EntityUtils.toString(httpEntity);

                        return objectMapper.readValue(responseJson, VbMedia.class);
                    }
                });*/

                return response;
            }

        } catch (IOException ioe) {
            throw new ApiException(ioe);
        }
    }

    @Override
    public VbMedia postMedia(File media) throws ApiException {
        return postMedia(media, null, null, null);
    }

    @Override
    public VbMedia postMedia(File media, VbConfiguration configuration) throws ApiException {
        return postMedia(media, null, configuration, null);
    }

    @Override
    public VbMedia postMedia(File media, VbMetadata metadata) throws ApiException {
        return postMedia(media, null, null, metadata);
    }

    @Override
    public VbMedia postMedia(File media, VbConfiguration configuration, VbMetadata metadata) throws ApiException {
        return postMedia(media, null, configuration, metadata);
    }

    @Override
    public VbMedia postMedia(String mediaUrl) throws ApiException {
        return postMedia(null, mediaUrl, null, null);
    }

    @Override
    public VbMedia postMedia(String mediaUrl, VbConfiguration configuration) throws ApiException {
        return postMedia(null, mediaUrl, configuration, null);
    }

    @Override
    public VbMedia postMedia(String mediaUrl, VbMetadata metadata) throws ApiException {
        return postMedia(null, mediaUrl, null, metadata);
    }

    @Override
    public VbMedia postMedia(String mediaUrl, VbConfiguration configuration, VbMetadata metadata) throws ApiException {
        return postMedia(null, mediaUrl, configuration, metadata);
    }

    /**
     * This method provides a common POST /media, whether by Url or attachment.
     * @param media
     * @param mediaUrl
     * @param configuration
     * @param metadata
     * @return a VbMedia response entity
     * @throws ApiException
     */
    public VbMedia postMedia(File media, String mediaUrl, VbConfiguration configuration, VbMetadata metadata) throws ApiException {
        Preconditions.checkArgument(
                (media != null || mediaUrl != null) && ! (media != null && mediaUrl != null),
                "Exactly one of media and mediaUrl must not be null"
        );
        checkThatBearerTokenIsNotNull();

        final String url = VOICEBASE_V3_MEDIA;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader(AUTHORIZATION, this.authorizationHeader);

            MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();

            if (mediaUrl != null) {
                entityBuilder.addTextBody(MEDIA_URL, mediaUrl);
            }
            if (media != null) {
                entityBuilder.addBinaryBody(MEDIA, media);
            }
            if (configuration != null) {
                entityBuilder.addTextBody(CONFIGURATION, objectMapper.writeValueAsString(configuration));
            }
            if (metadata != null) {
                entityBuilder.addTextBody(METADATA, objectMapper.writeValueAsString(metadata));
            }

            httpPost.setEntity(entityBuilder.build());

            VbMedia response = httpClient.execute(httpPost, new VoiceBaseResponseHandler<>(VbMedia.class));

            return response;

        } catch (IOException ioe) {
            throw new ApiException(ioe);
        }
    }

    @Override
    public String getBearerToken() {

        return this.bearerToken;
    }

    @Override
    public void setBearerToken(String bearerToken) {
        Preconditions.checkNotNull(bearerToken);
        Preconditions.checkArgument(! bearerToken.isEmpty(), "Bearer token cannot be empty");

        this.bearerToken = bearerToken;
        this.authorizationHeader = new StringBuilder(BEARER).append(SPACE).append(bearerToken).toString();
    }

    protected void checkThatBearerTokenIsNotNull() {
        Preconditions.checkState(this.authorizationHeader != null, "Bearer token must be set");
    }

    protected void initialize(final String bearerToken) {
        if (bearerToken != null) { setBearerToken(bearerToken); }

        this.objectMapper = new ObjectMapper();
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        this.objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        this.objectMapper.setDateFormat(new RFC3339DateFormat());
        this.objectMapper.registerModule(new JavaTimeModule());

    }

    protected String bearerToken;

    protected String authorizationHeader;

    protected ObjectMapper objectMapper;

    protected class VoiceBaseResponseHandler<T> implements ResponseHandler<T> {

        public VoiceBaseResponseHandler(Class<T> clazz) {
            this.clazz = clazz;
        }

        @Override
        public T handleResponse(HttpResponse httpResponse) throws IOException {

            final StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine.getStatusCode() > 300) {
                throw new IOException(Integer.toString(statusLine.getStatusCode()));
            }

            final HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity == null) {
                throw new IOException("Received an empty response");
            }

            // For production usage, consider streaming the data into Jackson rather than via String
            final String responseJson = EntityUtils.toString(httpEntity);

            final T result = objectMapper.readValue(responseJson, clazz);

            return result;
        }

        protected Class<T> clazz;

    }

    protected final static String AUTHORIZATION = "Authorization";

    protected final static String BEARER = "Bearer";

    protected final static String CONFIGURATION = "configuration";

    protected final static String MEDIA = "media";

    protected final static String MEDIA_URL = "mediaUrl";

    protected final static String METADATA = "metadata";

    protected final static String SPACE = " ";

    protected final static String SLASH = "/";

    protected final static String VOICEBASE_V3_ENDPOINT = "https://apis.voicebase.com/v3";

    protected final static String VOICEBASE_V3_MEDIA = VOICEBASE_V3_ENDPOINT + "/media";

    protected final static String VOICEBASE_V3_MEDIA_SLASH = VOICEBASE_V3_MEDIA + SLASH;


}
