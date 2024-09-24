package com.example.ass1.resources

import com.example.ass1.ui.theme.AbstractText
import com.example.ass1.ui.theme.NonTranslatableText
import com.example.ass1.ui.theme.StringKey
import com.example.ass1.ui.theme.emptyString

val arbuzStrings: Map<StringKey, AbstractText> = mapOf(
    ProjectString.NoneString to NonTranslatableText(emptyString()),
    ProjectString.CanvaCompany to NonTranslatableText("Canva"),
    ProjectString.CanvaDate to NonTranslatableText("Posted on 3 March"),
    ProjectString.CanvaTitle to NonTranslatableText("Junior UX Designer"),
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
    ProjectString.JobTitle to NonTranslatableText("Job Description"),
    ProjectString.JobSubtitle to NonTranslatableText(
        "Can you bring creative human-centered ideas to life" +
        "and make great things happen beyond what meets the eye?\n" +
        "We believe in teamwork, fun, complex projects, diverse perspectives," +
        "and simple solutions. How about you? We're looking for a like-minded"),
    ProjectString.RolesTitle to NonTranslatableText("Roles and Responsibilities"),
    ProjectString.RolesSubtitle to NonTranslatableText(
        "Drive the design process with cross-functional partners and design leads.\n" +
        "Design new experiences and patterns in a complex ecosystem and across platforms.\n" +
        "Partner with UX Research and Content Strategists through the design process.\n" +
        "Work closely with Product and Engineering to ensure a high quality implementation."
    ),
    ProjectString.ApplyTitle to NonTranslatableText("Apply Before"),
    ProjectString.ApplySubtitle to NonTranslatableText("03 June, 2022"),
    ProjectString.TypeTitle to NonTranslatableText("Job Nature"),
    ProjectString.TypeSubtitle to NonTranslatableText("Full-time"),
    ProjectString.SalaryTitle to NonTranslatableText("Salary Range"),
    ProjectString.SalarySubtitle to NonTranslatableText("40k - 60k/yearly"),
    ProjectString.LocationTitle to NonTranslatableText("Job Location"),
    ProjectString.LocationSubtitle to NonTranslatableText("Work from anywhere"),
)
