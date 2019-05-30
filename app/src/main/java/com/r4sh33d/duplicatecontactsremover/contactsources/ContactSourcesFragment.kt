package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentContactSourcesBinding
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper

class ContactSourcesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentContactSourcesBinding.inflate(inflater)

        binding.setLifecycleOwner(this)

        val viewModelFactory = ContactsSourcesViewModelFactory(ContactsHelper(context!!))

        val sleepQualityViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(ContactSourcesViewModel::class.java)

        binding.viewModel = sleepQualityViewModel


        return binding.root
    }


}
