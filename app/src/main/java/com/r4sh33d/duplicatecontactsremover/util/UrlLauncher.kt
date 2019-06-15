package com.r4sh33d.duplicatecontactsremover.util

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.annotation.AttrRes
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.net.toUri
import com.r4sh33d.duplicatecontactsremover.R

/** @author Aidan Follestad (@afollestad), r4sh33d  */
interface UrlLauncher {
    fun viewUrl(url: String)
}

class RealUrlLauncher(
    private val currentActivity: Activity
) : UrlLauncher {

    override fun viewUrl(url: String) {
        val customTabsIntent = CustomTabsIntent.Builder()
            .setToolbarColor(resolveColor(R.attr.colorPrimary))
            .build()
        try {
            customTabsIntent.launchUrl(currentActivity, url.toUri())
        } catch (_: ActivityNotFoundException) {
            val chooser = Intent.createChooser(
                Intent(ACTION_VIEW)
                    .setData(url.toUri()), "View URL"
            )
            currentActivity.startActivity(chooser)
        }
    }

    private fun resolveColor(@AttrRes attr: Int): Int {
        val a = currentActivity.theme.obtainStyledAttributes(intArrayOf(attr))
        try {
            return a.getColor(0, 0)
        } finally {
            a.recycle()
        }
    }

    fun launchPlayStore() {
        val uri = Uri.parse("market://details?id=" + currentActivity.packageName)
        val goToMarket = Intent(ACTION_VIEW, uri).apply {
            Intent.FLAG_ACTIVITY_NO_HISTORY or
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK
        }
        try {
            currentActivity.startActivity(goToMarket)
        } catch (_: ActivityNotFoundException) {
              viewUrl( "http://play.google.com/store/apps/details?id=" + currentActivity.packageName)
        }
    }
}
