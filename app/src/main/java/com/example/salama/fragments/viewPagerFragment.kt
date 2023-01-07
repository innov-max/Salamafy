package com.example.salama.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.salama.R
import com.example.salama.classes.viewPagerAdapter
import kotlinx.android.synthetic.main.fragment_view_pager.view.*


class viewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager,container,false)
        // Inflate the layout for this fragment
        val fragmentlist = arrayListOf<Fragment>(
            firstScreen(),
            secondScreen(),
            thirdScreen(),


        )
        val adapter = viewPagerAdapter(
          fragmentlist,
          requireActivity().supportFragmentManager,
          lifecycle
        )
        view.viewPager.adapter = adapter
     return view
    }



}