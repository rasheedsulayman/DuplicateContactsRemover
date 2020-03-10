package com.r4sh33d.duplicatecontactsremover.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bX\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ab\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0013\u0012\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0013\u0012\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001`\u0013\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020#\u00a2\u0006\u0002\u0010$J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010`\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013H\u00c6\u0003J\u001d\u0010a\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0013H\u00c6\u0003J\u001d\u0010b\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0013H\u00c6\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010SJ\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u001d\u0010g\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0013H\u00c6\u0003J\u001d\u0010h\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001`\u0013H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020#H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010r\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010t\u001a\u00020#2\u0006\u0010u\u001a\u00020\u0000H\u0002J\u0010\u0010v\u001a\u00020#2\u0006\u0010u\u001a\u00020\u0000H\u0002J\u00de\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00132\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00132\u001c\b\u0002\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00132\u001c\b\u0002\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001`\u00132\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020#H\u00c6\u0001\u00a2\u0006\u0002\u0010xJ\t\u0010y\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010z\u001a\u00020#2\b\u0010{\u001a\u0004\u0018\u00010|H\u0096\u0002J\u000e\u0010}\u001a\u00020\u00052\u0006\u0010~\u001a\u00020\u007fJ\t\u0010\u0080\u0001\u001a\u00020\u0003H\u0016J\u0019\u0010\u0081\u0001\u001a\u00020#2\u0006\u0010u\u001a\u00020\u00002\b\b\u0002\u0010~\u001a\u00020\u007fJ\t\u0010\u0082\u0001\u001a\u00020\u0005H\u0016J\u001e\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0003H\u00d6\u0001R.\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R.\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0011\u00108\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b9\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0011\u0010;\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b<\u0010*R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010=\"\u0004\b>\u0010?R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010A\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\bB\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R\u0014\u0010E\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bF\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010*R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010*\"\u0004\bO\u0010,R\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010*\"\u0004\bQ\u0010,R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010V\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010!\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010*\"\u0004\bX\u0010,R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010*R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010*\"\u0004\b[\u0010,R.\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010&\"\u0004\b]\u0010(\u00a8\u0006\u0088\u0001"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Landroid/os/Parcelable;", "id", "", "firstName", "", "surname", "middleName", "contactId", "phoneNumbers", "", "Lcom/r4sh33d/duplicatecontactsremover/model/PhoneNumber;", "accountName", "accountType", "nickname", "photoUri", "emails", "Ljava/util/ArrayList;", "Lcom/r4sh33d/duplicatecontactsremover/model/Email;", "Lkotlin/collections/ArrayList;", "addresses", "Lcom/r4sh33d/duplicatecontactsremover/model/Address;", "events", "Lcom/r4sh33d/duplicatecontactsremover/model/Event;", "starred", "thumbnailUri", "notes", "organization", "Lcom/r4sh33d/duplicatecontactsremover/model/Organization;", "websites", "IMs", "Lcom/r4sh33d/duplicatecontactsremover/model/IM;", "prefix", "suffix", "isChecked", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/r4sh33d/duplicatecontactsremover/model/Organization;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)V", "getIMs", "()Ljava/util/ArrayList;", "setIMs", "(Ljava/util/ArrayList;)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getAccountType", "setAccountType", "getAddresses", "setAddresses", "getContactId", "()I", "getEmails", "setEmails", "getEvents", "setEvents", "getFirstName", "fullName", "getFullName", "getId", "initials", "getInitials", "()Z", "setChecked", "(Z)V", "getMiddleName", "multiLinedPhoneNumbers", "getMultiLinedPhoneNumbers", "getNickname", "setNickname", "normalizedNumberConcat", "getNormalizedNumberConcat", "getNotes", "getOrganization", "()Lcom/r4sh33d/duplicatecontactsremover/model/Organization;", "getPhoneNumbers", "()Ljava/util/List;", "setPhoneNumbers", "(Ljava/util/List;)V", "getPhotoUri", "setPhotoUri", "getPrefix", "setPrefix", "getStarred", "()Ljava/lang/Integer;", "setStarred", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSuffix", "setSuffix", "getSurname", "getThumbnailUri", "setThumbnailUri", "getWebsites", "setWebsites", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "containEqualNames", "contact", "containEqualPhoneNumbers", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/r4sh33d/duplicatecontactsremover/model/Organization;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "describeContents", "equals", "other", "", "getDuplicateCriteriaString", "duplicateCriteria", "Lcom/r4sh33d/duplicatecontactsremover/util/DuplicateCriteria;", "hashCode", "isDuplicateOf", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Contact implements android.os.Parcelable {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String surname = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String middleName = null;
    private final int contactId = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber> phoneNumbers;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accountName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accountType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nickname;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoUri;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email> emails;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address> addresses;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event> events;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer starred;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thumbnailUri;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String notes = null;
    @org.jetbrains.annotations.Nullable()
    private final com.r4sh33d.duplicatecontactsremover.model.Organization organization = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> websites;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM> IMs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String prefix;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String suffix;
    private boolean isChecked;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMultiLinedPhoneNumbers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInitials() {
        return null;
    }
    
    private final java.lang.String getNormalizedNumberConcat() {
        return null;
    }
    
    private final boolean containEqualNames(com.r4sh33d.duplicatecontactsremover.model.Contact contact) {
        return false;
    }
    
    private final boolean containEqualPhoneNumbers(com.r4sh33d.duplicatecontactsremover.model.Contact contact) {
        return false;
    }
    
    public final boolean isDuplicateOf(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.model.Contact contact, @org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDuplicateCriteriaString(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSurname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMiddleName() {
        return null;
    }
    
    public final int getContactId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber> getPhoneNumbers() {
        return null;
    }
    
    public final void setPhoneNumbers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountName() {
        return null;
    }
    
    public final void setAccountName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountType() {
        return null;
    }
    
    public final void setAccountType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNickname() {
        return null;
    }
    
    public final void setNickname(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoUri() {
        return null;
    }
    
    public final void setPhotoUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email> getEmails() {
        return null;
    }
    
    public final void setEmails(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address> getAddresses() {
        return null;
    }
    
    public final void setAddresses(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event> getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStarred() {
        return null;
    }
    
    public final void setStarred(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnailUri() {
        return null;
    }
    
    public final void setThumbnailUri(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.r4sh33d.duplicatecontactsremover.model.Organization getOrganization() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getWebsites() {
        return null;
    }
    
    public final void setWebsites(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM> getIMs() {
        return null;
    }
    
    public final void setIMs(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefix() {
        return null;
    }
    
    public final void setPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuffix() {
        return null;
    }
    
    public final void setSuffix(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isChecked() {
        return false;
    }
    
    public final void setChecked(boolean p0) {
    }
    
    public Contact(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String middleName, int contactId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber> phoneNumbers, @org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUri, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email> emails, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address> addresses, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event> events, @org.jetbrains.annotations.Nullable()
    java.lang.Integer starred, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnailUri, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.model.Organization organization, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> websites, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM> IMs, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix, boolean isChecked) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.r4sh33d.duplicatecontactsremover.model.Organization component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.r4sh33d.duplicatecontactsremover.model.Contact copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String middleName, int contactId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber> phoneNumbers, @org.jetbrains.annotations.NotNull()
    java.lang.String accountName, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, @org.jetbrains.annotations.Nullable()
    java.lang.String nickname, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUri, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email> emails, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address> addresses, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event> events, @org.jetbrains.annotations.Nullable()
    java.lang.Integer starred, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnailUri, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, @org.jetbrains.annotations.Nullable()
    com.r4sh33d.duplicatecontactsremover.model.Organization organization, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> websites, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM> IMs, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String suffix, boolean isChecked) {
        return null;
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
}