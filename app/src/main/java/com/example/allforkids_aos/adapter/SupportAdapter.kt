package com.example.allforkids_aos.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.allforkids_aos.AskFragment
import com.example.allforkids_aos.HelpFragment
import com.example.allforkids_aos.SupportHelpActivity

class SupportAdapter(fragmentActivity: SupportHelpActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HelpFragment()
            1 -> AskFragment()
            else -> HelpFragment()
        }
    }
}