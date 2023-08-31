package com.example.allforkids_aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.adapter.AnnouncementAdapter
import com.example.allforkids_aos.adapter.HelpAdapter
import com.example.allforkids_aos.databinding.FragmentHelpBinding
import com.example.allforkids_aos.model.Announcement
import com.example.allforkids_aos.model.Help

class HelpFragment : Fragment() {
    private lateinit var viewBinding: FragmentHelpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentHelpBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }
    private fun setupRecyclerView() {
        val helpList = createHelpList()
        val helpRecyclerView = viewBinding.rvHelp
        helpRecyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        helpRecyclerView.adapter = HelpAdapter(helpList)
    }

    private fun createHelpList(): List<Help> {
        val helpList = mutableListOf<Help>()

        helpList.add(Help("게시글/댓글을 신고했는데 언제 답변이 오나요?", getString(R.string.help_content1)))
        helpList.add(Help("게시글/댓글을 신고했는데 언제 답변이 오나요?", getString(R.string.help_content1)))
        helpList.add(Help("게시글/댓글을 신고했는데 언제 답변이 오나요?", getString(R.string.help_content1)))
        helpList.add(Help("게시글/댓글을 신고했는데 언제 답변이 오나요?", getString(R.string.help_content1)))
        helpList.add(Help("게시글/댓글을 신고했는데 언제 답변이 오나요?", getString(R.string.help_content1)))
        helpList.add(Help("게시글/댓글을 신고했는데 언제 답변이 오나요?", getString(R.string.help_content1)))
        // ... 추가적인 Character를 만들고 리스트에 추가하십시오
        return helpList
    }


}