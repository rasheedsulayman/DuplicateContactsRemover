package com.r4sh33d.duplicatecontactsremover.contactsources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import kotlinx.coroutines.*


class ContactSourcesViewModel(val contactsHelper: ContactsHelper, val duplicateCriteria: DuplicateCriteria) :
    ViewModel() {

    private val _navigateToSelectedContactsAccount = MutableLiveData<ContactsAccount>()

    val navigateToSelectedContactsAccount: LiveData<ContactsAccount>
        get() = _navigateToSelectedContactsAccount

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status


    private val _contactsAccountList = MutableLiveData<List<ContactsAccount>>()

    val contactsAccountList: LiveData<List<ContactsAccount>>
        get() = _contactsAccountList

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        getContactsAccountsList()
    }

    private fun getContactsAccountsList() {
        coroutineScope.launch {
            _status.value = LoadingStatus.LOADING
            _contactsAccountList.value = getContactsWithAccounts()
            _status.value = if (contactsAccountList.value!!.isNotEmpty()) LoadingStatus.DONE
            else LoadingStatus.EMPTY
        }
    }

    suspend fun getContactsWithAccounts(): List<ContactsAccount> {
        return withContext(Dispatchers.IO) {
            contactsHelper.getContactsWithAccounts(duplicateCriteria)
        }
    }

    fun displayContactAccountDetails(contactsAccount: ContactsAccount) {
        _navigateToSelectedContactsAccount.value = contactsAccount
    }

    fun displayContactAccountDetailsComplete() {
        _navigateToSelectedContactsAccount.value = null
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}