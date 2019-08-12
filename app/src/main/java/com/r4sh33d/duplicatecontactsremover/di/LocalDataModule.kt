package com.r4sh33d.duplicatecontactsremover.di

import android.content.Context
import android.content.SharedPreferences
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Provides
    @Singleton
    fun provideGlobalSharedPreference(app: Context): SharedPreferences =
        app.getSharedPreferences("global_shared_prefs", Context.MODE_PRIVATE)

    @Provides
    @Singleton
    fun providePrefsUtils(prefs: SharedPreferences): PrefsUtils =
        PrefsUtils(prefs)
}
