package com.example.ass1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.R
import com.example.ass1.compose.PreviewContainer
import com.example.ass1.data.Status
import com.example.ass1.resources.ProjectString
import com.example.ass1.ui.theme.ProjectTheme
import com.example.ass1.ui.theme.stringRes

@Composable
fun StatusComponent(
    modifier: Modifier = Modifier,
    statusType: Status,
) {
    val icon = when (statusType) {
        is Status.Applied -> R.drawable.ic_check
        is Status.ExpiresSoon -> R.drawable.ic_info
        else -> null
    } ?: return

    val backgroundColor = when (statusType) {
        is Status.Applied -> ProjectTheme.colors.greenStatus
        is Status.ExpiresSoon -> ProjectTheme.colors.yellowStatus
        else -> Color.Unspecified
    }

    val text = when (statusType) {
        is Status.Applied -> ProjectString.Applied
        is Status.ExpiresSoon -> ProjectString.ExpiresSoon
        else -> ProjectString.NoneString
    }

    Box(
        modifier = modifier
            .background(backgroundColor)
            .padding(horizontal = 6.dp, vertical = 4.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
            )
            Text(
                modifier = Modifier.padding(start = 4.dp),
                text = stringRes(key = text),
                style = ProjectTheme.typography.title1screen.copy(
                    fontSize = 10.sp,
                    color = ProjectTheme.colors.white,
                ),
            )
        }
    }
}

@[Composable Preview]
private fun StatusComponentPreview() {
    PreviewContainer {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            StatusComponent(
                statusType = Status.None
            )
            StatusComponent(
                statusType = Status.Applied
            )
            StatusComponent(
                statusType = Status.ExpiresSoon
            )
        }
    }
}
