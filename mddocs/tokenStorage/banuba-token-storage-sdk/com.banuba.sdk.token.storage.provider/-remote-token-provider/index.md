//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.provider](../index.md)/[RemoteTokenProvider](index.md)

# RemoteTokenProvider

[androidJvm]\
class [RemoteTokenProvider](index.md)&lt;[T](index.md) : [RemoteTokenApi](../-remote-token-api/index.md)&gt;(localToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenPreference: [TokenPreference](../../com.banuba.sdk.token.storage.data/-token-preference/index.md), tokenRetrofitClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](index.md)&gt;, tokenMapper: [RemoteTokenMapper](../-remote-token-mapper/index.md), remoteUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), interceptor: Interceptor?, dispatcher: Dispatcher?) : [TokenProvider](../-token-provider/index.md)

One of the [TokenProvider](../-token-provider/index.md) implementations that loads Video Editor token from Remote Server

## Parameters

androidJvm

| | |
|---|---|
| localToken | will be used if the is no remote or cached tokens |
| tokenPreference | the cached token storage |
| tokenRetrofitClass | the Retrofit class that is used for remote token downloading |
| tokenMapper | the [RemoteTokenMapper](../-remote-token-mapper/index.md) object that is used to map token from Remote Server |
| remoteUrl | the Url address where remote token is located on the Remote Server |
| interceptor | optional Interceptor object that can be used for extra actions when remote token is downloaded |
| dispatcher | optional Dispatcher object that can be used to set policy and execute asynchronous requests |

## Constructors

| | |
|---|---|
| [RemoteTokenProvider](-remote-token-provider.md) | [androidJvm]<br>fun &lt;[T](index.md) : [RemoteTokenApi](../-remote-token-api/index.md)&gt; [RemoteTokenProvider](-remote-token-provider.md)(localToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenPreference: [TokenPreference](../../com.banuba.sdk.token.storage.data/-token-preference/index.md), tokenRetrofitClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](index.md)&gt;, tokenMapper: [RemoteTokenMapper](../-remote-token-mapper/index.md), remoteUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), interceptor: Interceptor? = null, dispatcher: Dispatcher? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getToken](get-token.md) | [androidJvm]<br>open override fun [getToken](get-token.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Function to get token for Video Editor from any sources |
