package com.r4sh33d.duplicatecontactsremover.databinding;
import com.r4sh33d.duplicatecontactsremover.R;
import com.r4sh33d.duplicatecontactsremover.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemContactListBindingImpl extends ItemContactListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.checkBox, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemContactListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemContactListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.contactInitials.setTag(null);
        this.fullName.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.phoneNumbers.setTag(null);
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
        if (BR.contact == variableId) {
            setContact((com.r4sh33d.duplicatecontactsremover.model.Contact) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setContact(@Nullable com.r4sh33d.duplicatecontactsremover.model.Contact Contact) {
        this.mContact = Contact;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.contact);
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
        java.lang.String contactMultiLinedPhoneNumbers = null;
        com.r4sh33d.duplicatecontactsremover.model.Contact contact = mContact;
        java.lang.String contactFullName = null;
        java.lang.String ContactInitials1 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (contact != null) {
                    // read contact.multiLinedPhoneNumbers
                    contactMultiLinedPhoneNumbers = contact.getMultiLinedPhoneNumbers();
                    // read contact.fullName
                    contactFullName = contact.getFullName();
                    // read contact.initials
                    ContactInitials1 = contact.getInitials();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contactInitials, ContactInitials1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fullName, contactFullName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phoneNumbers, contactMultiLinedPhoneNumbers);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): contact
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}