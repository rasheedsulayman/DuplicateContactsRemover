import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesAdapter
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactAccountsLoadingStatus
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount

// -- ContactsAccounts Fragment

@BindingAdapter("accountsLoadingStatus")
fun bindStatus(statusTextView: TextView, status: ContactAccountsLoadingStatus?) {
    when (status) {
        ContactAccountsLoadingStatus.LOADING -> {
            statusTextView.text = "Loading your accounts, Please wait"
        }
        ContactAccountsLoadingStatus.ERROR -> {
            statusTextView.text = "Empty Accounts"
        }
        ContactAccountsLoadingStatus.DONE -> {
            statusTextView.visibility = View.GONE
        }
    }
}

@BindingAdapter("accountsLoadingStatus")
fun bindStatus(statusProgressBar: ProgressBar, status: ContactAccountsLoadingStatus?) {
    when (status) {
        ContactAccountsLoadingStatus.LOADING -> statusProgressBar.visibility = View.VISIBLE
        else -> statusProgressBar.visibility = View.GONE
    }
}

@BindingAdapter("contactAccountsList")
fun bindHeaderTextView(headerTextView: TextView, data: List<ContactsAccount>?) {
    headerTextView.visibility = if (data?.size == null || data.isEmpty()) View.GONE else View.VISIBLE
}

@BindingAdapter("contactAccountsList")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<ContactsAccount>?) {
    data?.let {
        val adapter = recyclerView.adapter as ContactSourcesAdapter
        adapter.updateData(data)
    }
}

// -- End Contacts Accounts Fragment
