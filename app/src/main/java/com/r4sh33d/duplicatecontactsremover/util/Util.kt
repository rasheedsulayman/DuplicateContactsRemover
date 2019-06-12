package com.r4sh33d.duplicatecontactsremover.util

import android.os.Environment
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

fun getDateTimeFromDateString(dateString: String): DateTime {
    val dateFormats = getDateFormats()
    var date = DateTime()
    for (format in dateFormats) {
        try {
            date = DateTime.parse(dateString, DateTimeFormat.forPattern(format))

            val hasYear = format.contains("y")
            if (!hasYear) {
                date = date.withYear(DateTime().year)
            }
            break
        } catch (ignored: Exception) {
        }
    }
    return date
}

fun getDateFormats() = arrayListOf(
    "yyyy-MM-dd",
    "yyyyMMdd",
    "yyyy.MM.dd",
    "yy-MM-dd",
    "yyMMdd",
    "yy.MM.dd",
    "yy/MM/dd",
    "MM-dd",
    "--MM-dd",
    "MMdd",
    "MM/dd",
    "MM.dd"
)

fun getBackupFile(): File {
    for (i in 1..1000) {
        val file = File(Environment.getExternalStorageDirectory(), "$CONTACTS_BACKUP_FILE_PREFIX$i.vcf")
        if (!file.exists() && !file.isDirectory) {
            return file
        }
    }
    val calender = Calendar.getInstance()
    val dateFormat = SimpleDateFormat("hh_mm_ss", Locale.getDefault())
    val timeString = dateFormat.format(calender.time)
    return File(
        Environment.getExternalStorageDirectory(),
        "$CONTACTS_BACKUP_FILE_PREFIX$timeString.vcf"
    )
}