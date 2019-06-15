package com.r4sh33d.duplicatecontactsremover.dialogs.licences

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.r4sh33d.duplicatecontactsremover.R

class LicencesDialog : DialogFragment() {

    companion object {
        private const val TAG = "LicencesDialog"
        fun show(parentFragment: Fragment) = LicencesDialog().show(parentFragment.childFragmentManager, TAG)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(context!!).inflate(R.layout.licences_dialog, null)
        view.findViewById<WebView>(R.id.licences_webview).loadUrl("file:///android_asset/licences.html")
        return MaterialDialog(context!!)
            .title(text = "Licences")
            .customView( view = view, noVerticalPadding = true, dialogWrapContent = true)
            .positiveButton(R.string.dismiss)
    }
}
