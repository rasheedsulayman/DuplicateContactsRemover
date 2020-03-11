package com.r4sh33d.duplicatecontactsremover.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel;

public abstract class FragmentDuplicateContactFixBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView contactsListRecyclerView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView progressMessage;

  @NonNull
  public final MaterialButton removeDuplicates;

  @Bindable
  protected DuplicateContactViewModel mViewModel;

  protected FragmentDuplicateContactFixBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView contactsListRecyclerView, ProgressBar progressBar,
      TextView progressMessage, MaterialButton removeDuplicates) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contactsListRecyclerView = contactsListRecyclerView;
    this.progressBar = progressBar;
    this.progressMessage = progressMessage;
    this.removeDuplicates = removeDuplicates;
  }

  public abstract void setViewModel(@Nullable DuplicateContactViewModel viewModel);

  @Nullable
  public DuplicateContactViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDuplicateContactFixBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDuplicateContactFixBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDuplicateContactFixBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.fragment_duplicate_contact_fix, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDuplicateContactFixBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDuplicateContactFixBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDuplicateContactFixBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.fragment_duplicate_contact_fix, null, false, component);
  }

  public static FragmentDuplicateContactFixBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDuplicateContactFixBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDuplicateContactFixBinding)bind(component, view, com.r4sh33d.duplicatecontactsremover.R.layout.fragment_duplicate_contact_fix);
  }
}
