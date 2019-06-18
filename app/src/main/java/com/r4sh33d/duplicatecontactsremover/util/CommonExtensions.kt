package com.r4sh33d.duplicatecontactsremover.util

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Bitmap
import android.net.Uri
import androidx.annotation.AttrRes
import androidx.annotation.PluralsRes
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import com.r4sh33d.duplicatecontactsremover.R
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

fun Activity.viewUrl(url: String) {
    val customTabsIntent = CustomTabsIntent.Builder()
        .setToolbarColor(resolveColor(R.attr.colorPrimary))
        .build()
    try {
        customTabsIntent.launchUrl(this, url.toUri())
    } catch (_: ActivityNotFoundException) {
        val chooser = Intent.createChooser(
            Intent(Intent.ACTION_VIEW)
                .setData(url.toUri()), "View URL"
        )
        startActivity(chooser)
    }
}

private fun Activity.resolveColor(@AttrRes attr: Int): Int {
    val a = theme.obtainStyledAttributes(intArrayOf(attr))
    try {
        return a.getColor(0, 0)
    } finally {
        a.recycle()
    }
}

fun Activity.launchPlayStore() {
    val uri = Uri.parse("market://details?id=$packageName")
    val goToMarket = Intent(Intent.ACTION_VIEW, uri).apply {
        Intent.FLAG_ACTIVITY_NO_HISTORY or
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK
    }
    try {
        startActivity(goToMarket)
    } catch (_: ActivityNotFoundException) {
        viewUrl("http://play.google.com/store/apps/details?id=$packageName")
    }
}

