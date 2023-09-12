package com.example.allforkids_aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.allforkids_aos.databinding.ActivityCommunityReviewPostBinding

class CommunityReviewPostActivity : AppCompatActivity() {
    private val viewBinding : ActivityCommunityReviewPostBinding by lazy {
        ActivityCommunityReviewPostBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val btnReviewPostBack = findViewById<ImageView>(R.id.btn_review_post_back)
        btnReviewPostBack.setOnClickListener {
            val intent = Intent(this, CommunityMypageListActivity::class.java) // OtherActivity로 이동
            startActivity(intent)
        }
    }
}