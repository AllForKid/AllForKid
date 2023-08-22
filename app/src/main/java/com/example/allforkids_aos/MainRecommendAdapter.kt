package com.example.allforkids_aos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRecommendAdapter(private val itemList: ArrayList<MainRecommendItem>) : RecyclerView.Adapter<MainRecommendAdapter.MainRecommendViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecommendViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recommend_item, parent,false)
        return MainRecommendViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainRecommendViewHolder, position: Int) {
        holder.textTitle.text = itemList[position].title
        holder.textExplain.text = itemList[position].explainText
        holder.itemImage.setImageResource(itemList[position].itemImg)

    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class MainRecommendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle = itemView.findViewById<TextView>(R.id.titleTextView)
        val textExplain = itemView.findViewById<TextView>(R.id.explainTextView)
        val itemImage = itemView.findViewById<ImageView>(R.id.itemImageView)

    }
}