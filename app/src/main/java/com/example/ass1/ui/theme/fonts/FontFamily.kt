package com.example.ass1.ui.theme.fonts

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.ass1.R

val FontFamily.Companion.Poppins: FontFamily
    get() = FontFamily(
        Font(
            resId = R.font.poppins_semibold,
            weight = FontWeight.SemiBold,
        ),
        Font(
            resId = R.font.poppins_regular,
            weight = FontWeight.Normal,
        ),
        Font(
            resId = R.font.poppins_bold,
            weight = FontWeight.Bold,
        ),
        Font(
            resId = R.font.poppins_medium,
            weight = FontWeight.Medium,
        )
    )