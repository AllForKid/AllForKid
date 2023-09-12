package com.example.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allforkids_aos.databinding.ActivityCommunityReviewDetailBinding

class CommunityReviewDetailActivity : AppCompatActivity() {
    private val viewBinding : ActivityCommunityReviewDetailBinding by lazy {
        ActivityCommunityReviewDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
    }
}