package com.example.allforkids_aos.landing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.allforkids_aos.R
import com.example.allforkids_aos.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        if (savedInstanceState == null) {
            // savedInstanceState가 null인 경우에만 Fragment를 추가합니다.
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            val signUpFragment = SignUpFragment() // 기본값으로 보여줄 Fragment
            fragmentTransaction.add(R.id.sign_up_container, signUpFragment)
            fragmentTransaction.commit()
        }
    }
}
