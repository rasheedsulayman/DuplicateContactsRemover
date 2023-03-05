package com.r4sh33d.duplicatecontactsremover

import android.app.Application
import com.r4sh33d.duplicatecontactsremover.di.AppComponent
import com.r4sh33d.duplicatecontactsremover.di.DaggerAppComponent
import timber.log.Timber

class DuplicateContactsApp : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        // Fabric.with(this, Crashlytics())
        component = DaggerAppComponent.builder()
            .context(this)
            .build()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
