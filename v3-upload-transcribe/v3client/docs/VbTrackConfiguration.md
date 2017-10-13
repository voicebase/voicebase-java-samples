
# VbTrackConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trackIndex** | **Integer** | Track index. |  [optional]
**speakerName** | **String** | Speaker name. Defaults to \&quot;Speaker\&quot;. If this attribute is specified, all channels are mixed into a single one. |  [optional]
**speakerRole** | **String** | A description of the speaker role. Only used as metadata. |  [optional]
**channels** | [**java.util.List&lt;VbChannelConfiguration&gt;**](VbChannelConfiguration.md) | List of channels to process, mutually exclusive with \&quot;speakerName\&quot; |  [optional]



