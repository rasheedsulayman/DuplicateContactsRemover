package com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\u0019\u001a\u00020\u0015H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/deletecontact/DeleteContactsViewModel;", "Landroidx/lifecycle/ViewModel;", "contactsHelper", "Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;", "(Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;)V", "_progress", "Landroidx/lifecycle/MutableLiveData;", "", "_status", "Lcom/r4sh33d/duplicatecontactsremover/util/LoadingStatus;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "progress", "Landroidx/lifecycle/LiveData;", "getProgress", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "viewModelJob", "Lkotlinx/coroutines/Job;", "deleteContacts", "", "contacts", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "onCleared", "app_debug"})
public final class DeleteContactsViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _progress = null;
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final com.r4sh33d.duplicatecontactsremover.util.ContactsHelper contactsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getProgress() {
        return null;
    }
    
    public final void deleteContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public DeleteContactsViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.ContactsHelper contactsHelper) {
        super();
    }
}