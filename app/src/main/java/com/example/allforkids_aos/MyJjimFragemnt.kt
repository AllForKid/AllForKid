package com.example.allforkids_aos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.allforkids_aos.databinding.FragmentMyJjimBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MyJjimFragemnt.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyJjimFragemnt : Fragment() {
    private lateinit var viewBinding: FragmentMyJjimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentMyJjimBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}