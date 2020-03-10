package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\"#$B)\u0012\"\u0010\u0004\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u000e\u0010!\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R-\u0010\u0004\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "contactsToRemoveCallback", "Lkotlin/Function1;", "Ljava/util/HashSet;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/HashSet;", "", "(Lkotlin/jvm/functions/Function1;)V", "checkedPositionMarker", "Landroid/util/SparseBooleanArray;", "getCheckedPositionMarker", "()Landroid/util/SparseBooleanArray;", "setCheckedPositionMarker", "(Landroid/util/SparseBooleanArray;)V", "contactToRemove", "getContactToRemove", "()Ljava/util/HashSet;", "setContactToRemove", "(Ljava/util/HashSet;)V", "getContactsToRemoveCallback", "()Lkotlin/jvm/functions/Function1;", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateCheckedPositionMarker", "ContactViewHolder", "DiffCallback", "LabelViewHolder", "app_debug"})
public final class DuplicateContactsAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.Object, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.util.SparseBooleanArray checkedPositionMarker;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact> contactToRemove;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact>, kotlin.Unit> contactsToRemoveCallback = null;
    private static final int TYPE_LABEL = 1;
    private static final int TYPE_CONTACT = 2;
    public static final com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactsAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.SparseBooleanArray getCheckedPositionMarker() {
        return null;
    }
    
    public final void setCheckedPositionMarker(@org.jetbrains.annotations.NotNull()
    android.util.SparseBooleanArray p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact> getContactToRemove() {
        return null;
    }
    
    public final void setContactToRemove(@org.jetbrains.annotations.NotNull()
    java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void updateCheckedPositionMarker(@org.jetbrains.annotations.NotNull()
    android.util.SparseBooleanArray checkedPositionMarker) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact>, kotlin.Unit> getContactsToRemoveCallback() {
        return null;
    }
    
    public DuplicateContactsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.Contact>, kotlin.Unit> contactsToRemoveCallback) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactsAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/r4sh33d/duplicatecontactsremover/databinding/ItemContactListBinding;", "(Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactsAdapter;Lcom/r4sh33d/duplicatecontactsremover/databinding/ItemContactListBinding;)V", "bind", "", "contact", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "app_debug"})
    public final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.r4sh33d.duplicatecontactsremover.databinding.ItemContactListBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.r4sh33d.duplicatecontactsremover.model.Contact contact) {
        }
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull()
        com.r4sh33d.duplicatecontactsremover.databinding.ItemContactListBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactsAdapter$LabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/r4sh33d/duplicatecontactsremover/databinding/ItemContactGroupLabelBinding;", "(Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactsAdapter;Lcom/r4sh33d/duplicatecontactsremover/databinding/ItemContactGroupLabelBinding;)V", "bind", "", "label", "", "app_debug"})
    public final class LabelViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.r4sh33d.duplicatecontactsremover.databinding.ItemContactGroupLabelBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String label) {
        }
        
        public LabelViewHolder(@org.jetbrains.annotations.NotNull()
        com.r4sh33d.duplicatecontactsremover.databinding.ItemContactGroupLabelBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0017J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/duplicatecontact/DuplicateContactsAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "()V", "TYPE_CONTACT", "", "TYPE_LABEL", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.Object> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.Object oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.Object newItem) {
            return false;
        }
        
        @android.annotation.SuppressLint(value = {"DiffUtilEquals"})
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.Object oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.Object newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}