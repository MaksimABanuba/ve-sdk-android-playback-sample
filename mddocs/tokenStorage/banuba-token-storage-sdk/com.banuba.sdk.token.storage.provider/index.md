//[banuba-token-storage-sdk](../../index.md)/[com.banuba.sdk.token.storage.provider](index.md)

# Package com.banuba.sdk.token.storage.provider

## Types

| Name | Summary |
|---|---|
| [FirebaseTokenProvider](-firebase-token-provider/index.md) | [androidJvm]<br>class [FirebaseTokenProvider](-firebase-token-provider/index.md)(localToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenPreference: [TokenPreference](../com.banuba.sdk.token.storage.data/-token-preference/index.md), targetSnapshot: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, firebaseDatabase: FirebaseDatabase?) : [TokenProvider](-token-provider/index.md)<br>One of the [TokenProvider](-token-provider/index.md) implementations that loads Video Editor token from Firebase Realtime Database. |
| [RemoteTokenApi](-remote-token-api/index.md) | [androidJvm]<br>interface [RemoteTokenApi](-remote-token-api/index.md)<br>The interface that is used to getting token data from Server. [RemoteTokenApi](-remote-token-api/index.md) implementation should be Retrofit service interface. For Example: |
| [RemoteTokenMapper](-remote-token-mapper/index.md) | [androidJvm]<br>fun interface [RemoteTokenMapper](-remote-token-mapper/index.md)<br>The interface that is used to map data from Remote Server. For example: |
| [RemoteTokenProvider](-remote-token-provider/index.md) | [androidJvm]<br>class [RemoteTokenProvider](-remote-token-provider/index.md)&lt;[T](-remote-token-provider/index.md) : [RemoteTokenApi](-remote-token-api/index.md)&gt;(remoteUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenRetrofitClass: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;[T](-remote-token-provider/index.md)&gt;, tokenMapper: [RemoteTokenMapper](-remote-token-mapper/index.md), interceptor: Interceptor?, dispatcher: Dispatcher?) : [TokenProvider](-token-provider/index.md)<br>One of the [TokenProvider](-token-provider/index.md) implementations that loads Video Editor token from Remote Server |
| [TokenProvider](-token-provider/index.md) | [androidJvm]<br>interface [TokenProvider](-token-provider/index.md)<br>The interface that is used to get the Video Editor token. There are two implementations for different cases: [FirebaseTokenProvider](-firebase-token-provider/index.md) for loading token from Firebase Realtime Database; [RemoteTokenProvider](-remote-token-provider/index.md) for loading token from any Remote Server. |
