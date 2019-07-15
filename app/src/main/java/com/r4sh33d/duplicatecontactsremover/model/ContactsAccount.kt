package com.r4sh33d.duplicatecontactsremover.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ContactsAccount(val accountKey: String, val contacts: ArrayList<Contact>) : Parcelable {

    companion object {
        //some device manufacturers do not use regular name for phone and sim accounts. Also happens with some popular account providers.
        //We try to correct it here, where possible.
        //TODO find smarter way to do this without the manual checking.
        const val ACCOUNT_KEY_SEPARATOR = "<-->"
        const val TELEGRAM_DISPLAY_NAME = "Telegram"
        const val PHONE_DISPLAY_NAME = "Phone"
        const val SIM_CARD_DISPLAY_NAME = "Sim Card 1"
        const val SIM_CARD2_DISPLAY_NAME = "Sim Card 2"
        const val TELEGRAM_PACKAGE = "org.telegram.messenger"
        const val SAMSUNG_SIM_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim"
        const val SAMSUNG_SIM1_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim1"
        const val SAMSUNG_SIM2_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.sim2"
        const val SAMSUNG_PHONE_CONTACTS_PACKAGE_NAME = "vnd.sec.contact.phone"
    }

    fun getDisplayName(): String {
        val keyList = accountKey.split(ACCOUNT_KEY_SEPARATOR)
        return when (keyList[1]) {
            TELEGRAM_PACKAGE -> TELEGRAM_DISPLAY_NAME
            SAMSUNG_SIM_CONTACTS_PACKAGE_NAME, SAMSUNG_SIM1_CONTACTS_PACKAGE_NAME -> SIM_CARD_DISPLAY_NAME
            SAMSUNG_PHONE_CONTACTS_PACKAGE_NAME -> PHONE_DISPLAY_NAME
            SAMSUNG_SIM2_CONTACTS_PACKAGE_NAME -> SIM_CARD2_DISPLAY_NAME
            else -> return keyList[0]
        }
    }
}