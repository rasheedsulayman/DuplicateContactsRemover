package com.r4sh33d.duplicatecontactsremover

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupViewModel
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsViewModel
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter


class ContactsSourcesViewModelFactory(
    private val contactsHelper: ContactsHelper, private val duplicateCriteria: DuplicateCriteria
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactSourcesViewModel::class.java)) {
            return ContactSourcesViewModel(contactsHelper, duplicateCriteria) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}


class ContactsBackupViewModelFactory(
    private val vcfExporter: VcfExporter, private val contacts: ArrayList<Contact>
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactsBackupViewModel::class.java)) {
            return ContactsBackupViewModel(
                vcfExporter,
                contacts
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class DeleteContactsViewModelFactory(
    private val contactsHelper: ContactsHelper, private val contacts: ArrayList<Contact>
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DeleteContactsViewModel::class.java)) {
            return DeleteContactsViewModel(
                contactsHelper,
                contacts
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class DuplicateContactsViewModelFactory(
    private val contactsAccount: ContactsAccount,
    private val duplicateCriteria: DuplicateCriteria,
    private val contactsHelper: ContactsHelper
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DuplicateContactViewModel::class.java)) {
            return DuplicateContactViewModel(contactsAccount, duplicateCriteria, contactsHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
