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
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentContactSourcesConstaraintLayoutBinding
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper

class ContactSourcesFragment : Fragment() {

    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentContactSourcesConstaraintLayoutBinding.inflate(inflater)

        binding.lifecycleOwner = this

        binding.contactSourcesRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )

        val fragmentArgs = ContactSourcesFragmentArgs.fromBundle(arguments!!)
        val viewModelFactory =
            ContactsSourcesViewModelFactory(ContactsHelper(context!!), fragmentArgs.duplicateCriteria)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ContactSourcesViewModel::class.java)
        binding.viewModel = viewModel

        binding.contactSourcesRecyclerView.adapter = ContactSourcesAdapter(ArrayList()) {
            viewModel.displayContactAccountDetails(it)
        }

        viewModel.navigateToSelectedContactsAccount.observe(this, Observer {
            if (null != it) {
                this.findNavController().navigate(
                    ContactSourcesFragmentDirections.actionContactSourcesFragmentToDuplicateContactFixFragment(
                        it,
                        fragmentArgs.duplicateCriteria
                    )
                )
                viewModel.displayContactAccountDetailsComplete()
            }
        })

        mainActivity.run {
            setUpToolBar("Contact Sources")
            invalidateToolbarElevation(0)
        }

        return binding.root
    }
}
