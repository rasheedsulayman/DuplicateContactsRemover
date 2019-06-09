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
import com.r4sh33d.duplicatecontactsremover.util.onScrollChanged

class DuplicateContactFixFragment : Fragment() {

    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

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
        mainActivity.setUpToolBar(fragmentArgs.contactsAccount.getDisplayName())
        binding.contactsListRecyclerView.onScrollChanged { mainActivity.invalidateToolbarElevation(it) }
        return binding.root
    }
}
