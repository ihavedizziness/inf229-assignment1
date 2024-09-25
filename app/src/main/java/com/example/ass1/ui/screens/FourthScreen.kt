package com.example.ass1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.R
import com.example.ass1.compose.PreviewContainer
import com.example.ass1.data.FourthScreenListDVO
import com.example.ass1.ui.components.FourthScreenListItemComponent
import com.example.ass1.ui.components.ProfileCountComponent
import com.example.ass1.ui.theme.ProjectTheme

@Composable
fun FourthScreen(
    modifier: Modifier = Modifier,
    data: List<FourthScreenListDVO>,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = ProjectTheme.colors.white)
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 24.dp),
                    text = "Profile",
                    style = ProjectTheme.typography.title1screen.copy(
                        color = ProjectTheme.colors.black,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                    ),
                    textAlign = TextAlign.Center
                )
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.ic_settings),
                    contentDescription = null,
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 13.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Icon(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.profile_avatar),
                    contentDescription = null,
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 24.dp, bottom = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    ProfileCountComponent(
                        title = "2156",
                        subtitle = "Followers",
                    )
                    ProfileCountComponent(
                        title = "567",
                        subtitle = "Following",
                    )
                    ProfileCountComponent(
                        title = "23",
                        subtitle = "News",
                    )
                }
            }
            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Wilson Franci",
                style = ProjectTheme.typography.title1screen.copy(
                    color = ProjectTheme.colors.black,
                    fontSize = 16.sp,
                ),
            )
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                style = ProjectTheme.typography.title1screen.copy(
                    color = ProjectTheme.colors.violet,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                ),
            )
            Row(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    contentPadding = PaddingValues(
                        vertical = 13.dp
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ProjectTheme.colors.blueButton,
                    ),
                    onClick = {},
                ) {
                    Text(
                        text = "Edit profile",
                        style = ProjectTheme.typography.title1screen.copy(
                            color = ProjectTheme.colors.white,
                            fontSize = 16.sp,
                        ),
                    )
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp),
                    shape = RoundedCornerShape(6.dp),
                    contentPadding = PaddingValues(
                        vertical = 13.dp
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = ProjectTheme.colors.blueButton,
                    ),
                    onClick = {},
                ) {
                    Text(
                        text = "Website",
                        style = ProjectTheme.typography.title1screen.copy(
                            color = ProjectTheme.colors.white,
                            fontSize = 16.sp,
                        ),
                    )
                }
            }
            LazyColumn(
                modifier = Modifier.padding(top = 30.dp)
            ) {
                items(data) { item ->
                    FourthScreenListItemComponent(data = item)
                }
            }
        }
    }
}

@[Composable Preview]
private fun FourthScreenPreview() {
    PreviewContainer {
        FourthScreen(
            data = listOf(
                FourthScreenListDVO(
                    image = R.drawable.nfts,
                    type = "NFTs",
                    title = "Minting Your First NFT: A Beginner’s Guide to Creating...",
                    createdAt = "15m ago"
                ),
                FourthScreenListDVO(
                    image = R.drawable.business,
                    type = "Business",
                    title = "5 things to know before the stock market opens Monday",
                    createdAt = "1h ago"
                ),
                FourthScreenListDVO(
                    image = R.drawable.travel,
                    type = "Travel",
                    title = "Bali plans to reopen to international tourists in Septe...",
                    createdAt = "1w ago"
                ),
                FourthScreenListDVO(
                    image = R.drawable.health,
                    type = "Health",
                    title = "Healthy Living: Diet and Exercise Tips & Tools for Success.",
                    createdAt = "4h ago"
                ),
            )
        )
    }
}