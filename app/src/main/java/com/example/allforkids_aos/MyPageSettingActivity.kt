package com.example.allforkids_aos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.allforkids_aos.databinding.ActivityMyPageSettingBinding
import com.example.allforkids_aos.model.BirthViewModel

class MyPageSettingActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMyPageSettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMyPageSettingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.actionbar.appbarSave.visibility = View.VISIBLE
        viewBinding.imgMyPageProfile.clipToOutline = true
        viewBinding.tvChangeBirth.setOnClickListener {
            val intent = Intent(this, MyPageBirthActivity::class.java)
            startActivity(intent)
        }
        viewBinding.editNickname.setOnClickListener{
            if (!validateNickname()) {
                viewBinding.editLayoutNickname.error = "사용할 수 있는 닉네임입니다"
                return@setOnClickListener
            }
        }
    }
    override fun onResume() {
        super.onResume()
        // SharedPreferences에서 데이터 읽어오기
        val sharedPreferences = getSharedPreferences("birth", Context.MODE_PRIVATE)
        val receivedData = sharedPreferences.getString("birth", "2000-01-01")
        viewBinding.tvBirth.text = receivedData
    }
    private fun validateNickname(): Boolean {
        val value:String = viewBinding.editLayoutNickname.editText?.text.toString()

        return if (value.isEmpty()) {
            viewBinding.editLayoutNickname.error = "닉네임을 입력해주세요."
            false
        } else if (value.length > 10) {
            viewBinding.editLayoutNickname.error = "글자수가 10을 초과했습니다."
            false
        } else {
            viewBinding.editLayoutNickname.error = null
            true
        }
    }
}