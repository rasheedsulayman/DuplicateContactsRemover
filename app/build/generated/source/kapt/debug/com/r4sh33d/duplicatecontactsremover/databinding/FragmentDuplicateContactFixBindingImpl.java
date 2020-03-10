package com.r4sh33d.duplicatecontactsremover.databinding;
import com.r4sh33d.duplicatecontactsremover.R;
import com.r4sh33d.duplicatecontactsremover.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDuplicateContactFixBindingImpl extends FragmentDuplicateContactFixBinding  {

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

    public FragmentDuplicateContactFixBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentDuplicateContactFixBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            );
        this.contactsListRecyclerView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.progressMessage.setTag(null);
        this.removeDuplicates.setTag(null);
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
            setViewModel((com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel ViewModel) {
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
                return onChangeViewModelDuplicateContactsSearchResults((androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<java.lang.Object>,android.util.SparseBooleanArray>>) object, fieldId);
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
    private boolean onChangeViewModelDuplicateContactsSearchResults(androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<java.lang.Object>,android.util.SparseBooleanArray>> ViewModelDuplicateContactsSearchResults, int fieldId) {
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
        androidx.lifecycle.LiveData<com.r4sh33d.duplicatecontactsremover.util.LoadingStatus> viewModelStatus = null;
        androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<java.lang.Object>,android.util.SparseBooleanArray>> viewModelDuplicateContactsSearchResults = null;
        kotlin.Pair<java.util.List<java.lang.Object>,android.util.SparseBooleanArray> viewModelDuplicateContactsSearchResultsGetValue = null;
        com.r4sh33d.duplicatecontactsremover.util.LoadingStatus viewModelStatusGetValue = null;
        com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel viewModel = mViewModel;

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
                        // read viewModel.duplicateContactsSearchResults
                        viewModelDuplicateContactsSearchResults = viewModel.getDuplicateContactsSearchResults();
                    }
                    updateLiveDataRegistration(1, viewModelDuplicateContactsSearchResults);


                    if (viewModelDuplicateContactsSearchResults != null) {
                        // read viewModel.duplicateContactsSearchResults.getValue()
                        viewModelDuplicateContactsSearchResultsGetValue = viewModelDuplicateContactsSearchResults.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindDuplicateContactsRecyclerView(this.contactsListRecyclerView, viewModelDuplicateContactsSearchResultsGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindDuplicatesLoadingStatus(this.progressBar, viewModelStatusGetValue);
            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindDuplicatesLoadingStatus(this.progressMessage, viewModelStatusGetValue);
            com.r4sh33d.duplicatecontactsremover.util.BindingAdaptersKt.bindDuplicatesLoadingStatus(this.removeDuplicates, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel.duplicateContactsSearchResults
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}