//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.license](../index.md)/[EditorLicenseManager](index.md)

# EditorLicenseManager

[androidJvm]\
object [EditorLicenseManager](index.md)

## Functions

| Name | Summary |
|---|---|
| [checkPostProcessingEffect](check-post-processing-effect.md) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [checkPostProcessingEffect](check-post-processing-effect.md)(effectId: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Function to check if post-processing effects is available in the license |
| [doWhenInitialized](do-when-initialized.md) | [androidJvm]<br>suspend fun [doWhenInitialized](do-when-initialized.md)(block: suspend ([EditorLicense](../-editor-license/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Function to run [block](do-when-initialized.md) when license initialization is completed |
| [initialize](initialize.md) | [androidJvm]<br>suspend fun [initialize](initialize.md)(token: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Function to start parsing the [token](initialize.md) and initialize the license |
| [isTokenExpired](is-token-expired.md) | [androidJvm]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [isTokenExpired](is-token-expired.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Function to check if the license has expired |

## Properties

| Name | Summary |
|---|---|
| [isInitialized](is-initialized.md) | [androidJvm]<br>val [isInitialized](is-initialized.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>True if the license is initialized |
| [license](license.md) | [androidJvm]<br>lateinit var [license](license.md): [EditorLicense](../-editor-license/index.md)<br>License information |
