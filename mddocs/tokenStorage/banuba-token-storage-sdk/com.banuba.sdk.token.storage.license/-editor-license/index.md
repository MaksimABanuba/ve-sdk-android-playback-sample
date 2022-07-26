//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.license](../index.md)/[EditorLicense](index.md)

# EditorLicense

[androidJvm]\
data class [EditorLicense](index.md)(clientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientType: [EditorLicense.ClientType](-client-type/index.md), collectAnalytics: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), timeBombInfo: [EditorLicense.TimeBombInfo](-time-bomb-info/index.md)?, supportsFaceAR: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), maxFaces: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), postProcessingEffects: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt;, arCloudUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, supportsPip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isPlatformSupported: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), giphyApiKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), supportsFHD: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsBgSeparation: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsAudioBrowser: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsPixelateEffects: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsVeSdk: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsPlaybackApi: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsExportApi: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))

Data class that contains license information

## Parameters

androidJvm

| | |
|---|---|
| clientId | Client ID |
| clientType | Type of Licence |
| collectAnalytics | Does license support collect analytics |
| timeBombInfo | License range |
| supportsFaceAR | Does license support Face AR |
| maxFaces | Max faces count |
| postProcessingEffects | A set of available post-precessing effects |
| arCloudUrl | Link to ar mask set |
| isPlatformSupported | Does license support Android platform |
| giphyApiKey | Giphy api key |
| supportsFHD | Does license support FHD |
| supportsBgSeparation | Does license support background separation |
| supportsAudioBrowser | Does license support audio browser |
| supportsPixelateEffects | Does it support pixelate effects |

## Constructors

| | |
|---|---|
| [EditorLicense](-editor-license.md) | [androidJvm]<br>fun [EditorLicense](-editor-license.md)(clientId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientType: [EditorLicense.ClientType](-client-type/index.md), collectAnalytics: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), timeBombInfo: [EditorLicense.TimeBombInfo](-time-bomb-info/index.md)?, supportsFaceAR: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), maxFaces: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), postProcessingEffects: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt;, arCloudUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, supportsPip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), isPlatformSupported: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), giphyApiKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), supportsFHD: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsBgSeparation: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsAudioBrowser: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsPixelateEffects: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsVeSdk: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsPlaybackApi: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), supportsExportApi: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) |

## Types

| Name | Summary |
|---|---|
| [ClientType](-client-type/index.md) | [androidJvm]<br>enum [ClientType](-client-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[EditorLicense.ClientType](-client-type/index.md)&gt; |
| [TimeBombInfo](-time-bomb-info/index.md) | [androidJvm]<br>data class [TimeBombInfo](-time-bomb-info/index.md)(begin: [Date](https://developer.android.com/reference/kotlin/java/util/Date.html), end: [Date](https://developer.android.com/reference/kotlin/java/util/Date.html)) |

## Properties

| Name | Summary |
|---|---|
| [arCloudUrl](ar-cloud-url.md) | [androidJvm]<br>val [arCloudUrl](ar-cloud-url.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
| [clientId](client-id.md) | [androidJvm]<br>val [clientId](client-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [clientType](client-type.md) | [androidJvm]<br>val [clientType](client-type.md): [EditorLicense.ClientType](-client-type/index.md) |
| [collectAnalytics](collect-analytics.md) | [androidJvm]<br>val [collectAnalytics](collect-analytics.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [giphyApiKey](giphy-api-key.md) | [androidJvm]<br>val [giphyApiKey](giphy-api-key.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [isPlatformSupported](is-platform-supported.md) | [androidJvm]<br>val [isPlatformSupported](is-platform-supported.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [maxFaces](max-faces.md) | [androidJvm]<br>val [maxFaces](max-faces.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [postProcessingEffects](post-processing-effects.md) | [androidJvm]<br>val [postProcessingEffects](post-processing-effects.md): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)&gt; |
| [supportsAudioBrowser](supports-audio-browser.md) | [androidJvm]<br>val [supportsAudioBrowser](supports-audio-browser.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsBgSeparation](supports-bg-separation.md) | [androidJvm]<br>val [supportsBgSeparation](supports-bg-separation.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsExportApi](supports-export-api.md) | [androidJvm]<br>val [supportsExportApi](supports-export-api.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsFaceAR](supports-face-a-r.md) | [androidJvm]<br>val [supportsFaceAR](supports-face-a-r.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsFHD](supports-f-h-d.md) | [androidJvm]<br>val [supportsFHD](supports-f-h-d.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsPip](supports-pip.md) | [androidJvm]<br>val [supportsPip](supports-pip.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsPixelateEffects](supports-pixelate-effects.md) | [androidJvm]<br>val [supportsPixelateEffects](supports-pixelate-effects.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsPlaybackApi](supports-playback-api.md) | [androidJvm]<br>val [supportsPlaybackApi](supports-playback-api.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [supportsVeSdk](supports-ve-sdk.md) | [androidJvm]<br>val [supportsVeSdk](supports-ve-sdk.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [timeBombInfo](time-bomb-info.md) | [androidJvm]<br>val [timeBombInfo](time-bomb-info.md): [EditorLicense.TimeBombInfo](-time-bomb-info/index.md)? |
