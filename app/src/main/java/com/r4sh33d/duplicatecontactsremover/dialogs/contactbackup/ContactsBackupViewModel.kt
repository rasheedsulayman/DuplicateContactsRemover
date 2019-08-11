package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus
import com.r4sh33d.duplicatecontactsremover.util.LoadingStatus.*
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter
import com.r4sh33d.duplicatecontactsremover.util.getBackupFile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import timber.log.Timber
import java.io.File
import java.util.*
import javax.inject.Inject

class ContactsBackupViewModel @Inject constructor(
    private val vcfExporter: VcfExporter
) : ViewModel() {

    private val _status = MutableLiveData<LoadingStatus>()

    val status: LiveData<LoadingStatus>
        get() = _status

    private val _progress = MutableLiveData<Int>()

    val progress: LiveData<Int>
        get() = _progress

    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.IO)

    var backupFile: File? = null

    fun backupContacts(contacts: ArrayList<Contact>) {
        coroutineScope.launch {
            try {
                _status.postValue(LOADING)
                _progress.postValue(0)
                backupFile = getBackupFile()
                vcfExporter.exportContacts(backupFile!!, contacts) {
                    _progress.postValue(it)
                    if (it == 100) {
                        _status.postValue(DONE)
                    }
                }
            } catch (e: Exception) {
                Timber.e(e)
                _progress.postValue(0)
                _status.postValue(FAILED)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}
