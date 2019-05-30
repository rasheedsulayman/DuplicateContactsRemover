package com.r4sh33d.duplicatecontactsremover.model

data class PhoneNumber(var value: String, var type: Int, var label: String, var normalizedNumber: String?){
    override fun toString(): String {
        return "PhoneNumber(value='$value', type=$type, label='$label', normalizedNumber=$normalizedNumber)"
    }
}
