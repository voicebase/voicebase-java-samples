# DefinitionApi

All URIs are relative to *https://apis.voicebase.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKeywordSpottingGroup**](DefinitionApi.md#createKeywordSpottingGroup) | **PUT** /v3/definition/spotting/groups/{groupId} | Create or update keyword spotting group
[**createVocabulary**](DefinitionApi.md#createVocabulary) | **PUT** /v3/definition/vocabularies/{vocabularyId} | Create or update a custom vocabulary
[**deleteKeywordSpottingGroupById**](DefinitionApi.md#deleteKeywordSpottingGroupById) | **DELETE** /v3/definition/spotting/groups/{groupId} | Delete keyword spotting group
[**deleteVocabularyById**](DefinitionApi.md#deleteVocabularyById) | **DELETE** /v3/definition/vocabularies/{vocabularyId} | Delete a custom vocabulary
[**getClassifier**](DefinitionApi.md#getClassifier) | **GET** /v3/definition/prediction/classifiers/{classifierId} | Retrieve details about a predictive classification model
[**getClassifiers**](DefinitionApi.md#getClassifiers) | **GET** /v3/definition/prediction/classifiers | List predictive classification models
[**getDetector**](DefinitionApi.md#getDetector) | **GET** /v3/definition/prediction/detectors/{detectorId} | Retrieve details about a detection model
[**getDetectors**](DefinitionApi.md#getDetectors) | **GET** /v3/definition/prediction/detectors | List detection models
[**getKeywordSpottingGroupById**](DefinitionApi.md#getKeywordSpottingGroupById) | **GET** /v3/definition/spotting/groups/{groupId} | Retrieve a keyword spotting Group
[**getKeywordSpottingGroups**](DefinitionApi.md#getKeywordSpottingGroups) | **GET** /v3/definition/spotting/groups | List keyword spotting groups
[**getSearchableFields**](DefinitionApi.md#getSearchableFields) | **GET** /v3/definition/media/search | Retrieve the list of extended metadata searchable fields
[**getVocabularies**](DefinitionApi.md#getVocabularies) | **GET** /v3/definition/vocabularies | List custom vocabularies
[**getVocabularyById**](DefinitionApi.md#getVocabularyById) | **GET** /v3/definition/vocabularies/{vocabularyId} | Retrieve a custom vocabulary.
[**setSearchableFields**](DefinitionApi.md#setSearchableFields) | **PUT** /v3/definition/media/search | Define extended metadata searchable fields


<a name="createKeywordSpottingGroup"></a>
# **createKeywordSpottingGroup**
> VbKeywordGroup createKeywordSpottingGroup(groupId, keywordSpottingGroup)

Create or update keyword spotting group

Create or update a keyword spotting group with a set of keywords

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String groupId = "groupId_example"; // String | The keyword spotting group identifier.
VbKeywordGroup keywordSpottingGroup = new VbKeywordGroup(); // VbKeywordGroup | Keyword Spotting Group definition
try {
    VbKeywordGroup result = apiInstance.createKeywordSpottingGroup(groupId, keywordSpottingGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#createKeywordSpottingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The keyword spotting group identifier. |
 **keywordSpottingGroup** | [**VbKeywordGroup**](VbKeywordGroup.md)| Keyword Spotting Group definition |

### Return type

[**VbKeywordGroup**](VbKeywordGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createVocabulary"></a>
# **createVocabulary**
> VbVocabulary createVocabulary(vocabularyId, vocabulary)

Create or update a custom vocabulary

Create or update a custom vocabulary. Custom vocabularies are used to improve accurary of transcription

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String vocabularyId = "vocabularyId_example"; // String | The vocabulary identifier (name).
VbVocabulary vocabulary = new VbVocabulary(); // VbVocabulary | Vocabulary defintion.
try {
    VbVocabulary result = apiInstance.createVocabulary(vocabularyId, vocabulary);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#createVocabulary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vocabularyId** | **String**| The vocabulary identifier (name). |
 **vocabulary** | [**VbVocabulary**](VbVocabulary.md)| Vocabulary defintion. |

### Return type

[**VbVocabulary**](VbVocabulary.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteKeywordSpottingGroupById"></a>
# **deleteKeywordSpottingGroupById**
> deleteKeywordSpottingGroupById(groupId)

Delete keyword spotting group

Delete the keyword spotting group

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String groupId = "groupId_example"; // String | The keyword spotting group identifier.
try {
    apiInstance.deleteKeywordSpottingGroupById(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#deleteKeywordSpottingGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The keyword spotting group identifier. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVocabularyById"></a>
# **deleteVocabularyById**
> deleteVocabularyById(vocabularyId)

Delete a custom vocabulary

Delete a custom vocabulary

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String vocabularyId = "vocabularyId_example"; // String | The vocabulary identifier (name)
try {
    apiInstance.deleteVocabularyById(vocabularyId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#deleteVocabularyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vocabularyId** | **String**| The vocabulary identifier (name) |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClassifier"></a>
# **getClassifier**
> VbClassifierModel getClassifier(classifierId)

Retrieve details about a predictive classification model

Get the classifier model

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String classifierId = "classifierId_example"; // String | The classifier model identifier.
try {
    VbClassifierModel result = apiInstance.getClassifier(classifierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getClassifier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classifierId** | **String**| The classifier model identifier. |

### Return type

[**VbClassifierModel**](VbClassifierModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClassifiers"></a>
# **getClassifiers**
> VbClassifierModelsResponse getClassifiers()

List predictive classification models

List available predictive models for classification

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
try {
    VbClassifierModelsResponse result = apiInstance.getClassifiers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getClassifiers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VbClassifierModelsResponse**](VbClassifierModelsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDetector"></a>
# **getDetector**
> VbDetectorModel getDetector(detectorId)

Retrieve details about a detection model

Retrieve details about a detection model

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String detectorId = "detectorId_example"; // String | The detector model identifier.
try {
    VbDetectorModel result = apiInstance.getDetector(detectorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getDetector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **detectorId** | **String**| The detector model identifier. |

### Return type

[**VbDetectorModel**](VbDetectorModel.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDetectors"></a>
# **getDetectors**
> VbDetectorModelsResponse getDetectors()

List detection models

List available detection models

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
try {
    VbDetectorModelsResponse result = apiInstance.getDetectors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getDetectors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VbDetectorModelsResponse**](VbDetectorModelsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeywordSpottingGroupById"></a>
# **getKeywordSpottingGroupById**
> VbKeywordGroup getKeywordSpottingGroupById(groupId)

Retrieve a keyword spotting Group

Retrieve a keyword spotting group with its keywords

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String groupId = "groupId_example"; // String | Keyword spotting group identifier
try {
    VbKeywordGroup result = apiInstance.getKeywordSpottingGroupById(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getKeywordSpottingGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| Keyword spotting group identifier |

### Return type

[**VbKeywordGroup**](VbKeywordGroup.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeywordSpottingGroups"></a>
# **getKeywordSpottingGroups**
> VbKeywordGroupsResponse getKeywordSpottingGroups()

List keyword spotting groups

Get all defined keyword spotting groups

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
try {
    VbKeywordGroupsResponse result = apiInstance.getKeywordSpottingGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getKeywordSpottingGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VbKeywordGroupsResponse**](VbKeywordGroupsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSearchableFields"></a>
# **getSearchableFields**
> VbSearchableFields getSearchableFields()

Retrieve the list of extended metadata searchable fields

Get searchable fields

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
try {
    VbSearchableFields result = apiInstance.getSearchableFields();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getSearchableFields");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VbSearchableFields**](VbSearchableFields.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVocabularies"></a>
# **getVocabularies**
> VbVocabulariesResponse getVocabularies()

List custom vocabularies

List all defined custom vocabularies. Custom vocabularies are used to improve accurary of transcription

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
try {
    VbVocabulariesResponse result = apiInstance.getVocabularies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getVocabularies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VbVocabulariesResponse**](VbVocabulariesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVocabularyById"></a>
# **getVocabularyById**
> VbVocabulary getVocabularyById(vocabularyId)

Retrieve a custom vocabulary.

Retrieve a custom vocabulary

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
String vocabularyId = "vocabularyId_example"; // String | The vocabulary identifier (name)
try {
    VbVocabulary result = apiInstance.getVocabularyById(vocabularyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#getVocabularyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vocabularyId** | **String**| The vocabulary identifier (name) |

### Return type

[**VbVocabulary**](VbVocabulary.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setSearchableFields"></a>
# **setSearchableFields**
> VbSearchableFields setSearchableFields(searchableFields)

Define extended metadata searchable fields

Create or update custom parameters of metadata for search

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.DefinitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

DefinitionApi apiInstance = new DefinitionApi();
VbSearchableFields searchableFields = new VbSearchableFields(); // VbSearchableFields | Key config.
try {
    VbSearchableFields result = apiInstance.setSearchableFields(searchableFields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefinitionApi#setSearchableFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchableFields** | [**VbSearchableFields**](VbSearchableFields.md)| Key config. |

### Return type

[**VbSearchableFields**](VbSearchableFields.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

