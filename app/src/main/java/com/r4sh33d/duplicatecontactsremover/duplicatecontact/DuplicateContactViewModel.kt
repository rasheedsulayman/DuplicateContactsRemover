package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import kotlinx.coroutines.*

class DuplicateContactViewModel(
    private val contactsAccount: ContactsAccount,
    val duplicateCriteria: DuplicateCriteria,
    private val contactsHelper: ContactsHelper
) : ViewModel() {

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status

    private val _duplicateContactList = MutableLiveData<List<Any>>()

    val duplicateContactsList: LiveData<List<Any>>
        get() = _duplicateContactList

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        getDuplicateContactsList()
    }


    private fun getDuplicateContactsList() {
        coroutineScope.launch {
            _status.value = LoadingStatus.LOADING
            _duplicateContactList.value = getDuplicateContacts()
            _status.value = if (duplicateContactsList.value!!.isNotEmpty()) LoadingStatus.DONE
            else LoadingStatus.EMPTY
        }
    }

    suspend fun getDuplicateContacts(): ArrayList<Any> {
        return withContext(Dispatchers.Default) {
            contactsHelper.getDuplicateContactsWithLabels(contactsAccount, duplicateCriteria)
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}