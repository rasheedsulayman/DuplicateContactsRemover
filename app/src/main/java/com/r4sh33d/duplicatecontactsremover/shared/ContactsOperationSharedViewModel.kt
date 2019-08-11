package com.r4sh33d.duplicatecontactsremover.shared

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import javax.inject.Inject

/**
 * A ViewModel which that is shared between ContactSourcesFragments and DuplicateContactsFragment
 * to expose the user-selected ContactsAccount
 */
class ContactsOperationSharedViewModel @Inject constructor() : ViewModel() {

    private val _selectedAccount = MutableLiveData<ContactsAccount>()
    val selectedAccount: LiveData<ContactsAccount>
        get() = _selectedAccount

    fun selectContactsAccount(contactsAccount: ContactsAccount) {
        _selectedAccount.value = contactsAccount
    }
}
