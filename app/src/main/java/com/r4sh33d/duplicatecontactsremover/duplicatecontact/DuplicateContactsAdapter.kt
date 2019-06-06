package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactGroupLabelBinding
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactListBinding
import com.r4sh33d.duplicatecontactsremover.model.Contact

class DuplicateContactsAdapter(
    var duplicateContacts: List<Any> = ArrayList()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_LABEL = 1
    private val TYPE_CONTACT = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_CONTACT -> ContactViewHolder(
                ItemContactListBinding.bind(
                    inflater.inflate(
                        R.layout.item_contact_list,
                        parent,
                        false
                    )
                )
            )
            else -> LabelViewHolder(
                ItemContactGroupLabelBinding.bind(
                    inflater.inflate(
                        R.layout.item_contact_group_label,
                        parent,
                        false
                    )
                )
            )
        }
    }

    /*companion object DiffCallback : DiffUtil.ItemCallback<Any>() {
        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
            if (oldItem is Contact && newItem is Contact) return oldItem.id == newItem.id
            else if (oldItem is String && newItem is String) return (oldItem as String).equals(newItem as String)
            return false
        }

    }*/

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = duplicateContacts[position]
        when (holder.itemViewType) {
            TYPE_CONTACT -> (holder as ContactViewHolder).bind(item as Contact)
            TYPE_LABEL -> (holder as LabelViewHolder).bind(item as String)
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = duplicateContacts[position]
        return if (item is Contact) TYPE_CONTACT else TYPE_LABEL
    }

    override fun getItemCount(): Int {
        return duplicateContacts.size
    }

    fun updateData(duplicateContacts: List<Any>) {
        this.duplicateContacts = duplicateContacts
        notifyDataSetChanged()
    }

    inner class ContactViewHolder(private val binding: ItemContactListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(contact: Contact) {
            binding.contact = contact
            binding.executePendingBindings()
        }
    }

    inner class LabelViewHolder(private val binding: ItemContactGroupLabelBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(label: String) {
            binding.groupLabel = label
            binding.executePendingBindings()
        }
    }
}