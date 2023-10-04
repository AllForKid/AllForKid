package com.afk.allforkids_aos

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.afk.allforkids_aos.databinding.ActivityMyPageBirthBinding
import com.afk.allforkids_aos.model.BirthViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MyPageBirthActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMyPageBirthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMyPageBirthBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.actionbar.appbarBirthChange.visibility = View.VISIBLE

        val bottomSheet = viewBinding.coordinator.findViewById<View>(R.id.bottom_sheet)
        val persistentBottomSheet: BottomSheetBehavior<View> =
            BottomSheetBehavior.from(bottomSheet)

        viewBinding.imgCalendar.setOnClickListener {
            persistentBottomSheet.state = BottomSheetBehavior.STATE_EXPANDED
        }
        viewBinding.imgX.setOnClickListener {
            persistentBottomSheet.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        viewBinding.appCompatButton2.setOnClickListener {
            val year = viewBinding.datePicker.year
            val month = viewBinding.datePicker.month + 1    // 월은 0부터 시작하므로 1을 더함
            val day = viewBinding.datePicker.dayOfMonth
            var date = String.format("%04d-%02d-%02d", year, month, day)

            val viewModel = ViewModelProvider(this)[BirthViewModel::class.java]
            viewModel.setData(date)
            viewModel.getData().observe(this){ value ->
                viewBinding.tvDate.text = value
            }

            val sharedPreferences = getSharedPreferences("birth", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("birth", date)
            editor.apply()
        }

    }
}