
# VbMedia

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formatVersion** | **String** | Media format version. E.g. 3.0.1 |  [optional]
**mediaId** | **String** | Media unique identifier. |  [optional]
**status** | [**VbStatusEnum**](VbStatusEnum.md) | Processing state. |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) | Creation timestamp |  [optional]
**metadata** | [**VbMetadata**](VbMetadata.md) | User defined data associated with this record. |  [optional]
**mediaContentType** | **String** | The MIME type of the media submitted for processing. E.g. audio/x-wav, audio/mpeg |  [optional]
**length** | **Long** | Duration of the audio/video submitted for processing expressed in milliseconds |  [optional]
**knowledge** | [**VbKnowledge**](VbKnowledge.md) | Semantic knowledge discovery section. If knoweledge discovery was requested, this section contains the results. |  [optional]
**spotting** | [**VbSpotting**](VbSpotting.md) | If kewyword spotting was requested, this section contains the results. |  [optional]
**prediction** | [**VbPrediction**](VbPrediction.md) | If any predictions (classifiers, detectors) were requested, this section contains the results. |  [optional]
**transcript** | [**VbTranscript**](VbTranscript.md) | This section contains the transcript in a variety of formats |  [optional]
**warnings** | [**java.util.List&lt;VbMessage&gt;**](VbMessage.md) | This section contains warnings about the media |  [optional]
**streams** | [**java.util.List&lt;VbStream&gt;**](VbStream.md) | Theaudio/video streams available. |  [optional]
**job** | [**VbJob**](VbJob.md) |  |  [optional]



