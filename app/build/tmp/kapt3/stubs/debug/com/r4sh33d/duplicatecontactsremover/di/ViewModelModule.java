package com.r4sh33d.duplicatecontactsremover.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/di/ViewModelModule;", "", "()V", "bindContactSourcesViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesViewModel;", "bindContactsOperationSharedViewModel", "Lcom/r4sh33d/duplicatecontactsremover/shared/ContactsOperationSharedViewModel;", "bindDeleteContactsViewModel", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsViewModel;", "bindDuplicateContactViewModel", "Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactViewModel;", "bindRepoViewModel", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactsBackupViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/r4sh33d/duplicatecontactsremover/di/DuplicateContactsViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindContactSourcesViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDuplicateContactViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindRepoViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDeleteContactsViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.r4sh33d.duplicatecontactsremover.shared.ContactsOperationSharedViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindContactsOperationSharedViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.shared.ContactsOperationSharedViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.di.DuplicateContactsViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}