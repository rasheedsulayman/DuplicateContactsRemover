package com.r4sh33d.duplicatecontactsremover.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J?\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\u0011J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/util/VcfExporter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contactsExported", "", "getContext", "()Landroid/content/Context;", "exportContacts", "", "file", "Ljava/io/File;", "contacts", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "progressCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "percentage", "getAddressTypeLabel", "", "type", "label", "getEmailTypeLabel", "getPhoneNumberTypeLabel", "app_debug"})
@javax.inject.Singleton()
public final class VcfExporter {
    private int contactsExported;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void exportContacts(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progressCallback) {
    }
    
    private final java.lang.String getPhoneNumberTypeLabel(int type, java.lang.String label) {
        return null;
    }
    
    private final java.lang.String getEmailTypeLabel(int type, java.lang.String label) {
        return null;
    }
    
    private final java.lang.String getAddressTypeLabel(int type, java.lang.String label) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public VcfExporter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}