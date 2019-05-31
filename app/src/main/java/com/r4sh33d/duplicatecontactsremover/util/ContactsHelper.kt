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
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.model.Contact
import com.r4sh33d.duplicatecontactsremover.model.ContactSource
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount
import com.r4sh33d.duplicatecontactsremover.model.PhoneNumber
import timber.log.Timber
import java.util.HashSet
import java.util.LinkedHashSet
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.set

class ContactsHelper(val context: Context) {

    private val BATCH_SIZE = 100

    fun getContactsWithAccounts(): List<ContactsAccount> {
        return getDeviceContacts().filter {
            it.value.size > 1
        }.map { ContactsAccount(it.key, it.value) }
    }

    private fun getContactProjection() = arrayOf(
        ContactsContract.Data.CONTACT_ID,
        ContactsContract.Data.RAW_CONTACT_ID,
        CommonDataKinds.StructuredName.PREFIX,
        CommonDataKinds.StructuredName.GIVEN_NAME,
        CommonDataKinds.StructuredName.MIDDLE_NAME,
        CommonDataKinds.StructuredName.FAMILY_NAME,
        ContactsContract.RawContacts.ACCOUNT_NAME,
        ContactsContract.RawContacts.ACCOUNT_TYPE
    )

    private fun getDeviceContacts(): HashMap<String, ArrayList<Contact>> {
        var contactsMap = HashMap<String, ArrayList<Contact>>()
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = getContactProjection()
        val selection = "${ContactsContract.Data.MIMETYPE} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)
        val sortOrder = null

        var cursor: Cursor? = null

        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, sortOrder)
            if (cursor?.moveToFirst() == true) {
                do {
                    val accountName = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_NAME) ?: ""
                    val accountType = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_TYPE) ?: ""
                    var accountNameIdentifier = accountName
                    if (accountType == TELEGRAM_PACKAGE) {
                        accountNameIdentifier = context.getString(R.string.telegram)
                    }

                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val prefix = cursor.getStringValue(CommonDataKinds.StructuredName.PREFIX) ?: ""
                    val firstName = cursor.getStringValue(CommonDataKinds.StructuredName.GIVEN_NAME) ?: ""
                    val middleName = cursor.getStringValue(CommonDataKinds.StructuredName.MIDDLE_NAME) ?: ""
                    val surname = cursor.getStringValue(CommonDataKinds.StructuredName.FAMILY_NAME) ?: ""
                    val contactId = cursor.getIntValue(ContactsContract.Data.CONTACT_ID)
                    val numbers = getPhoneNumbers(id)

                    val contact = Contact(
                        id,
                        prefix,
                        firstName,
                        surname,
                        middleName,
                        "",
                        contactId,
                        numbers,
                        accountName,
                        accountType
                    )

