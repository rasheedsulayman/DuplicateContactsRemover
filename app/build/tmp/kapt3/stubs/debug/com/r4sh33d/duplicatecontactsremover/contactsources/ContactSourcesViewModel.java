package com.r4sh33d.duplicatecontactsremover.contactsources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesViewModel;", "Landroidx/lifecycle/ViewModel;", "contactsHelper", "Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;", "(Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;)V", "_contactsAccountList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "_status", "Lcom/r4sh33d/duplicatecontactsremover/util/LoadingStatus;", "contactsAccountList", "Landroidx/lifecycle/LiveData;", "getContactsAccountList", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "getContactsAccountsList", "", "duplicateCriteria", "Lcom/r4sh33d/duplicatecontactsremover/util/DuplicateCriteria;", "getContactsWithAccounts", "(Lcom/r4sh33d/duplicatecontactsremover/util/DuplicateCriteria;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "app_debug"})
public final class ContactSourcesViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount>> _contactsAccountList = null;
    private final com.r4sh33d.duplicatecontactsremover.util.ContactsHelper contactsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount>> getContactsAccountList() {
        return null;
    }
    
    public final void getContactsAccountsList(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public ContactSourcesViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.ContactsHelper contactsHelper) {
        super();
    }
}