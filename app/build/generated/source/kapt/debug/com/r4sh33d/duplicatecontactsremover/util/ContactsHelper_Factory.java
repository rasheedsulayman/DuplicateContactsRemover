package com.r4sh33d.duplicatecontactsremover.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsHelper_Factory implements Factory<ContactsHelper> {
  private final Provider<Context> contextProvider;

  public ContactsHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ContactsHelper get() {
    return new ContactsHelper(contextProvider.get());
  }

  public static ContactsHelper_Factory create(Provider<Context> contextProvider) {
    return new ContactsHelper_Factory(contextProvider);
  }

  public static ContactsHelper newContactsHelper(Context context) {
    return new ContactsHelper(context);
  }
}
