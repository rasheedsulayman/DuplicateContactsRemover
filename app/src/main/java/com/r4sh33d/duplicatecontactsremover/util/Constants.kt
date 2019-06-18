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
const val MAIN = "MAIN"
const val FAX = "FAX"
const val WORK_FAX = "WORK;FAX"
const val HOME_FAX = "HOME;FAX"
const val PAGER = "PAGER"
const val MOBILE = "MOBILE"

val requiredPermissionMap = mapOf(
    Pair(Manifest.permission.READ_CONTACTS, R.string.read_contacts_permissions_explanation),
    Pair(Manifest.permission.WRITE_CONTACTS, R.string.write_contacts_permissions_explanation),
    Pair(Manifest.permission.WRITE_EXTERNAL_STORAGE, R.string.external_storage_permissions_explanation))