package com.afk.allforkids_aos

data class CommunityReviewPost(
    val title: String,
    val content: String,
    val author: String,
    val date: String,
    val postImageResId: Int,
    val authorProfileImageResId: Int
)
