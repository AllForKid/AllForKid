package com.example.allforkids_aos.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.allforkids_aos.JjimTravelActivity
import com.example.allforkids_aos.LinkedJjimFragment
import com.example.allforkids_aos.MyJjimFragemnt

class JjimTravelAdapter(fragmentActivity: JjimTravelActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MyJjimFragemnt()
            1 -> LinkedJjimFragment()
            else -> MyJjimFragemnt()
        }
    }
}