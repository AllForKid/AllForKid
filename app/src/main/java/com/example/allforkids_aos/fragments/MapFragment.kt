package com.example.allforkids_aos.fragments

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.allforkids_aos.R
import com.kakao.util.maps.helper.Utility.getPackageInfo
import net.daum.mf.map.api.MapView
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import android.content.ContentValues.TAG


class MapFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)

        val mapView = MapView(requireContext())

        val mapViewContainer = rootView.findViewById(R.id.map_view) as ViewGroup
        mapViewContainer.addView(mapView)

        return rootView
    }



}