package com.afk.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.afk.allforkids_aos.adapter.JjimTravelAdapter
import com.afk.allforkids_aos.databinding.ActivityJjimTravelBinding
import com.google.android.material.tabs.TabLayoutMediator

class JjimTravelActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityJjimTravelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityJjimTravelBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.actionbar.appbarJjimTravel.visibility = View.VISIBLE
        val jjimTravelAdapter = JjimTravelAdapter(this)
        viewBinding.vp2.adapter = jjimTravelAdapter

        val tabTitleArray = arrayOf(
            "내가 찜한 여행지",
            "연동된 계정이 찜한 여행지"
        )
        TabLayoutMediator(viewBinding.tabLayout, viewBinding.vp2) {tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()
    }
}