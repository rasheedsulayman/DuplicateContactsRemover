
package com.r4sh33d.duplicatecontactsremover.contactsources

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper

class ContactsSourcesViewModelFactory(
        private val contactsHelper: ContactsHelper
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactSourcesViewModel::class.java)) {
            return ContactSourcesViewModel(contactsHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
