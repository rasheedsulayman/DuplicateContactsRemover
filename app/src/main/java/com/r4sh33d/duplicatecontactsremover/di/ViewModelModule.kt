
package com.r4sh33d.duplicatecontactsremover.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.r4sh33d.duplicatecontactsremover.util.DuplicateContactsViewModelFactory
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupViewModel
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsViewModel
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ContactSourcesViewModel::class)
    abstract fun bindContactSourcesViewModel(viewModel: ContactSourcesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DuplicateContactViewModel::class)
    abstract fun bindDuplicateContactViewModel(viewModel: DuplicateContactViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ContactsBackupViewModel::class)
    abstract fun bindRepoViewModel(viewModel: ContactsBackupViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(DeleteContactsViewModel::class)
    abstract fun deleteContactsViewModel(viewModel: DeleteContactsViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: DuplicateContactsViewModelFactory): ViewModelProvider.Factory
}
