package com.afk.allforkids_aos.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.afk.allforkids_aos.AskFragment
import com.afk.allforkids_aos.HelpFragment
import com.afk.allforkids_aos.SupportHelpActivity

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