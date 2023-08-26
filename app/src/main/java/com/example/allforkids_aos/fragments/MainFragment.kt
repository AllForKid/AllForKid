package com.example.allforkids_aos.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.MainRecommendAdapter
import com.example.allforkids_aos.MainRecommendItem
import com.example.allforkids_aos.R
import com.example.allforkids_aos.MainRecommendFamilyItem
import com.example.allforkids_aos.MainRecommendFamilyAdapter
import com.example.allforkids_aos.MainRecommendLikedItem
import com.example.allforkids_aos.MainRecommendThemeAdapter
import com.example.allforkids_aos.MainRecommendThemeItem
import com.example.allforkids_aos.MainRecommendLikedAdapter
import com.example.allforkids_aos.MainRecommendTagItem
import com.example.allforkids_aos.MainRecommendTagAdapter



class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemList = ArrayList<MainRecommendItem>()

        itemList.add(MainRecommendItem("놓치면 후회하는 이번 달 어린이 전시", "<<하이디 부허 : 공간은 피막, 피부>>", R.drawable.main_recommend_image1))
        itemList.add(MainRecommendItem("놓치면 후회하는 이번 달 어린이 전시","<<하이디 부허 : 공간은 피막, 피부>>", R.drawable.main_recommend_image1))
        itemList.add(MainRecommendItem("놓치면 후회하는 이번 달 어린이 전시","<<하이디 부허 : 공간은 피막, 피부>>", R.drawable.main_recommend_image1))

        val mainRecommendAdapter = MainRecommendAdapter(itemList)

        val recyclerView = view.findViewById<RecyclerView>(R.id.mainRV_board)
        recyclerView.adapter = mainRecommendAdapter


        // family
        val familyItemList = ArrayList<MainRecommendFamilyItem>()

        familyItemList.add(MainRecommendFamilyItem(R.drawable.main_recommend_image2,"강릉"))
        familyItemList.add(MainRecommendFamilyItem(R.drawable.main_recommend_yeosu,"여수"))
        familyItemList.add(MainRecommendFamilyItem(R.drawable.main_recommend_jeju,"제주"))

        val mainRecommendFamilyAdapter = MainRecommendFamilyAdapter(familyItemList)

        val familyRecyclerView = view.findViewById<RecyclerView>(R.id.mainFamilyRV_board)
        familyRecyclerView.adapter = mainRecommendFamilyAdapter


        // theme
        val themeItemList = ArrayList<MainRecommendThemeItem>()

        themeItemList.add(MainRecommendThemeItem(R.drawable.main_recommend_image3))
        themeItemList.add(MainRecommendThemeItem(R.drawable.main_recommend_image4))
        themeItemList.add(MainRecommendThemeItem(R.drawable.main_recommend_image3))

        val mainRecommendThemeAdapter = MainRecommendThemeAdapter(themeItemList)

        val themeRecyclerView = view.findViewById<RecyclerView>(R.id.mainThemeRV_board)
        themeRecyclerView.adapter = mainRecommendThemeAdapter


        // liked
        val likedItemList = ArrayList<MainRecommendLikedItem>()

        likedItemList.add(MainRecommendLikedItem(R.drawable.main_recommend_yeosu,"여수"))
        likedItemList.add(MainRecommendLikedItem(R.drawable.main_recommend_jeju,"제주"))
        likedItemList.add(MainRecommendLikedItem(R.drawable.main_recommend_image2,"강릉"))

        val mainRecommendLikedAdapter = MainRecommendLikedAdapter(likedItemList)

        val likedRecyclerView = view.findViewById<RecyclerView>(R.id.mainLikedRV_board)
        likedRecyclerView.adapter = mainRecommendLikedAdapter


        // tag
        val tagItemList = ArrayList<MainRecommendTagItem>()

        tagItemList.add(MainRecommendTagItem(R.drawable.main_recommend_image3))
        tagItemList.add(MainRecommendTagItem(R.drawable.main_recommend_image4))
        tagItemList.add(MainRecommendTagItem(R.drawable.main_recommend_image3))

        val mainRecommendTagAdapter = MainRecommendTagAdapter(tagItemList)

        val tagRecyclerView = view.findViewById<RecyclerView>(R.id.mainTagRV_board)
        tagRecyclerView.adapter = mainRecommendTagAdapter

    }


}