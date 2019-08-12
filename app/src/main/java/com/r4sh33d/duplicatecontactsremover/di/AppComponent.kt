package com.r4sh33d.duplicatecontactsremover.di

import android.content.Context
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesFragment
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.rateus.RateUsDialog
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactFixFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        LocalDataModule::class, ViewModelModule::class
    ]
)

interface AppComponent {

    fun inject(target: ContactSourcesFragment)

    fun inject(target: DuplicateContactFixFragment)

    fun inject(target: ContactBackupDialog)

    fun inject(target: DeleteContactsDialog)

    fun inject(target: RateUsDialog)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun context(app: Context): Builder
    }
}
