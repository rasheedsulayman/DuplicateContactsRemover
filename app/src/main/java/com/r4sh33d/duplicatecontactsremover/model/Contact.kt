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
    var isChecked: Boolean = false
) : Parcelable {

    val fullName: String
        get() = "$firstName $middleName $surname"

    val multiLinedPhoneNumbers: String
        get() {
            val phoneNumbersBuilder = StringBuilder()
            phoneNumbers.forEach {
                phoneNumbersBuilder.append("${it.value}\n")
            }
            return phoneNumbersBuilder.toString()
        }

    val initials: String
        get() = fullName.substring(0, 1)

    fun getNormalizedNumbersConcat(): String {
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
        return thisContactName.contains(name) || name.contains(thisContactName)
    }

    fun containEqualPhoneNumbers(contact: Contact): Boolean {
        val thisNomalizedNumber = getNormalizedNumbersConcat()
        val normaLizedNumber = contact.getNormalizedNumbersConcat()
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

    fun getDuplicateCriteriaString(duplicateCriteria: DuplicateCriteria = PHONE_NUMBER): String {
        return when (duplicateCriteria) {
            PHONE_NUMBER -> getNormalizedNumbersConcat()
            NAME -> fullName
        }
    }

    override fun toString(): String {
        return "\nContact(name: $firstName $surname, phoneNumbers: $phoneNumbers, contactID: $contactId , rawId: $id)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Contact

        if (id != other.id) return false
        if (firstName != other.firstName) return false
        if (surname != other.surname) return false
        if (middleName != other.middleName) return false
        if (contactId != other.contactId) return false
        if (phoneNumbers != other.phoneNumbers) return false
        if (accountName != other.accountName) return false
        if (accountType != other.accountType) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + firstName.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + middleName.hashCode()
        result = 31 * result + contactId
        result = 31 * result + phoneNumbers.hashCode()
        result = 31 * result + accountName.hashCode()
        result = 31 * result + accountType.hashCode()
        return result
    }

}