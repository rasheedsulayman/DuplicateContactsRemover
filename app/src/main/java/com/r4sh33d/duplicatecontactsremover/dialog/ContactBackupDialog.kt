package com.r4sh33d.duplicatecontactsremover.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.google.android.material.button.MaterialButton
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter

class ContactBackupDialog : DialogFragment() {
    private val CONTACTS_KEY = "contacts_key"
    private lateinit var statusTextView: TextView
    private lateinit var finishButton: MaterialButton
    private lateinit var progressBar: ProgressBar

    fun newInstance(contactsToDelete: ArrayList<Contact>): ContactBackupDialog {
        val args = Bundle()
        args.putParcelableArrayList(CONTACTS_KEY, contactsToDelete)
        val fragment = ContactBackupDialog()
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
        view.findViewById<TextView>(R.id.title_textview).text = "Contact Backup"
        statusTextView = view.findViewById<TextView>(R.id.status_textview)
        progressBar = view.findViewById<ProgressBar>(R.id.status_progress_bar)
        finishButton = view.findViewById<MaterialButton>(R.id.finish_button)
        return dialog
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val contacts = arguments!!.getParcelableArrayList<Contact>(CONTACTS_KEY)
        val viewModelFactory = ContactsBackupViewModelFactory(VcfExporter(context!!), contacts)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ContactsBackupViewModel::class.java)
        viewModel.progress.observe(this, Observer {
            progressBar.progress = it
        })
    }
}