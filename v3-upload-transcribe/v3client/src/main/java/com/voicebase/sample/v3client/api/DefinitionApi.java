package com.voicebase.sample.v3client.api;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sample.v3client.ApiClient;
import com.voicebase.sample.v3client.Configuration;
import com.voicebase.sample.v3client.Pair;

import javax.ws.rs.core.GenericType;

import com.voicebase.sample.v3client.model.VbClassifierModel;
import com.voicebase.sample.v3client.model.VbClassifierModelsResponse;
import com.voicebase.sample.v3client.model.VbDetectorModel;
import com.voicebase.sample.v3client.model.VbDetectorModelsResponse;
import com.voicebase.sample.v3client.model.VbErrorResponse;
import com.voicebase.sample.v3client.model.VbKeywordGroup;
import com.voicebase.sample.v3client.model.VbKeywordGroupsResponse;
import com.voicebase.sample.v3client.model.VbSearchableFields;
import com.voicebase.sample.v3client.model.VbVocabulariesResponse;
import com.voicebase.sample.v3client.model.VbVocabulary;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class DefinitionApi {
  private ApiClient apiClient;

  public DefinitionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefinitionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create or update keyword spotting group
   * Create or update a keyword spotting group with a set of keywords
   * @param groupId The keyword spotting group identifier. (required)
   * @param keywordSpottingGroup Keyword Spotting Group definition (required)
   * @return VbKeywordGroup
   * @throws ApiException if fails to make API call
   */
  public VbKeywordGroup createKeywordSpottingGroup(String groupId, VbKeywordGroup keywordSpottingGroup) throws ApiException {
    Object localVarPostBody = keywordSpottingGroup;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling createKeywordSpottingGroup");
    }
    
    // verify the required parameter 'keywordSpottingGroup' is set
    if (keywordSpottingGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'keywordSpottingGroup' when calling createKeywordSpottingGroup");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/spotting/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<VbKeywordGroup> localVarReturnType = new GenericType<VbKeywordGroup>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create or update a custom vocabulary
   * Create or update a custom vocabulary. Custom vocabularies are used to improve accurary of transcription
   * @param vocabularyId The vocabulary identifier (name). (required)
   * @param vocabulary Vocabulary defintion. (required)
   * @return VbVocabulary
   * @throws ApiException if fails to make API call
   */
  public VbVocabulary createVocabulary(String vocabularyId, VbVocabulary vocabulary) throws ApiException {
    Object localVarPostBody = vocabulary;
    
    // verify the required parameter 'vocabularyId' is set
    if (vocabularyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vocabularyId' when calling createVocabulary");
    }
    
    // verify the required parameter 'vocabulary' is set
    if (vocabulary == null) {
      throw new ApiException(400, "Missing the required parameter 'vocabulary' when calling createVocabulary");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/vocabularies/{vocabularyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vocabularyId" + "\\}", apiClient.escapeString(vocabularyId.toString()));

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

    GenericType<VbVocabulary> localVarReturnType = new GenericType<VbVocabulary>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete keyword spotting group
   * Delete the keyword spotting group
   * @param groupId The keyword spotting group identifier. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteKeywordSpottingGroupById(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteKeywordSpottingGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/spotting/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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
   * Delete a custom vocabulary
   * Delete a custom vocabulary
   * @param vocabularyId The vocabulary identifier (name) (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteVocabularyById(String vocabularyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vocabularyId' is set
    if (vocabularyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vocabularyId' when calling deleteVocabularyById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/vocabularies/{vocabularyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vocabularyId" + "\\}", apiClient.escapeString(vocabularyId.toString()));

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
   * Retrieve details about a predictive classification model
   * Get the classifier model
   * @param classifierId The classifier model identifier. (required)
   * @return VbClassifierModel
   * @throws ApiException if fails to make API call
   */
  public VbClassifierModel getClassifier(String classifierId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'classifierId' is set
    if (classifierId == null) {
      throw new ApiException(400, "Missing the required parameter 'classifierId' when calling getClassifier");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/prediction/classifiers/{classifierId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "classifierId" + "\\}", apiClient.escapeString(classifierId.toString()));

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

    GenericType<VbClassifierModel> localVarReturnType = new GenericType<VbClassifierModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List predictive classification models
   * List available predictive models for classification
   * @return VbClassifierModelsResponse
   * @throws ApiException if fails to make API call
   */
  public VbClassifierModelsResponse getClassifiers() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/definition/prediction/classifiers".replaceAll("\\{format\\}","json");

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

    GenericType<VbClassifierModelsResponse> localVarReturnType = new GenericType<VbClassifierModelsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve details about a detection model
   * Retrieve details about a detection model
   * @param detectorId The detector model identifier. (required)
   * @return VbDetectorModel
   * @throws ApiException if fails to make API call
   */
  public VbDetectorModel getDetector(String detectorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'detectorId' is set
    if (detectorId == null) {
      throw new ApiException(400, "Missing the required parameter 'detectorId' when calling getDetector");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/prediction/detectors/{detectorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "detectorId" + "\\}", apiClient.escapeString(detectorId.toString()));

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

    GenericType<VbDetectorModel> localVarReturnType = new GenericType<VbDetectorModel>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List detection models
   * List available detection models
   * @return VbDetectorModelsResponse
   * @throws ApiException if fails to make API call
   */
  public VbDetectorModelsResponse getDetectors() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/definition/prediction/detectors".replaceAll("\\{format\\}","json");

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

    GenericType<VbDetectorModelsResponse> localVarReturnType = new GenericType<VbDetectorModelsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve a keyword spotting Group
   * Retrieve a keyword spotting group with its keywords
   * @param groupId Keyword spotting group identifier (required)
   * @return VbKeywordGroup
   * @throws ApiException if fails to make API call
   */
  public VbKeywordGroup getKeywordSpottingGroupById(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getKeywordSpottingGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/spotting/groups/{groupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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

    GenericType<VbKeywordGroup> localVarReturnType = new GenericType<VbKeywordGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List keyword spotting groups
   * Get all defined keyword spotting groups
   * @return VbKeywordGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public VbKeywordGroupsResponse getKeywordSpottingGroups() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/definition/spotting/groups".replaceAll("\\{format\\}","json");

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

    GenericType<VbKeywordGroupsResponse> localVarReturnType = new GenericType<VbKeywordGroupsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve the list of extended metadata searchable fields
   * Get searchable fields
   * @return VbSearchableFields
   * @throws ApiException if fails to make API call
   */
  public VbSearchableFields getSearchableFields() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/definition/media/search".replaceAll("\\{format\\}","json");

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

    GenericType<VbSearchableFields> localVarReturnType = new GenericType<VbSearchableFields>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List custom vocabularies
   * List all defined custom vocabularies. Custom vocabularies are used to improve accurary of transcription
   * @return VbVocabulariesResponse
   * @throws ApiException if fails to make API call
   */
  public VbVocabulariesResponse getVocabularies() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v3/definition/vocabularies".replaceAll("\\{format\\}","json");

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

    GenericType<VbVocabulariesResponse> localVarReturnType = new GenericType<VbVocabulariesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve a custom vocabulary.
   * Retrieve a custom vocabulary
   * @param vocabularyId The vocabulary identifier (name) (required)
   * @return VbVocabulary
   * @throws ApiException if fails to make API call
   */
  public VbVocabulary getVocabularyById(String vocabularyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'vocabularyId' is set
    if (vocabularyId == null) {
      throw new ApiException(400, "Missing the required parameter 'vocabularyId' when calling getVocabularyById");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/vocabularies/{vocabularyId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "vocabularyId" + "\\}", apiClient.escapeString(vocabularyId.toString()));

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

    GenericType<VbVocabulary> localVarReturnType = new GenericType<VbVocabulary>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Define extended metadata searchable fields
   * Create or update custom parameters of metadata for search
   * @param searchableFields Key config. (required)
   * @return VbSearchableFields
   * @throws ApiException if fails to make API call
   */
  public VbSearchableFields setSearchableFields(VbSearchableFields searchableFields) throws ApiException {
    Object localVarPostBody = searchableFields;
    
    // verify the required parameter 'searchableFields' is set
    if (searchableFields == null) {
      throw new ApiException(400, "Missing the required parameter 'searchableFields' when calling setSearchableFields");
    }
    
    // create path and map variables
    String localVarPath = "/v3/definition/media/search".replaceAll("\\{format\\}","json");

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

    GenericType<VbSearchableFields> localVarReturnType = new GenericType<VbSearchableFields>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
