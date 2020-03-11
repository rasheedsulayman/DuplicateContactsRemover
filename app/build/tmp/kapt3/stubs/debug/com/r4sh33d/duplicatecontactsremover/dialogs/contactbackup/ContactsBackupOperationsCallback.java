package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactsBackupOperationsCallback;", "", "onBackupFinished", "", "dialog", "Lcom/r4sh33d/duplicatecontactsremover/dialogs/contactbackup/ContactBackupDialog;", "backUpFile", "Ljava/io/File;", "onFinishButtonClicked", "app_debug"})
public abstract interface ContactsBackupOperationsCallback {
    
    public abstract void onBackupFinished(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog dialog, @org.jetbrains.annotations.Nullable()
    java.io.File backUpFile);
    
    public abstract void onFinishButtonClicked(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog dialog);
}