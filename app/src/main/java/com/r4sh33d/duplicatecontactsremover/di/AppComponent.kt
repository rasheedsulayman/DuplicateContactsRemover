package com.r4sh33d.duplicatecontactsremover.di

import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesFragment
import com.r4sh33d.duplicatecontactsremover.dialogs.about.AboutDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactFixFragment
import com.r4sh33d.duplicatecontactsremover.landingpage.LandingPageFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ContextModule::class, ViewModelModule::class
    ]
)
interface AppComponent {

    fun inject(target: ContactSourcesFragment)

    fun inject(target: DuplicateContactFixFragment)

    fun inject(target: ContactBackupDialog)

    fun inject(target: DeleteContactsDialog)

    fun inject(target: AboutDialog)

}
