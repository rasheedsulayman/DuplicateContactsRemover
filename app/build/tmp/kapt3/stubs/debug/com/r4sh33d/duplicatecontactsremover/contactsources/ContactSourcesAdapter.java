package com.r4sh33d.duplicatecontactsremover.contactsources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u0014\u0010\u0019\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesAdapter$ContactSourceViewHolder;", "contactsAccounts", "", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "accountClickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getAccountClickListener", "()Lkotlin/jvm/functions/Function1;", "getContactsAccounts", "()Ljava/util/List;", "setContactsAccounts", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "ContactSourceViewHolder", "app_debug"})
public final class ContactSourcesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesAdapter.ContactSourceViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> contactsAccounts;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount, kotlin.Unit> accountClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesAdapter.ContactSourceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesAdapter.ContactSourceViewHolder holder, int position) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> contactsAccounts) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> getContactsAccounts() {
        return null;
    }
    
    public final void setContactsAccounts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount, kotlin.Unit> getAccountClickListener() {
        return null;
    }
    
    public ContactSourcesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> contactsAccounts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.r4sh33d.duplicatecontactsremover.model.ContactsAccount, kotlin.Unit> accountClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesAdapter$ContactSourceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/r4sh33d/duplicatecontactsremover/databinding/ItemContactSourceBinding;", "(Lcom/r4sh33d/duplicatecontactsremover/contactsources/ContactSourcesAdapter;Lcom/r4sh33d/duplicatecontactsremover/databinding/ItemContactSourceBinding;)V", "bind", "", "contactsAccount", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "app_debug"})
    public final class ContactSourceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.r4sh33d.duplicatecontactsremover.databinding.ItemContactSourceBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.r4sh33d.duplicatecontactsremover.model.ContactsAccount contactsAccount) {
        }
        
        public ContactSourceViewHolder(@org.jetbrains.annotations.NotNull()
        com.r4sh33d.duplicatecontactsremover.databinding.ItemContactSourceBinding binding) {
            super(null);
        }
    }
}