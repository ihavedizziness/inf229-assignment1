package com.example.ass1.data

import androidx.compose.runtime.Stable
import com.example.ass1.R
import com.example.ass1.resources.ProjectString
import com.example.ass1.ui.theme.StringKey

@Stable
data class SecondScreenListDVO(
    val title: String,
    val list: List<SecondScreenListItemDVO>,
)

@Stable
data class SecondScreenListItemDVO(
    val image: Int = R.drawable.canva,
    val title: String,
    val subtitle: String,
    val type: StringKey = ProjectString.Paystack,
    val status: Status = Status.None,
    val salary: StringKey = ProjectString.Salary,
)

@Stable
sealed class Status {
    data object None : Status()
    data object Applied : Status()
    data object ExpiresSoon : Status()
}
