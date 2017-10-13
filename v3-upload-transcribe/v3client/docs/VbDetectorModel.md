
# VbDetectorModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detectorId** | **String** |  |  [optional]
**detectorName** | **String** | Use this detector name when refering to this detector in a configuration for media processing |  [optional]
**detectorVersion** | **String** | Use this version in conjuction with the detector name for referring to this detector in a configuration provided with the media for processing |  [optional]
**detectorDescription** | **String** | Describes the function of this detector and its restrictions |  [optional]
**detectorType** | **String** | Detector type, one of ( &#39;binary&#39;, &#39;multiclass&#39;).  Binary detectors only report positive cases. |  [optional]
**classes** | [**java.util.List&lt;VbClass&gt;**](VbClass.md) | Set of possible classes for segments identified by this detector |  [optional]
**parameters** | [**java.util.List&lt;VbParameterDefinition&gt;**](VbParameterDefinition.md) | Set of possible parameters for this detector |  [optional]



