package com.r4sh33d.duplicatecontactsremover.contactsources

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesAdapter.ContactSourceViewHolder
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactSourceBinding
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount

class ContactSourcesAdapter(
    var contactsAccounts: List<ContactsAccount>,
    val accountClickListener: (ContactsAccount) -> Unit
) : RecyclerView.Adapter<ContactSourceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactSourceViewHolder {
        return ContactSourceViewHolder(
            ItemContactSourceBinding.bind(
                LayoutInflater.from(parent.context).inflate(R.layout.item_contact_source, parent, false)
            )
        )
    }

    override fun getItemCount(): Int {
        return contactsAccounts.size
    }

    override fun onBindViewHolder(holder: ContactSourceViewHolder, position: Int) {
        holder.bind(contactsAccounts[position])
    }

    fun updateData(contactsAccounts: List<ContactsAccount>) {
        this.contactsAccounts = contactsAccounts
        notifyDataSetChanged()
    }

    inner class ContactSourceViewHolder(private var binding: ItemContactSourceBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                accountClickListener(contactsAccounts[adapterPosition])
            }
        }

        fun bind(contactsAccount: ContactsAccount) {
            binding.account = contactsAccount
            binding.executePendingBindings()
        }
    }
}