package com.example.ass1.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.R
import com.example.ass1.ui.theme.ProjectTheme
import com.example.ass1.ui.theme.toBulletText

@Composable
fun BigTitleAndSubtitleComponent(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    isNeedToBullet: Boolean = false,
) {
    val descriptionText = if (isNeedToBullet) {
        subtitle.toBulletText(14.sp)
    } else buildAnnotatedString { append(subtitle) }

    Column(
        modifier = modifier,
    ) {
        Text(
            text = title.toUpperCase(Locale.current),
            style = ProjectTheme.typography.title1screen.copy(
                color = ProjectTheme.colors.greyScreen2,
                fontSize = 12.sp,
            ),
        )
        Text(
            modifier = Modifier
                .padding(top = 10.dp),
            text = descriptionText,
            style = ProjectTheme.typography.title1screen.copy(
                color = ProjectTheme.colors.black,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
            ),
        )
        Row(
            modifier = Modifier.padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "See more",
                style = ProjectTheme.typography.title1screen.copy(
                    color = ProjectTheme.colors.greenText,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                ),
            )
            Icon(
                modifier = Modifier.padding(start = 3.dp),
                painter = painterResource(id = R.drawable.ic_dropdown),
                tint = ProjectTheme.colors.greenText,
                contentDescription = null,
            )
        }
    }
}
