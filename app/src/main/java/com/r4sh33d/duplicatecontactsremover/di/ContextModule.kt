package com.r4sh33d.duplicatecontactsremover.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(private val appContext: Context) {

    @Provides
    @Singleton
    fun appContext(): Context = appContext
}
