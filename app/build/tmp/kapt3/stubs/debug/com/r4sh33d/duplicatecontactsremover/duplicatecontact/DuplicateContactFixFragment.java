package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006-"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactFixFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactsBackupOperationsCallback;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsOperationsCallback;", "()V", "contactsToDelete", "Ljava/util/HashSet;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/HashSet;", "mainActivity", "Lcom/r4sh33d/duplicatecontactsremover/MainActivity;", "getMainActivity", "()Lcom/r4sh33d/duplicatecontactsremover/MainActivity;", "prefsUtils", "Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "getPrefsUtils", "()Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "setPrefsUtils", "(Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "canShowRateAppDialog", "", "goToLandingPage", "", "onBackupFinished", "dialog", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactBackupDialog;", "backUpFile", "Ljava/io/File;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteOperationFinished", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsDialog;", "onFinishButtonClicked", "app_debug"})
public final class DuplicateContactFixFragment extends androidx.fragment.app.Fragment implements com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupOperationsCallback, com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsOperationsCallback {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.r4sh33d.duplicatecontactsremover.util.PrefsUtils prefsUtils;
    private java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact> contactsToDelete;
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
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