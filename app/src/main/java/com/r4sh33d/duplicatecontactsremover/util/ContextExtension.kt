package com.r4sh33d.duplicatecontactsremover.util

import android.content.Context
import android.content.pm.PackageManager
import android.os.Looper
import androidx.core.content.ContextCompat

fun Context.hasPermissions(permissionList: Set<String>): Boolean {
    for (permission in permissionList) {
        if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
            return false
        }
    }
    return true
}

fun Context.hasPermision(permission: String): Boolean =
    ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED

fun isOnMainThread() = Looper.myLooper() == Looper.getMainLooper()
