package com.r4sh33d.duplicatecontactsremover.dialog

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter

class ContactsBackupViewModelFactory(
    private val vcfExporter: VcfExporter, private val contacts: ArrayList<Contact>
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactsBackupViewModel::class.java)) {
            return ContactsBackupViewModel(vcfExporter, contacts) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}