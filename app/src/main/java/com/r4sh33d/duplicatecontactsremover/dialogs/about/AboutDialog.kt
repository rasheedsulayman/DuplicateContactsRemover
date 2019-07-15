package com.r4sh33d.duplicatecontactsremover.dialogs.about

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.r4sh33d.duplicatecontactsremover.BuildConfig
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.util.viewUrl

class AboutDialog : DialogFragment() {

    companion object {
        private const val TAG = "AboutDialog"
        fun show(fragment: Fragment) = AboutDialog().show(fragment.childFragmentManager, TAG)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialDialog(context!!)
            .title(text = getString(R.string.about_dialog_title, BuildConfig.VERSION_NAME))
            .message(res = R.string.about_body) {
                html { activity!!.viewUrl(it) }
                lineSpacing(1.4f)
            }
            .positiveButton(R.string.dismiss)
    }
}
