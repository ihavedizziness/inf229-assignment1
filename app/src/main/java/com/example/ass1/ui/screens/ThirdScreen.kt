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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ass1.R
import com.example.ass1.compose.PreviewContainer
import com.example.ass1.resources.ProjectString
import com.example.ass1.ui.components.BigTitleAndSubtitleComponent
import com.example.ass1.ui.components.TitleAndSubtitleComponent
import com.example.ass1.ui.theme.ProjectTheme
import com.example.ass1.ui.theme.stringRes

@Composable
fun ThirdScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                color = ProjectTheme.colors.white,
                shape = RoundedCornerShape(30.dp),
            )
    ) {
        Column {
            Column(
                modifier = Modifier.padding(top = 32.dp, start = 24.dp, end = 24.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_back),
                        contentDescription = null,
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_favorite),
                        contentDescription = null,
                    )
                }
                Column(
                    modifier = Modifier.padding(top = 24.dp),
                ) {
                    Image(
                        modifier = Modifier.size(60.dp),
                        painter = painterResource(id = R.drawable.canva),
                        contentDescription = null,
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = stringRes(key = ProjectString.CanvaTitle),
                        style = ProjectTheme.typography.title1screen.copy(
                            fontWeight = FontWeight.Medium,
                            color = ProjectTheme.colors.black,
                        ),
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = stringRes(key = ProjectString.CanvaCompany),
                        style = ProjectTheme.typography.title1screen.copy(
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp,
                            color = ProjectTheme.colors.greyScreen2,
                        ),
                    )
                    Text(
                        modifier = Modifier.padding(top = 5.dp),
                        text = stringRes(key = ProjectString.CanvaDate),
                        style = ProjectTheme.typography.title1screen.copy(
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = ProjectTheme.colors.greyScreen2,
                        ),
                    )
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 20.dp),
                thickness = 5.dp,
                color = ProjectTheme.colors.buttonColor,
            )
            Column(
                modifier = Modifier.padding(24.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    TitleAndSubtitleComponent(
                        title = stringRes(key = ProjectString.ApplyTitle),
                        subtitle = stringRes(key = ProjectString.ApplySubtitle),
                    )
                    TitleAndSubtitleComponent(
                        modifier = Modifier.padding(start = 100.dp),
                        title = stringRes(key = ProjectString.TypeTitle),
                        subtitle = stringRes(key = ProjectString.TypeSubtitle),
                        isLabeled = true,
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 24.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    TitleAndSubtitleComponent(
                        title = stringRes(key = ProjectString.SalaryTitle),
                        subtitle = stringRes(key = ProjectString.SalarySubtitle),
                    )
                    TitleAndSubtitleComponent(
                        modifier = Modifier.padding(start = 84.dp),
                        title = stringRes(key = ProjectString.LocationTitle),
                        subtitle = stringRes(key = ProjectString.LocationSubtitle),
                    )
                }
            }
            HorizontalDivider(
                thickness = 5.dp,
                color = ProjectTheme.colors.buttonColor,
            )
            BigTitleAndSubtitleComponent(
                modifier = Modifier.padding(24.dp),
                title = stringRes(key = ProjectString.JobTitle),
                subtitle = stringRes(key = ProjectString.JobSubtitle),
            )
            HorizontalDivider(
                thickness = 5.dp,
                color = ProjectTheme.colors.buttonColor,
            )
            BigTitleAndSubtitleComponent(
                modifier = Modifier.padding(top = 24.dp, start = 24.dp, end = 24.dp),
                title = stringRes(key = ProjectString.RolesTitle),
                subtitle = stringRes(key = ProjectString.RolesSubtitle),
                isNeedToBullet = true,
            )
        }
    }
}

@[Composable Preview]
private fun ThirdScreenPreview() {
    PreviewContainer {
        ThirdScreen()
    }
}
