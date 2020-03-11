package com.r4sh33d.duplicatecontactsremover.shared;

import java.lang.System;

/**
 * A ViewModel which that is shared between ContactSourcesFragments and DuplicateContactsFragment
 * to expose the user-selected ContactsAccount
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/shared/ContactsOperationSharedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_selectedAccount", "Landroidx/lifecycle/MutableLiveData;", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "selectedAccount", "Landroidx/lifecycle/LiveData;", "getSelectedAccount", "()Landroidx/lifecycle/LiveData;", "selectContactsAccount", "", "contactsAccount", "app_debug"})
public final class ContactsOperationSharedViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> _selectedAccount = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> getSelectedAccount() {
        return null;
    }
    
    public final void selectContactsAccount(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.model.ContactsAccount contactsAccount) {
    }
    
    @javax.inject.Inject()
    public ContactsOperationSharedViewModel() {
        super();
    }
}