package com.r4sh33d.duplicatecontactsremover.databinding;
import com.r4sh33d.duplicatecontactsremover.R;
import com.r4sh33d.duplicatecontactsremover.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentContactSourcesBindingImpl extends FragmentContactSourcesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentContactSourcesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentContactSourcesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ProgressBar) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.contactSourcesRecyclerView.setTag(null);
        this.headerMessage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.progressMessage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus>) object, fieldId);
            case 1 :
                return onChangeViewModelContactsAccountList((androidx.lifecycle.LiveData<java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContactsAccountList(androidx.lifecycle.LiveData<java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount>> ViewModelContactsAccountList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount> viewModelContactsAccountListGetValue = null;
        androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> viewModelStatus = null;
        androidx.lifecycle.LiveData<java.util.List<com.r4sh33d.duplicatecontactsremover.model.ContactsAccount>> viewModelContactsAccountList = null;
        com.r4sh33d.duplicatecontactsremover.util.LoadingStatus viewModelStatusGetValue = null;
        com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(0, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contactsAccountList
                        viewModelContactsAccountList = viewModel.getContactsAccountList();
                    }
                    updateLiveDataRegistration(1, viewModelContactsAccountList);


                    if (viewModelContactsAccountList != null) {
                        // read viewModel.contactsAccountList.getValue()
                        viewModelContactsAccountListGetValue = viewModelContactsAccountList.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindAccountsRecyclerView(this.contactSourcesRecyclerView, viewModelContactsAccountListGetValue);
            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindHeaderTextView(this.headerMessage, viewModelContactsAccountListGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindAccountsLoadingStatus(this.progressBar, viewModelStatusGetValue);
            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindAccountsLoadingStatus(this.progressMessage, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel.contactsAccountList
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}