package com.r4sh33d.duplicatecontactsremover.di

import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesFragment
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactFixFragment
import com.r4sh33d.duplicatecontactsremover.landingpage.LandingPageFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ContextModule::class
    ]
)
interface AppComponent {

    fun inject(target: LandingPageFragment)

    fun inject(target: ContactSourcesFragment)

    fun inject(target: DuplicateContactFixFragment)
}
