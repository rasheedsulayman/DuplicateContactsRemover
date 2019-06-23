package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentDuplicateContactFixConstaraintLayoutBinding
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupOperationsCallback
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsOperationsCallback
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.getQuantityString
import com.r4sh33d.duplicatecontactsremover.util.onScrollChanged
import java.io.File
import javax.inject.Inject

class DuplicateContactFixFragment : Fragment(), ContactsBackupOperationsCallback, DeleteContactsOperationsCallback {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var contactsToDelete: HashSet<Contact>
    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (mainActivity.applicationContext as DuplicateContactsApp).component.inject(this)
        val binding = FragmentDuplicateContactFixConstaraintLayoutBinding.inflate(inflater)
        binding.lifecycleOwner = this
        val fragmentArgs = DuplicateContactFixFragmentArgs.fromBundle(arguments!!)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DuplicateContactViewModel::class.java)
        binding.viewModel = viewModel

        viewModel.getDuplicateContactsList(fragmentArgs.contactsAccount, fragmentArgs.duplicateCriteria)

        mainActivity.setUpToolBar(fragmentArgs.contactsAccount.getDisplayName())
        binding.removeDuplicates.text = mainActivity.getQuantityString(R.plurals.remove_n_contacts, 0)

        binding.contactsListRecyclerView.adapter = DuplicateContactsAdapter {
            binding.removeDuplicates.text = mainActivity.getQuantityString(R.plurals.remove_n_contacts, it.size)
            contactsToDelete = it
        }

        binding.contactsListRecyclerView.onScrollChanged { mainActivity.invalidateToolbarElevation(it) }

        binding.removeDuplicates.setOnClickListener {
            if (contactsToDelete.isEmpty()) {
                Toast.makeText(activity, R.string.select_contacts_to_delete, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            MaterialDialog(mainActivity).show {
                title(R.string.remove_contacts_question)
                message(text = mainActivity.getQuantityString(R.plurals.remove_n_duplicate_contacts_confirmation_message,
                        contactsToDelete.size) + getString(R.string.contacts_backup_and_restore_information)
                ) { lineSpacing(1.2f) }
                positiveButton(R.string.okay) {
                    ContactBackupDialog.show(this@DuplicateContactFixFragment, ArrayList(contactsToDelete))
                }
                negativeButton(R.string.cancel)
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
