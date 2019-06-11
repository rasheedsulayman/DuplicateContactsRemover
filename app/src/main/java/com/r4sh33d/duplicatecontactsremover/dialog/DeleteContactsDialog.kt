package com.r4sh33d.duplicatecontactsremover.dialog

import android.app.Dialog
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.google.android.material.button.MaterialButton
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.model.Contact

class DeleteContactsDialog : DialogFragment() {
    private val CONTACTS_KEY = "contacts_key"

    fun newInstance(contactsToDelete: ArrayList<Contact>): DeleteContactsDialog {
        val args = Bundle()
        args.putParcelableArrayList(CONTACTS_KEY, contactsToDelete)
        val fragment = DeleteContactsDialog()
        fragment.arguments = args
        return fragment
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        isCancelable = false
        val dialog = MaterialDialog(context!!).show {
            customView(R.layout.backup_delete_dialog_layout, noVerticalPadding = true, dialogWrapContent = true)
            noAutoDismiss()
        }

        val view = dialog.getCustomView()
        val statusTextView = view.findViewById<TextView>(R.id.status_textview)
        val progressBar = view.findViewById<ProgressBar>(R.id.status_progress_bar)
        val finishButton = view.findViewById<MaterialButton>(R.id.finish_button)


        return dialog

    }
}