package com.example.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.allforkids_aos.adapter.SupportAdapter
import com.example.allforkids_aos.databinding.ActivitySupportHelpBinding
import com.google.android.material.tabs.TabLayoutMediator

class SupportHelpActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivitySupportHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySupportHelpBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.actionbar.appbarCustomerService.visibility = View.VISIBLE
        val supportAdapter = SupportAdapter(this)
        viewBinding.vp2.adapter = supportAdapter

        val tabTitleArray = arrayOf(
            "도움말",
            "문의하기"
        )
        TabLayoutMediator(viewBinding.tabLayout, viewBinding.vp2) {tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()
    }

}