package com.example.salama.fragments


import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.postDelayed
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.salama.R




class welcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       Handler().postDelayed({
           if (onBoardingFinished()){
               findNavController().navigate(R.id.action_welcomeFragment_to_home22)

           }else{
               findNavController().navigate(R.id.action_welcomeFragment_to_home22)
           }

       },3000)
        return inflater.inflate(R.layout.fragment_welcome,container,false)
    }
    private fun onBoardingFinished():Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
     return sharedPref.getBoolean("finished",false)
    }




}