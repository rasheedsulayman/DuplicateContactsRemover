package com.r4sh33d.duplicatecontactsremover.util

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.annotation.AttrRes
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.net.toUri
import com.r4sh33d.duplicatecontactsremover.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RealUrlLauncher @Inject constructor(private val context: Context) {

    fun viewUrl(url: String) {
        val customTabsIntent = CustomTabsIntent.Builder()
            .setToolbarColor(resolveColor(R.attr.colorPrimary))
            .build()
        try {
            customTabsIntent.launchUrl(context, url.toUri())
        } catch (_: ActivityNotFoundException) {
            val chooser = Intent.createChooser(
                Intent(ACTION_VIEW)
                    .setData(url.toUri()), "View URL"
            )
            context.startActivity(chooser)
        }
    }

    private fun resolveColor(@AttrRes attr: Int): Int {
        val a = context.theme.obtainStyledAttributes(intArrayOf(attr))
        try {
            return a.getColor(0, 0)
        } finally {
            a.recycle()
        }
    }

    fun launchPlayStore() {
        val uri = Uri.parse("market://details?id=" + context.packageName)
        val goToMarket = Intent(ACTION_VIEW, uri).apply {
            Intent.FLAG_ACTIVITY_NO_HISTORY or
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK
        }
        try {
            context.startActivity(goToMarket)
        } catch (_: ActivityNotFoundException) {
            viewUrl("http://play.google.com/store/apps/details?id=" + context.packageName)
        }
    }
}
