package com.r4sh33d.duplicatecontactsremover.util

import android.Manifest
import com.r4sh33d.duplicatecontactsremover.R

const val HANGOUTS = "Hangouts"
const val QQ = "QQ"
const val JABBER = "Jabber"
const val TELEGRAM = "Telegram"

const val TELEGRAM_PACKAGE = "org.telegram.messenger"
const val CONTACTS_BACKUP_FILE_PREFIX = "duplicate_contacts_"

const val CELL = "CELL"
const val WORK = "WORK"
const val HOME = "HOME"
const val OTHER = "OTHER"
const val PREF = "PREF"
const val WORK_FAX = "WORK;FAX"
const val HOME_FAX = "HOME;FAX"
const val PAGER = "PAGER"
const val MOBILE = "MOBILE"
const val RATE_US_THRESHOLD = 2
const val ISSUE_URL = "https://github.com/r4sh33d/DuplicateContactsRemover/issues/new/"

val requiredPermissionMap = mapOf(
    Pair(Manifest.permission.READ_CONTACTS, R.string.read_contacts_permissions_explanation),
    Pair(Manifest.permission.WRITE_CONTACTS, R.string.write_contacts_permissions_explanation),
    Pair(Manifest.permission.WRITE_EXTERNAL_STORAGE, R.string.external_storage_permissions_explanation))

class PrefsKeys {
    companion object {
        const val NO_OF_SUCCESSFUL_OPERATIONS = "no_of_successful_operation"
        const val DO_NOT_DISTURB_FOR_RATING = "do_not_disturb_for_rating"
    }
}
