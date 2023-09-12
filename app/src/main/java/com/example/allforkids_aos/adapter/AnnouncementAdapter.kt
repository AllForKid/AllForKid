package com.example.allforkids_aos.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.AnnouncementActivity
import com.example.allforkids_aos.AnnouncementDetailActivity
import com.example.allforkids_aos.databinding.ItemAnnouncementBinding
import com.example.allforkids_aos.model.Announcement

class AnnouncementAdapter(private val announcementList: List<Announcement>) : RecyclerView.Adapter<AnnouncementAdapter.AnnouncementViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnnouncementViewHolder {
        val itemBinding = ItemAnnouncementBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return AnnouncementViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AnnouncementViewHolder, position: Int) {
        val announcement = announcementList[position]
        holder.bind(announcement)
    }

    override fun getItemCount(): Int {
        return announcementList.size
    }

    inner class AnnouncementViewHolder(private val itemBinding: ItemAnnouncementBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        private val contentTextView: TextView = itemBinding.tvContent
        private val dateTextView: TextView = itemBinding.tvDate

        fun bind(announcement: Announcement) {
            // Character 객체로부터 데이터를 가져와서 뷰에 설정
            contentTextView.text = announcement.content
            dateTextView.text = announcement.date

            itemBinding.root.setOnClickListener {
                val intent = Intent(itemBinding.root.context,AnnouncementDetailActivity::class.java)
                itemBinding.root.context.startActivity(intent)

            }
        }
    }

}