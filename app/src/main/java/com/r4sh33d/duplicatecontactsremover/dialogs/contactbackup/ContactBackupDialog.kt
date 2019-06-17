package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
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
        return "Contacts Backup"
    }

    override fun setUpDialogDetails() {
        (context!!.applicationContext as DuplicateContactsApp).component.inject(this)
        val contacts = arguments!!.getParcelableArrayList<Contact>(CONTACTS_KEY)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ContactsBackupViewModel::class.java)
        val callback = parentFragment as? ContactsBackupOperationsCallback
            ?: throw IllegalArgumentException("Parent Fragment must implement BackupOperationsCallback")

        viewModel.status.observe(this, Observer {
            when (it) {
                LoadingStatus.LOADING -> statusTextView.text = "Backing up your contacts, Please wait. . ."
                LoadingStatus.DONE -> {
                    statusTextView.text = "Contacts successfully backed up."
                    finishButton.isEnabled = true
                    callback.onBackupFinished(this, viewModel.backupFile)
                }
                LoadingStatus.FAILED -> {
                    statusTextView.text = "Contact backup failed."
                    callback.onBackupFinished(this, viewModel.backupFile)
                }
                else -> {/*Nothing.*/
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
