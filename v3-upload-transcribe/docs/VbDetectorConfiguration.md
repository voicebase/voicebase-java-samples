
# VbDetectorConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**detectorId** | **String** | Detector identifier, a UUID |  [optional]
**detectorName** | **String** | A name identifying a detector offered by Voicebase to all customers |  [optional]
**version** | **String** | Provide a specific version (e.g. \&quot;3.1.3\&quot;), specify a minimum (e.g. \&quot;3.1+\&quot;) or get the \&quot;latest\&quot;. Defaults to \&quot;latest\&quot; if not specified. |  [optional]
**parameters** | [**java.util.List&lt;VbParameter&gt;**](VbParameter.md) | List of parameter values to the detector |  [optional]
**redactor** | [**VbRedactorConfiguration**](VbRedactorConfiguration.md) |  |  [optional]



