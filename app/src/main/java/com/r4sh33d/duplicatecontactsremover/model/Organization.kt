package com.r4sh33d.duplicatecontactsremover.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Organization(var company: String, var jobPosition: String) : Parcelable {
    fun isEmpty() = company.isEmpty() && jobPosition.isEmpty()

    fun isNotEmpty() = !isEmpty()
}
