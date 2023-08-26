package com.example.allforkids_aos.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.allforkids_aos.MyPageSettingActivity
import com.example.allforkids_aos.R
import com.example.allforkids_aos.WithDrawalActivity
import com.example.allforkids_aos.databinding.FragmentSettingBinding

class SettingFragment : Fragment() {
    private lateinit var viewBinding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentSettingBinding.inflate(inflater, container,false)

        viewBinding.imgMyPageProfile.clipToOutline = true

        viewBinding.btnSetting.setOnClickListener {
            val intent = Intent(requireActivity(), MyPageSettingActivity::class.java)
            startActivity(intent)
        }

        viewBinding.tvWithdrawal.setOnClickListener {
            val intent = Intent(requireActivity(), WithDrawalActivity::class.java)
            startActivity(intent)
        }
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}