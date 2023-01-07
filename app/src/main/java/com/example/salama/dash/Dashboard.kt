package com.example.salama.dash

import android.graphics.Insets.add
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.annotation.RequiresApi
import androidx.core.os.postDelayed
import androidx.fragment.app.Fragment
import com.example.salama.R
import com.example.salama.fragments.DashboardFragment
import com.example.salama.fragments.dashscreen1
import com.example.salama.fragments.viewPagerFragment

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(android.R.id.content, DashboardFragment()).commit()
        }



    }


}