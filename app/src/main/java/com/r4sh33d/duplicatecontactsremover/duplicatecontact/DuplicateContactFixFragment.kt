package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.os.Bundle
import android.view.*
import android.widget.CheckBox
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentDuplicateContactFixBinding
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupOperationsCallback
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsOperationsCallback
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.shared.ContactsOperationSharedViewModel
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils
import com.r4sh33d.duplicatecontactsremover.util.RATE_US_THRESHOLD
import com.r4sh33d.duplicatecontactsremover.util.getQuantityString
import com.r4sh33d.duplicatecontactsremover.util.onScrollChanged
import java.io.File
import javax.inject.Inject

class DuplicateContactFixFragment : Fragment(), ContactsBackupOperationsCallback,
    DeleteContactsOperationsCallback {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var prefsUtils: PrefsUtils

    private lateinit var contactsToDelete: HashSet<Contact>

    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    private val duplicateContactsViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(DuplicateContactViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (mainActivity.applicationContext as DuplicateContactsApp).component.inject(this)

        val binding = FragmentDuplicateContactFixBinding.inflate(inflater)

        binding.lifecycleOwner = this

        val sharedViewModel = mainActivity.run {
            ViewModelProviders.of(this, viewModelFactory)
                .get(ContactsOperationSharedViewModel::class.java)
        }

        binding.viewModel = duplicateContactsViewModel
        val fragmentArgs = DuplicateContactFixFragmentArgs.fromBundle(arguments!!)

        sharedViewModel.selectedAccount.observe(this, Observer {
            duplicateContactsViewModel.getDuplicateContactsList(it, fragmentArgs.duplicateCriteria)
            mainActivity.setUpToolBar(it.getDisplayName())
        })

        binding.removeDuplicates.text =
            mainActivity.getQuantityString(R.plurals.remove_n_contacts, 0)

        binding.contactsListRecyclerView.adapter = DuplicateContactsAdapter {
            binding.removeDuplicates.text =
                mainActivity.getQuantityString(R.plurals.remove_n_contacts, it.size)
            contactsToDelete = it
        }

        binding.contactsListRecyclerView.onScrollChanged {
            mainActivity.invalidateToolbarElevation(
                it
            )
        }

        binding.removeDuplicates.setOnClickListener {
            if (contactsToDelete.isEmpty()) {
                Toast.makeText(activity, R.string.select_contacts_to_delete, Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            MaterialDialog(mainActivity).show {
                title(R.string.remove_contacts_question)
                message(
                    text = mainActivity.getQuantityString(
                        R.plurals.remove_n_duplicate_contacts_confirmation_message,
                        contactsToDelete.size
                    ) +
                            getString(R.string.contacts_backup_and_restore_information)
                ) { lineSpacing(1.2f) }
                positiveButton(R.string.okay) {
                    ContactBackupDialog.show(
                        this@DuplicateContactFixFragment,
                        ArrayList(contactsToDelete)
                    )
                }
                negativeButton(R.string.cancel)
            }
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.duplicate_fix_menu, menu)

        val checkBox = menu.findItem(R.id.menu_select_all).actionView as CheckBox

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            duplicateContactsViewModel.selectAll(isChecked)
        }
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
            DuplicateContactFixFragmentDirections.actionDuplicateContactFixFragmentToLandingPageFragment(
                canShowRateAppDialog()
            )
        )
    }

    private fun canShowRateAppDialog(): Boolean =
        !prefsUtils.getNoDisturbStatusForStatusForRatings() &&
                (prefsUtils.getNoOfSuccessfulContactsOperations() == RATE_US_THRESHOLD)
}
