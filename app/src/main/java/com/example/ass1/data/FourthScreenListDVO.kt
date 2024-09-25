package com.example.ass1.data

import androidx.compose.runtime.Stable
import com.example.ass1.R

@Stable
data class FourthScreenListDVO(
    val image: Int,
    val type: String,
    val title: String,
    val avatar: Int = R.drawable.profile_avatar,
    val username: String = "Wilson Franci",
    val createdAt: String,
)
