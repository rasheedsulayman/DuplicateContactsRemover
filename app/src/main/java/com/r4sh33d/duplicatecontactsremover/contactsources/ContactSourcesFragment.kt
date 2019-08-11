package com.r4sh33d.duplicatecontactsremover.contactsources

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentContactSourcesBinding
import com.r4sh33d.duplicatecontactsremover.shared.ContactsOperationSharedViewModel
import javax.inject.Inject

class ContactSourcesFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (mainActivity.applicationContext as DuplicateContactsApp).component.inject(this)
        setUpToolbar()
        val binding = FragmentContactSourcesBinding.inflate(inflater)

        binding.lifecycleOwner = this
        val fragmentArgs = ContactSourcesFragmentArgs.fromBundle(arguments!!)

        val contactSourcesViewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(ContactSourcesViewModel::class.java)

        val sharedViewModel = mainActivity.run {
            ViewModelProviders.of(this, viewModelFactory)
                .get(ContactsOperationSharedViewModel::class.java)
        }

        binding.viewModel = contactSourcesViewModel

        binding.contactSourcesRecyclerView.adapter = ContactSourcesAdapter(ArrayList()) {
            sharedViewModel.selectContactsAccount(it)
            findNavController().navigate(
                ContactSourcesFragmentDirections
                    .actionContactSourcesFragmentToDuplicateContactFixFragment(fragmentArgs.duplicateCriteria)
            )
        }
        contactSourcesViewModel.getContactsAccountsList(fragmentArgs.duplicateCriteria)
        return binding.root
    }

    private fun setUpToolbar() = mainActivity.run {
        setUpToolBar(getString(R.string.contact_sources))
        invalidateToolbarElevation(0)
    }
}
