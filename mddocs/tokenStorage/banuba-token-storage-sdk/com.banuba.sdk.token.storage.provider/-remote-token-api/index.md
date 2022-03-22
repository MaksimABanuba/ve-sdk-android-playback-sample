//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.provider](../index.md)/[RemoteTokenApi](index.md)

# RemoteTokenApi

[androidJvm]\
interface [RemoteTokenApi](index.md)

The interface that is used to getting token data from Server. [RemoteTokenApi](index.md) implementation should be Retrofit service interface. For Example:

interface CustomRemoteTokenApi : RemoteTokenApi {     @Streaming     @GET("token.txt")     override suspend fun getToken(): ResponseBody }

## Functions

| Name | Summary |
|---|---|
| [getToken](get-token.md) | [androidJvm]<br>abstract suspend fun [getToken](get-token.md)(): [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)<br>Should be overridden using appropriate request annotation |
