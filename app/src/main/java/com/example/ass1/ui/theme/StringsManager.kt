package com.example.ass1.ui.theme

import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf

interface AbstractText

interface StringKey : Parcelable

data class NonTranslatableText(
    val text: String,
) : AbstractText

@Stable
interface TextProvider {

    val strings: Map<StringKey, AbstractText>
    val localeState: LocaleState

    fun getString(key: StringKey): String {
        return this.getLocaleString(key)
    }

    fun getLocaleString(id: StringKey): String {
        return when (val text = strings[id]) {
            is NonTranslatableText -> {
                text.text
            }
            else -> { "" }
        }
    }
}

val LocalTextProvider = compositionLocalOf<TextProvider> {
    ProjectTextProvider()
}

class ProjectTextProvider(
    override val strings: Map<StringKey, AbstractText> = emptyMap(),
    override val localeState: LocaleState = LocaleState(locale = "en"),
) : TextProvider

@Composable
@ReadOnlyComposable
fun stringRes(key: StringKey): String {
    return LocalTextProvider.current.getLocaleString(key)
}
