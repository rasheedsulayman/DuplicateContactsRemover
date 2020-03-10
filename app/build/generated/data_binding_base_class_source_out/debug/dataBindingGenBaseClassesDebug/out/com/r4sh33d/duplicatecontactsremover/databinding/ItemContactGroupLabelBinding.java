package com.r4sh33d.duplicatecontactsremover.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class ItemContactGroupLabelBinding extends ViewDataBinding {
  @NonNull
  public final TextView labelTextView;

  @Bindable
  protected String mGroupLabel;

  protected ItemContactGroupLabelBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView labelTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.labelTextView = labelTextView;
  }

  public abstract void setGroupLabel(@Nullable String groupLabel);

  @Nullable
  public String getGroupLabel() {
    return mGroupLabel;
  }

  @NonNull
  public static ItemContactGroupLabelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContactGroupLabelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContactGroupLabelBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_group_label, root, attachToRoot, component);
  }

  @NonNull
  public static ItemContactGroupLabelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContactGroupLabelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContactGroupLabelBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_group_label, null, false, component);
  }

  public static ItemContactGroupLabelBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemContactGroupLabelBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemContactGroupLabelBinding)bind(component, view, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_group_label);
  }
}
