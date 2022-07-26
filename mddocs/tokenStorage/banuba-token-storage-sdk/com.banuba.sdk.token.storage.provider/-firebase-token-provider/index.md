//[banuba-token-storage-sdk](../../../index.md)/[com.banuba.sdk.token.storage.provider](../index.md)/[FirebaseTokenProvider](index.md)

# FirebaseTokenProvider

[androidJvm]\
class [FirebaseTokenProvider](index.md)(localToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenPreference: [TokenPreference](../../com.banuba.sdk.token.storage.data/-token-preference/index.md), targetSnapshot: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, firebaseDatabase: FirebaseDatabase?, connectivityManager: [ConnectivityManager](https://developer.android.com/reference/kotlin/android/net/ConnectivityManager.html)) : [TokenProvider](../-token-provider/index.md)

One of the [TokenProvider](../-token-provider/index.md) implementations that loads Video Editor token from Firebase Realtime Database.

## Parameters

androidJvm

| | |
|---|---|
| localToken | will be used if firebaseDatabase is null |

## Constructors

| | |
|---|---|
| [FirebaseTokenProvider](-firebase-token-provider.md) | [androidJvm]<br>fun [FirebaseTokenProvider](-firebase-token-provider.md)(localToken: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), tokenPreference: [TokenPreference](../../com.banuba.sdk.token.storage.data/-token-preference/index.md), targetSnapshot: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, firebaseDatabase: FirebaseDatabase?, connectivityManager: [ConnectivityManager](https://developer.android.com/reference/kotlin/android/net/ConnectivityManager.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getToken](get-token.md) | [androidJvm]<br>open override fun [getToken](get-token.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Function to get token for Video Editor from any sources |
