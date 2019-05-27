package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.content.ContentProviderOperation
import android.content.Context
import android.database.Cursor
import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds
import timber.log.Timber

class ContactsHelper(val context: Context) {

    private val BATCH_SIZE = 100

    fun getContacts() : ArrayList<Contact>{
        return getDeviceContacts()
    }

    private fun getContactProjection() = arrayOf(
        ContactsContract.Data.CONTACT_ID,
        ContactsContract.Data.RAW_CONTACT_ID,
        CommonDataKinds.StructuredName.PREFIX,
        CommonDataKinds.StructuredName.GIVEN_NAME,
        CommonDataKinds.StructuredName.MIDDLE_NAME,
        CommonDataKinds.StructuredName.FAMILY_NAME
    )

    private fun getDeviceContacts(): ArrayList<Contact> {
        val contacts = ArrayList<Contact>()
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
                    val id = cursor.getIntValue(ContactsContract.Data.RAW_CONTACT_ID)
                    val prefix = cursor.getStringValue(CommonDataKinds.StructuredName.PREFIX) ?: ""
                    val firstName = cursor.getStringValue(CommonDataKinds.StructuredName.GIVEN_NAME) ?: ""
                    val middleName = cursor.getStringValue(CommonDataKinds.StructuredName.MIDDLE_NAME) ?: ""
                    val surname = cursor.getStringValue(CommonDataKinds.StructuredName.FAMILY_NAME) ?: ""
                    val contactId = cursor.getIntValue(ContactsContract.Data.CONTACT_ID)
                    val numbers = getPhoneNumbers(id)
                    val contact = Contact(id, prefix, firstName, surname, middleName, "", contactId, numbers)
                    contacts.add(contact)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            Timber.e(e)
            context.showErrorToast(e)
        } finally {
            cursor?.close()
        }
        context.showErrorToast("Finished getting the contacts data")
        return contacts
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
                    val phoneNumber = PhoneNumber(number, type, label, normalizedNumber)
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
                return Contact(id, prefix, firstName, surname, middleName, suffix, contactId, number)
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
}
