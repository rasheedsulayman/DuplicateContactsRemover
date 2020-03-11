package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0013\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\u0014j\b\u0012\u0004\u0012\u00020\t`\u0015\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fR&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactViewModel;", "Landroidx/lifecycle/ViewModel;", "contactsHelper", "Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;", "(Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;)V", "_duplicateContactSearchResult", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Landroid/util/SparseBooleanArray;", "_status", "Lcom/r4sh33d/duplicatecontactsremover/util/LoadingStatus;", "duplicateContactsSearchResults", "Landroidx/lifecycle/LiveData;", "getDuplicateContactsSearchResults", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "getDuplicateContacts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "contactsAccount", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "duplicateCriteria", "Lcom/r4sh33d/duplicatecontactsremover/util/DuplicateCriteria;", "(Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;Lcom/r4sh33d/duplicatecontactsremover/util/DuplicateCriteria;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDuplicateContactsList", "", "selectAll", "isSelectAll", "", "app_debug"})
public final class DuplicateContactViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> _status = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.util.List<java.lang.Object>, android.util.SparseBooleanArray>> _duplicateContactSearchResult = null;
    private final com.r4sh33d.duplicatecontactsremover.util.ContactsHelper contactsHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<java.lang.Object>, android.util.SparseBooleanArray>> getDuplicateContactsSearchResults() {
        return null;
    }
    
    public final void getDuplicateContactsList(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.model.ContactsAccount contactsAccount, @org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
    }
    
    public final void selectAll(boolean isSelectAll) {
    }
    
    @javax.inject.Inject()
    public DuplicateContactViewModel(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.ContactsHelper contactsHelper) {
        super();
    }
}