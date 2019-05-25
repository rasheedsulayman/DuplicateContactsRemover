package com.r4sh33d.duplicatecontactsremover.duplicatecontact


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.r4sh33d.duplicatecontactsremover.R

class DuplicateContactFixFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_duplicate_contact_fix, container, false)
    }


}
