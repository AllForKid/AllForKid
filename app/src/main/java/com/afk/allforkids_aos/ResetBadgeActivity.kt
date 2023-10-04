package com.afk.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.afk.allforkids_aos.databinding.ActivityResetBadgeBinding

class ResetBadgeActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityResetBadgeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityResetBadgeBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.actionbar.appbarResetBadge.visibility = View.VISIBLE
    }
}