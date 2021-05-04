package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragments.fragments.FirstFragment
import com.example.fragments.fragments.SecondFragment
import com.example.fragments.fragments.ThirdFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Fragment>()
        list.add(FirstFragment())
        list.add(FirstFragment())
        list.add(FirstFragment())


        view_pager.apply {
            adapter = ViewPagerAdapter(supportFragmentManager, list)
        }

        view_pager.offscreenPageLimit = 3

        tab_layout.setupWithViewPager(view_pager)
    }

}