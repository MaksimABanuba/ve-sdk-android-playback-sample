//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.provider](../index.md)/[RemoteTokenProvider](index.md)/[RemoteTokenProvider](-remote-token-provider.md)

# RemoteTokenProvider

[androidJvm]\
fun &lt;[T](index.md) : [RemoteTokenApi](../-remote-token-api/index.md)&gt; [RemoteTokenProvider](-remote-token-provider.md)(localToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenPreference: [TokenPreference](../../com.banuba.sdk.token.storage.data/-token-preference/index.md), tokenRetrofitClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](index.md)&gt;, tokenMapper: [RemoteTokenMapper](../-remote-token-mapper/index.md), remoteUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), interceptor: Interceptor? = null, dispatcher: Dispatcher? = null)

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
