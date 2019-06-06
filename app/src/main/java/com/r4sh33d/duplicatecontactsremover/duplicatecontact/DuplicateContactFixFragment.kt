package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentDuplicateContactFixConstaraintLayoutBinding
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper
import kotlinx.android.synthetic.main.toolbar_layout.*

class DuplicateContactFixFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDuplicateContactFixConstaraintLayoutBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.contactsListRecyclerView.adapter = DuplicateContactsAdapter()
        val fragmentArgs = DuplicateContactFixFragmentArgs.fromBundle(arguments!!)
        val viewModelFactory = DuplicateContactsViewModelFactory(
            fragmentArgs.contactsAccount,
            fragmentArgs.duplicateCriteria, ContactsHelper(context!!)
        )
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DuplicateContactViewModel::class.java)
        binding.viewModel = viewModel
        (activity as MainActivity).toolbarTitle.text = fragmentArgs.contactsAccount.getDisplayName()
        return binding.root
    }
}
