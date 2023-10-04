package com.afk.allforkids_aos.model

data class Help(
    val title: String,
    val content: String,
    var isExpanded: Boolean = false
)
