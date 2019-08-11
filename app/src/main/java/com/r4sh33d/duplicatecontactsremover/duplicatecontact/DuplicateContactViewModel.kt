package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.util.SparseBooleanArray
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import kotlinx.coroutines.*
import timber.log.Timber
import javax.inject.Inject

class DuplicateContactViewModel @Inject constructor(
    private val contactsHelper: ContactsHelper
) : ViewModel() {

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status

    private val _duplicateContactSearchResult = MutableLiveData<Pair<List<Any>, SparseBooleanArray>>()

    val duplicateContactsSearchResults: LiveData<Pair<List<Any>, SparseBooleanArray>>
        get() = _duplicateContactSearchResult

     fun getDuplicateContactsList(contactsAccount: ContactsAccount, duplicateCriteria: DuplicateCriteria) {
         viewModelScope.launch {
            _status.value = LoadingStatus.LOADING
            _duplicateContactSearchResult.value = getDuplicateContacts(contactsAccount, duplicateCriteria)
            _status.value = if (duplicateContactsSearchResults.value!!.first.isNotEmpty()) LoadingStatus.DONE
            else LoadingStatus.EMPTY
        }
    }

    private suspend fun getDuplicateContacts(
        contactsAccount: ContactsAccount,
        duplicateCriteria: DuplicateCriteria
    ): Pair<ArrayList<Any>, SparseBooleanArray> {
        return withContext(Dispatchers.Default) {
            contactsHelper.getDuplicateContactsWithLabels(contactsAccount, duplicateCriteria)
        }
    }

}