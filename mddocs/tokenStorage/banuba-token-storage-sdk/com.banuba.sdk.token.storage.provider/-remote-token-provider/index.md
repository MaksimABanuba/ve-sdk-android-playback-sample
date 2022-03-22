//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.provider](../index.md)/[RemoteTokenProvider](index.md)

# RemoteTokenProvider

[androidJvm]\
class [RemoteTokenProvider](index.md)&lt;[T](index.md) : [RemoteTokenApi](../-remote-token-api/index.md)&gt;(remoteUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenRetrofitClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](index.md)&gt;, tokenMapper: [RemoteTokenMapper](../-remote-token-mapper/index.md), interceptor: Interceptor?, dispatcher: Dispatcher?) : [TokenProvider](../-token-provider/index.md)

One of the [TokenProvider](../-token-provider/index.md) implementations that loads Video Editor token from Remote Server

## Constructors

| | |
|---|---|
| [RemoteTokenProvider](-remote-token-provider.md) | [androidJvm]<br>fun &lt;[T](index.md) : [RemoteTokenApi](../-remote-token-api/index.md)&gt; [RemoteTokenProvider](-remote-token-provider.md)(remoteUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenRetrofitClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](index.md)&gt;, tokenMapper: [RemoteTokenMapper](../-remote-token-mapper/index.md), interceptor: Interceptor? = null, dispatcher: Dispatcher? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getToken](get-token.md) | [androidJvm]<br>open override fun [getToken](get-token.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Function to get token for Video Editor from any sources |
