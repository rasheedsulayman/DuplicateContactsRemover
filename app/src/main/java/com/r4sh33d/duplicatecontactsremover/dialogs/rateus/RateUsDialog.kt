package com.r4sh33d.duplicatecontactsremover.dialogs.rateus

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils
import com.r4sh33d.duplicatecontactsremover.util.launchPlayStore
import javax.inject.Inject

class RateUsDialog : DialogFragment() {

    @Inject
    lateinit var prefsUtils: PrefsUtils

    companion object {
        private const val TAG = "RateUsDialog"
        fun show(fragment: Fragment) = RateUsDialog().show(fragment.childFragmentManager, TAG)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        (context!!.applicationContext as DuplicateContactsApp).component.inject(this)
        return MaterialDialog(context!!)
            .title(R.string.rate_us)
            .message(R.string.rate_us_message) {
                lineSpacing(1.4f)
            }
            .positiveButton(R.string.rate_now, click = {
                prefsUtils.setNoDisturbStatusForStatusForRatings(true)
                activity!!.launchPlayStore()
            }).neutralButton(R.string.no_thanks, click = {
                prefsUtils.setNoDisturbStatusForStatusForRatings(true)
            })
            .negativeButton(R.string.later, click = {
                prefsUtils.resetNoOfSuccessfulContactsOperations()
            })
    }
}
