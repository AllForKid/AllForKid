package com.example.allforkids_aos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.allforkids_aos.R
import com.example.allforkids_aos.ToggleAnimation
import com.example.allforkids_aos.databinding.ItemHelpBinding
import com.example.allforkids_aos.model.Help

class HelpAdapter(private val helpList: List<Help>) : RecyclerView.Adapter<HelpAdapter.HelpViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelpViewHolder {
        val itemBinding = ItemHelpBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return HelpViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: HelpViewHolder, position: Int) {
        val help = helpList[position]
        holder.bind(help)
    }

    override fun getItemCount(): Int {
        return helpList.size
    }

    inner class HelpViewHolder(private val itemBinding: ItemHelpBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        private val titleTextView: TextView = itemBinding.textView11
        private val contentTextView: TextView = itemBinding.textView2
        private val layoutExpand = itemBinding.layoutDetail

        fun bind(help: Help) {
            // Character 객체로부터 데이터를 가져와서 뷰에 설정
            titleTextView.text = help.title
            contentTextView.text = help.content
            itemBinding.imageView2.setOnClickListener {
                val show = toggleLayout(!help.isExpanded, it, layoutExpand)
                help.isExpanded = show
//                if (itemBinding.layoutDetail.visibility == View.VISIBLE){
//                    itemBinding.layoutDetail.visibility = View.GONE
//                    itemBinding.imageView2.animate().apply {
//                        duration=300
//                        rotation(0f)
//                    }
//                } else {
//                    itemBinding.layoutDetail.visibility = View.VISIBLE
//                    itemBinding.imageView2.animate().apply {
//                        duration = 300
//                        rotation(180f)
//                    }
//                }
                if (show) {
                    itemBinding.layout.setBackgroundResource(R.drawable.style_help_border_top_change)
                } else {
                    itemBinding.layout.setBackgroundResource(R.drawable.style_help_border_top)
                }

            }

        }

        private fun toggleLayout(isExpanded: Boolean, view: View, layoutExpand: ConstraintLayout): Boolean {
            // 2
            ToggleAnimation.toggleArrow(view, isExpanded)
            if (isExpanded) {
                ToggleAnimation.expand(layoutExpand)
            } else {
                ToggleAnimation.collapse(layoutExpand)
            }
            return isExpanded
        }
    }
}