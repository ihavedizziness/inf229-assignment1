package com.example.ass1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.R
import com.example.ass1.compose.PreviewContainer
import com.example.ass1.data.FourthScreenListDVO
import com.example.ass1.data.SecondScreenListItemDVO
import com.example.ass1.ui.theme.ProjectTheme

@Composable
fun FourthScreenListItemComponent(
    modifier: Modifier = Modifier,
    data: FourthScreenListDVO,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 13.dp)
            .background(color = ProjectTheme.colors.white,),
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .size(96.dp)
                    .clip(RoundedCornerShape(6.dp)),
                painter = painterResource(id = data.image),
                contentDescription = null,
            )
            Column(
                modifier = Modifier.padding(start = 4.dp),
            ) {
                Text(
                    text = data.type,
                    style = ProjectTheme.typography.title1screen.copy(
                        color = ProjectTheme.colors.violet,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                )
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = data.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = ProjectTheme.typography.title1screen.copy(
                        color = ProjectTheme.colors.black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                    ),
                )
                Row(
                    modifier = Modifier
                        .padding(top = 4.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Row {
                        Icon(
                            modifier = Modifier
                                .size(20.dp)
                                .clip(CircleShape),
                            painter = painterResource(id = R.drawable.profile_avatar),
                            contentDescription = null,
                        )
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            text = data.username,
                            style = ProjectTheme.typography.title1screen.copy(
                                color = ProjectTheme.colors.violet,
                                fontSize = 13.sp,
                            ),
                        )
                        Icon(
                            modifier = Modifier
                                .padding(start = 8.dp)
                                .size(14.dp),
                            painter = painterResource(id = R.drawable.ic_time),
                            contentDescription = null,
                        )
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            text = data.createdAt,
                            style = ProjectTheme.typography.title1screen.copy(
                                color = ProjectTheme.colors.greyScreen2,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Normal,
                            ),
                        )
                    }
                    Icon(
                        modifier = Modifier.size(14.dp),
                        painter = painterResource(id = R.drawable.ic_ellipsize),
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

@[Composable Preview]
private fun FourthScreenListItemComponentPreview() {
    PreviewContainer {
        FourthScreenListItemComponent(
            data = FourthScreenListDVO(
                image = R.drawable.business,
                type = "NFTs",
                title = "Minting Your First NFT: A Beginner’s Guide to Creating...",
                createdAt = "15m ago"
            ),
        )
    }
}