package com.example.ass1.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ass1.ui.theme.fonts.Poppins

@Composable
fun ProjectTheme(
    colors: ProjectColors = ProjectTheme.colors,
    typography: Typography = ProjectTheme.typography,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typography
    ) {
        content()
    }
}

object ProjectTheme {
    val colors: ProjectColors
        get() = ProjectLightColors()

    val typography: Typography
        get() = Typography(
            title1screen = TextStyle(
                fontFamily = FontFamily.Poppins,
                color = colors.whiteScreen1,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                fontStyle = FontStyle.Normal,
            )
        )
}

@Composable
fun ProjectStrings(
    textProvider: TextProvider,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalTextProvider provides textProvider
    ) {
        content()
    }
}

