
package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DuplicateContactsViewModelFactory(
        private val contactsHelper: ContactsHelper) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DuplicateContactViewModel::class.java)) {
            return DuplicateContactViewModel(contactsHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
