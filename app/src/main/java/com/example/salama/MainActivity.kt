package com.example.salama

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.salama.fragments.viewPagerFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.content, viewPagerFragment()).commit()
        }
    }

}