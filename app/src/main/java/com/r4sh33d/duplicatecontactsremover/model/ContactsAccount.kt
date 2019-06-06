package com.r4sh33d.duplicatecontactsremover.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ContactsAccount(val accountKey: String, val contacts: ArrayList<Contact>) : Parcelable {

    companion object {
        const val ACCOUNT_KEY_SEPARATOR = "<-->"
        const val TELEGRAM_DISPLAY_NAME = "Telegram"
        const val PHONE_DISPLAY_NAME = "Phone"
        const val SIM_CARD_DISPLAY_NAME = "Sim Card"
        const val TELEGRAM_PACKAGE = "org.telegram.messenger"
        const val SIGNAL_PACKAGE = "org.thoughtcrime.securesms"
        const val WHATSAPP_PACKAGE = "com.whatsapp"
        const val SAMSUNG_SIM_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim"
        const val SAMSUNG_PHONE_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.phone"
    }

    fun getDisplayName(): String {
        val keyList = accountKey.split(ACCOUNT_KEY_SEPARATOR)
        return when (keyList[1]) {
            TELEGRAM_PACKAGE -> TELEGRAM_DISPLAY_NAME
            SAMSUNG_SIM_CONTACTS_PACKAGE_NAME -> SIM_CARD_DISPLAY_NAME
            SAMSUNG_PHONE_CONTACTS_PACKAGE_NAME -> PHONE_DISPLAY_NAME
            else -> return keyList[0]
        }
    }
}