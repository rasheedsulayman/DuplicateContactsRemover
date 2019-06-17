package com.r4sh33d.duplicatecontactsremover.contactsources

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.r4sh33d.duplicatecontactsremover.DuplicateContactsApp
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentContactSourcesConstaraintLayoutBinding
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
        val binding = FragmentContactSourcesConstaraintLayoutBinding.inflate(inflater)
        binding.lifecycleOwner = this
        val fragmentArgs = ContactSourcesFragmentArgs.fromBundle(arguments!!)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(ContactSourcesViewModel::class.java)
        binding.viewModel = viewModel
        binding.contactSourcesRecyclerView.adapter = ContactSourcesAdapter(ArrayList()) {
            viewModel.displayContactAccountDetails(it)
        }
        viewModel.getContactsAccountsList(fragmentArgs.duplicateCriteria)

        viewModel.navigateToSelectedContactsAccount.observe(this, Observer {
            if (it != null) {
                this.findNavController().navigate(
                    ContactSourcesFragmentDirections.actionContactSourcesFragmentToDuplicateContactFixFragment(it,
                        fragmentArgs.duplicateCriteria
                    )
                )
                viewModel.displayContactAccountDetailsComplete()
            }
        })
        setUpToolbar()
        return binding.root
    }

    private fun setUpToolbar () = mainActivity.run {
        setUpToolBar("Contact Sources")
        invalidateToolbarElevation(0)
    }
}
