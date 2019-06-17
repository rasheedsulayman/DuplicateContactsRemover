package com.r4sh33d.duplicatecontactsremover

import android.app.Application
import com.r4sh33d.duplicatecontactsremover.di.AppComponent
import com.r4sh33d.duplicatecontactsremover.di.ContextModule
import com.r4sh33d.duplicatecontactsremover.di.DaggerAppComponent
import timber.log.Timber

class DuplicateContactsApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .contextModule(ContextModule(this))
            .build()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }
}