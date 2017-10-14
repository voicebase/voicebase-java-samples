# What Is This?

This is a sample that shows how to use VoiceBase V3 with the Apache HttpComponents HttpClient library.

It uses a ful Jackson-ized data model generated from the VoiceBase V3 Swagger, but only implements the methods for:
- /media POST
- /media/{mediaId} GET

It is not intended as a fully-features VoiceBase V3 client, but as a demonstration of how to integrate VoiceBase using
the Apache HttpComponents HttpClient library.

For details, see:
- VoiceBaseV3MinimalClientImpl
- VoiceBaseV3MinimalClientTest

Please note:

> To run the attached unit tests, create a file called `.voicebase-bearer-token`, containing your Bearer token.

# Generated Swagger Client Documentation

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.voicebase.sample.v3</groupId>
    <artifactId>client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.voicebase.sample.v3:client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.voicebase.sample.v3client.*;
import com.voicebase.sample.v3client.auth.*;
import com.voicebase.sample.v3client.model.*;
import com.voicebase.sample.v3client.api.DefinitionApi;

import java.io.File;
import java.util.*;

public class DefinitionApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://apis.voicebase.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefinitionApi* | [**createKeywordSpottingGroup**](docs/DefinitionApi.md#createKeywordSpottingGroup) | **PUT** /v3/definition/spotting/groups/{groupId} | Create or update keyword spotting group
*DefinitionApi* | [**createVocabulary**](docs/DefinitionApi.md#createVocabulary) | **PUT** /v3/definition/vocabularies/{vocabularyId} | Create or update a custom vocabulary
*DefinitionApi* | [**deleteKeywordSpottingGroupById**](docs/DefinitionApi.md#deleteKeywordSpottingGroupById) | **DELETE** /v3/definition/spotting/groups/{groupId} | Delete keyword spotting group
*DefinitionApi* | [**deleteVocabularyById**](docs/DefinitionApi.md#deleteVocabularyById) | **DELETE** /v3/definition/vocabularies/{vocabularyId} | Delete a custom vocabulary
*DefinitionApi* | [**getClassifier**](docs/DefinitionApi.md#getClassifier) | **GET** /v3/definition/prediction/classifiers/{classifierId} | Retrieve details about a predictive classification model
*DefinitionApi* | [**getClassifiers**](docs/DefinitionApi.md#getClassifiers) | **GET** /v3/definition/prediction/classifiers | List predictive classification models
*DefinitionApi* | [**getDetector**](docs/DefinitionApi.md#getDetector) | **GET** /v3/definition/prediction/detectors/{detectorId} | Retrieve details about a detection model
*DefinitionApi* | [**getDetectors**](docs/DefinitionApi.md#getDetectors) | **GET** /v3/definition/prediction/detectors | List detection models
*DefinitionApi* | [**getKeywordSpottingGroupById**](docs/DefinitionApi.md#getKeywordSpottingGroupById) | **GET** /v3/definition/spotting/groups/{groupId} | Retrieve a keyword spotting Group
*DefinitionApi* | [**getKeywordSpottingGroups**](docs/DefinitionApi.md#getKeywordSpottingGroups) | **GET** /v3/definition/spotting/groups | List keyword spotting groups
*DefinitionApi* | [**getSearchableFields**](docs/DefinitionApi.md#getSearchableFields) | **GET** /v3/definition/media/search | Retrieve the list of extended metadata searchable fields
*DefinitionApi* | [**getVocabularies**](docs/DefinitionApi.md#getVocabularies) | **GET** /v3/definition/vocabularies | List custom vocabularies
*DefinitionApi* | [**getVocabularyById**](docs/DefinitionApi.md#getVocabularyById) | **GET** /v3/definition/vocabularies/{vocabularyId} | Retrieve a custom vocabulary.
*DefinitionApi* | [**setSearchableFields**](docs/DefinitionApi.md#setSearchableFields) | **PUT** /v3/definition/media/search | Define extended metadata searchable fields
*KeyManagementApi* | [**createKey**](docs/KeyManagementApi.md#createKey) | **POST** /v3/profile/keys | Create API Key
*KeyManagementApi* | [**deleteKeyById**](docs/KeyManagementApi.md#deleteKeyById) | **DELETE** /v3/profile/keys/{keyId} | Delete API key
*KeyManagementApi* | [**getKeyById**](docs/KeyManagementApi.md#getKeyById) | **GET** /v3/profile/keys/{keyId} | Retrieve details about an API key
*KeyManagementApi* | [**getKeys**](docs/KeyManagementApi.md#getKeys) | **GET** /v3/profile/keys | List API Keys
*MediaApi* | [**deleteMediaById**](docs/MediaApi.md#deleteMediaById) | **DELETE** /v3/media/{mediaId} | Delete a media, transcripts and analytics results
*MediaApi* | [**getMediaById**](docs/MediaApi.md#getMediaById) | **GET** /v3/media/{mediaId} | Retrieve transcript and analytical results from a media record
*MediaApi* | [**getMetadataById**](docs/MediaApi.md#getMetadataById) | **GET** /v3/media/{mediaId}/metadata | Retrieve metadata associated with a media record
*MediaApi* | [**getProgressById**](docs/MediaApi.md#getProgressById) | **GET** /v3/media/{mediaId}/progress | Retrieve processing progress
*MediaApi* | [**getStreamByMediaIdAndName**](docs/MediaApi.md#getStreamByMediaIdAndName) | **GET** /v3/media/{mediaId}/streams/{streamName} | Downloads the media identified by the stream name
*MediaApi* | [**getStreamsById**](docs/MediaApi.md#getStreamsById) | **GET** /v3/media/{mediaId}/streams | List streams
*MediaApi* | [**getSubtitleDfxpById**](docs/MediaApi.md#getSubtitleDfxpById) | **GET** /v3/media/{mediaId}/transcript/dfxp | Retrieve DFXP transcript
*MediaApi* | [**getSubtitleWebVttById**](docs/MediaApi.md#getSubtitleWebVttById) | **GET** /v3/media/{mediaId}/transcript/webvtt | Retrieve WEBVTT transcript
*MediaApi* | [**getSubtitlesById**](docs/MediaApi.md#getSubtitlesById) | **GET** /v3/media/{mediaId}/transcript/srt | Retrieve SRT transcript
*MediaApi* | [**getTextById**](docs/MediaApi.md#getTextById) | **GET** /v3/media/{mediaId}/transcript/text | Retrieve text transcript
*MediaApi* | [**getTranscript**](docs/MediaApi.md#getTranscript) | **GET** /v3/media/{mediaId}/transcript | Retrieve transcript
*MediaApi* | [**mediaQuery**](docs/MediaApi.md#mediaQuery) | **GET** /v3/media | List media records
*MediaApi* | [**postMedia**](docs/MediaApi.md#postMedia) | **POST** /v3/media | Upload a media file for transcription and analysis
*MediaApi* | [**postMediaById**](docs/MediaApi.md#postMediaById) | **POST** /v3/media/{mediaId} | Align a transcript and re-run the job
*MediaApi* | [**setMetadataById**](docs/MediaApi.md#setMetadataById) | **PUT** /v3/media/{mediaId}/metadata | Update media metadata


## Documentation for Models

 - [VbAudioRedactorConfiguration](docs/VbAudioRedactorConfiguration.md)
 - [VbCallbackConfiguration](docs/VbCallbackConfiguration.md)
 - [VbCallbackFormatEnum](docs/VbCallbackFormatEnum.md)
 - [VbCallbackStreamEnum](docs/VbCallbackStreamEnum.md)
 - [VbCallbackTypeEnum](docs/VbCallbackTypeEnum.md)
 - [VbChannelConfiguration](docs/VbChannelConfiguration.md)
 - [VbClass](docs/VbClass.md)
 - [VbClassifier](docs/VbClassifier.md)
 - [VbClassifierConfiguration](docs/VbClassifierConfiguration.md)
 - [VbClassifierModel](docs/VbClassifierModel.md)
 - [VbClassifierModelsResponse](docs/VbClassifierModelsResponse.md)
 - [VbConfiguration](docs/VbConfiguration.md)
 - [VbContentFilteringConfiguration](docs/VbContentFilteringConfiguration.md)
 - [VbDetectedSegment](docs/VbDetectedSegment.md)
 - [VbDetection](docs/VbDetection.md)
 - [VbDetector](docs/VbDetector.md)
 - [VbDetectorConfiguration](docs/VbDetectorConfiguration.md)
 - [VbDetectorModel](docs/VbDetectorModel.md)
 - [VbDetectorModelsResponse](docs/VbDetectorModelsResponse.md)
 - [VbDiarization](docs/VbDiarization.md)
 - [VbError](docs/VbError.md)
 - [VbErrorResponse](docs/VbErrorResponse.md)
 - [VbFormattingConfiguration](docs/VbFormattingConfiguration.md)
 - [VbFrequency](docs/VbFrequency.md)
 - [VbGroup](docs/VbGroup.md)
 - [VbHttpMethodEnum](docs/VbHttpMethodEnum.md)
 - [VbIncludeTypeEnum](docs/VbIncludeTypeEnum.md)
 - [VbIngestConfiguration](docs/VbIngestConfiguration.md)
 - [VbJob](docs/VbJob.md)
 - [VbKey](docs/VbKey.md)
 - [VbKeyConfiguration](docs/VbKeyConfiguration.md)
 - [VbKeysResponse](docs/VbKeysResponse.md)
 - [VbKeyword](docs/VbKeyword.md)
 - [VbKeywordGroup](docs/VbKeywordGroup.md)
 - [VbKeywordGroupsResponse](docs/VbKeywordGroupsResponse.md)
 - [VbKnowledge](docs/VbKnowledge.md)
 - [VbKnowledgeConfiguration](docs/VbKnowledgeConfiguration.md)
 - [VbMedia](docs/VbMedia.md)
 - [VbMediaQueryResponse](docs/VbMediaQueryResponse.md)
 - [VbMediaSummary](docs/VbMediaSummary.md)
 - [VbMention](docs/VbMention.md)
 - [VbMessage](docs/VbMessage.md)
 - [VbMetadata](docs/VbMetadata.md)
 - [VbOccurrence](docs/VbOccurrence.md)
 - [VbParameter](docs/VbParameter.md)
 - [VbParameterDefinition](docs/VbParameterDefinition.md)
 - [VbPrediction](docs/VbPrediction.md)
 - [VbPredictionConfiguration](docs/VbPredictionConfiguration.md)
 - [VbPriorityEnum](docs/VbPriorityEnum.md)
 - [VbProgress](docs/VbProgress.md)
 - [VbProgressTask](docs/VbProgressTask.md)
 - [VbPublishConfiguration](docs/VbPublishConfiguration.md)
 - [VbRedactorConfiguration](docs/VbRedactorConfiguration.md)
 - [VbReference](docs/VbReference.md)
 - [VbSearchableFields](docs/VbSearchableFields.md)
 - [VbSpeechModelConfiguration](docs/VbSpeechModelConfiguration.md)
 - [VbSpotting](docs/VbSpotting.md)
 - [VbSpottingConfiguration](docs/VbSpottingConfiguration.md)
 - [VbSpottingGroupConfiguration](docs/VbSpottingGroupConfiguration.md)
 - [VbStatusEnum](docs/VbStatusEnum.md)
 - [VbStereoConfiguration](docs/VbStereoConfiguration.md)
 - [VbStream](docs/VbStream.md)
 - [VbStreams](docs/VbStreams.md)
 - [VbTaskStatusEnum](docs/VbTaskStatusEnum.md)
 - [VbTopic](docs/VbTopic.md)
 - [VbTrackConfiguration](docs/VbTrackConfiguration.md)
 - [VbTranscript](docs/VbTranscript.md)
 - [VbTranscriptConfiguration](docs/VbTranscriptConfiguration.md)
 - [VbTranscriptFormat](docs/VbTranscriptFormat.md)
 - [VbTranscriptRedactorConfiguration](docs/VbTranscriptRedactorConfiguration.md)
 - [VbVocabulariesResponse](docs/VbVocabulariesResponse.md)
 - [VbVocabulary](docs/VbVocabulary.md)
 - [VbVocabularyConfiguration](docs/VbVocabularyConfiguration.md)
 - [VbVocabularyScript](docs/VbVocabularyScript.md)
 - [VbVocabularyScriptConfiguration](docs/VbVocabularyScriptConfiguration.md)
 - [VbVocabularyTerm](docs/VbVocabularyTerm.md)
 - [VbVocabularyTermConfiguration](docs/VbVocabularyTermConfiguration.md)
 - [VbVocabularyType](docs/VbVocabularyType.md)
 - [VbWord](docs/VbWord.md)
 - [VbWordTypeEnum](docs/VbWordTypeEnum.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@voicebase.com

