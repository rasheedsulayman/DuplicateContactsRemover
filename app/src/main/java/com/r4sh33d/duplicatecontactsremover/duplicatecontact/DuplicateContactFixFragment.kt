package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.r4sh33d.duplicatecontactsremover.R

class DuplicateContactFixFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_duplicate_contact_fix, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModelFactory = DuplicateContactsViewModelFactory(ContactsHelper(context!!))

        // Get a reference to the ViewModel associated with this fragment.
        val sleepQualityViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(DuplicateContactViewModel::class.java)


    }

}
