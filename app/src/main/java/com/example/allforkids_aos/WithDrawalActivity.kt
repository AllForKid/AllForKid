package com.example.allforkids_aos

import android.graphics.Color
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

        viewBinding.checkBox.isChecked = false
        viewBinding.appCompatButton.isEnabled = false

        viewBinding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            viewBinding.appCompatButton.isEnabled = isChecked
        }
        viewBinding.appCompatButton.setOnClickListener {
            // 클릭 형태 유지
            viewBinding.appCompatButton.isSelected = viewBinding.appCompatButton.isSelected != true

            // textView 색상 변화
            val newTextColor = Color.WHITE
            viewBinding.appCompatButton.setTextColor(newTextColor)
        }
    }
}