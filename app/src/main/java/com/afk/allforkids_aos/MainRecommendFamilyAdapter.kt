package com.afk.allforkids_aos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainRecommendFamilyAdapter(private val itemList: ArrayList<MainRecommendFamilyItem>) : RecyclerView.Adapter<MainRecommendFamilyAdapter.MainRecommendFamilyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecommendFamilyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_recommend_family_item, parent,false)
        return MainRecommendFamilyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainRecommendFamilyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].itemImg)
        holder.textTitle.text = itemList[position].title

    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    inner class MainRecommendFamilyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView.findViewById<ImageView>(R.id.placeImageView)
        val textTitle = itemView.findViewById<TextView>(R.id.placeTextView)

    }
}