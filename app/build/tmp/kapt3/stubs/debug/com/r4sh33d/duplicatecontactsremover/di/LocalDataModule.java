package com.r4sh33d.duplicatecontactsremover.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/di/LocalDataModule;", "", "()V", "provideGlobalSharedPreference", "Landroid/content/SharedPreferences;", "app", "Landroid/content/Context;", "providePrefsUtils", "Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "prefs", "app_debug"})
@dagger.Module()
public final class LocalDataModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideGlobalSharedPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.r4sh33d.duplicatecontactsremover.util.PrefsUtils providePrefsUtils(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        return null;
    }
    
    public LocalDataModule() {
        super();
    }
}