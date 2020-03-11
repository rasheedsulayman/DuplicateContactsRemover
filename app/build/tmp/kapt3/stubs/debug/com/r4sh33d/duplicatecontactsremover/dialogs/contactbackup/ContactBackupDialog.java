package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactBackupDialog;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/BaseProgressDialog;", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getTitle", "", "setUpDialogDetails", "", "Companion", "app_debug"})
public final class ContactBackupDialog extends com.r4sh33d.duplicatecontactsremover.dialogs.BaseProgressDialog {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private static final java.lang.String CONTACTS_KEY = "contacts_key";
    private static final java.lang.String TAG = "ContactBackupDialog";
    public static final com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void setUpDialogDetails() {
    }
    
    public ContactBackupDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J9\u0010\u0006\u001a\u00020\u0007\"\f\b\u0000\u0010\b*\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactBackupDialog$Companion;", "", "()V", "CONTACTS_KEY", "", "TAG", "show", "", "T", "Landroidx/fragment/app/Fragment;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactsBackupOperationsCallback;", "parentFragment", "contactsToDelete", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;)V", "app_debug"})
    public static final class Companion {
        
        public final <T extends androidx.fragment.app.Fragment & com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupOperationsCallback>void show(@org.jetbrains.annotations.NotNull()
        T parentFragment, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contactsToDelete) {
        }
        
        private Companion() {
            super();
        }
    }
}