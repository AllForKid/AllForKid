package com.example.allforkids_aos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MainRecommendThemeAdapter(private val itemList: ArrayList<MainRecommendThemeItem>) : RecyclerView.Adapter<MainRecommendThemeAdapter.MainRecommendThemeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecommendThemeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recommend_theme_item, parent,false)
        return MainRecommendThemeViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainRecommendThemeViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].itemImg)

    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class MainRecommendThemeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView.findViewById<ImageView>(R.id.imageView)

    }
}