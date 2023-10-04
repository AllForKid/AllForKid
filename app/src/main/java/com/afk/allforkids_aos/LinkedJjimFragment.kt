package com.afk.allforkids_aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afk.allforkids_aos.databinding.FragmentLinkedJjimBinding

class LinkedJjimFragment : Fragment() {
    private lateinit var viewBinding: FragmentLinkedJjimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentLinkedJjimBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}