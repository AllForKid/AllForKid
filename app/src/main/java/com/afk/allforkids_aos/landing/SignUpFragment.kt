package com.afk.allforkids_aos.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.afk.allforkids_aos.R
import com.afk.allforkids_aos.databinding.FragmentSignUpBinding

class SignUpFragment:Fragment() {
    private lateinit var binding:FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentSignUpBinding.inflate(layoutInflater)

        // 부모 계정 버튼 클릭 리스너
        binding.ivLogo.setOnClickListener {
            // TODO: sharedPreference에 부모 계정임을 저장한다.
            // 예: requireContext().getSharedPreferences("your_pref_name", Context.MODE_PRIVATE).edit().putBoolean("is_parent_account", true).apply()
        }

        // 아이 계정 버튼 클릭 리스너
        binding.ivLogo2.setOnClickListener {
            // TODO: sharedPreference에 아이 계정임을 저장한다.
            // 예: requireContext().getSharedPreferences("your_pref_name", Context.MODE_PRIVATE).edit().putBoolean("is_parent_account", false).apply()
        }

        // 다음 버튼 클릭 리스너
        binding.btnLogin.setOnClickListener {
            // 동의 페이지로 넘어가기
            // Fragment 내에서 다음 Fragment로 전환
            val fragmentManager = parentFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            // Fragment 교체
            val agreeFragment = SignUpAgreeFragment()
            fragmentTransaction.replace(R.id.sign_up_container, agreeFragment)

            // Transaction 커밋
            fragmentTransaction.addToBackStack(null) // 뒤로 가기 스택에 추가
            fragmentTransaction.commit()
        }
    }
}