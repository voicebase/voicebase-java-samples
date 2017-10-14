package com.voicebase.sample.v3client.api;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sample.v3client.ApiClient;
import com.voicebase.sample.v3client.Configuration;
import com.voicebase.sample.v3client.Pair;

import javax.ws.rs.core.GenericType;

import com.voicebase.sample.v3client.model.VbErrorResponse;
import com.voicebase.sample.v3client.model.VbKey;
import com.voicebase.sample.v3client.model.VbKeyConfiguration;
import com.voicebase.sample.v3client.model.VbKeysResponse;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class KeyManagementApi {
  private ApiClient apiClient;

  public KeyManagementApi() {
    this(Configuration.getDefaultApiClient());
  }

  public KeyManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create API Key
   * Create a new API key for the current user
   * @param key Key config. (required)
   * @return VbKey
   * @throws ApiException if fails to make API call
   */
  public VbKey createKey(VbKeyConfiguration key) throws ApiException {
    Object localVarPostBody = key;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling createKey");
    }
    
    // create path and map variables
    String localVarPath = "/v3/profile/keys".replaceAll("\\{format\\}","json");

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

    GenericType<VbKey> localVarReturnType = new GenericType<VbKey>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete API key
   * Delete and revoke this API key
   * @param keyId The key Id. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteKeyById(String keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteKeyById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/profile/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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
   * Retrieve details about an API key
   * Get information about this API key
   * @param keyId The key Id. (required)
   * @return VbKey
   * @throws ApiException if fails to make API call
   */
  public VbKey getKeyById(String keyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling getKeyById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/profile/keys/{keyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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

    GenericType<VbKey> localVarReturnType = new GenericType<VbKey>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List API Keys
   * Returns all current API keys for current user
   * @return VbKeysResponse
   * @throws ApiException if fails to make API call
   */
  public VbKeysResponse getKeys() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/profile/keys".replaceAll("\\{format\\}","json");

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

    GenericType<VbKeysResponse> localVarReturnType = new GenericType<VbKeysResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
