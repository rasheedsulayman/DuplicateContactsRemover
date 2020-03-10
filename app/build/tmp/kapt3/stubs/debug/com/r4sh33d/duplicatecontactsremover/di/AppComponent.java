package com.r4sh33d.duplicatecontactsremover.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/di/AppComponent;", "", "inject", "", "target", "Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesFragment;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactBackupDialog;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsDialog;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/rateus/RateUsDialog;", "Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactFixFragment;", "Builder", "app_debug"})
@dagger.Component(modules = {com.r4sh33d.duplicatecontactsremover.di.LocalDataModule.class, com.r4sh33d.duplicatecontactsremover.di.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesFragment target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactFixFragment target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.rateus.RateUsDialog target);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/di/AppComponent$Builder;", "", "build", "Lcom/r4sh33d/duplicatecontactsremover/di/AppComponent;", "context", "app", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.r4sh33d.duplicatecontactsremover.di.AppComponent build();
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.r4sh33d.duplicatecontactsremover.di.AppComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context app);
    }
}