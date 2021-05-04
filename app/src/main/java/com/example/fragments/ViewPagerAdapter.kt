@file:Suppress("DEPRECATION")

package com.example.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, val fragments : ArrayList<Fragment>)
    : FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return fragments.size
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First"
            1 -> "Second"
            2 -> "Third"
            else -> "Unknown"
        }
    }
}