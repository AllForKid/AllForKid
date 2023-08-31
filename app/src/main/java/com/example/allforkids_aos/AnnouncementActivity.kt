package com.example.allforkids_aos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.allforkids_aos.adapter.AnnouncementAdapter
import com.example.allforkids_aos.databinding.ActivityAnnouncementBinding
import com.example.allforkids_aos.model.Announcement

class AnnouncementActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityAnnouncementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAnnouncementBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.actionbar.appbarNotice.visibility = View.VISIBLE

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val announcementList = createAnnouncementList()
        val announcementRecyclerView = viewBinding.rvAnnouncement
        announcementRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        announcementRecyclerView.adapter = AnnouncementAdapter(announcementList)
    }

    private fun createAnnouncementList(): List<Announcement> {
        val announcementList = mutableListOf<Announcement>()
        announcementList.add(Announcement("[안내] 업데이트 관련 안내", "2023. 08. 19"))
        announcementList.add(Announcement("[안내] 업데이트 관련 안내", "2023. 08. 20"))
        // ... 추가적인 Character를 만들고 리스트에 추가하십시오
        return announcementList
    }
}