package com.r4sh33d.duplicatecontactsremover.util

import android.content.Context
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import androidx.annotation.PluralsRes
import androidx.core.content.ContextCompat
import java.io.ByteArrayOutputStream

fun Bitmap.getByteArray(): ByteArray {
    var baos: ByteArrayOutputStream? = null
    try {
        baos = ByteArrayOutputStream()
        compress(Bitmap.CompressFormat.JPEG, 80, baos)
        return baos.toByteArray()
    } finally {
        baos?.close()
    }
}

fun String.times(x: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 1..x) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

fun Cursor.getStringValue(key: String) = getString(getColumnIndex(key))

fun Cursor.getIntValue(key: String) = getInt(getColumnIndex(key))

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

fun Context.getQuantityString(@PluralsRes plural: Int, quantity: Int): String {
    return resources.getQuantityString(plural, quantity, quantity)
}

