package com.r4sh33d.duplicatecontactsremover.util

import android.content.Context
import android.net.Uri
import android.provider.ContactsContract.CommonDataKinds
import android.provider.MediaStore
import com.r4sh33d.duplicatecontactsremover.model.Contact
import ezvcard.Ezvcard
import ezvcard.VCard
import ezvcard.parameter.ImageType
import ezvcard.property.*
import ezvcard.util.PartialDate
import java.io.File
import java.util.*

class VcfExporter(val context: Context) {
    private var contactsExported = 0

    fun exportContacts(file: File,
        contacts: ArrayList<Contact>,
        progressCallback: (percentage: Int) -> Unit
    ) {
        val cards = ArrayList<VCard>()
        for (contact in contacts) {
            val card = VCard()
            StructuredName().apply {
                prefixes.add(contact.prefix)
                given = contact.firstName
                additionalNames.add(contact.middleName)
                family = contact.surname
                suffixes.add(contact.suffix)
                card.structuredName = this
            }

            if (!contact.nickname.isNullOrEmpty()) {
                card.setNickname(contact.nickname)
            }

            contact.phoneNumbers.forEach {
                val phoneNumber = Telephone(it.value)
                phoneNumber.parameters.addType(getPhoneNumberTypeLabel(it.type, it.label))
                card.addTelephoneNumber(phoneNumber)
            }

            contact.emails?.forEach {
                val email = Email(it.value)
                email.parameters.addType(getEmailTypeLabel(it.type, it.label))
                card.addEmail(email)
            }

            contact.events?.forEach {
                if (it.type == CommonDataKinds.Event.TYPE_BIRTHDAY || it.type == CommonDataKinds.Event.TYPE_ANNIVERSARY) {
                    val dateTime = getDateTimeFromDateString(it.value)
                    if (it.value.startsWith("--")) {
                        val partialDate =
                            PartialDate.builder().year(null).month(dateTime.monthOfYear).date(dateTime.dayOfMonth)
                                .build()
                        if (it.type == CommonDataKinds.Event.TYPE_BIRTHDAY) {
                            card.birthdays.add(Birthday(partialDate))
                        } else {
                            card.anniversaries.add(Anniversary(partialDate))
                        }
                    } else {
                        Calendar.getInstance().apply {
                            clear()
                            set(Calendar.YEAR, dateTime.year)
                            set(Calendar.MONTH, dateTime.monthOfYear - 1)
                            set(Calendar.DAY_OF_MONTH, dateTime.dayOfMonth)
                            if (it.type == CommonDataKinds.Event.TYPE_BIRTHDAY) {
                                card.birthdays.add(Birthday(time))
                            } else {
                                card.anniversaries.add(Anniversary(time))
                            }
                        }
                    }
                }
            }

            contact.addresses?.forEach {
                val address = Address()
                address.streetAddress = it.value
                address.parameters.addType(getAddressTypeLabel(it.type, it.label))
                card.addAddress(address)
            }

            contact.IMs?.forEach {
                val impp = when (it.type) {
                    CommonDataKinds.Im.PROTOCOL_AIM -> Impp.aim(it.value)
                    CommonDataKinds.Im.PROTOCOL_YAHOO -> Impp.yahoo(it.value)
                    CommonDataKinds.Im.PROTOCOL_MSN -> Impp.msn(it.value)
                    CommonDataKinds.Im.PROTOCOL_ICQ -> Impp.icq(it.value)
                    CommonDataKinds.Im.PROTOCOL_SKYPE -> Impp.skype(it.value)
                    CommonDataKinds.Im.PROTOCOL_GOOGLE_TALK -> Impp(HANGOUTS, it.value)
                    CommonDataKinds.Im.PROTOCOL_QQ -> Impp(QQ, it.value)
                    CommonDataKinds.Im.PROTOCOL_JABBER -> Impp(JABBER, it.value)
                    else -> Impp(it.label, it.value)
                }
                card.addImpp(impp)
            }

            if (contact.notes != null && contact.notes.isNotEmpty()) {
                card.addNote(contact.notes)
            }

            if (contact.organization != null && contact.organization.isNotEmpty()) {
                val organization = Organization()
                organization.values.add(contact.organization.company)
                card.organization = organization
                card.titles.add(Title(contact.organization.jobPosition))
            }

            contact.websites?.forEach {
                card.addUrl(it)
            }

            if (!contact.thumbnailUri.isNullOrEmpty()) {
                val photoByteArray = MediaStore.Images.Media.getBitmap(
                    context.contentResolver,
                    Uri.parse(contact.thumbnailUri)
                ).getByteArray()
                val photo = Photo(photoByteArray, ImageType.JPEG)
                card.addPhoto(photo)
            }

            cards.add(card)
            contactsExported++
            // Use 90% for building the cards, then the remaining 10% for actual writing to file.
            progressCallback((contactsExported / contacts.size) * 90)
        }
        Ezvcard.write(cards).go(file)
        progressCallback(100)
    }

    private fun getPhoneNumberTypeLabel(type: Int, label: String) = when (type) {
        CommonDataKinds.Phone.TYPE_MOBILE -> CELL
        CommonDataKinds.Phone.TYPE_HOME -> HOME
        CommonDataKinds.Phone.TYPE_WORK -> WORK
        CommonDataKinds.Phone.TYPE_MAIN -> PREF
        CommonDataKinds.Phone.TYPE_FAX_WORK -> WORK_FAX
        CommonDataKinds.Phone.TYPE_FAX_HOME -> HOME_FAX
        CommonDataKinds.Phone.TYPE_PAGER -> PAGER
        CommonDataKinds.Phone.TYPE_OTHER -> OTHER
        else -> label
    }

    private fun getEmailTypeLabel(type: Int, label: String) = when (type) {
        CommonDataKinds.Email.TYPE_HOME -> HOME
        CommonDataKinds.Email.TYPE_WORK -> WORK
        CommonDataKinds.Email.TYPE_MOBILE -> MOBILE
        CommonDataKinds.Email.TYPE_OTHER -> OTHER
        else -> label
    }

    private fun getAddressTypeLabel(type: Int, label: String) = when (type) {
        CommonDataKinds.StructuredPostal.TYPE_HOME -> HOME
        CommonDataKinds.StructuredPostal.TYPE_WORK -> WORK
        CommonDataKinds.StructuredPostal.TYPE_OTHER -> OTHER
        else -> label
    }
}
