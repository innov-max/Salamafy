package com.example.salama.fragments


import android.content.Intent
import android.os.Bundle
import android.os.Handler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.salama.MainActivity
import com.example.salama.R
import com.example.salama.dash.Dashboard
import kotlinx.android.synthetic.main.fragment_third_screen.*


class thirdScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_third_screen,container,false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnfinish.setOnClickListener {
            val intent = Intent(context,Dashboard::class.java)
            startActivity(intent)
        }
        return
    }

}



