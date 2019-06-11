package com.r4sh33d.duplicatecontactsremover.dialog

import android.os.Environment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.CONTACTS_BACKUP_FILE_PREFIX
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.io.File

enum class BackupAndDeleteOperationStatus {
    IDLE, BACKUP, DELETE, FINISHED, FAILED
}

class ContactsDeleteAndBackupViewModel(val contactsHelper: ContactsHelper, val contacts: ArrayList<Contact>) :
    ViewModel() {

    private val _status = MutableLiveData<BackupAndDeleteOperationStatus>()

    val status: LiveData<BackupAndDeleteOperationStatus>
        get() = _status

    private val _progress = MutableLiveData<Int>()

    val progress: LiveData<Int>
        get() = _progress

    private var viewModelJob = Job()

    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        backupAndDeleteContacts()
    }

    private fun backupAndDeleteContacts() {
        coroutineScope.launch {
            _status.value = BackupAndDeleteOperationStatus.BACKUP
            _progress.value = 0

        }
    }


    fun getBackupFile(): File {
        for (i in 1..1000) {
            val file = File(Environment.getExternalStorageDirectory(), "$CONTACTS_BACKUP_FILE_PREFIX$i.vcf")
            if (!file.exists() && !file.isDirectory) {
                return file
            }
        }
        return File(
            Environment.getExternalStorageDirectory(),
            "$CONTACTS_BACKUP_FILE_PREFIX${System.currentTimeMillis()}.vcf"
        )
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}