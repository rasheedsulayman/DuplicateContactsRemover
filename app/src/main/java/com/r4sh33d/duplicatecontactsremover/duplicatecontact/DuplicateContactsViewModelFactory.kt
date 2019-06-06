package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria

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
