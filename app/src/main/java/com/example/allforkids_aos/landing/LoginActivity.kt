package com.example.allforkids_aos.landing
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.allforkids_aos.MainActivity
import com.example.allforkids_aos.R
import com.example.allforkids_aos.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // 로그인 버튼 클릭 시 MainActivity로 이동하는 예제 코드
        val loginButton = binding.btnLogin
        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // LoginActivity 종료
        }

        // 회원가입 버튼 클릭 시 SignUpActivity로 이동하는 예제 코드
        val signUpButton = binding.btnSignUp
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish() // LoginActivity 종료
        }

    }
}
