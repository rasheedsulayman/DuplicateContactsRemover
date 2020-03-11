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
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel;

public abstract class FragmentContactSourcesBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView contactSourcesRecyclerView;

  @NonNull
  public final TextView headerMessage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView progressMessage;

  @Bindable
  protected ContactSourcesViewModel mViewModel;

  protected FragmentContactSourcesBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView contactSourcesRecyclerView, TextView headerMessage,
      ProgressBar progressBar, TextView progressMessage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contactSourcesRecyclerView = contactSourcesRecyclerView;
    this.headerMessage = headerMessage;
    this.progressBar = progressBar;
    this.progressMessage = progressMessage;
  }

  public abstract void setViewModel(@Nullable ContactSourcesViewModel viewModel);

  @Nullable
  public ContactSourcesViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentContactSourcesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentContactSourcesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentContactSourcesBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.fragment_contact_sources, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentContactSourcesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentContactSourcesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentContactSourcesBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.fragment_contact_sources, null, false, component);
  }

  public static FragmentContactSourcesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentContactSourcesBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentContactSourcesBinding)bind(component, view, com.r4sh33d.duplicatecontactsremover.R.layout.fragment_contact_sources);
  }
}
