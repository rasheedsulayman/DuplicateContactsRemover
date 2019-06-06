package com.r4sh33d.duplicatecontactsremover

import android.content.Context
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
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.afollestad.materialdialogs.MaterialDialog
import com.google.android.material.snackbar.Snackbar
import com.r4sh33d.duplicatecontactsremover.util.*
import kotlinx.android.synthetic.main.fragment_landing_page.*

class LandingPageFragment : Fragment() {
    private lateinit var attachedActivity: AppCompatActivity

    private val requestAppSettings = 600
    private val permissionCode = 500

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        attachedActivity = context!! as AppCompatActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_landing_page, container, false)


    private val onButtonOnClickListener = View.OnClickListener {
        it.findNavController().navigate(
            LandingPageFragmentDirections
                .actionLandingPageFragmentToContactSourcesFragment(if (it.id == R.id.findDuplicateNumbersButton) DuplicateCriteria.PHONE_NUMBER else DuplicateCriteria.NAME)
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
                    if (attachedActivity.hasPermision(permission)) continue
                    if (shouldShowPermissionExplanation(permission)) {
                        Snackbar.make(
                            attachedActivity.window.decorView.rootView,
                            requiredPermissionMap[permission]!!, Snackbar.LENGTH_INDEFINITE
                        ).apply {
                            setAction(R.string.grant) { checkPermissions() }
                            view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text).maxLines = 5
                            show()
                        }
                    } else {
                        MaterialDialog(attachedActivity).show {
                            title(R.string.enable_permission)
                            message(R.string.manual_permission_grant_instruction)
                            positiveButton(R.string.settings) {
                                openAppSettings()
                                attachedActivity.finish()
                            }
                            negativeButton(R.string.cancel) {
                                Toast.makeText(attachedActivity, R.string.permission_denied, Toast.LENGTH_SHORT).show()
                                attachedActivity.finish()
                            }
                        }
                    }
                    break
                }
            }
        }
    }

    fun shouldShowPermissionExplanation(permissionString: String): Boolean =
        ActivityCompat.shouldShowRequestPermissionRationale(attachedActivity, permissionString)

    fun openAppSettings() {
        val appSettingsIntent = Intent(
            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
            Uri.parse("package:${attachedActivity.packageName}")
        ).apply {
            addCategory(Intent.CATEGORY_DEFAULT)
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        startActivityForResult(appSettingsIntent, requestAppSettings)
    }

    fun checkPermissions() {
        if (!attachedActivity.hasPermissions(requiredPermissionMap.keys)) {
            requestPermissions(requiredPermissions, permissionCode)
        } else {
            onStoragePermissionGranted()
        }
    }

    fun onStoragePermissionGranted() {
        findDuplicateNamesButton.apply {
            setOnClickListener(onButtonOnClickListener)
            isEnabled = true
        }
        findDuplicateNumbersButton.apply {
            setOnClickListener(onButtonOnClickListener)
            isEnabled = true
        }
    }
}
