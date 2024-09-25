@file:Suppress("MagicNumber")

package com.example.ass1.ui.theme

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalColors: ProvidableCompositionLocal<ProjectColors> = staticCompositionLocalOf { ProjectUnspecifiedColors }

interface ProjectColors {
    val white: Color
    val black: Color
    val whiteScreen1: Color
    val backgroundGreen: Color
    val backgroundGreen81: Color
    val buttonColor: Color
    val shadowColor: Color
    val blackScreen2: Color
    val greyScreen2: Color
    val blackGreyScreen2: Color
    val greenStatus: Color
    val yellowStatus: Color
    val greenText: Color
    val violet: Color
    val blueButton: Color
}

data class ProjectLightColors(
    override val whiteScreen1: Color = Color(0xFFF4F4F4),
    override val backgroundGreen: Color = Color(0xFF12AA73),
    override val backgroundGreen81: Color = Color(0xCF135B46),
    override val buttonColor: Color = Color(0xFFBFDBD1),
    override val shadowColor: Color = Color(0x40000000),
    override val white: Color = Color(0xFFFFFFFF),
    override val black: Color = Color(0xFF000000),
    override val blackScreen2: Color = Color(0xFF0D0D0D),
    override val greyScreen2: Color = Color(0xFF434545),
    override val blackGreyScreen2: Color = Color(0xFF53595F),
    override val greenStatus: Color = Color(0xFF07864B),
    override val yellowStatus: Color = Color(0xFFDAA400),
    override val greenText: Color = Color(0xFF0FAC74),
    override val violet: Color = Color(0xFF4E4B66),
    override val blueButton: Color = Color(0xFF1877F2),
) : ProjectColors

object ProjectUnspecifiedColors : ProjectColors {
    override val whiteScreen1: Color = Color.Unspecified
    override val backgroundGreen: Color = Color.Unspecified
    override val backgroundGreen81: Color = Color.Unspecified
    override val buttonColor: Color = Color.Unspecified
    override val shadowColor: Color = Color.Unspecified
    override val white: Color = Color.Unspecified
    override val black: Color = Color.Unspecified
    override val blackScreen2: Color = Color.Unspecified
    override val greyScreen2: Color = Color.Unspecified
    override val blackGreyScreen2: Color = Color.Unspecified
    override val greenStatus: Color = Color.Unspecified
    override val yellowStatus: Color = Color.Unspecified
    override val greenText: Color = Color.Unspecified
    override val violet: Color = Color.Unspecified
    override val blueButton: Color = Color.Unspecified
}
