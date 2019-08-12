package com.r4sh33d.duplicatecontactsremover.util

import android.content.SharedPreferences
import androidx.core.content.edit
import javax.inject.Inject

class PrefsUtils @Inject constructor(private val sharedPref: SharedPreferences) {

    fun putString(key: String, value: String?) {
        sharedPref.edit {
            putString(key, value)
        }
    }

    fun doesContain(key: String): Boolean {
        return sharedPref.contains(key)
    }

    fun putBoolean(key: String, value: Boolean) {
        sharedPref.edit {
            putBoolean(key, value)
        }
    }

    fun putInt(key: String, value: Int) {
        sharedPref.edit {
            putInt(key, value)
        }
    }

    fun putFloat(key: String, value: Float) {
        sharedPref.edit()
            .putFloat(key, value)
            .apply()
    }

    fun putStringSet(key: String, values: Set<String>) {
        sharedPref.edit {
            putStringSet(key, values)
        }
    }

    fun putLong(key: String, value: Long) {
        sharedPref.edit {
            putLong(key, value)
        }
    }

    fun getString(key: String, defaultValue: String?): String? {
        return sharedPref.getString(key, defaultValue)
    }

    fun getInt(key: String, defaultValue: Int): Int {
        return sharedPref.getInt(key, defaultValue)
    }

    fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return sharedPref.getBoolean(key, defaultValue)
    }

    fun getFloat(key: String, defaultValue: Float): Float {
        return sharedPref.getFloat(key, defaultValue)
    }

    fun getLong(key: String, defaultValue: Long): Long {
        return sharedPref.getLong(key, defaultValue)
    }

    fun getStringSet(key: String, defaultValue: Set<String>): Set<String>? {
        return sharedPref.getStringSet(key, defaultValue)
    }

    // Helper method to access common values

    fun incrementNoOfSuccessfulContactsOperations() {
        val noOfSuccessFullOperations = getNoOfSuccessfulContactsOperations() + 1
        val reset = (noOfSuccessFullOperations) > RATE_US_THRESHOLD
        putInt(PrefsKeys.NO_OF_SUCCESSFUL_OPERATIONS, if (reset) 1 else noOfSuccessFullOperations)
    }

    fun resetNoOfSuccessfulContactsOperations() {
        putInt(PrefsKeys.NO_OF_SUCCESSFUL_OPERATIONS, 1)
    }

    fun getNoOfSuccessfulContactsOperations() = getInt(PrefsKeys.NO_OF_SUCCESSFUL_OPERATIONS, 0)

    fun getNoDisturbStatusForStatusForRatings() =
        getBoolean(PrefsKeys.DO_NOT_DISTURB_FOR_RATING, false)

    fun setNoDisturbStatusForStatusForRatings(doNotDisturb: Boolean) =
        putBoolean(PrefsKeys.DO_NOT_DISTURB_FOR_RATING, doNotDisturb)
}
