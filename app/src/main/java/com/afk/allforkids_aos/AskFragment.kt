package com.afk.allforkids_aos

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.afk.allforkids_aos.databinding.AskDialogBinding
import com.afk.allforkids_aos.databinding.FragmentAskBinding

class AskFragment : Fragment() {
    private lateinit var viewBinding: FragmentAskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentAskBinding.inflate(layoutInflater)

        viewBinding.checkBox.isChecked = false
        viewBinding.appCompatButton.isEnabled = false

        viewBinding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            viewBinding.appCompatButton.isEnabled = isChecked
        }
        viewBinding.appCompatButton.setOnClickListener {
            // 클릭 형태 유지
            viewBinding.appCompatButton.isSelected = !viewBinding.appCompatButton.isSelected

            // textView 색상 변화
            if (viewBinding.appCompatButton.isSelected) {
                viewBinding.appCompatButton.setTextColor(resources.getColorStateList(R.color.white))
            } else {
                viewBinding.appCompatButton.setTextColor(Color.parseColor("#6B6666"))
            }

            showDialog()
        }
        return viewBinding.root
    }

    private fun showDialog(){
        val dialogViewBinding = AskDialogBinding.inflate(layoutInflater)
        val dialog= androidx.appcompat.app.AlertDialog.Builder(requireContext()).create()
        dialog.setView(dialogViewBinding.root)

        // dialog 배경 투명 처리
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        // 다이얼로그 크기 설정
        dialog.window?.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(false)    // 다이얼로그 영역 밖 클릭 시, 다이얼 로그 삭제 금지
        dialog.setCancelable(false)                 // 취소가 가능하도록 하는 코드

        dialog.show()

        dialogViewBinding.button.setOnClickListener {
            dialog.dismiss()
            viewBinding.appCompatButton.isSelected = false
        }
    }


}