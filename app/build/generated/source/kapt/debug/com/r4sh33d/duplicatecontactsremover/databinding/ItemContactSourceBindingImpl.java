package com.r4sh33d.duplicatecontactsremover.databinding;
import com.r4sh33d.duplicatecontactsremover.R;
import com.r4sh33d.duplicatecontactsremover.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemContactSourceBindingImpl extends ItemContactSourceBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 3);
        sViewsWithIds.put(R.id.arrowImageView, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemContactSourceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemContactSourceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.accountInfo.setTag(null);
        this.accountName.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.account == variableId) {
            setAccount((com.r4sh33d.duplicatecontactsremover.model.ContactsAccount) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAccount(@Nullable com.r4sh33d.duplicatecontactsremover.model.ContactsAccount Account) {
        this.mAccount = Account;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.account);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int accountContactsSize = 0;
        java.lang.String stringValueOfAccountContactsSize = null;
        java.lang.String accountDisplayName = null;
        com.r4sh33d.duplicatecontactsremover.model.ContactsAccount account = mAccount;
        java.util.ArrayList<com.r4sh33d.duplicatecontactsremover.model.Contact> accountContacts = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (account != null) {
                    // read account.displayName
                    accountDisplayName = account.getDisplayName();
                    // read account.contacts
                    accountContacts = account.getContacts();
                }


                if (accountContacts != null) {
                    // read account.contacts.size
                    accountContactsSize = accountContacts.size();
                }


                // read String.valueOf(account.contacts.size)
                stringValueOfAccountContactsSize = java.lang.String.valueOf(accountContactsSize);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accountInfo, stringValueOfAccountContactsSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accountName, accountDisplayName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): account
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}