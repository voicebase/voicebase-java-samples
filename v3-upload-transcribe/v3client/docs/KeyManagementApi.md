# KeyManagementApi

All URIs are relative to *https://apis.voicebase.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKey**](KeyManagementApi.md#createKey) | **POST** /v3/profile/keys | Create API Key
[**deleteKeyById**](KeyManagementApi.md#deleteKeyById) | **DELETE** /v3/profile/keys/{keyId} | Delete API key
[**getKeyById**](KeyManagementApi.md#getKeyById) | **GET** /v3/profile/keys/{keyId} | Retrieve details about an API key
[**getKeys**](KeyManagementApi.md#getKeys) | **GET** /v3/profile/keys | List API Keys


<a name="createKey"></a>
# **createKey**
> VbKey createKey(key)

Create API Key

Create a new API key for the current user

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.KeyManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

KeyManagementApi apiInstance = new KeyManagementApi();
VbKeyConfiguration key = new VbKeyConfiguration(); // VbKeyConfiguration | Key config.
try {
    VbKey result = apiInstance.createKey(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementApi#createKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | [**VbKeyConfiguration**](VbKeyConfiguration.md)| Key config. |

### Return type

[**VbKey**](VbKey.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteKeyById"></a>
# **deleteKeyById**
> deleteKeyById(keyId)

Delete API key

Delete and revoke this API key

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.KeyManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

KeyManagementApi apiInstance = new KeyManagementApi();
String keyId = "keyId_example"; // String | The key Id.
try {
    apiInstance.deleteKeyById(keyId);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementApi#deleteKeyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| The key Id. |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeyById"></a>
# **getKeyById**
> VbKey getKeyById(keyId)

Retrieve details about an API key

Get information about this API key

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.KeyManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

KeyManagementApi apiInstance = new KeyManagementApi();
String keyId = "keyId_example"; // String | The key Id.
try {
    VbKey result = apiInstance.getKeyById(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementApi#getKeyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**| The key Id. |

### Return type

[**VbKey**](VbKey.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKeys"></a>
# **getKeys**
> VbKeysResponse getKeys()

List API Keys

Returns all current API keys for current user

### Example
```java
// Import classes:
//import com.voicebase.sample.v3client.ApiClient;
//import com.voicebase.sample.v3client.ApiException;
//import com.voicebase.sample.v3client.Configuration;
//import com.voicebase.sample.v3client.auth.*;
//import com.voicebase.sample.v3client.api.KeyManagementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

KeyManagementApi apiInstance = new KeyManagementApi();
try {
    VbKeysResponse result = apiInstance.getKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeyManagementApi#getKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VbKeysResponse**](VbKeysResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

