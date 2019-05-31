package com.r4sh33d.duplicatecontactsremover.contactsources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import kotlinx.coroutines.*

enum class ContactAccountsLoadingStatus { LOADING, ERROR, DONE }

class ContactSourcesViewModel(val contactsHelper: ContactsHelper) : ViewModel() {

    private val _status = MutableLiveData<ContactAccountsLoadingStatus>()

    val status: LiveData<ContactAccountsLoadingStatus>
        get() = _status


    private val _contactsAccountList = MutableLiveData<List<ContactsAccount>>()

    val contactsAccountList: LiveData<List<ContactsAccount>>
        get() = _contactsAccountList


    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        getDuplicateContactsList()
    }

    private fun getDuplicateContactsList() {
        coroutineScope.launch {
            _status.value = ContactAccountsLoadingStatus.LOADING
            _contactsAccountList.value = getContactsWithAccounts()
            _status.value = ContactAccountsLoadingStatus.DONE
        }
    }

    suspend fun getContactsWithAccounts(): List<ContactsAccount> {
        return withContext(Dispatchers.IO) {
            contactsHelper.getContactsWithAccounts()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}