                    if (!contactsMap.containsKey(accountNameIdentifier)) {
                        contactsMap[accountNameIdentifier] = ArrayList()
                    }
                    contactsMap[accountNameIdentifier]!!.add(contact)

                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
            context.showErrorToast(e)
        } finally {
            cursor?.close()
        }
        return contactsMap
    }

    private fun getPhoneNumbers(contactId: Int): ArrayList<PhoneNumber> {
        var phoneNumbers = ArrayList<PhoneNumber>()
        val uri = CommonDataKinds.Phone.CONTENT_URI
        val projection = arrayOf(
            ContactsContract.Data.RAW_CONTACT_ID,
            CommonDataKinds.Phone.NUMBER,
            CommonDataKinds.Phone.NORMALIZED_NUMBER,
            CommonDataKinds.Phone.TYPE,
            CommonDataKinds.Phone.LABEL
        )

        val selection = "${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = arrayOf(contactId.toString())
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                do {
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val number = cursor.getStringValue(CommonDataKinds.Phone.NUMBER) ?: continue
                    val normalizedNumber = cursor.getStringValue(CommonDataKinds.Phone.NORMALIZED_NUMBER) ?: null
                    val type = cursor.getIntValue(CommonDataKinds.Phone.TYPE)
                    val label = cursor.getStringValue(CommonDataKinds.Phone.LABEL) ?: ""
                    val phoneNumber = PhoneNumber(
                        number,
                        type,
                        label,
                        normalizedNumber
                    )
                    phoneNumbers.add(phoneNumber)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
            context.showErrorToast(e)
        } finally {
            cursor?.close()
        }
        return phoneNumbers
    }


    fun getContactWithId(id: Int, isLocalPrivate: Boolean): Contact? {
        if (id == 0) {
            return null
        }
        val selection = "${ContactsContract.Data.MIMETYPE} = ? AND ${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE, id.toString())
        return parseContactCursor(selection, selectionArgs)
    }

    fun getContactWithLookupKey(key: String): Contact? {
        val selection = "${ContactsContract.Data.MIMETYPE} = ? AND ${ContactsContract.Data.LOOKUP_KEY} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE, key)
        return parseContactCursor(selection, selectionArgs)
    }

    private fun parseContactCursor(selection: String, selectionArgs: Array<String>): Contact? {
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = getContactProjection()
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
            if (cursor?.moveToFirst() == true) {
                val accountName = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_NAME) ?: ""
                val accountType = cursor.getStringValue(ContactsContract.RawContacts.ACCOUNT_TYPE) ?: ""
                val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                val prefix = cursor.getStringValue(CommonDataKinds.StructuredName.PREFIX) ?: ""
                val firstName = cursor.getStringValue(CommonDataKinds.StructuredName.GIVEN_NAME)
                    ?: ""
                val middleName = cursor.getStringValue(CommonDataKinds.StructuredName.MIDDLE_NAME)
                    ?: ""
                val surname = cursor.getStringValue(CommonDataKinds.StructuredName.FAMILY_NAME)
                    ?: ""
                val suffix = cursor.getStringValue(CommonDataKinds.StructuredName.SUFFIX) ?: ""
                val number = getPhoneNumbers(id)
                val contactId = cursor.getIntValue(ContactsContract.Data.CONTACT_ID)
                return Contact(
                    id, prefix, firstName, surname, middleName, suffix, contactId, number,
                    accountName, accountType
                )
            }
        } finally {
            cursor?.close()
        }
        return null
    }


    private fun getRealContactId(id: Long): Int {
        val uri = ContactsContract.Data.CONTENT_URI
        val projection = getContactProjection()
        val selection = "${ContactsContract.Data.MIMETYPE} = ? AND ${ContactsContract.Data.RAW_CONTACT_ID} = ?"
        val selectionArgs = arrayOf(CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE, id.toString())
        var cursor: Cursor? = null
        try {
            cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
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

            if (context.hasPermission(PERMISSION_WRITE_CONTACTS)) {
                context.contentResolver.applyBatch(ContactsContract.AUTHORITY, operations)
            }
        } catch (e: Exception) {
            context.showErrorToast(e)
        }
    }

    fun Context.getAllContactSources(): List<ContactSource> {
        val sources = ContactsHelper(this).getDeviceContactSources()
        return sources.toMutableList()
    }

    fun getDeviceContactSources(): LinkedHashSet<ContactSource> {
        val sources = LinkedHashSet<ContactSource>()
        if (!context.hasContactPermissions()) {
            return sources
        }

        val accounts = AccountManager.get(context).accounts
        accounts.forEach {
            if (ContentResolver.getIsSyncable(it, ContactsContract.AUTHORITY) == 1) {
                var publicName = it.name
                if (it.type == TELEGRAM_PACKAGE) {
                    publicName += " (${context.getString(R.string.telegram)})"
                }
                val contactSource = ContactSource(
                    it.name,
                    it.type,
                    publicName
                )
                sources.add(contactSource)
            }
        }

        val contentResolverAccounts = getContentResolverAccounts().filter {
            it.name.isNotEmpty() && it.type.isNotEmpty() && !accounts.contains(Account(it.name, it.type))
        }
        sources.addAll(contentResolverAccounts)

        return sources
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
                    var publicName = name
                    if (type == TELEGRAM_PACKAGE) {
                        publicName += " (${context.getString(R.string.telegram)})"
                    }

                    val source = ContactSource(
                        name,
                        type,
                        publicName
                    )
                    sources.add(source)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
        } finally {
            cursor?.close()
        }
    }
}
