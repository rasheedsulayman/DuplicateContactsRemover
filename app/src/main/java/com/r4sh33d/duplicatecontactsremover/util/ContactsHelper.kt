package com.r4sh33d.duplicatecontactsremover.util

import android.accounts.Account
import android.accounts.AccountManager
import android.content.ContentProviderOperation
import android.content.ContentResolver
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds
import android.telephony.PhoneNumberUtils
import android.text.TextUtils
import android.util.SparseArray
import android.util.SparseBooleanArray
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.model.*
import com.r4sh33d.duplicatecontactsremover.times
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria.NAME
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria.PHONE_NUMBER
import timber.log.Timber
import java.util.HashSet
import java.util.LinkedHashSet
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.set

class ContactsHelper(val context: Context) {
    private var displayContactSources = ArrayList<String>()
    private val BATCH_SIZE = 100

    private val contactsProjection = arrayOf(
        ContactsContract.Data.CONTACT_ID,
        ContactsContract.Data.RAW_CONTACT_ID,
        CommonDataKinds.StructuredName.PREFIX,
        CommonDataKinds.StructuredName.GIVEN_NAME,
        CommonDataKinds.StructuredName.MIDDLE_NAME,
        CommonDataKinds.StructuredName.FAMILY_NAME,
        CommonDataKinds.StructuredName.SUFFIX,
        CommonDataKinds.StructuredName.PHOTO_URI,
        CommonDataKinds.StructuredName.PHOTO_THUMBNAIL_URI,
        CommonDataKinds.StructuredName.STARRED,
        ContactsContract.RawContacts.ACCOUNT_NAME,
        ContactsContract.RawContacts.ACCOUNT_TYPE
    )

    fun getContactsWithAccounts(duplicateCriteria: DuplicateCriteria): List<ContactsAccount> {
        displayContactSources = getDeviceContactSources().map { it.name }.toMutableList() as ArrayList
        return getDeviceContacts(duplicateCriteria).map { ContactsAccount(it.key, it.value) }
    }

