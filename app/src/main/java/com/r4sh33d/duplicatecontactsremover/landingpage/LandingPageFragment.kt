package com.r4sh33d.duplicatecontactsremover.landingpage

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.google.android.material.snackbar.Snackbar
import com.r4sh33d.duplicatecontactsremover.LandingPageFragmentDirections
import com.r4sh33d.duplicatecontactsremover.MainActivity
import com.r4sh33d.duplicatecontactsremover.R
import com.r4sh33d.duplicatecontactsremover.util.*
import kotlinx.android.synthetic.main.fragment_landing_page.*

class LandingPageFragment : Fragment() {

    private val mainActivity: MainActivity
        get() {
            return activity as? MainActivity ?: throw IllegalStateException("Not attached!")
        }

    private val requestAppSettings = 600
    private val permissionCode = 500

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_landing_page, container, false)


    private val onButtonOnClickListener = View.OnClickListener {
        it.findNavController().navigate(
            LandingPageFragmentDirections.actionLandingPageFragmentToContactSourcesFragment(
                if (it.id == R.id.findDuplicateNumbersButton)
                    DuplicateCriteria.PHONE_NUMBER else DuplicateCriteria.NAME
            )
        )
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivity.setUpToolBar("Duplicate Contacts", true)
        mainActivity.invalidateToolbarElevation(0)
        checkPermissions()
    }

    private fun checkPermissionResults(results: IntArray): Boolean {
        results.forEach {
            if (it != PackageManager.PERMISSION_GRANTED) return false
        }
        return true
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (permissionCode == requestCode) {
            if (checkPermissionResults(grantResults)) {
                onStoragePermissionGranted()
            } else {
                for (permission in permissions) {
                    if (mainActivity.hasPermision(permission)) continue
                    if (shouldShowPermissionExplanation(permission)) {
                        Snackbar.make(
                            mainActivity.window.decorView.rootView,
                            requiredPermissionMap[permission]!!, Snackbar.LENGTH_INDEFINITE
                        ).apply {
                            setAction(R.string.grant) { checkPermissions() }
                            view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text).maxLines = 5
                            show()
                        }
                    } else {
                        MaterialDialog(mainActivity).show {
                            title(R.string.enable_permission)
                            message(R.string.manual_permission_grant_instruction)
                            positiveButton(R.string.settings) {
                                openAppSettings()
                                mainActivity.finish()
                            }
                            negativeButton(R.string.cancel) {
                                Toast.makeText(mainActivity,
                                    R.string.permission_denied, Toast.LENGTH_SHORT).show()
                                mainActivity.finish()
                            }
                        }
                    }
                    break
                }
            }
        }
    }

    fun shouldShowPermissionExplanation(permissionString: String): Boolean =
        ActivityCompat.shouldShowRequestPermissionRationale(mainActivity, permissionString)

    fun openAppSettings() {
        val appSettingsIntent = Intent(
            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
            Uri.parse("package:${mainActivity.packageName}")
        ).apply {
            addCategory(Intent.CATEGORY_DEFAULT)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivityForResult(appSettingsIntent, requestAppSettings)
    }

    fun checkPermissions() {
        if (!mainActivity.hasPermissions(requiredPermissionMap.keys)) {
            requestPermissions(requiredPermissions, permissionCode)
        } else {
            onStoragePermissionGranted()
        }
    }

    fun onStoragePermissionGranted() {
        findDuplicateNamesButton.run {
            setOnClickListener(onButtonOnClickListener)
            isEnabled = true
        }
        findDuplicateNumbersButton.run {
            setOnClickListener(onButtonOnClickListener)
            isEnabled = true
        }
    }
}
