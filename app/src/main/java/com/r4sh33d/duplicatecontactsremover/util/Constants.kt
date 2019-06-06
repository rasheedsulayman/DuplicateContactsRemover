package com.r4sh33d.duplicatecontactsremover.util

import android.Manifest


// apps with special handling
const val TELEGRAM_PACKAGE = "org.telegram.messenger"

val requiredPermissions = arrayOf(
    Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS,
    Manifest.permission.WRITE_EXTERNAL_STORAGE
)

val requiredPermissionMap = mapOf(
    Pair(Manifest.permission.READ_CONTACTS, "We need the read contacts permission to find the duplicate contacts"),
    Pair(Manifest.permission.WRITE_CONTACTS, "We need write contacts permission to remove the duplicate contacts"),
    Pair(Manifest.permission.WRITE_EXTERNAL_STORAGE, "We need external storage permission to create contact backups"))