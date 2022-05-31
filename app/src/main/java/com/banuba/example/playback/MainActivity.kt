package com.banuba.example.playback

import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.banuba.example.playback.utils.GetMultipleContents
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel by viewModel<MainViewModel>()

    private val selectVideos = registerForActivityResult(GetMultipleContents()) {
        val predefinedVideos = it.toTypedArray()
        if (predefinedVideos.isNotEmpty()) {
            viewModel.addVideosToPlayback(predefinedVideos)
        }
    }

    private val selectMusicTrack = registerForActivityResult(ActivityResultContracts.GetContent()) {
        if (it == null) {
            musicEffectCheckBox.isChecked = false
            return@registerForActivityResult
        }
        viewModel.addMusicToPlayback(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        videoPlayerSelectVideos.setOnClickListener {
            selectVideos.launch("video/*")
        }

        videoPlayerMakeScreenshot.setOnClickListener {
            viewModel.takeScreenshot()
        }

        videoPlaybackBtn.setOnClickListener {
            if (videoPlaybackBtn.isActivated) {
                viewModel.pause()
            } else {
                viewModel.play()
            }
            videoPlaybackBtn.isActivated = !videoPlaybackBtn.isActivated
        }

        videoRewindBtn.setOnClickListener {
            viewModel.rewind()
        }

        fxEffectCheckBox.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                viewModel.applyFxEffect()
            } else {
                viewModel.removeFxEffect()
            }
        }

        textEffectCheckBox.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                viewModel.applyTextEffect()
            } else {
                viewModel.removeTextEffect()
            }
        }

        gifEffectCheckBox.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                viewModel.applyGifEffect()
            } else {
                viewModel.removeGifEffect()
            }
        }

        speedEffectCheckBox.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                viewModel.applySpeedEffect()
            } else {
                viewModel.removeSpeedEffect()
            }
        }

        lutEffectCheckBox.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                viewModel.applyLutEffect()
            } else {
                viewModel.removeLutEffect()
            }
        }

        musicEffectCheckBox.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                selectMusicTrack.launch("audio/*")
            } else {
                viewModel.removeMusicEffect()
            }
        }

        videoPlayerSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    viewModel.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

        videoPlayerVolumeSeekBar.max = 100
        videoPlayerVolumeSeekBar.progress = 100
        videoPlayerVolumeSeekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, progress: Int, fromUser: Boolean) {
                viewModel.setVolume(progress.toFloat() / 100)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

        screenshotCardView.setOnClickListener {
            screenshotCardView.visibility = View.GONE
        }

        viewModel.errorMsg.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }

        viewModel.totalDuration.observe(this) { totalDuration ->
            videoPlayerSeekBar.max = totalDuration
        }

        viewModel.playbackPosition.observe(this) { position ->
            videoPlayerSeekBar.progress = position
        }

        viewModel.screenshotBitmap.observe(this) { screenshot ->
            screenshotImageView.setImageBitmap(screenshot)
            screenshotCardView.visibility = View.VISIBLE
        }

        viewModel.prepare(videoPlayerSurfaceView.holder)

    }

    override fun onStop() {
        videoPlaybackBtn.isActivated = false
        viewModel.pause()
        super.onStop()
    }

    override fun onDestroy() {
        viewModel.releasePlayer(videoPlayerSurfaceView.holder)
        super.onDestroy()
    }


}