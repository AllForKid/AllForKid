package com.afk.allforkids_aos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afk.allforkids_aos.databinding.FragmentCommunityBinding


class CommunityFragment : Fragment() {
    private lateinit var viewBinding: FragmentCommunityBinding

    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentCommunityBinding.inflate(inflater, container, false)
        return viewBinding.root

    }
}