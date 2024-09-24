package com.example.ass1.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.ass1.resources.arbuzStrings
import com.example.ass1.ui.theme.ProjectStrings
import com.example.ass1.ui.theme.ProjectTextProvider
import com.example.ass1.ui.theme.ProjectTheme

@Composable
fun PreviewContainer(content: @Composable () -> Unit) {
    ProjectTheme {
        val localeState by ProjectStrings.localeFlow.collectAsStateWithLifecycle()
        ProjectStrings(
            textProvider = ProjectTextProvider(arbuzStrings, localeState),
            content = content,
        )
    }
}