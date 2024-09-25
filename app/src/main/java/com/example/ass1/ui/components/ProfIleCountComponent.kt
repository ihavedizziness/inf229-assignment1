package com.example.ass1.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.ui.theme.ProjectTheme

@Composable
fun ProfileCountComponent(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title.toUpperCase(Locale.current),
            textAlign = TextAlign.Center,
            style = ProjectTheme.typography.title1screen.copy(
                color = ProjectTheme.colors.black,
                fontSize = 16.sp,
            ),
        )
        Text(
            modifier = Modifier
                .padding(top = 10.dp),
            text = subtitle,
            textAlign = TextAlign.Center,
            style = ProjectTheme.typography.title1screen.copy(
                color = ProjectTheme.colors.black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
            ),
        )
    }
}

@[Composable Preview]
private fun ProfileCountComponentPreview() {
    ProfileCountComponent(
        title = "2156",
        subtitle = "Followers",
    )
}