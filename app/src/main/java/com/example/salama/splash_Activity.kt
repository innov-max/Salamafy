package com.example.salama

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.salama.fragments.welcomeFragment


class splash_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.salama.R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            val i = Intent(this@splash_Activity, MainActivity::class.java)
            startActivity(i)
        }, 5000)
    }

}