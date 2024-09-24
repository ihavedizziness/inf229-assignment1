package com.example.ass1.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.ui.theme.ProjectTheme
import com.example.ass1.ui.theme.StringKey
import com.example.ass1.ui.theme.stringRes

@Composable
fun IconLabelComponent(
    modifier: Modifier = Modifier,
    icon: Int,
    stringKey: StringKey,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            tint = ProjectTheme.colors.whiteScreen1,
            painter = painterResource(id = icon),
            contentDescription = null,
        )
        Text(
            modifier = Modifier
                .widthIn(max = 134.dp)
                .heightIn(min = 47.dp)
                .padding(start = 11.dp),
            text = stringRes(key = stringKey),
            style = ProjectTheme.typography.title1screen.copy(
                fontSize = 12.sp,
            ),
        )
    }
}
