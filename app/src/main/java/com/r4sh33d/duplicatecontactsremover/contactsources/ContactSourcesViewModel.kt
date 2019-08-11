package com.r4sh33d.duplicatecontactsremover.contactsources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import kotlinx.coroutines.*
import javax.inject.Inject


class ContactSourcesViewModel @Inject constructor(private val contactsHelper: ContactsHelper) :
    ViewModel() {

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status

    private val _contactsAccountList = MutableLiveData<List<ContactsAccount>>()

    val contactsAccountList: LiveData<List<ContactsAccount>>
        get() = _contactsAccountList

    fun getContactsAccountsList(duplicateCriteria: DuplicateCriteria) {
        viewModelScope.launch {
            _status.value = LoadingStatus.LOADING
            _contactsAccountList.value = getContactsWithAccounts(duplicateCriteria)
            _status.value = if (contactsAccountList.value!!.isNotEmpty()) LoadingStatus.DONE
            else LoadingStatus.EMPTY
        }
    }

    private suspend fun getContactsWithAccounts(duplicateCriteria: DuplicateCriteria): List<ContactsAccount> {
        return withContext(Dispatchers.IO) {
            contactsHelper.getContactsWithAccounts(duplicateCriteria)
        }
    }
}