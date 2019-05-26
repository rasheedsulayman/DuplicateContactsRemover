package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.app.Application
import com.r4sh33d.duplicatecontactsremover.BuildConfig
import timber.log.Timber



class DuplicateContactsApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}