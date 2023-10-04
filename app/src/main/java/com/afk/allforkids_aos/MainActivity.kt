package com.afk.allforkids_aos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.afk.allforkids_aos.fragments.MainFragment
import com.afk.allforkids_aos.fragments.SearchFragment
import com.afk.allforkids_aos.fragments.MapFragment
import com.afk.allforkids_aos.fragments.CommunityFragment
import com.afk.allforkids_aos.fragments.SettingFragment

class MainActivity : AppCompatActivity() {
    private val mainFragment = MainFragment()
    private val searchFragment = SearchFragment()
    private val mapFragment = MapFragment()
    private val communityFragment = CommunityFragment()
    private val settingFragment = SettingFragment()

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        // MainFragment로 시작
        replaceFragment(mainFragment)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.tapMain -> {
                    replaceFragment(mainFragment)
                }
                R.id.tapSearch -> {
                    replaceFragment(searchFragment)
                }
                R.id.tapMap -> {
                    replaceFragment(mapFragment)
                }
                R.id.tapCommunity -> {
                    replaceFragment(communityFragment)
                }
                R.id.tapSetting -> {
                    replaceFragment(settingFragment)
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
