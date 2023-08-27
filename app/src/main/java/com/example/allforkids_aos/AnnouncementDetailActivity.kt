package com.example.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.allforkids_aos.databinding.ActivityAnnouncementDetailBinding

class AnnouncementDetailActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityAnnouncementDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAnnouncementDetailBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.actionbar.appbarNotice.visibility = View.VISIBLE
    }
}