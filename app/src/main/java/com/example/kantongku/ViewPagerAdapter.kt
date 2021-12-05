package com.example.kantongku

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
            private val JUMLAH_MENU=3

            override fun createFragment(position: Int): Fragment {
                when (position) {
                    0 -> {return TransaksiFragment()}
                    1 -> {return HutangFragment()}
                    2 -> {return KantongFragment()}
                    else -> {return KantongFragment()}
                }
            }

            override fun getItemCount(): Int {
                return JUMLAH_MENU
            }
        }