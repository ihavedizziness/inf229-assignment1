package com.example.ass1.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.R
import com.example.ass1.compose.PreviewContainer
import com.example.ass1.data.SecondScreenListDVO
import com.example.ass1.data.SecondScreenListItemDVO
import com.example.ass1.data.Status
import com.example.ass1.ui.components.SecondScreenListItemComponent
import com.example.ass1.ui.theme.ProjectTheme

@Composable
fun SecondScreen(
    modifier: Modifier = Modifier,
    data: List<SecondScreenListDVO>,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = ProjectTheme.colors.buttonColor,
                shape = RoundedCornerShape(30.dp),
            )
    ) {
        Column(
            modifier = Modifier.padding(top = 60.dp, start = 16.dp, end = 16.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    modifier = Modifier.size(45.dp),
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = null,
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = null,
                )
            }
            Column(
                modifier = Modifier.padding(top = 35.dp),
            ) {
                data.forEach { list ->
                    Text(
                        text = list.title.toUpperCase(Locale.current),
                        style = ProjectTheme.typography.title1screen.copy(
                            fontSize = 12.sp,
                            color = ProjectTheme.colors.greyScreen2,
                        ),
                    )
                    LazyColumn(
                        modifier = Modifier.padding(top = 16.dp),
                    ) {
                        items(list.list) { item ->
                            SecondScreenListItemComponent(
                                modifier = Modifier.padding(bottom = 16.dp),
                                data = item
                            )
                        }
                    }
                }
            }
        }
    }
}

@[Composable Preview]
private fun SecondScreenPreview() {
    PreviewContainer {
        SecondScreen(
            data = listOf(
                SecondScreenListDVO(
                    title = "Designer",
                    list = listOf(
                        SecondScreenListItemDVO(
                            title = "Junior UX Designer",
                            subtitle = "Canva",
                        ),
                        SecondScreenListItemDVO(
                            title = "Junior Product Designer",
                            subtitle = "Canva",
                            status = Status.Applied,
                        ),
                        SecondScreenListItemDVO(
                            title = "Middle motion Designer",
                            subtitle = "Canva",
                            status = Status.ExpiresSoon,
                        ),
                    ),
                ),
                SecondScreenListDVO(
                    title = "Android",
                    list = listOf(
                        SecondScreenListItemDVO(
                            title = "Junior Android developer",
                            subtitle = "Kotlin, Java",
                        ),
                        SecondScreenListItemDVO(
                            title = "Middle Android developer",
                            subtitle = "Kotlin, Java",
                            status = Status.Applied,
                        ),
                        SecondScreenListItemDVO(
                            title = "Junior UX Designer",
                            subtitle = "Kotlin, Java",
                            status = Status.ExpiresSoon,
                        ),
                    ),
                ),
            ),
        )
    }
}
