package com.example.ass1.ui.theme

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

private val String.Companion.empty: String get() = ""
private val String.Companion.blank: String get() = " "

fun emptyString() = String.empty
fun emptyBlank() = String.blank

private const val bulletString = "\u2022"

fun String.toBulletText(indent: TextUnit): AnnotatedString {
    val paragraphStyle = ParagraphStyle(textIndent = TextIndent(restLine = indent))
    val messages = this.split("\n")
    return buildAnnotatedString {
        messages.forEach { message ->
            if (message.isNotBlank()) {
                withStyle(style = paragraphStyle) {
                    append(bulletString)
                    append("\t\t")
                    append(message)
                }
            }
        }
    }
}
