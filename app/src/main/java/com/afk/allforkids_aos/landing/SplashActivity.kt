package com.afk.allforkids_aos.landing

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.afk.allforkids_aos.MainActivity
import com.afk.allforkids_aos.R

class SplashActivity : AppCompatActivity() {

    private lateinit var prefs: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        // SharedPreferences 초기화
        prefs = getSharedPreferences("onBoarding", Context.MODE_PRIVATE)

        // 2초 동안 스플래시 화면을 표시한 후 작업 수행
        Handler(Looper.getMainLooper()).postDelayed({
            // 온보딩을 완료한 경우
            if (isOnBoardingFinished()) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // 스플래시 화면을 종료
            } else {
                // 온보딩을 완료하지 않은 경우
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish() // 스플래시 화면을 종료
            }
        }, 2000) // 3초 후에 메인 화면 또는 로그인 화면으로 이동
    }

        private fun isOnBoardingFinished(): Boolean {
            return prefs.getBoolean("finished", false)
        }
}
