package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001c\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020\"2\u0006\u0010$\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000103H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00069"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactFixFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactsBackupOperationsCallback;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsOperationsCallback;", "()V", "contactsToDelete", "Ljava/util/HashSet;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/HashSet;", "duplicateContactsViewModel", "Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactViewModel;", "getDuplicateContactsViewModel", "()Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactViewModel;", "duplicateContactsViewModel$delegate", "Lkotlin/Lazy;", "mainActivity", "Lcom/r4sh33d/duplicatecontactsremover/MainActivity;", "getMainActivity", "()Lcom/r4sh33d/duplicatecontactsremover/MainActivity;", "prefsUtils", "Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "getPrefsUtils", "()Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "setPrefsUtils", "(Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "canShowRateAppDialog", "", "goToLandingPage", "", "onBackupFinished", "dialog", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactBackupDialog;", "backUpFile", "Ljava/io/File;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteOperationFinished", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsDialog;", "onFinishButtonClicked", "onViewCreated", "view", "app_debug"})
public final class DuplicateContactFixFragment extends androidx.fragment.app.Fragment implements com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupOperationsCallback, com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsOperationsCallback {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.r4sh33d.duplicatecontactsremover.util.PrefsUtils prefsUtils;
    private java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact> contactsToDelete;
    private final kotlin.Lazy duplicateContactsViewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.r4sh33d.duplicatecontactsremover.util.PrefsUtils getPrefsUtils() {
        return null;
    }
    
    public final void setPrefsUtils(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.PrefsUtils p0) {
    }
    
    private final com.r4sh33d.duplicatecontactsremover.MainActivity getMainActivity() {
        return null;
    }
    
    private final com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel getDuplicateContactsViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu, @org.jetbrains.annotations.Nullable()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onDeleteOperationFinished(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog dialog) {
    }
    
    @java.lang.Override()
    public void onBackupFinished(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog dialog, @org.jetbrains.annotations.Nullable()
    java.io.File backUpFile) {
    }
    
    @java.lang.Override()
    public void onFinishButtonClicked(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog dialog) {
    }
    
    private final void goToLandingPage() {
    }
    
    private final boolean canShowRateAppDialog() {
        return false;
    }
    
    public DuplicateContactFixFragment() {
        super();
    }
}