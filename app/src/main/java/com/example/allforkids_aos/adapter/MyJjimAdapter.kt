package com.example.allforkids_aos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.databinding.ItemMyJjimBinding
import com.example.allforkids_aos.model.MyJjim

class MyJjimAdapter(private val myJjimList: List<MyJjim>) : RecyclerView.Adapter<MyJjimAdapter.MyJjimViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyJjimViewHolder {
        val itemBinding = ItemMyJjimBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MyJjimViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MyJjimViewHolder, position: Int) {
        val myJjim = myJjimList[position]
        holder.bind(myJjim)
    }

    override fun getItemCount(): Int {
        return myJjimList.size
    }

    inner class MyJjimViewHolder(private val itemBinding: ItemMyJjimBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(myJjim: MyJjim) {
            itemBinding.textView17.text = myJjim.content
        }
    }
}