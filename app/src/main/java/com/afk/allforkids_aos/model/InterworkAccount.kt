package com.afk.allforkids_aos.model

data class InterworkAccount(
    val number: String,
    val nickname: String,
    val code: String,
    val date: String,
    val unlinked:String = "연동 해제"
)
