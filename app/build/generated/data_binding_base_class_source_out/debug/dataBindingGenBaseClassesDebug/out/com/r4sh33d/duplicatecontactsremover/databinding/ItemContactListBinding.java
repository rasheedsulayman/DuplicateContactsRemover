package com.r4sh33d.duplicatecontactsremover.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.r4sh33d.duplicatecontactsremover.model.Contact;

public abstract class ItemContactListBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final TextView contactInitials;

  @NonNull
  public final TextView fullName;

  @NonNull
  public final TextView phoneNumbers;

  @Bindable
  protected Contact mContact;

  protected ItemContactListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CheckBox checkBox, TextView contactInitials, TextView fullName,
      TextView phoneNumbers) {
    super(_bindingComponent, _root, _localFieldCount);
    this.checkBox = checkBox;
    this.contactInitials = contactInitials;
    this.fullName = fullName;
    this.phoneNumbers = phoneNumbers;
  }

  public abstract void setContact(@Nullable Contact contact);

  @Nullable
  public Contact getContact() {
    return mContact;
  }

  @NonNull
  public static ItemContactListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContactListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContactListBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_list, root, attachToRoot, component);
  }

  @NonNull
  public static ItemContactListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContactListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContactListBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_list, null, false, component);
  }

  public static ItemContactListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemContactListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemContactListBinding)bind(component, view, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_list);
  }
}
