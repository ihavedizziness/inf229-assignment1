package com.example.ass1.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
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
import com.example.ass1.ui.components.IconLabelComponent
import com.example.ass1.ui.theme.ProjectTheme
import com.example.ass1.ui.theme.createGradientBrush
import com.example.ass1.ui.theme.stringRes

@Composable
fun FirstScreen(
    modifier: Modifier = Modifier,
) {
    val gradient = remember {
        createGradientBrush(
            listOf(
                ProjectTheme.colors.backgroundGreen,
                ProjectTheme.colors.backgroundGreen81,
            )
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = gradient,
                shape = RoundedCornerShape(30.dp),
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier
                .padding(top = 86.dp)
                .width(98.dp)
                .height(20.dp),
            painter = painterResource(id = R.drawable.smartr_logo),
            contentDescription = null,
        )
        Image(
            modifier = Modifier
                .padding(top = 53.dp)
                .width(200.dp)
                .height(211.dp),
            painter = painterResource(id = R.drawable.signup_man),
            contentDescription = null,
        )
        Text(
            modifier = Modifier.padding(top = 20.dp),
            text = stringRes(key = ProjectString.FirstScreenTitle),
            style = ProjectTheme.typography.title1screen,
        )
        IconLabelComponent(
            modifier = Modifier.padding(top = 35.dp),
            icon = R.drawable.ic_switch,
            stringKey = ProjectString.SwitchLabel,
        )
        IconLabelComponent(
            modifier = Modifier.padding(top = 35.dp),
            icon = R.drawable.ic_login,
            stringKey = ProjectString.LoginLabel,
        )
        IconLabelComponent(
            modifier = Modifier.padding(top = 35.dp),
            icon = R.drawable.ic_refresh,
            stringKey = ProjectString.RefreshLabel,
        )
        Text(
            modifier = Modifier.padding(top = 48.dp),
            text = stringRes(key = ProjectString.FirstScreenSubtitle),
            style = ProjectTheme.typography.title1screen.copy(
                fontSize = 10.sp,
            ),
        )
        Button(
            modifier = Modifier
                .width(274.dp)
                .padding(top = 9.dp),
            onClick = {},
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ProjectTheme.colors.buttonColor,
            ),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp),
        ) {
            Text(
                text = stringRes(key = ProjectString.FirstScreenButtonLabel),
                style = ProjectTheme.typography.title1screen.copy(
                    fontSize = 15.sp,
                    color = ProjectTheme.colors.backgroundGreen81,
                    fontWeight = FontWeight.Bold,
                ),
            )
        }
    }
}

@[Composable Preview]
private fun FirstScreenPreview() {
    PreviewContainer {
        FirstScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}