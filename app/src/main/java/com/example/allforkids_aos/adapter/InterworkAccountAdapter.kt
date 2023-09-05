package com.example.allforkids_aos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.databinding.ItemAccountBinding
import com.example.allforkids_aos.model.InterworkAccount

class InterworkAccountAdapter(private val accountList: List<InterworkAccount>) : RecyclerView.Adapter<InterworkAccountAdapter.InterworkAccountViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InterworkAccountViewHolder {
        val itemBinding = ItemAccountBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return InterworkAccountViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: InterworkAccountViewHolder, position: Int) {
        val account = accountList[position]
        holder.bind(account)
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
        }
    }
}