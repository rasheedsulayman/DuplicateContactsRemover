package com.r4sh33d.duplicatecontactsremover.contactsources

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesAdapter.ContactSourceViewHolder
import com.r4sh33d.duplicatecontactsremover.model.Account

class ContactSourcesAdapter(var accounts: ArrayList<Account>, val clickListener: (Account) -> Unit) :
    RecyclerView.Adapter<ContactSourceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactSourceViewHolder {
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ContactSourceViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ContactSourceViewHolder(private var binding: GridViewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(marsProperty: MarsProperty) {
            binding.property = marsProperty
            // This is important, because it forces the data binding to execute immediately,
            // which allows the RecyclerView to make the correct view size measurements
            binding.executePendingBindings()
        }
    }
}