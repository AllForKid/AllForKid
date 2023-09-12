package com.example.allforkids_aos

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.core.content.ContentProviderCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.allforkids_aos.adapter.HelpAdapter
import com.example.allforkids_aos.adapter.InterworkAccountAdapter
import com.example.allforkids_aos.databinding.AccountLinkedDialogBinding
import com.example.allforkids_aos.databinding.ActivityAccountInterworkBinding
import com.example.allforkids_aos.model.Help
import com.example.allforkids_aos.model.InterworkAccount

class AccountInterworkActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityAccountInterworkBinding
    private val accountList = mutableListOf<InterworkAccount>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityAccountInterworkBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.actionbar.appbarAccountInterwork.visibility = View.VISIBLE

        setupRecyclerView()
        viewBinding.tvCopyMyCode.setOnClickListener {
            Toast.makeText(this, "연동 코드를 복사했습니다", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupRecyclerView() {
        val accountList = createHelpList()
        val accountRecyclerView = viewBinding.rvAccountLink
        accountRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        accountRecyclerView.adapter = InterworkAccountAdapter(this,accountList)
    }

    private fun createHelpList(): List<InterworkAccount> {
        val accountList = mutableListOf<InterworkAccount>()

        accountList.add(InterworkAccount("1.","묘몽","bbbbbb","2023.08.27"))
        // ... 추가적인 Character를 만들고 리스트에 추가하십시오
        return accountList
    }
}