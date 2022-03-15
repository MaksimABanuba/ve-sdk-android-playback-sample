//[ve-playback-sdk](../../../index.md)/[com.banuba.sdk.playback](../index.md)/[PlaybackUtils](index.md)/[createVideoRecordRange](create-video-record-range.md)

# createVideoRecordRange

[androidJvm]\

@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)

@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)

fun [createVideoRecordRange](create-video-record-range.md)(sourceUri: [Uri](https://developer.android.com/reference/kotlin/android/net/Uri.html), context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), playFromMs: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = 0, playToMs: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)? = null, rotation: Rotation = Rotation.ROTATION_0): VideoRecordRange?

Helper function to create VideoRecordRange objects which are consumed by [VideoPlayer.setVideoRanges](../-video-player/set-video-ranges.md).

## Parameters

androidJvm

| | |
|---|---|
| sourceUri | Uri for the video to play (file:// and content:// schemas are both available) |
| context | android context |
| playFromMs | defines the starting position in milliseconds to play this video from |
| playToMs | defines the ending position in milliseconds to play this video to |
| rotation | defines video rotation (there are available rotation values in com.banuba.sdk.core.Rotation) |
