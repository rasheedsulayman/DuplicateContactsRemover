package com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsDialog;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/BaseProgressDialog;", "()V", "prefsUtils", "Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "getPrefsUtils", "()Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;", "setPrefsUtils", "(Lcom/r4sh33d/duplicatecontactsremover/util/PrefsUtils;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getTitle", "", "setUpDialogDetails", "", "Companion", "app_debug"})
public final class DeleteContactsDialog extends com.r4sh33d.duplicatecontactsremover.dialogs.BaseProgressDialog {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.r4sh33d.duplicatecontactsremover.util.PrefsUtils prefsUtils;
    private static final java.lang.String CONTACTS_KEY = "contacts_key";
    private static final java.lang.String BACKUP_FILE_NAME_KEY = "back_up_file_name";
    private static final java.lang.String TAG = "ContactBackupDialog";
    public static final com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog.Companion Companion = null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void setUpDialogDetails() {
    }
    
    public DeleteContactsDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JA\u0010\u0007\u001a\u00020\b\"\f\b\u0000\u0010\t*\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\t2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsDialog$Companion;", "", "()V", "BACKUP_FILE_NAME_KEY", "", "CONTACTS_KEY", "TAG", "show", "", "T", "Landroidx/fragment/app/Fragment;", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsOperationsCallback;", "parentFragment", "contactsToDelete", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/ArrayList;", "backUpFileName", "(Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        public final <T extends androidx.fragment.app.Fragment & com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsOperationsCallback>void show(@org.jetbrains.annotations.NotNull()
        T parentFragment, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contactsToDelete, @org.jetbrains.annotations.NotNull()
        java.lang.String backUpFileName) {
        }
        
        private Companion() {
            super();
        }
    }
}