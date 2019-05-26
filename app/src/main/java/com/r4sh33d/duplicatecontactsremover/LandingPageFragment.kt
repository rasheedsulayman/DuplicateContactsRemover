package com.r4sh33d.duplicatecontactsremover


import android.Manifest
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.PERMISSION_READ_CONTACTS
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.PERMISSION_WRITE_CONTACTS
import kotlinx.android.synthetic.main.fragment_landing_page.*

class LandingPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_landing_page, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startButton.setOnClickListener {
           requestPermission()
        }
    }

    fun navigateToNextPage(){
        startButton.findNavController().navigate(
            LandingPageFragmentDirections
                .actionLandingPageFragmentToDuplicateContactFixFragment()
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == PERMISSION_READ_CONTACTS && resultCode == RESULT_OK) {
            navigateToNextPage()
        }
    }

    fun requestPermission() {
        if (ContextCompat.checkSelfPermission(activity!!, Manifest.permission.READ_CONTACTS)
            == PackageManager.PERMISSION_GRANTED){
            navigateToNextPage()
        }
        else{
            ActivityCompat.requestPermissions(
                activity!!, arrayOf(Manifest.permission.WRITE_CONTACTS, Manifest.permission.READ_CONTACTS),
                PERMISSION_READ_CONTACTS
            )
        }
    }
}
