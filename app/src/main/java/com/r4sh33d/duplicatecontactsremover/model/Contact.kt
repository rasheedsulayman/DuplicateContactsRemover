package com.r4sh33d.duplicatecontactsremover.model

import android.os.Parcelable
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria.NAME
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria.PHONE_NUMBER
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contact(
    val id: Int,
    val firstName: String,
    val surname: String,
    val middleName: String,
    val contactId: Int,
    var phoneNumbers: List<PhoneNumber>,
    var accountName: String,
    var accountType: String,
    var isMarked: Boolean = false,
    var isChecked: Boolean = false
) : Parcelable {

    val fullName: String
        get() = "$firstName $middleName $surname"

    val multiLinedPhoneNumbers: String
        get() {
            val phoneNumbersBuilder = StringBuilder()
            phoneNumbers.forEachIndexed { index, phoneNumber ->
                phoneNumbersBuilder.append(phoneNumber.value)
                if (index != phoneNumbers.size - 1) phoneNumbersBuilder.append("\n")
            }
            return phoneNumbersBuilder.toString()
        }

    val initials: String
        get() = fullName.substring(0, 1)

    val normalizedNumberConcat: String
        get() {
            var phoneNumbersString = ""
            phoneNumbers.forEach {
                val phoneNumberKey = if (!it.normalizedNumber.isNullOrBlank()) it.normalizedNumber else it.value
                phoneNumbersString = phoneNumbersString.plus("$phoneNumberKey::")
            }
            return phoneNumbersString
        }

    fun containEqualNames(contact: Contact): Boolean {
        val thisContactName = fullName
        val name = contact.fullName
        if (thisContactName.isBlank() || name.isBlank()) {
            return false
        }
        return thisContactName == name
    }

    fun containEqualPhoneNumbers(contact: Contact): Boolean {
        val thisNomalizedNumber = normalizedNumberConcat
        val normaLizedNumber = contact.normalizedNumberConcat
        if (thisNomalizedNumber.isBlank() || normaLizedNumber.isBlank()) {
            return false
        }
        return thisNomalizedNumber.contains(normaLizedNumber) || normaLizedNumber.contains(thisNomalizedNumber)
    }

    fun isDuplicateOf(contact: Contact, duplicateCriteria: DuplicateCriteria = PHONE_NUMBER): Boolean {
        return when (duplicateCriteria) {
            PHONE_NUMBER -> containEqualPhoneNumbers(contact)
            NAME -> containEqualNames(contact)
        }
    }

    fun getDuplicateCriteriaString(duplicateCriteria: DuplicateCriteria): String {
        return when (duplicateCriteria) {
            PHONE_NUMBER -> normalizedNumberConcat
            NAME -> fullName
        }
    }

    override fun toString(): String {
        return "\nContact(name: $firstName $surname, phoneNumbers: $phoneNumbers, contactID: $contactId , rawId: $id)"
    }

}