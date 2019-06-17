package com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import timber.log.Timber
import java.util.ArrayList
import javax.inject.Inject

class DeleteContactsViewModel @Inject constructor(
    private val contactsHelper: ContactsHelper
) : ViewModel() {

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status

    private val _progress = MutableLiveData<Int>()

    val progress: LiveData<Int>
        get() = _progress

    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.IO)

     fun deleteContacts(contacts: ArrayList<Contact>) {
        coroutineScope.launch {
            try {
                _status.postValue(LOADING)
                _progress.postValue(0)
                contactsHelper.deleteContacts(contacts) {
                    _progress.postValue(it)
                    if (it == 100) {
                        _status.postValue(DONE)
                    }
                }
            } catch (e: Exception) {
                Timber.e(e)
                _status.postValue(FAILED)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}