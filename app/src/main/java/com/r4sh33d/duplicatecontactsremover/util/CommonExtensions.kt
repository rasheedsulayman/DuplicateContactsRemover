package com.r4sh33d.duplicatecontactsremover.util

import android.database.Cursor
import android.graphics.Bitmap
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



