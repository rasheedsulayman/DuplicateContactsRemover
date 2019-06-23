package com.r4sh33d.duplicatecontactsremover.dialogs

import android.app.Dialog
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.google.android.material.button.MaterialButton
import com.r4sh33d.duplicatecontactsremover.R

abstract class BaseProgressDialog : DialogFragment() {
    protected lateinit var statusTextView: TextView
    protected lateinit var finishButton: MaterialButton
    protected lateinit var progressBar: ProgressBar

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        isCancelable = false
        val dialog = MaterialDialog(context!!)
            .customView(R.layout.progress_dialog_layout, noVerticalPadding = true, dialogWrapContent = true)
            .title(text =  getTitle())
            .noAutoDismiss()
        val view = dialog.getCustomView()
        statusTextView = view.findViewById(R.id.status_textview)
        progressBar = view.findViewById(R.id.status_progress_bar)
        finishButton = view.findViewById(R.id.finish_button)
        setUpDialogDetails()
        return dialog
    }

    abstract fun getTitle(): String
    abstract fun setUpDialogDetails()
}