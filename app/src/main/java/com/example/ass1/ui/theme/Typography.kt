package com.example.ass1.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

val LocalTypography = staticCompositionLocalOf { Typography() }

data class Typography(
    val title1screen: TextStyle = TextStyle(),
)