package com.example.ass1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.compose.PreviewContainer
import com.example.ass1.data.SecondScreenListItemDVO
import com.example.ass1.data.Status
import com.example.ass1.ui.theme.ProjectTheme
import com.example.ass1.ui.theme.stringRes

@Composable
fun SecondScreenListItemComponent(
    data: SecondScreenListItemDVO,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = ProjectTheme.colors.white,
                shape = RoundedCornerShape(20.dp)
            ),
    ) {
        Column(
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp, start = 16.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row {
                    Image(
                        modifier = Modifier.size(35.dp),
                        painter = painterResource(id = data.image),
                        contentDescription = null,
                    )
                    Column(
                        modifier = Modifier.padding(start = 12.dp)
                    ) {
                        Text(
                            text = data.title,
                            style = ProjectTheme.typography.title1screen.copy(
                                color = ProjectTheme.colors.blackScreen2,
                                fontSize = 14.sp,
                            ),
                        )
                        Text(
                            text = data.subtitle,
                            style = ProjectTheme.typography.title1screen.copy(
                                color = ProjectTheme.colors.greyScreen2,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium,
                            ),
                        )
                    }
                }
                StatusComponent(statusType = data.status)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, end = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Box(
                    modifier = Modifier
                        .background(
                            color = ProjectTheme.colors.buttonColor,
                            shape = RoundedCornerShape(30.dp),
                        ),
                ) {
                    Text(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        text = stringRes(key = data.type),
                        style = ProjectTheme.typography.title1screen.copy(
                            color = ProjectTheme.colors.blackGreyScreen2,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                        ),
                    )
                }
                Text(
                    text = stringRes(key = data.salary),
                    style = ProjectTheme.typography.title1screen.copy(
                        color = ProjectTheme.colors.greyScreen2,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                )
            }
        }
    }
}

@[Composable Preview]
private fun SecondScreenListItemComponentPreview() {
    PreviewContainer {
        SecondScreenListItemComponent(
            data = SecondScreenListItemDVO(
                title = "Junior UX Designer",
                subtitle = "Canva",
            ),
        )
    }
}