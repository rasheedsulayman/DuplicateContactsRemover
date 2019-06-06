package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentDuplicateContactFixBinding
import kotlinx.android.synthetic.main.toolbar_layout.*

class DuplicateContactFixFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDuplicateContactFixBinding.inflate(inflater)
        binding.lifecycleOwner = this

        val fragmentArgs = DuplicateContactFixFragmentArgs.fromBundle(arguments!!)
        val viewModelFactory = DuplicateContactsViewModelFactory(fragmentArgs.contactsAccount, fragmentArgs.duplicateCriteria)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DuplicateContactViewModel::class.java)
        binding.viewModel = viewModel
        binding.contactsListRecyclerView.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )
        (activity as MainActivity).toolbarTitle.text = fragmentArgs.contactsAccount.getDisplayName()
        return binding.root
    }
}
