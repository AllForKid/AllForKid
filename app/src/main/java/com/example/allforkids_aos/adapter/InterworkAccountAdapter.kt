package com.example.allforkids_aos.adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.databinding.AccountLinkedDialogBinding
import com.example.allforkids_aos.databinding.AskDialogBinding
import com.example.allforkids_aos.databinding.ItemAccountBinding
import com.example.allforkids_aos.model.InterworkAccount
import com.example.allforkids_aos.model.MyJjim

class InterworkAccountAdapter(
    private val context: Context,
    private val accountList: List<InterworkAccount>) : RecyclerView.Adapter<InterworkAccountAdapter.InterworkAccountViewHolder>() {
    private var onItemClickListener: ((InterworkAccount) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InterworkAccountViewHolder {
        val itemBinding = ItemAccountBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return InterworkAccountViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: InterworkAccountViewHolder, position: Int) {
        val account = accountList[position]
        holder.bind(account)

        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(account)
        }
    }

    override fun getItemCount(): Int {
        return accountList.size
    }

    inner class InterworkAccountViewHolder(private val itemBinding: ItemAccountBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(interworkAccount: InterworkAccount) {
            itemBinding.tvNum.text = interworkAccount.number
            itemBinding.tvLinkDate.text = interworkAccount.date
            itemBinding.tvNickname.text = interworkAccount.nickname
            itemBinding.tvCode.text = interworkAccount.code
            itemBinding.tvUnlink.text = interworkAccount.unlinked

            itemBinding.tvUnlink.setOnClickListener {
                showDialog(context)
            }
        }
    }

    private fun showDialog(context:Context){
        val dialogViewBinding = AccountLinkedDialogBinding.inflate(LayoutInflater.from(context))
        val dialog= androidx.appcompat.app.AlertDialog.Builder(context).create()
        dialog.setView(dialogViewBinding.root)

        // dialog 배경 투명 처리
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        // 다이얼로그 크기 설정
        dialog.window?.setLayout(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(false)    // 다이얼로그 영역 밖 클릭 시, 다이얼 로그 삭제 금지
        dialog.setCancelable(true)                 // 취소가 가능하도록 하는 코드

        dialog.show()

        dialogViewBinding.button.setOnClickListener {
            dialog.dismiss()
        }
        dialogViewBinding.button13.setOnClickListener {
            dialog.dismiss()
        }

    }
}