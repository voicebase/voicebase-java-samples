# MediaApi

All URIs are relative to *https://apis.voicebase.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMediaById**](MediaApi.md#deleteMediaById) | **DELETE** /v3/media/{mediaId} | Delete a media, transcripts and analytics results
[**getMediaById**](MediaApi.md#getMediaById) | **GET** /v3/media/{mediaId} | Retrieve transcript and analytical results from a media record
[**getMetadataById**](MediaApi.md#getMetadataById) | **GET** /v3/media/{mediaId}/metadata | Retrieve metadata associated with a media record
[**getProgressById**](MediaApi.md#getProgressById) | **GET** /v3/media/{mediaId}/progress | Retrieve processing progress
[**getStreamByMediaIdAndName**](MediaApi.md#getStreamByMediaIdAndName) | **GET** /v3/media/{mediaId}/streams/{streamName} | Downloads the media identified by the stream name
[**getStreamsById**](MediaApi.md#getStreamsById) | **GET** /v3/media/{mediaId}/streams | List streams
[**getSubtitleDfxpById**](MediaApi.md#getSubtitleDfxpById) | **GET** /v3/media/{mediaId}/transcript/dfxp | Retrieve DFXP transcript
[**getSubtitleWebVttById**](MediaApi.md#getSubtitleWebVttById) | **GET** /v3/media/{mediaId}/transcript/webvtt | Retrieve WEBVTT transcript
[**getSubtitlesById**](MediaApi.md#getSubtitlesById) | **GET** /v3/media/{mediaId}/transcript/srt | Retrieve SRT transcript
[**getTextById**](MediaApi.md#getTextById) | **GET** /v3/media/{mediaId}/transcript/text | Retrieve text transcript
[**getTranscript**](MediaApi.md#getTranscript) | **GET** /v3/media/{mediaId}/transcript | Retrieve transcript
[**mediaQuery**](MediaApi.md#mediaQuery) | **GET** /v3/media | List media records
[**postMedia**](MediaApi.md#postMedia) | **POST** /v3/media | Upload a media file for transcription and analysis
[**postMediaById**](MediaApi.md#postMediaById) | **POST** /v3/media/{mediaId} | Align a transcript and re-run the job
[**setMetadataById**](MediaApi.md#setMetadataById) | **PUT** /v3/media/{mediaId}/metadata | Update media metadata


<a name="deleteMediaById"></a>
# **deleteMediaById**
> deleteMediaById(mediaId)

Delete a media, transcripts and analytics results

Delete this media

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    apiInstance.deleteMediaById(mediaId);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#deleteMediaById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMediaById"></a>
# **getMediaById**
> VbMedia getMediaById(mediaId, includeAlternateFormat)

Retrieve transcript and analytical results from a media record

Retrieve analytical results from a previously uploaded media

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
java.util.List<String> includeAlternateFormat = Arrays.asList("includeAlternateFormat_example"); // java.util.List<String> | Set of alternate formats to include in the response
try {
    VbMedia result = apiInstance.getMediaById(mediaId, includeAlternateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getMediaById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |
 **includeAlternateFormat** | [**java.util.List&lt;String&gt;**](String.md)| Set of alternate formats to include in the response | [optional]

### Return type

[**VbMedia**](VbMedia.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataById"></a>
# **getMetadataById**
> VbMetadata getMetadataById(mediaId)

Retrieve metadata associated with a media record

Retrieve the media metadata

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    VbMetadata result = apiInstance.getMetadataById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getMetadataById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

[**VbMetadata**](VbMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProgressById"></a>
# **getProgressById**
> VbJob getProgressById(mediaId)

Retrieve processing progress

Retrieve processing progress for a given media

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    VbJob result = apiInstance.getProgressById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getProgressById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

[**VbJob**](VbJob.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStreamByMediaIdAndName"></a>
# **getStreamByMediaIdAndName**
> VbStream getStreamByMediaIdAndName(mediaId, streamName)

Downloads the media identified by the stream name

Returns a redirect to the named media stream

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
String streamName = "streamName_example"; // String | A stream name
try {
    VbStream result = apiInstance.getStreamByMediaIdAndName(mediaId, streamName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getStreamByMediaIdAndName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |
 **streamName** | **String**| A stream name |

### Return type

[**VbStream**](VbStream.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStreamsById"></a>
# **getStreamsById**
> VbStreams getStreamsById(mediaId)

List streams

Get list of available media URLs

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    VbStreams result = apiInstance.getStreamsById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getStreamsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

[**VbStreams**](VbStreams.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubtitleDfxpById"></a>
# **getSubtitleDfxpById**
> String getSubtitleDfxpById(mediaId)

Retrieve DFXP transcript

Retrieve the transcript from a given media in DFXP format

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    String result = apiInstance.getSubtitleDfxpById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getSubtitleDfxpById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ttml+xml

<a name="getSubtitleWebVttById"></a>
# **getSubtitleWebVttById**
> String getSubtitleWebVttById(mediaId)

Retrieve WEBVTT transcript

Retrieve the transcript from a given media in WEBVTT format

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    String result = apiInstance.getSubtitleWebVttById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getSubtitleWebVttById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/vtt

<a name="getSubtitlesById"></a>
# **getSubtitlesById**
> String getSubtitlesById(mediaId)

Retrieve SRT transcript

Retrieve the transcript from a given media in SRT (subtitles) format

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    String result = apiInstance.getSubtitlesById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getSubtitlesById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/srt

<a name="getTextById"></a>
# **getTextById**
> String getTextById(mediaId)

Retrieve text transcript

Retrieve the transcript from a given media in plain text format

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Media identifier, a UUID.
try {
    String result = apiInstance.getTextById(mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getTextById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Media identifier, a UUID. |

### Return type

**String**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getTranscript"></a>
# **getTranscript**
> VbTranscript getTranscript(mediaId, includeAlternateFormat)

Retrieve transcript

Retrieve the transcript from a given media

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Get media by Id.
java.util.List<String> includeAlternateFormat = Arrays.asList("includeAlternateFormat_example"); // java.util.List<String> | Set of alternate formats to include in the response
try {
    VbTranscript result = apiInstance.getTranscript(mediaId, includeAlternateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getTranscript");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Get media by Id. |
 **includeAlternateFormat** | [**java.util.List&lt;String&gt;**](String.md)| Set of alternate formats to include in the response | [optional]

### Return type

[**VbTranscript**](VbTranscript.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mediaQuery"></a>
# **mediaQuery**
> VbMediaQueryResponse mediaQuery(query, externalId, before, after, extendedFilter, onOrAfterDate, onOrBeforeDate, sortOrder, limit)

List media records

Retrieve a list of media previously uploaded that match a criteria

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String query = "query_example"; // String | The full text search
String externalId = "externalId_example"; // String | Media tagged with externalId in the metadata.
String before = "before_example"; // String | Find media created before this mediaId
String after = "after_example"; // String | Find media created after this mediaId
java.util.List<String> extendedFilter = Arrays.asList("extendedFilter_example"); // java.util.List<String> | A special filter which is of the form 'extendedFilter=Name;Value' which allows you to filter by extended metadata.
OffsetDateTime onOrAfterDate = new OffsetDateTime(); // OffsetDateTime | Media created on or after date.
OffsetDateTime onOrBeforeDate = new OffsetDateTime(); // OffsetDateTime | Media created on or before date.
String sortOrder = "sortOrder_example"; // String | Sort order.
Integer limit = 56; // Integer | Control the number of values returned.
try {
    VbMediaQueryResponse result = apiInstance.mediaQuery(query, externalId, before, after, extendedFilter, onOrAfterDate, onOrBeforeDate, sortOrder, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#mediaQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| The full text search | [optional]
 **externalId** | **String**| Media tagged with externalId in the metadata. | [optional]
 **before** | **String**| Find media created before this mediaId | [optional]
 **after** | **String**| Find media created after this mediaId | [optional]
 **extendedFilter** | [**java.util.List&lt;String&gt;**](String.md)| A special filter which is of the form &#39;extendedFilter&#x3D;Name;Value&#39; which allows you to filter by extended metadata. | [optional]
 **onOrAfterDate** | **OffsetDateTime**| Media created on or after date. | [optional]
 **onOrBeforeDate** | **OffsetDateTime**| Media created on or before date. | [optional]
 **sortOrder** | **String**| Sort order. | [optional]
 **limit** | **Integer**| Control the number of values returned. | [optional]

### Return type

[**VbMediaQueryResponse**](VbMediaQueryResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMedia"></a>
# **postMedia**
> VbMedia postMedia(media, mediaUrl, _configuration, metadata, transcript)

Upload a media file for transcription and analysis

Upload new new media to the service as an attachment or from a url

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
File media = new File("/path/to/file.txt"); // File | Media file attached to the request.
String mediaUrl = "mediaUrl_example"; // String | URL where media file can be downloaded.
String _configuration = "_configuration_example"; // String | A JSON object with configuration options.
String metadata = "metadata_example"; // String | Metadata about the file being posted.
String transcript = "transcript_example"; // String | A transcript
try {
    VbMedia result = apiInstance.postMedia(media, mediaUrl, _configuration, metadata, transcript);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#postMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **media** | **File**| Media file attached to the request. | [optional]
 **mediaUrl** | **String**| URL where media file can be downloaded. | [optional]
 **_configuration** | **String**| A JSON object with configuration options. | [optional]
 **metadata** | **String**| Metadata about the file being posted. | [optional]
 **transcript** | **String**| A transcript | [optional]

### Return type

[**VbMedia**](VbMedia.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data, multipart/mixed
 - **Accept**: application/json

<a name="postMediaById"></a>
# **postMediaById**
> VbMedia postMediaById(mediaId, _configuration, metadata, transcript)

Align a transcript and re-run the job

Upload a transcript to the service as an attachment for alignment and re-running of the job

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | A JSON object with configuration options.
String _configuration = "_configuration_example"; // String | A JSON object with configuration options.
String metadata = "metadata_example"; // String | Metadata about the file being posted.
String transcript = "transcript_example"; // String | A transcript
try {
    VbMedia result = apiInstance.postMediaById(mediaId, _configuration, metadata, transcript);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#postMediaById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| A JSON object with configuration options. |
 **_configuration** | **String**| A JSON object with configuration options. | [optional]
 **metadata** | **String**| Metadata about the file being posted. | [optional]
 **transcript** | **String**| A transcript | [optional]

### Return type

[**VbMedia**](VbMedia.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data, multipart/mixed
 - **Accept**: application/json

<a name="setMetadataById"></a>
# **setMetadataById**
> VbMetadata setMetadataById(mediaId, metadata)

Update media metadata

Set or update the media metadata

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
String mediaId = "mediaId_example"; // String | Get media by Id.
VbMetadata metadata = new VbMetadata(); // VbMetadata | metadata.
try {
    VbMetadata result = apiInstance.setMetadataById(mediaId, metadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#setMetadataById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mediaId** | **String**| Get media by Id. |
 **metadata** | [**VbMetadata**](VbMetadata.md)| metadata. |

### Return type

[**VbMetadata**](VbMetadata.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

