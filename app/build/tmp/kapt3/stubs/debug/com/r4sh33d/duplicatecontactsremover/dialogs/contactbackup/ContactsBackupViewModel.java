package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\b\u0010\u001f\u001a\u00020\u001bH\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactsBackupViewModel;", "Landroidx/lifecycle/ViewModel;", "vcfExporter", "Lcom/r4sh33d/duplicatecontactsremover/util/VcfExporter;", "(Lcom/r4sh33d/duplicatecontactsremover/util/VcfExporter;)V", "_progress", "Landroidx/lifecycle/MutableLiveData;", "", "_status", "Lcom/r4sh33d/duplicatecontactsremover/util/LoadingStatus;", "backupFile", "Ljava/io/File;", "getBackupFile", "()Ljava/io/File;", "setBackupFile", "(Ljava/io/File;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "progress", "Landroidx/lifecycle/LiveData;", "getProgress", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "viewModelJob", "Lkotlinx/coroutines/Job;", "backupContacts", "", "contacts", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "onCleared", "app_debug"})
public final class ContactsBackupViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _progress = null;
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.Nullable()
    private java.io.File backupFile;
    private final com.r4sh33d.duplicatecontactsremover.util.VcfExporter vcfExporter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getBackupFile() {
        return null;
    }
    
    public final void setBackupFile(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    public final void backupContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public ContactsBackupViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.VcfExporter vcfExporter) {
        super();
    }
}