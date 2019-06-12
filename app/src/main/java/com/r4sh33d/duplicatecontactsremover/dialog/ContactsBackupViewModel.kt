package com.r4sh33d.duplicatecontactsremover.dialog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus.*
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter
import com.r4sh33d.duplicatecontactsremover.util.getBackupFile
import kotlinx.coroutines.*
import timber.log.Timber
import java.util.*

class ContactsBackupViewModel(val vcfExporter: VcfExporter, val contacts: ArrayList<Contact>
) :
    ViewModel() {

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status

    private val _progress = MutableLiveData<Int>()

    val progress: LiveData<Int>
        get() = _progress

    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        coroutineScope.launch {
            backupAndContacts()
        }
    }

    private suspend fun backupAndContacts() {
        withContext(Dispatchers.IO) {
            try {
                _status.value = LOADING
                _progress.value = 0
                vcfExporter.exportContacts(getBackupFile(), contacts) {
                    _progress.value = it
                    if (it == 100) {
                        _status.value = DONE
                    }
                }
            } catch (e: Exception) {
                Timber.e(e)
                _status.value = FAILED
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}