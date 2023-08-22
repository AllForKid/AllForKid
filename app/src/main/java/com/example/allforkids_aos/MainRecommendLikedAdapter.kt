package com.example.allforkids_aos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRecommendLikedAdapter(private val itemList: ArrayList<MainRecommendLikedItem>) : RecyclerView.Adapter<MainRecommendLikedAdapter.MainRecommendLikedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecommendLikedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recommend_liked_item, parent,false)
        return MainRecommendLikedViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainRecommendLikedViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].itemImg)
        holder.textTitle.text = itemList[position].title

    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class MainRecommendLikedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView.findViewById<ImageView>(R.id.likedPlaceImageView)
        val textTitle = itemView.findViewById<TextView>(R.id.likedTextView)

    }
}