package com.example.salama.fragments

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import androidx.viewpager2.widget.ViewPager2
import com.example.salama.R
import com.example.salama.dash.Dashboard
import kotlinx.android.synthetic.main.fragment_dashscreen1.*
import kotlinx.android.synthetic.main.fragment_second_screen.view.*
import kotlinx.android.synthetic.main.fragment_third_screen.*
import java.net.URL

class dashscreen1 : Fragment() {
    private var playbackPosition = 0
    private  val rtsUrl =""//insert the streaming link
    private lateinit var mediaController:MediaController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashscreen1, container, false)

        liveStream.setOnPreparedListener {
            mediaController.setAnchorView(videoContainer)
            liveStream.setMediaController(mediaController)
            liveStream.seekTo(playbackPosition)
            liveStream.start()
        }
        liveStream.setOnInfoListener { player, what, extra ->
            if (what ==MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START)
                progressBaravideo.visibility = View.INVISIBLE
            true
        }

        return view

    }
    override  fun onStart(){
        super.onStart()
val url = Uri.parse(rtsUrl)
        liveStream.setVideoURI(url)
        progressBaravideo.visibility =View.VISIBLE

    }

    override fun onPause() {
        super.onPause()
        liveStream.pause()
        playbackPosition = liveStream.currentPosition
    }

    override fun onStop() {
        super.onStop()
        liveStream.stopPlayback()
        super.onStop()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        return
    }


}




