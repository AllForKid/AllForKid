package com.example.allforkids_aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.databinding.ActivityCommunityMypageListBinding

class CommunityMypageListActivity : AppCompatActivity() {
    private val viewBinding : ActivityCommunityMypageListBinding by lazy {
        ActivityCommunityMypageListBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val mypageReviewListRecyclerView: RecyclerView = findViewById(R.id.mypage_list_recycler)
        val layoutManager = GridLayoutManager(this, 3)
        mypageReviewListRecyclerView.layoutManager = layoutManager

        val btnMypageReviewPost = findViewById<Button>(R.id.btn_mypage_review_post)
        btnMypageReviewPost.setOnClickListener {
            val intent = Intent(this, CommunityReviewPostActivity::class.java)
            startActivity(intent)
        }
    }
}