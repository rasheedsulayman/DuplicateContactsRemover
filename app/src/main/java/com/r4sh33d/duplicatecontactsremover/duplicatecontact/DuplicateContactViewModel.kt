//package com.r4sh33d.duplicatecontactsremover.duplicatecontact
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import com.r4sh33d.duplicatecontactsremover.model.Contact
//import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
//import kotlinx.coroutines.*
//import timber.log.Timber
//
//class DuplicateContactViewModel(val contactsHelper: ContactsHelper) : ViewModel() {
//
//    private val _contactsList = MutableLiveData<List<Contact>>()
//
//    val contactsList: LiveData<List<Contact>>
//        get() = _contactsList
//
//    private var viewModelJob = Job()
//    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)
//
//    init {
//        getDuplicateContactsList()
//    }
//
//    private fun getDuplicateContactsList() {
//        coroutineScope.launch {
//            Timber.d("Enter Main scope with, executing on: %s", Thread.currentThread())
//            val contactsMap = getContactsWithAccounts()
//        }
//    }
//
//    suspend fun getContactsWithAccounts(): Map<String, ArrayList<Contact>> {
//        return withContext(Dispatchers.IO) {
//            contactsHelper.getContactsWithAccounts()
//        }
//    }
//
//    override fun onCleared() {
//        super.onCleared()
//        Timber.d("Onclered called")
//        viewModelJob.cancel()
//    }
//}