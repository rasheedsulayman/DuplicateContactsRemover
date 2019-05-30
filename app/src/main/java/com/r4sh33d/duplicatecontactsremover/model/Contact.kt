package com.r4sh33d.duplicatecontactsremover.model

data class Contact(
    val id: Int,
    val prefix: String,
    val firstName: String,
    val surname: String,
    val middleName: String,
    val suffix: String,
    val contactId: Int,
    var phoneNumbers: List<PhoneNumber>,
    var accountName: String,
    var accountType: String
) {
    override fun toString(): String {
        return "Contact(id=$id, prefix='$prefix', firstName='$firstName', surname='$surname', " +
                "middleName='$middleName', suffix='$suffix', contactId=$contactId, phoneNumbers=$phoneNumbers, " +
                "accountName='$accountName', accountType='$accountType') +\n"
    }
}