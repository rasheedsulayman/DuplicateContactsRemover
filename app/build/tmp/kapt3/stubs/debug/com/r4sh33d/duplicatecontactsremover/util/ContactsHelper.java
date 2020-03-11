package com.r4sh33d.duplicatecontactsremover.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JA\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\fj\b\u0012\u0004\u0012\u00020\u0010`\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u0013J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J/\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\fj\b\u0012\u0004\u0012\u00020 `\u00110\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0$JB\u0010*\u001a4\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0+j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100\fj\b\u0012\u0004\u0012\u00020\u0010`\u0011`,2\u0006\u0010&\u001a\u00020\'H\u0002J2\u0010-\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\fj\b\u0012\u0004\u0012\u00020\u0001`\u0011\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J/\u00101\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002020\fj\b\u0012\u0004\u0012\u000202`\u00110\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J/\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002040\fj\b\u0012\u0004\u0012\u000204`\u00110\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J/\u00105\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002060\fj\b\u0012\u0004\u0012\u000206`\u00110\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J/\u0010;\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020<0\fj\b\u0012\u0004\u0012\u00020<`\u00110\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"J\b\u0010=\u001a\u00020\u0007H\u0002J&\u0010>\u001a\u00020\u00072\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@H\u0002J+\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010EJ/\u0010F\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\fj\b\u0012\u0004\u0012\u00020\u0007`\u00110\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014H\u0002\u00a2\u0006\u0002\u0010\"R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contactsProjection", "", "", "[Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "displayContactSources", "Ljava/util/ArrayList;", "deleteContacts", "", "contacts", "Lcom/r4sh33d/duplicatecontactsremover/model/Contact;", "Lkotlin/collections/ArrayList;", "progressCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "progress", "fillSourcesFromUri", "uri", "Landroid/net/Uri;", "sources", "Ljava/util/HashSet;", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactSource;", "getAddresses", "Landroid/util/SparseArray;", "Lcom/r4sh33d/duplicatecontactsremover/model/Address;", "contactId", "(Ljava/lang/Integer;)Landroid/util/SparseArray;", "getContactsWithAccounts", "", "Lcom/r4sh33d/duplicatecontactsremover/model/ContactsAccount;", "duplicateCriteria", "Lcom/r4sh33d/duplicatecontactsremover/util/DuplicateCriteria;", "getContentResolverAccounts", "getDeviceContactSources", "getDeviceContacts", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getDuplicateContactsWithLabels", "Lkotlin/Pair;", "Landroid/util/SparseBooleanArray;", "contactsAccount", "getEmails", "Lcom/r4sh33d/duplicatecontactsremover/model/Email;", "getEvents", "Lcom/r4sh33d/duplicatecontactsremover/model/Event;", "getIMs", "Lcom/r4sh33d/duplicatecontactsremover/model/IM;", "getNicknames", "getNotes", "getOrganizations", "Lcom/r4sh33d/duplicatecontactsremover/model/Organization;", "getPhoneNumbers", "Lcom/r4sh33d/duplicatecontactsremover/model/PhoneNumber;", "getQuestionMarks", "getSourcesSelection", "addMimeType", "", "addContactId", "useRawContactId", "getSourcesSelectionArgs", "mimetype", "(Ljava/lang/String;Ljava/lang/Integer;)[Ljava/lang/String;", "getWebsites", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class ContactsHelper {
    private java.util.ArrayList<java.lang.String> displayContactSources;
    private final java.lang.String[] contactsProjection = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final int BATCH_SIZE = 100;
    public static final com.r4sh33d.duplicatecontactsremover.util.ContactsHelper.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> getContactsWithAccounts(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
        return null;
    }
    
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact>> getDeviceContacts(com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.PhoneNumber>> getPhoneNumbers(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.lang.String> getNicknames(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Email>> getEmails(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Address>> getAddresses(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.IM>> getIMs(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Event>> getEvents(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.lang.String> getNotes(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<com.r4sh33d.duplicatecontactsremover.model.Organization> getOrganizations(java.lang.Integer contactId) {
        return null;
    }
    
    private final android.util.SparseArray<java.util.ArrayList<java.lang.String>> getWebsites(java.lang.Integer contactId) {
        return null;
    }
    
    private final java.lang.String getQuestionMarks() {
        return null;
    }
    
    private final java.lang.String getSourcesSelection(boolean addMimeType, boolean addContactId, boolean useRawContactId) {
        return null;
    }
    
    private final java.lang.String[] getSourcesSelectionArgs(java.lang.String mimetype, java.lang.Integer contactId) {
        return null;
    }
    
    public final void deleteContacts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> contacts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> progressCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactSource> getDeviceContactSources() {
        return null;
    }
    
    private final java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.ContactSource> getContentResolverAccounts() {
        return null;
    }
    
    private final void fillSourcesFromUri(android.net.Uri uri, java.util.HashSet<com.r4sh33d.duplicatecontactsremover.model.ContactSource> sources) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.util.ArrayList<java.lang.Object>, android.util.SparseBooleanArray> getDuplicateContactsWithLabels(@org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.model.ContactsAccount contactsAccount, @org.jetbrains.annotations.NotNull()
    com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria duplicateCriteria) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public ContactsHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/r4sh33d/duplicatecontactsremover/util/ContactsHelper$Companion;", "", "()V", "BATCH_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}