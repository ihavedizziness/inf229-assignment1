package com.example.ass1.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.ui.theme.ProjectTheme

@Composable
fun TitleAndSubtitleComponent(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    isLabeled: Boolean = false,
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            text = title.toUpperCase(Locale.current),
            style = ProjectTheme.typography.title1screen.copy(
                color = ProjectTheme.colors.greyScreen2,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
            ),
        )
        if (isLabeled) {
            Box(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .background(
                        color = ProjectTheme.colors.buttonColor,
                        shape = RoundedCornerShape(30.dp)
                    ),
            ) {
                Text(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    text = subtitle,
                    style = ProjectTheme.typography.title1screen.copy(
                        color = ProjectTheme.colors.black,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                )
            }
        } else {
            Text(
                modifier = Modifier
                    .padding(top = 10.dp),
                text = subtitle,
                style = ProjectTheme.typography.title1screen.copy(
                    color = ProjectTheme.colors.black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                ),
            )
        }
    }
}

@[Composable Preview]
private fun TitleAndSubtitleComponentPreview() {
    TitleAndSubtitleComponent(
        title = "Job Nature",
        subtitle = "Full-time",
        isLabeled = true,
    )
}