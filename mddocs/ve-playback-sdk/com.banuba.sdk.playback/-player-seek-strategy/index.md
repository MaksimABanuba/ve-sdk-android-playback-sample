//[ve-playback-sdk](../../../index.md)/[com.banuba.sdk.playback](../index.md)/[PlayerSeekStrategy](index.md)

# PlayerSeekStrategy

[androidJvm]\
enum [PlayerSeekStrategy](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[PlayerSeekStrategy](index.md)&gt; 

Playback seeking strategy.

Defines how accurate the position will be passed into player from [VideoPlayer.seekTo](../-video-player/seek-to.md) function.

## Entries

| | |
|---|---|
| [ACCURATE](-a-c-c-u-r-a-t-e/index.md) | [androidJvm]<br>[ACCURATE](-a-c-c-u-r-a-t-e/index.md)()<br>For the most accurate position, means that the video player takes the position exactly passed into [VideoPlayer.seekTo](../-video-player/seek-to.md) function |
| [FAST](-f-a-s-t/index.md) | [androidJvm]<br>[FAST](-f-a-s-t/index.md)()<br>For the fast seeking, means that the video player takes the closest sync point as the position |

## Properties

| Name | Summary |
|---|---|
| [name](-f-a-s-t/index.md#-372974862%2FProperties%2F1203721431) | [androidJvm]<br>val [name](-f-a-s-t/index.md#-372974862%2FProperties%2F1203721431): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](-f-a-s-t/index.md#-739389684%2FProperties%2F1203721431) | [androidJvm]<br>val [ordinal](-f-a-s-t/index.md#-739389684%2FProperties%2F1203721431): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