    private fun getDeviceContacts(duplicateCriteria: DuplicateCriteria): HashMap<String, ArrayList<Contact>> {

        val devicePhoneNumbers = getPhoneNumbers()
        val nicknames = getNicknames()
        val emails = getEmails()
        val addresses = getAddresses()
        val ims = getIMs()
        val events = getEvents()
        val notes = getNotes()
        val organizations = getOrganizations()
        val websites = getWebsites()

        val contactsMap = HashMap<String, ArrayList<Contact>>()
        val uri = ContactsContract.Data.CONTENT_URI
        val selection = "${ContactsContract.Data.MIMETYPE} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
        val sortOrder = null
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, contactsProjection, selection, selectionArgs, sortOrder)
            if (cursor?.moveToFirst() == true) {
                loop@ do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    var contactNumbers = devicePhoneNumbers.get(id)
                    val firstName = cursor.getStringValue(CommonDataKinds.StructuredName.GIVEN_NAME) ?: ""
                    val middleName = cursor.getStringValue(CommonDataKinds.StructuredName.MIDDLE_NAME) ?: ""
                    val surname = cursor.getStringValue(CommonDataKinds.StructuredName.FAMILY_NAME) ?: ""

                    when (duplicateCriteria) {
                        PHONE_NUMBER -> if (contactNumbers == null) continue@loop
                        NAME -> if ("$firstName $middleName $surname".isBlank()) continue@loop
                    }

                    val prefix = cursor.getStringValue(CommonDataKinds.StructuredName.PREFIX) ?: ""
                    val suffix = cursor.getStringValue(CommonDataKinds.StructuredName.SUFFIX) ?: ""
                    val accountName = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_NAME) ?: ""
                    val accountType = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_TYPE) ?: ""
                    val accountNameIdentifier = "$accountName${ContactsAccount.ACCOUNT_KEY_SEPARATOR}$accountType"
                    val contactId = cursor.getIntValue(ContactsContract.Data.CONTACT_ID)
                    val photoUri = cursor.getStringValue(CommonDataKinds.StructuredName.PHOTO_URI) ?: ""
                    val starred = cursor.getIntValue(CommonDataKinds.StructuredName.STARRED)
                    val thumbnailUri = cursor.getStringValue(CommonDataKinds.StructuredName.PHOTO_THUMBNAIL_URI) ?: ""

                    contactNumbers = contactNumbers ?: ArrayList()
                    val contactNickName = nicknames.get(id)
                    val contactEmails = emails.get(id)
                    val contactAddresses = addresses.get(id)
                    val contactIms = ims.get(id)
                    val contactEvents = events.get(id)
                    val contactNotes = notes.get(id)
                    val contactOrganization = organizations.get(id)
                    val contactWebsite = websites.get(id)

                    val contact = Contact(
                        id,
                        firstName,
                        surname,
                        middleName,
                        contactId,
                        contactNumbers,
                        accountName,
                        accountType,
                        contactNickName,
                        photoUri,
                        contactEmails,
                        contactAddresses, contactEvents,
                        starred, thumbnailUri, contactNotes,
                        contactOrganization, contactWebsite,
                        contactIms, prefix, suffix
                    )

                    if (!contactsMap.containsKey(accountNameIdentifier)) {
                        contactsMap[accountNameIdentifier] = ArrayList()
                    }
                    contactsMap[accountNameIdentifier]!!.add(contact)

                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }
        return contactsMap
    }

    private fun getPhoneNumbers(contactId: Int? = null): SparseArray<ArrayList<PhoneNumber>> {
        val phoneNumbers = SparseArray<ArrayList<PhoneNumber>>()
        val uri = CommonDataKinds.Phone.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Phone.NUMBER,
            CommonDataKinds.Phone.NORMALIZED_NUMBER,
            CommonDataKinds.Phone.TYPE,
            CommonDataKinds.Phone.LABEL
        )
        val selection = if (contactId == null) getSourcesSelection() else "${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = if (contactId == null) getSourcesSelectionArgs() else arrayOf(contactId.toString())
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val number = cursor.getStringValue(CommonDataKinds.Phone.NUMBER) ?: continue
                    val normalizedNumber =
                        cursor.getStringValue(CommonDataKinds.Phone.NORMALIZED_NUMBER)
                            ?: PhoneNumberUtils.normalizeNumber(number)

                    val type = cursor.getIntValue(CommonDataKinds.Phone.TYPE)
                    val label = cursor.getStringValue(CommonDataKinds.Phone.LABEL) ?: ""

                    if (phoneNumbers[id] == null) {
                        phoneNumbers.put(id, ArrayList())
                    }

                    val phoneNumber = PhoneNumber(number, type, label, normalizedNumber)
                    phoneNumbers[id].add(phoneNumber)
                } while (cursor.moveToNext())
            }
        } catch (ignored: Exception) {
        } finally {
            cursor?.close()
        }
        return phoneNumbers
    }


    private fun getNicknames(contactId: Int? = null): SparseArray<String> {
        val nicknames = SparseArray<String>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Nickname.NAME
        )

        val selection = getSourcesSelection(true, contactId != null)
        val selectionArgs = getSourcesSelectionArgs(CommonDataKinds.Nickname.CONTENT_ITEM_TYPE, contactId)

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val nickname = cursor.getStringValue(CommonDataKinds.Nickname.NAME) ?: continue
                    nicknames.put(id, nickname)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return nicknames
    }

    private fun getEmails(contactId: Int? = null): SparseArray<ArrayList<Email>> {
        val emails = SparseArray<ArrayList<Email>>()
        val uri = CommonDataKinds.Email.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Email.DATA,
            CommonDataKinds.Email.TYPE,
            CommonDataKinds.Email.LABEL
        )

        val selection = if (contactId == null) getSourcesSelection() else "${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = if (contactId == null) getSourcesSelectionArgs() else arrayOf(contactId.toString())

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val email = cursor.getStringValue(CommonDataKinds.Email.DATA) ?: continue
                    val type = cursor.getIntValue(CommonDataKinds.Email.TYPE)
                    val label = cursor.getStringValue(CommonDataKinds.Email.LABEL) ?: ""

                    if (emails[id] == null) {
                        emails.put(id, ArrayList())
                    }

                    emails[id]!!.add(Email(email, type, label))
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return emails
    }

    private fun getAddresses(contactId: Int? = null): SparseArray<ArrayList<Address>> {
        val addresses = SparseArray<ArrayList<Address>>()
        val uri = CommonDataKinds.StructuredPostal.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.StructuredPostal.FORMATTED_ADDRESS,
            CommonDataKinds.StructuredPostal.TYPE,
            CommonDataKinds.StructuredPostal.LABEL
        )

        val selection = if (contactId == null) getSourcesSelection() else "${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = if (contactId == null) getSourcesSelectionArgs() else arrayOf(contactId.toString())

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val address = cursor.getStringValue(CommonDataKinds.StructuredPostal.FORMATTED_ADDRESS)
                        ?: continue
                    val type = cursor.getIntValue(CommonDataKinds.StructuredPostal.TYPE)
                    val label = cursor.getStringValue(CommonDataKinds.StructuredPostal.LABEL) ?: ""

                    if (addresses[id] == null) {
                        addresses.put(id, ArrayList())
                    }

                    addresses[id]!!.add(Address(address, type, label))
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return addresses
    }

    private fun getIMs(contactId: Int? = null): SparseArray<ArrayList<IM>> {
        val IMs = SparseArray<ArrayList<IM>>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Im.DATA,
            CommonDataKinds.Im.PROTOCOL,
            CommonDataKinds.Im.CUSTOM_PROTOCOL
        )

        val selection = getSourcesSelection(true, contactId != null)
        val selectionArgs = getSourcesSelectionArgs(CommonDataKinds.Im.CONTENT_ITEM_TYPE, contactId)

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val IM = cursor.getStringValue(CommonDataKinds.Im.DATA) ?: continue
                    val type = cursor.getIntValue(CommonDataKinds.Im.PROTOCOL)
                    val label = cursor.getStringValue(CommonDataKinds.Im.CUSTOM_PROTOCOL) ?: ""

                    if (IMs[id] == null) {
                        IMs.put(id, ArrayList())
                    }

                    IMs[id]!!.add(IM(IM, type, label))
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return IMs
    }

    private fun getEvents(contactId: Int? = null): SparseArray<ArrayList<Event>> {
        val events = SparseArray<ArrayList<Event>>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Event.START_DATE,
            CommonDataKinds.Event.TYPE
        )

        val selection = getSourcesSelection(true, contactId != null)
        val selectionArgs = getSourcesSelectionArgs(CommonDataKinds.Event.CONTENT_ITEM_TYPE, contactId)

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val startDate = cursor.getStringValue(CommonDataKinds.Event.START_DATE)
                        ?: continue
                    val type = cursor.getIntValue(CommonDataKinds.Event.TYPE)

                    if (events[id] == null) {
                        events.put(id, ArrayList())
                    }

                    events[id]!!.add(Event(startDate, type))
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return events
    }

    private fun getNotes(contactId: Int? = null): SparseArray<String> {
        val notes = SparseArray<String>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Note.NOTE
        )

        val selection = getSourcesSelection(true, contactId != null)
        val selectionArgs = getSourcesSelectionArgs(CommonDataKinds.Note.CONTENT_ITEM_TYPE, contactId)

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val note = cursor.getStringValue(CommonDataKinds.Note.NOTE) ?: continue
                    notes.put(id, note)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return notes
    }

    private fun getOrganizations(contactId: Int? = null): SparseArray<Organization> {
        val organizations = SparseArray<Organization>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Organization.COMPANY,
            CommonDataKinds.Organization.TITLE
        )

        val selection = getSourcesSelection(true, contactId != null)
        val selectionArgs = getSourcesSelectionArgs(CommonDataKinds.Organization.CONTENT_ITEM_TYPE, contactId)

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val company = cursor.getStringValue(CommonDataKinds.Organization.COMPANY) ?: ""
                    val title = cursor.getStringValue(CommonDataKinds.Organization.TITLE) ?: ""
                    if (company.isEmpty() && title.isEmpty()) {
                        continue
                    }

                    val organization = Organization(company, title)
                    organizations.put(id, organization)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return organizations
    }

    private fun getWebsites(contactId: Int? = null): SparseArray<ArrayList<String>> {
        val websites = SparseArray<ArrayList<String>>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Website.URL
        )

        val selection = getSourcesSelection(true, contactId != null)
        val selectionArgs = getSourcesSelectionArgs(CommonDataKinds.Website.CONTENT_ITEM_TYPE, contactId)

        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val url = cursor.getStringValue(CommonDataKinds.Website.URL) ?: continue

                    if (websites[id] == null) {
                        websites.put(id, ArrayList())
                    }

                    websites[id]!!.add(url)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
        } finally {
            cursor?.close()
        }

        return websites
    }

    private fun getQuestionMarks() = "?,".times(displayContactSources.filter { it.isNotEmpty() }.size).trimEnd(',')

    private fun getSourcesSelection(
        addMimeType: Boolean = false,
        addContactId: Boolean = false,
        useRawContactId: Boolean = true
    ): String {
        val strings = ArrayList<String>()
        if (addMimeType) {
            strings.add("${ContactsContract.Data.MIMETYPE} = ?")
        }

        if (addContactId) {
            strings.add("${if (useRawContactId) ContactsContract.Data.RAW_CONTACT_ID else ContactsContract.Data.CONTACT_ID} = ?")
        } else {
            // sometimes local device storage has null account_name, handle it properly
            val accountnameString = StringBuilder()
            if (displayContactSources.contains("")) {
                accountnameString.append("(")
            }
            accountnameString.append("${ContactsContract.RawContacts.ACCOUNT_NAME} IN (${getQuestionMarks()})")
            if (displayContactSources.contains("")) {
                accountnameString.append(" OR ${ContactsContract.RawContacts.ACCOUNT_NAME} IS NULL)")
            }
            strings.add(accountnameString.toString())
        }

        return TextUtils.join(" AND ", strings)
    }

    private fun getSourcesSelectionArgs(mimetype: String? = null, contactId: Int? = null): Array<String> {
        val args = ArrayList<String>()

        if (mimetype != null) {
            args.add(mimetype)
        }

        if (contactId != null) {
            args.add(contactId.toString())
        } else {
            args.addAll(displayContactSources.filter { it.isNotEmpty() })
        }
        return args.toTypedArray()
    }


    private fun getRealContactId(id: Long): Int {
        val uri = ContactsContract.Data.CONTENT_URI
        val selection = "${ContactsContract.Data.MIMETYPE} = ? AND ${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE, id.toString())
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, contactsProjection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                return cursor.getIntValue(ContactsContract.Data.CONTACT_ID)
            }
        } finally {
            cursor?.close()
        }
        return 0
    }

    fun getContactLookupKey(contactId: String): String {
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = arrayOf(ContactsContract.Data.CONTACT_ID, ContactsContract.Data.LOOKUP_KEY)
        val selection = "${ContactsContract.Data.MIMETYPE} = ? AND ${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE, contactId)
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                val id = cursor.getIntValue(ContactsContract.Data.CONTACT_ID)
                val lookupKey = cursor.getStringValue(ContactsContract.Data.LOOKUP_KEY)
                return "$lookupKey/$id"
            }
        } finally {
            cursor?.close()
        }
        return ""
    }


    fun deleteContact(contact: Contact) {
        deleteContacts(arrayListOf(contact))
    }

    fun deleteContacts(contacts: ArrayList<Contact>) {
        try {
            val operations = ArrayList<ContentProviderOperation>()
            val selection = "${ContactsContract.RawContacts._ID} = ?"
            contacts.forEach {
                ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).apply {
                    val selectionArgs = arrayOf(it.id.toString())
                    withSelection(selection, selectionArgs)
                    operations.add(build())
                }

                if (operations.size % BATCH_SIZE == 0) {
                    context.contentResolver.applyBatch(ContactsContract.AUTHORITY, operations)
                    operations.clear()
                }
            }
            context.contentResolver.applyBatch(ContactsContract.AUTHORITY, operations)
        } catch (e: Exception) {
        }
    }

    fun getDeviceContactSources(): List<ContactSource> {
        val sources = LinkedHashSet<ContactSource>()
        val accounts = AccountManager.get(context).accounts
        accounts.forEach {
            if (ContentResolver.getIsSyncable(it, ContactsContract.AUTHORITY) == 1) {
                var publicName = it.name
                if (it.type == TELEGRAM_PACKAGE) {
                    publicName += " (${context.getString(R.string.telegram)})"
                }
                val contactSource = ContactSource(
                    it.name,
                    it.type
                )
                sources.add(contactSource)
            }
        }

        val contentResolverAccounts = getContentResolverAccounts().filter {
            it.name.isNotEmpty() && it.type.isNotEmpty() && !accounts.contains(Account(it.name, it.type))
        }
        sources.addAll(contentResolverAccounts)
        return sources.toMutableList()
    }

    private fun getContentResolverAccounts(): HashSet<ContactSource> {
        val sources = HashSet<ContactSource>()
        arrayOf(
            ContactsContract.Groups.CONTENT_URI, ContactsContract.Settings.CONTENT_URI,
            ContactsContract.RawContacts.CONTENT_URI
        ).forEach {
            fillSourcesFromUri(it, sources)
        }
        return sources
    }

    private fun fillSourcesFromUri(uri: Uri, sources: HashSet<ContactSource>) {
        val projection = arrayOf(
            ContactsContract.RawContacts.ACCOUNT_NAME,
            ContactsContract.RawContacts.ACCOUNT_TYPE
        )
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, null, null, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val name = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_NAME) ?: ""
                    val type = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_TYPE) ?: ""

                    val source = ContactSource(
                        name,
                        type
                    )
                    sources.add(source)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
        } finally {
            cursor?.close()
        }
    }

    fun getDuplicateContactsWithLabels(
        contactsAccount: ContactsAccount,
        duplicateCriteria: DuplicateCriteria
    ): Pair<ArrayList<Any>, SparseBooleanArray> {
        val listToReturn = ArrayList<Any>()
        val sparseBooleanArray = SparseBooleanArray()
        //Group the contacts by duplication criteria
        val contactsMap = contactsAccount.contacts.groupBy {
            it.getDuplicateCriteriaString(duplicateCriteria)
        }.filter {
            it.value.size > 1
        }
        //build the list to return
        contactsMap.values.forEachIndexed { index, list ->
            listToReturn.add("Group ${index + 1}")
            list.first().isChecked = true
            listToReturn.addAll(list)
        }
        //pre-select some of the contacts for deletion.
        listToReturn.forEachIndexed { index, any ->
            sparseBooleanArray.put(index, if (any is Contact) any.isChecked else false)
        }
        return Pair(listToReturn, sparseBooleanArray)
    }
}
