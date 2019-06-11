package com.r4sh33d.duplicatecontactsremover.dialog

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria

class ContactsDeleteAndBackupViewModelFactory(
    private val contactsHelper: ContactsHelper, private val duplicateCriteria: DuplicateCriteria
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactsDeleteAndBackupViewModel::class.java)) {
            return ContactsDeleteAndBackupViewModel(contactsHelper) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
