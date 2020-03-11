package com.r4sh33d.duplicatecontactsremover.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.r4sh33d.duplicatecontactsremover.model.ContactsAccount;

public abstract class ItemContactSourceBinding extends ViewDataBinding {
  @NonNull
  public final TextView accountInfo;

  @NonNull
  public final TextView accountName;

  @NonNull
  public final ImageView arrowImageView;

  @NonNull
  public final TextView textView4;

  @Bindable
  protected ContactsAccount mAccount;

  protected ItemContactSourceBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView accountInfo, TextView accountName, ImageView arrowImageView,
      TextView textView4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountInfo = accountInfo;
    this.accountName = accountName;
    this.arrowImageView = arrowImageView;
    this.textView4 = textView4;
  }

  public abstract void setAccount(@Nullable ContactsAccount account);

  @Nullable
  public ContactsAccount getAccount() {
    return mAccount;
  }

  @NonNull
  public static ItemContactSourceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContactSourceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContactSourceBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_source, root, attachToRoot, component);
  }

  @NonNull
  public static ItemContactSourceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemContactSourceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemContactSourceBinding>inflate(inflater, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_source, null, false, component);
  }

  public static ItemContactSourceBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemContactSourceBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemContactSourceBinding)bind(component, view, com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_source);
  }
}
