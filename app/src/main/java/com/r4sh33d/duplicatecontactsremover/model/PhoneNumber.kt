package com.r4sh33d.duplicatecontactsremover.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PhoneNumber(var value: String, var type: Int, var label: String, var normalizedNumber: String?) : Parcelable
