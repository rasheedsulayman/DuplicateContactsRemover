package com.r4sh33d.duplicatecontactsremover.contactsources

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentContactSourcesBinding
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper

class ContactSourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentContactSourcesBinding.inflate(inflater)

        binding.lifecycleOwner = this

        binding.contactSourcesRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        val viewModelFactory = ContactsSourcesViewModelFactory(ContactsHelper(context!!))

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ContactSourcesViewModel::class.java)

        binding.viewModel = viewModel

        binding.contactSourcesRecyclerView.adapter = ContactSourcesAdapter(ArrayList()) {
            viewModel.displayContactAccountDetails(it)
        }

        viewModel.navigateToSelectedContactsAccount.observe(this, Observer {
            if (null != it) {
                this.findNavController().navigate(
                    ContactSourcesFragmentDirections.actionContactSourcesFragmentToDuplicateContactFixFragment(it)
                )
                viewModel.displayContactAccountDetailsComplete()
            }
        })
        return binding.root
    }
}
