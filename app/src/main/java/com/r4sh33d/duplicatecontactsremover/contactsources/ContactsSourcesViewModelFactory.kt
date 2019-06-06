package com.r4sh33d.duplicatecontactsremover.contactsources

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria

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
