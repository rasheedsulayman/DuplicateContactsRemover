package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsViewModelFactory
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentDuplicateContactFixConstaraintLayoutBinding
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupOperationsCallback
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsOperationsCallback
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.onScrollChanged
import java.io.File
import kotlin.collections.ArrayList

class DuplicateContactFixFragment : Fragment(), ContactsBackupOperationsCallback, DeleteContactsOperationsCallback {
    private lateinit var contactsToDelete: HashSet<Contact>
    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDuplicateContactFixConstaraintLayoutBinding.inflate(inflater)
        binding.lifecycleOwner = this
        val fragmentArgs = DuplicateContactFixFragmentArgs.fromBundle(arguments!!)
        val viewModelFactory = DuplicateContactsViewModelFactory(
            fragmentArgs.contactsAccount,
            fragmentArgs.duplicateCriteria, ContactsHelper(context!!)
        )
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DuplicateContactViewModel::class.java)
        binding.viewModel = viewModel
        mainActivity.setUpToolBar(fragmentArgs.contactsAccount.getDisplayName())
        binding.contactsListRecyclerView.adapter = DuplicateContactsAdapter {
            binding.removeDuplicates.text = "Remove ${it.size} contacts"
            contactsToDelete = it
        }
        binding.contactsListRecyclerView.onScrollChanged { mainActivity.invalidateToolbarElevation(it) }

        binding.removeDuplicates.setOnClickListener {
            if (contactsToDelete.isEmpty()) {
                Toast.makeText(activity, "Please select contacts to delete in order to proceed", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            MaterialDialog(mainActivity).show {
                title(text = "Remove Contacts?")
                message(
                    text = "This operation will remove {${contactsToDelete.size} contacts from your phone. Don't worry, the contacts " +
                            "will be backed up to your phone storage. In case you change your mind, you can restore backed up contacts with any " +
                            "contacts manager app"
                )
                positiveButton(text = "Okay") {
                    ContactBackupDialog.show(this@DuplicateContactFixFragment, ArrayList(contactsToDelete))
                }
                negativeButton(text = "Cancel")
            }
        }
        return binding.root
    }

    override fun onDeleteOperationFinished(dialog: DeleteContactsDialog) {
        goToLandingPage()
    }

    override fun onBackupFinished(dialog: ContactBackupDialog, backUpFile: File?) {
        if (backUpFile != null) {
            dialog.dismiss()
            DeleteContactsDialog.show(this, ArrayList(contactsToDelete), backUpFile.absolutePath)
        }
    }

    override fun onFinishButtonClicked(dialog: ContactBackupDialog) {
        dialog.dismiss()
        goToLandingPage()
    }


    private fun goToLandingPage() {
        findNavController().navigate(
            DuplicateContactFixFragmentDirections.actionDuplicateContactFixFragmentToLandingPageFragment()
        )
    }
}
