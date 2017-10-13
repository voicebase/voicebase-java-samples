package com.voicebase.sample.v3client.api;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sample.v3client.ApiClient;
import com.voicebase.sample.v3client.Configuration;
import com.voicebase.sample.v3client.Pair;

import javax.ws.rs.core.GenericType;

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


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class MediaApi {
  private ApiClient apiClient;

  public MediaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MediaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete a media, transcripts and analytics results
   * Delete this media
   * @param mediaId Media identifier, a UUID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteMediaById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling deleteMediaById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieve transcript and analytical results from a media record
   * Retrieve analytical results from a previously uploaded media
   * @param mediaId Media identifier, a UUID. (required)
   * @param includeAlternateFormat Set of alternate formats to include in the response (optional)
   * @return VbMedia
   * @throws ApiException if fails to make API call
   */
  public VbMedia getMediaById(String mediaId, java.util.List<String> includeAlternateFormat) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getMediaById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "includeAlternateFormat", includeAlternateFormat));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbMedia> localVarReturnType = new GenericType<VbMedia>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve metadata associated with a media record
   * Retrieve the media metadata
   * @param mediaId Media identifier, a UUID. (required)
   * @return VbMetadata
   * @throws ApiException if fails to make API call
   */
  public VbMetadata getMetadataById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getMetadataById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/metadata".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbMetadata> localVarReturnType = new GenericType<VbMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve processing progress
   * Retrieve processing progress for a given media
   * @param mediaId Media identifier, a UUID. (required)
   * @return VbJob
   * @throws ApiException if fails to make API call
   */
  public VbJob getProgressById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getProgressById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/progress".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbJob> localVarReturnType = new GenericType<VbJob>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Downloads the media identified by the stream name
   * Returns a redirect to the named media stream
   * @param mediaId Media identifier, a UUID. (required)
   * @param streamName A stream name (required)
   * @return VbStream
   * @throws ApiException if fails to make API call
   */
  public VbStream getStreamByMediaIdAndName(String mediaId, String streamName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getStreamByMediaIdAndName");
    }
    
    // verify the required parameter 'streamName' is set
    if (streamName == null) {
      throw new ApiException(400, "Missing the required parameter 'streamName' when calling getStreamByMediaIdAndName");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/streams/{streamName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()))
      .replaceAll("\\{" + "streamName" + "\\}", apiClient.escapeString(streamName.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbStream> localVarReturnType = new GenericType<VbStream>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List streams
   * Get list of available media URLs
   * @param mediaId Media identifier, a UUID. (required)
   * @return VbStreams
   * @throws ApiException if fails to make API call
   */
  public VbStreams getStreamsById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getStreamsById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/streams".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbStreams> localVarReturnType = new GenericType<VbStreams>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve DFXP transcript
   * Retrieve the transcript from a given media in DFXP format
   * @param mediaId Media identifier, a UUID. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getSubtitleDfxpById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getSubtitleDfxpById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/transcript/dfxp".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/ttml+xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve WEBVTT transcript
   * Retrieve the transcript from a given media in WEBVTT format
   * @param mediaId Media identifier, a UUID. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getSubtitleWebVttById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getSubtitleWebVttById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/transcript/webvtt".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/vtt"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve SRT transcript
   * Retrieve the transcript from a given media in SRT (subtitles) format
   * @param mediaId Media identifier, a UUID. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getSubtitlesById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getSubtitlesById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/transcript/srt".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/srt"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve text transcript
   * Retrieve the transcript from a given media in plain text format
   * @param mediaId Media identifier, a UUID. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String getTextById(String mediaId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getTextById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/transcript/text".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve transcript
   * Retrieve the transcript from a given media
   * @param mediaId Get media by Id. (required)
   * @param includeAlternateFormat Set of alternate formats to include in the response (optional)
   * @return VbTranscript
   * @throws ApiException if fails to make API call
   */
  public VbTranscript getTranscript(String mediaId, java.util.List<String> includeAlternateFormat) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling getTranscript");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/transcript".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "includeAlternateFormat", includeAlternateFormat));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbTranscript> localVarReturnType = new GenericType<VbTranscript>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List media records
   * Retrieve a list of media previously uploaded that match a criteria
   * @param query The full text search (optional)
   * @param externalId Media tagged with externalId in the metadata. (optional)
   * @param before Find media created before this mediaId (optional)
   * @param after Find media created after this mediaId (optional)
   * @param extendedFilter A special filter which is of the form &#39;extendedFilter&#x3D;Name;Value&#39; which allows you to filter by extended metadata. (optional)
   * @param onOrAfterDate Media created on or after date. (optional)
   * @param onOrBeforeDate Media created on or before date. (optional)
   * @param sortOrder Sort order. (optional)
   * @param limit Control the number of values returned. (optional)
   * @return VbMediaQueryResponse
   * @throws ApiException if fails to make API call
   */
  public VbMediaQueryResponse mediaQuery(String query, String externalId, String before, String after, java.util.List<String> extendedFilter, OffsetDateTime onOrAfterDate, OffsetDateTime onOrBeforeDate, String sortOrder, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/media".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalId", externalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "extendedFilter", extendedFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onOrAfterDate", onOrAfterDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onOrBeforeDate", onOrBeforeDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbMediaQueryResponse> localVarReturnType = new GenericType<VbMediaQueryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Upload a media file for transcription and analysis
   * Upload new new media to the service as an attachment or from a url
   * @param media Media file attached to the request. (optional)
   * @param mediaUrl URL where media file can be downloaded. (optional)
   * @param _configuration A JSON object with configuration options. (optional)
   * @param metadata Metadata about the file being posted. (optional)
   * @param transcript A transcript (optional)
   * @return VbMedia
   * @throws ApiException if fails to make API call
   */
  public VbMedia postMedia(File media, String mediaUrl, String _configuration, String metadata, String transcript) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/media".replaceAll("\\{format\\}","json");

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    if (media != null)
      localVarFormParams.put("media", media);
if (mediaUrl != null)
      localVarFormParams.put("mediaUrl", mediaUrl);
if (_configuration != null)
      localVarFormParams.put("configuration", _configuration);
if (metadata != null)
      localVarFormParams.put("metadata", metadata);
if (transcript != null)
      localVarFormParams.put("transcript", transcript);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data", "multipart/mixed"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbMedia> localVarReturnType = new GenericType<VbMedia>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Align a transcript and re-run the job
   * Upload a transcript to the service as an attachment for alignment and re-running of the job
   * @param mediaId A JSON object with configuration options. (required)
   * @param _configuration A JSON object with configuration options. (optional)
   * @param metadata Metadata about the file being posted. (optional)
   * @param transcript A transcript (optional)
   * @return VbMedia
   * @throws ApiException if fails to make API call
   */
  public VbMedia postMediaById(String mediaId, String _configuration, String metadata, String transcript) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling postMediaById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    if (_configuration != null)
      localVarFormParams.put("configuration", _configuration);
if (metadata != null)
      localVarFormParams.put("metadata", metadata);
if (transcript != null)
      localVarFormParams.put("transcript", transcript);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data", "multipart/mixed"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbMedia> localVarReturnType = new GenericType<VbMedia>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update media metadata
   * Set or update the media metadata
   * @param mediaId Get media by Id. (required)
   * @param metadata metadata. (required)
   * @return VbMetadata
   * @throws ApiException if fails to make API call
   */
  public VbMetadata setMetadataById(String mediaId, VbMetadata metadata) throws ApiException {
    Object localVarPostBody = metadata;
    
    // verify the required parameter 'mediaId' is set
    if (mediaId == null) {
      throw new ApiException(400, "Missing the required parameter 'mediaId' when calling setMetadataById");
    }
    
    // verify the required parameter 'metadata' is set
    if (metadata == null) {
      throw new ApiException(400, "Missing the required parameter 'metadata' when calling setMetadataById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/media/{mediaId}/metadata".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mediaId" + "\\}", apiClient.escapeString(mediaId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Authorization" };

    GenericType<VbMetadata> localVarReturnType = new GenericType<VbMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
