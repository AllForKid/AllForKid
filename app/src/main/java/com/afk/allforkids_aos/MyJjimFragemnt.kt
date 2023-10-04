package com.afk.allforkids_aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.afk.allforkids_aos.adapter.MyJjimAdapter
import com.afk.allforkids_aos.databinding.FragmentMyJjimBinding
import com.afk.allforkids_aos.model.MyJjim

class MyJjimFragemnt : Fragment() {
    private lateinit var viewBinding: FragmentMyJjimBinding
    private val myJjimList = mutableListOf<MyJjim>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentMyJjimBinding.inflate(layoutInflater)

        val recyclerView = viewBinding.rvMyJjim
        val emptyImageView = viewBinding.imgEmptyRv
        val emptyTextView = viewBinding.tvEmptyRv

//        myJjimList.add(MyJjim("nc dinos"))

        val adapter = MyJjimAdapter(myJjimList)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        if(adapter.itemCount == 0 ) {
            emptyImageView.visibility = View.VISIBLE
            emptyTextView.visibility = View.VISIBLE
        } else {
            emptyImageView.visibility = View.GONE
            emptyTextView.visibility = View.GONE
        }
        return viewBinding.root
    }
}