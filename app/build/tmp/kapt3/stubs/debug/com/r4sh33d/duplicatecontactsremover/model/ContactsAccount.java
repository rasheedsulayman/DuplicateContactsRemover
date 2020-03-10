package com.r4sh33d.duplicatecontactsremover.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "Landroid/os/Parcelable;", "accountKey", "", "contacts", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getAccountKey", "()Ljava/lang/String;", "getContacts", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "getDisplayName", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class ContactsAccount implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String accountKey = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCOUNT_KEY_SEPARATOR = "<-->";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TELEGRAM_DISPLAY_NAME = "Telegram";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_DISPLAY_NAME = "Phone";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIM_CARD_DISPLAY_NAME = "Sim Card 1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIM_CARD2_DISPLAY_NAME = "Sim Card 2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TELEGRAM_PACKAGE = "org.telegram.messenger";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAMSUNG_SIM_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAMSUNG_SIM1_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAMSUNG_SIM2_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAMSUNG_PHONE_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.phone";
    public static final com.r4sh33d.duplicatecontactsremover.model.ContactsAccount.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> getContacts() {
        return null;
    }
    
    public ContactsAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String accountKey, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.r4sh33d.duplicatecontactsremover.model.ContactsAccount copy(@org.jetbrains.annotations.NotNull()
    java.lang.String accountKey, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount$Companion;", "", "()V", "ACCOUNT_KEY_SEPARATOR", "", "PHONE_DISPLAY_NAME", "SAMSUNG_PHONE_CONTACTS_PACKAGE_NAME", "SAMSUNG_SIM1_CONTACTS_PACKAGE_NAME", "SAMSUNG_SIM2_CONTACTS_PACKAGE_NAME", "SAMSUNG_SIM_CONTACTS_PACKAGE_NAME", "SIM_CARD2_DISPLAY_NAME", "SIM_CARD_DISPLAY_NAME", "TELEGRAM_DISPLAY_NAME", "TELEGRAM_PACKAGE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}