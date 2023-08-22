package com.example.allforkids_aos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MainRecommendTagAdapter(private val itemList: ArrayList<MainRecommendTagItem>) : RecyclerView.Adapter<MainRecommendTagAdapter.MainRecommendTagViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecommendTagViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recommend_tag_item, parent,false)
        return MainRecommendTagViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainRecommendTagViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].itemImg)

    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class MainRecommendTagViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView.findViewById<ImageView>(R.id.tagImageView)

    }
}