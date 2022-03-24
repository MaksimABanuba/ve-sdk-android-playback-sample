//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.provider](../index.md)/[RemoteTokenMapper](index.md)

# RemoteTokenMapper

[androidJvm]\
fun interface [RemoteTokenMapper](index.md)

The interface that is used to map data from Remote Server. For example:

object CustomRemoteTokenMapper : RemoteTokenMapper {     override fun map(params: Any): String =     if (params is ResponseBody) params.charStream().readText().trim()     else "" }

## Functions

| Name | Summary |
|---|---|
| [map](map.md) | [androidJvm]<br>abstract fun [map](map.md)(params: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Function to convert type returned by [RemoteTokenApi.getToken](../-remote-token-api/get-token.md) method of [RemoteTokenApi](../-remote-token-api/index.md) into the token String type that is used in the AI Video Editor SDK |
