//[ve-playback-sdk](../../../../index.md)/[com.banuba.sdk.playback](../../index.md)/[VideoPlayer](../index.md)/[Callback](index.md)/[onRangeDurationsMsUpdated](on-range-durations-ms-updated.md)

# onRangeDurationsMsUpdated

[androidJvm]\

@[WorkerThread](https://developer.android.com/reference/kotlin/androidx/annotation/WorkerThread.html)

open fun [onRangeDurationsMsUpdated](on-range-durations-ms-updated.md)(durationsMs: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[LongRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-long-range/index.html)&gt;)

This is called after [VideoPlayer.setVideoRanges](../set-video-ranges.md). It is invoked on the background thread.

## Parameters

androidJvm

| | |
|---|---|
| durationsMs | exact video range positions in milliseconds |
