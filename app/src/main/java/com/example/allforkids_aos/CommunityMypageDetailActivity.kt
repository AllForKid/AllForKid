package com.example.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allforkids_aos.databinding.ActivityCommunityMypageDetailBinding

class CommunityMypageDetailActivity : AppCompatActivity() {
    private val viewBinding : ActivityCommunityMypageDetailBinding by lazy {
        ActivityCommunityMypageDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }
}