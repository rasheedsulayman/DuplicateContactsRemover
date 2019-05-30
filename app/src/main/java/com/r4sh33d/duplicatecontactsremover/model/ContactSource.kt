package com.r4sh33d.duplicatecontactsremover.model

data class ContactSource(
    var name: String,
    var type: String,
    var publicName: String,
    var contacts: ArrayList<Contact>?
) {

    fun getFullIdentifier(): String {
        return "$name:$type"
    }
}
