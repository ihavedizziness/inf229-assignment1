package com.example.ass1.resources

import com.example.ass1.ui.theme.AbstractText
import com.example.ass1.ui.theme.NonTranslatableText
import com.example.ass1.ui.theme.StringKey
import com.example.ass1.ui.theme.emptyString

val arbuzStrings: Map<StringKey, AbstractText> = mapOf(
    ProjectString.FirstScreenTitle to NonTranslatableText("Fresh look, same login."),
    ProjectString.SwitchLabel to NonTranslatableText("SmartRecruiters candidate portal is now Smartr."),
    ProjectString.LoginLabel to NonTranslatableText("Enter the same login info used for your SmartrProfile"),
    ProjectString.RefreshLabel to NonTranslatableText("If login details were saved, you may need to re-save."),
    ProjectString.FirstScreenButtonLabel to NonTranslatableText("GET STARTED"),
    ProjectString.FirstScreenSubtitle to NonTranslatableText("Why Smartr? Read here"),
    ProjectString.Paystack to NonTranslatableText("Paystack"),
    ProjectString.Salary to NonTranslatableText("$40-60k/yearly"),
    ProjectString.Applied to NonTranslatableText("Applied"),
    ProjectString.ExpiresSoon to NonTranslatableText("Expires soon"),
    ProjectString.NoneString to NonTranslatableText(emptyString()),
)