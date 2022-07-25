package com.banuba.example.playback

import android.app.Application
import com.banuba.sdk.playback.di.VePlaybackSdkKoinModule
import com.banuba.sdk.token.storage.di.TokenStorageKoinModule
import com.banuba.sdk.ve.di.VeSdkKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PlaybackApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PlaybackApp)
            allowOverride(true)
            modules(
                TokenStorageKoinModule().module,
                MainKoinModule().module,
                VeSdkKoinModule().module,
                VePlaybackSdkKoinModule().module
            )
        }
    }
}