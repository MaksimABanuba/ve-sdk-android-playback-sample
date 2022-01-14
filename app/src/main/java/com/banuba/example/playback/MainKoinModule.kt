package com.banuba.example.playback

import com.banuba.sdk.ve.media.VideoGalleryResourceValidator
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class MainKoinModule {

    val module = module {

        viewModel {
            MainViewModel(
                context = androidContext(),
                videoValidator = VideoGalleryResourceValidator(
                    context = androidContext()
                ),
                videoPlayer = get()
            )
        }
    }
}