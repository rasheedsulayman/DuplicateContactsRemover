package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.dialogs.BaseProgressDialog
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import java.io.File
import javax.inject.Inject

class ContactBackupDialog : BaseProgressDialog() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    companion object {
        private const val CONTACTS_KEY = "contacts_key"
        private const val TAG = "ContactBackupDialog"

        fun <T> show(
            parentFragment: T,
            contactsToDelete: ArrayList<Contact>
        ) where T : Fragment, T : ContactsBackupOperationsCallback {
            val dialog = ContactBackupDialog().apply {
                arguments = Bundle().apply {
                    putParcelableArrayList(CONTACTS_KEY, contactsToDelete)
                }
            }
            dialog.show(parentFragment.childFragmentManager, TAG)
        }
    }

    override fun getTitle(): String {
        return getString(R.string.contacts_backup)
    }

    override fun setUpDialogDetails() {
        (context!!.applicationContext as DuplicateContactsApp).component.inject(this)
        val contacts = arguments!!.getParcelableArrayList<Contact>(CONTACTS_KEY)!!
        val viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(ContactsBackupViewModel::class.java)
        val callback = parentFragment as? ContactsBackupOperationsCallback
            ?: throw IllegalArgumentException("Parent Fragment must implement BackupOperationsCallback")

        viewModel.status.observe(this, Observer {
            when (it) {
                LoadingStatus.LOADING -> statusTextView.text = getString(R.string.contact_backup_progress_message)
                LoadingStatus.DONE -> {
                    statusTextView.text = getString(R.string.contacts_backup_success_message)
                    finishButton.isEnabled = true
                    callback.onBackupFinished(this, viewModel.backupFile)
                }
                LoadingStatus.FAILED -> {
                    statusTextView.text = getString(R.string.contacts_backup_failure_message)
                    callback.onBackupFinished(this, viewModel.backupFile)
                }
                else -> { /*Nothing.*/
                }
            }
        })

        viewModel.progress.observe(this, Observer {
            progressBar.progress = it
        })

        finishButton.setOnClickListener {
            callback.onFinishButtonClicked(this)
        }
        viewModel.backupContacts(contacts)
    }
}

interface ContactsBackupOperationsCallback {
    fun onBackupFinished(dialog: ContactBackupDialog, backUpFile: File?)
    fun onFinishButtonClicked(dialog: ContactBackupDialog)
}
