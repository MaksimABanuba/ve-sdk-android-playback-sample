//[ve-playback-sdk](../../../index.md)/[com.banuba.sdk.playback](../index.md)/[PlaybackUtils](index.md)

# PlaybackUtils

[androidJvm]\
object [PlaybackUtils](index.md)

Utility class to ease [VideoPlayer](../-video-player/index.md) interactions

## Functions

| Name | Summary |
|---|---|
| [createVideoRecordRange](create-video-record-range.md) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [createVideoRecordRange](create-video-record-range.md)(sourceUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), playFromMs: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = 0, playToMs: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, rotation: Rotation = Rotation.ROTATION_0): VideoRecordRange?<br>Helper function to create VideoRecordRange objects which are consumed by [VideoPlayer.setVideoRanges](../-video-player/set-video-ranges.md). |
