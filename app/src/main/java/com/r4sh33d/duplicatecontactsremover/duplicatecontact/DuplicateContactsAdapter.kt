package com.r4sh33d.duplicatecontactsremover.duplicatecontact

import android.annotation.SuppressLint
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.util.forEach
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactGroupLabelBinding
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactListBinding
import com.r4sh33d.duplicatecontactsremover.model.Contact

class DuplicateContactsAdapter(val contactsToRemoveCallback: (HashSet<Contact>) -> Unit /*TODO use to an observer pattern?*/) :
    ListAdapter<Any, RecyclerView.ViewHolder>(DiffCallback) {

    var checkedPositionMarker = SparseBooleanArray()
    var contactToRemove = HashSet<Contact>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_CONTACT -> ContactViewHolder(
                ItemContactListBinding.bind(
                    inflater.inflate(R.layout.item_contact_list, parent, false)
                )
            )
            else -> LabelViewHolder(
                ItemContactGroupLabelBinding.bind(
                    inflater.inflate(R.layout.item_contact_group_label, parent, false)
                )
            )
        }
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Any>() {
        private const val TYPE_LABEL = 1
        private const val TYPE_CONTACT = 2

        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
            return oldItem === newItem
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
            if (oldItem is Contact && newItem is Contact) return oldItem.id == newItem.id
            if (oldItem is String && newItem is String) return oldItem == newItem
            return false
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        when (holder.itemViewType) {
            TYPE_CONTACT -> (holder as ContactViewHolder).bind(item as Contact)
            TYPE_LABEL -> (holder as LabelViewHolder).bind(item as String)
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item is Contact) TYPE_CONTACT else TYPE_LABEL
    }

    fun updateCheckedPositionMarker(checkedPositionMarker: SparseBooleanArray) {
        this.checkedPositionMarker = checkedPositionMarker
    }

    inner class ContactViewHolder(private val binding: ItemContactListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
                checkedPositionMarker.put(adapterPosition, isChecked)
                val contact = getItem(adapterPosition) as Contact
                if (isChecked) contactToRemove.add(contact) else contactToRemove.remove(contact)
                contactsToRemoveCallback(contactToRemove)
            }
            itemView.setOnClickListener {
                binding.checkBox.isChecked = !binding.checkBox.isChecked
            }
        }

        fun bind(contact: Contact) {
            binding.contact = contact
            binding.executePendingBindings()
            binding.checkBox.isChecked = checkedPositionMarker.get(adapterPosition, false)
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
