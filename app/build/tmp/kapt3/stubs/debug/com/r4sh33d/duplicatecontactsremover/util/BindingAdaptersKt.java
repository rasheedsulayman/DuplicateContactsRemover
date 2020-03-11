package com.r4sh33d.duplicatecontactsremover.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007\u001a,\u0010\u000e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a \u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007\u00a8\u0006\u0018"}, d2 = {"bindAccountsLoadingStatus", "", "statusProgressBar", "Landroid/widget/ProgressBar;", "status", "Lcom/r4sh33d/duplicatecontactsremover/util/LoadingStatus;", "statusTextView", "Landroid/widget/TextView;", "bindAccountsRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "bindDuplicateContactsRecyclerView", "pair", "Lkotlin/Pair;", "", "Landroid/util/SparseBooleanArray;", "bindDuplicatesLoadingStatus", "button", "Lcom/google/android/material/button/MaterialButton;", "bindHeaderTextView", "headerTextView", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"accountsLoadingStatus"})
    public static final void bindAccountsLoadingStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView statusTextView, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.util.LoadingStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"accountsLoadingStatus"})
    public static final void bindAccountsLoadingStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar statusProgressBar, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.util.LoadingStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"contactAccountsList"})
    public static final void bindHeaderTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView headerTextView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"contactAccountsList"})
    public static final void bindAccountsRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"duplicatesLoadingStatus"})
    public static final void bindDuplicatesLoadingStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView statusTextView, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.util.LoadingStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"duplicatesLoadingStatus"})
    public static final void bindDuplicatesLoadingStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar statusProgressBar, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.util.LoadingStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"duplicatesLoadingStatus"})
    public static final void bindDuplicatesLoadingStatus(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton button, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.util.LoadingStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"duplicateContactList"})
    public static final void bindDuplicateContactsRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    kotlin.Pair<? extends java.util.List<? extends java.lang.Object>, ? extends android.util.SparseBooleanArray> pair) {
    }
}