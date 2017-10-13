
# VbIngestConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**speakerName** | **String** | Speaker name. Defaults to \&quot;Speaker\&quot;. If this attribute is specified, all channels are mixed into a single one. |  [optional]
**speakerRole** | **String** | A description of the speaker role. Only used as metadata. |  [optional]
**channels** | [**java.util.List&lt;VbChannelConfiguration&gt;**](VbChannelConfiguration.md) | List of channels to process, mutually exclusive with \&quot;tracks\&quot;, \&quot;stereo\&quot; and \&quot;speakerName\&quot; |  [optional]
**stereo** | [**VbStereoConfiguration**](VbStereoConfiguration.md) | Indicates to process two channels of the media. |  [optional]
**tracks** | [**java.util.List&lt;VbTrackConfiguration&gt;**](VbTrackConfiguration.md) | List of tracks to process, mutually exclusive with \&quot;channels\&quot;, \&quot;stereo\&quot; and \&quot;speakerName\&quot; |  [optional]



