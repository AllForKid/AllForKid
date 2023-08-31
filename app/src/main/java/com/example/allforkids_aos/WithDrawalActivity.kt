package com.example.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import com.example.allforkids_aos.databinding.ActivityWithDrawalBinding

class WithDrawalActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityWithDrawalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityWithDrawalBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.actionbar.appbarWithdrawal.visibility = View.VISIBLE
//        viewBinding.actionbar.appbarBackBtn.setOnClickListener {
//            finish()
//        }
        viewBinding.appCompatButton.setOnClickListener {
            viewBinding.appCompatButton.isPressed = viewBinding.appCompatButton.isPressed != true
        }
    }
}