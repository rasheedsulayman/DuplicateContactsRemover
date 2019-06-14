package com.r4sh33d.duplicatecontactsremover.util

import android.Manifest


const val HANGOUTS = "Hangouts"
const val QQ = "QQ"
const val JABBER = "Jabber"

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

val requiredPermissions = arrayOf(
    Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS,
    Manifest.permission.WRITE_EXTERNAL_STORAGE
)

val requiredPermissionMap = mapOf(
    Pair(Manifest.permission.READ_CONTACTS, "We need the read contacts permission to find the duplicate contacts"),
    Pair(Manifest.permission.WRITE_CONTACTS, "We need write contacts permission to remove the duplicate contacts"),
    Pair(Manifest.permission.WRITE_EXTERNAL_STORAGE, "We need external storage permission to create contact backups"))