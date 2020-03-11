package com.r4sh33d.duplicatecontactsremover.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H&J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/BaseProgressDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "finishButton", "Lcom/google/android/material/button/MaterialButton;", "getFinishButton", "()Lcom/google/android/material/button/MaterialButton;", "setFinishButton", "(Lcom/google/android/material/button/MaterialButton;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "statusTextView", "Landroid/widget/TextView;", "getStatusTextView", "()Landroid/widget/TextView;", "setStatusTextView", "(Landroid/widget/TextView;)V", "getTitle", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setUpDialogDetails", "", "app_debug"})
public abstract class BaseProgressDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    protected android.widget.TextView statusTextView;
    @org.jetbrains.annotations.NotNull()
    protected com.google.android.material.button.MaterialButton finishButton;
    @org.jetbrains.annotations.NotNull()
    protected android.widget.ProgressBar progressBar;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.widget.TextView getStatusTextView() {
        return null;
    }
    
    protected final void setStatusTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.google.android.material.button.MaterialButton getFinishButton() {
        return null;
    }
    
    protected final void setFinishButton(@org.jetbrains.annotations.NotNull()
    com.google.android.material.button.MaterialButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    protected final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    public abstract void setUpDialogDetails();
    
    public BaseProgressDialog() {
        super();
    }
}