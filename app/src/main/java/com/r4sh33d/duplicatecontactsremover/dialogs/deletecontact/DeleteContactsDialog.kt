package com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact

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
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils
import javax.inject.Inject

class DeleteContactsDialog : BaseProgressDialog() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var prefsUtils: PrefsUtils

    companion object {
        private const val CONTACTS_KEY = "contacts_key"
        private const val BACKUP_FILE_NAME_KEY = "back_up_file_name"
        private const val TAG = "ContactBackupDialog"

        fun <T> show(
            parentFragment: T,
            contactsToDelete: ArrayList<Contact>,
            backUpFileName: String
        ) where T : Fragment, T : DeleteContactsOperationsCallback {
            val dialog = DeleteContactsDialog().apply {
                arguments = Bundle().apply {
                    putParcelableArrayList(CONTACTS_KEY, contactsToDelete)
                    putString(BACKUP_FILE_NAME_KEY, backUpFileName)
                }
            }
            dialog.show(parentFragment.childFragmentManager, TAG)
        }
    }

    override fun getTitle(): String {
        return getString(R.string.remove_duplicates)
    }

    override fun setUpDialogDetails() {
        (context!!.applicationContext as DuplicateContactsApp).component.inject(this)
        val contacts = arguments!!.getParcelableArrayList<Contact>(CONTACTS_KEY)!!
        val backUpFileName = arguments!!.getString(BACKUP_FILE_NAME_KEY)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DeleteContactsViewModel::class.java)
        val callback = parentFragment as? DeleteContactsOperationsCallback
            ?: throw IllegalArgumentException("Parent Fragment must implement DeleteContactsDialog")
        viewModel.status.observe(this, Observer {
            when (it) {
                LoadingStatus.LOADING -> statusTextView.text = getString(R.string.remove_contacts_progress_message)
                LoadingStatus.DONE -> {
                    var successMessage = getString(R.string.remove_contacts_success_message)
                    backUpFileName?.run {
                        successMessage += getString(R.string.backup_location_message, this)
                    }
                    statusTextView.text = successMessage
                    prefsUtils.incrementNoOfSuccessfulContactsOperations()
                    finishButton.isEnabled = true
                }
                LoadingStatus.FAILED -> {
                    statusTextView.text = getString(R.string.remove_contacts_failure_message)
                    finishButton.isEnabled = true
                }
                else -> { /*Nothing.*/
                }
            }
        })
        viewModel.progress.observe(this, Observer {
            progressBar.progress = it
        })
        finishButton.setOnClickListener {
            callback.onDeleteOperationFinished(this)
        }
        viewModel.deleteContacts(contacts)
    }
}

interface DeleteContactsOperationsCallback {
    fun onDeleteOperationFinished(dialog: DeleteContactsDialog)
}
