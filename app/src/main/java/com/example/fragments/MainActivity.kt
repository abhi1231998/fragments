package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragments.fragments.FirstFragment
import com.example.fragments.fragments.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<Fragment>()
        list.add(FirstFragment())
        list.add(SecondFragment())


        view_pager.apply {
            adapter = ViewPagerAdapter(supportFragmentManager, list)
        }

        tab_layout.setupWithViewPager(view_pager)
    }

}