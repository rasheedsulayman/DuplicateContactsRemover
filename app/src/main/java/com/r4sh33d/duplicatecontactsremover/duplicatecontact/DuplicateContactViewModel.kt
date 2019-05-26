package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import timber.log.Timber

class DuplicateContactViewModel(val contactsHelper: ContactsHelper) : ViewModel() {

    private val _contactsList = MutableLiveData<List<Contact>>()


    val contactsList: LiveData<List<Contact>>
        get() = _contactsList

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        getDuplicateContactsList()
    }

    private fun getDuplicateContactsList() {
        coroutineScope.launch {
            withContext(Dispatchers.IO){
                Timber.d("Before get contacts")
                val contactsList = contactsHelper.getContacts()
                Timber.d("Size of contactsList: " + contactsList.size)
                Timber.d("Contacts list gotten: " + contactsList)
            }
        }

    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}