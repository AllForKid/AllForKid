package com.example.allforkids_aos

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.allforkids_aos.databinding.ActivityMyPageSettingBinding
import com.example.allforkids_aos.model.BirthViewModel
import com.google.android.material.textfield.TextInputEditText

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
        validateNickname()
    }

    override fun onResume() {
        super.onResume()
        // SharedPreferences에서 데이터 읽어오기
        val sharedPreferences = getSharedPreferences("birth", Context.MODE_PRIVATE)
        val receivedData = sharedPreferences.getString("birth", "2000-01-01")
        viewBinding.tvBirth.text = receivedData
    }

    private fun validateNickname(): Boolean {
        viewBinding.editNickname.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (viewBinding.editNickname.text!!.isEmpty() || viewBinding.editNickname.text!!.length > 10) {
                    viewBinding.editLayoutNickname.error = "올바른 입력 값이 아닙니다."
                } else {
                    viewBinding.editLayoutNickname.error = "사용할 수 있는 닉네임입니다."
                }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }
        })
        return TODO("Provide the return value")
    }
}