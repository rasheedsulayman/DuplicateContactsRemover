package com.r4sh33d.duplicatecontactsremover.contactsources;

import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactSourcesViewModel_Factory implements Factory<ContactSourcesViewModel> {
  private final Provider<ContactsHelper> contactsHelperProvider;

  public ContactSourcesViewModel_Factory(Provider<ContactsHelper> contactsHelperProvider) {
    this.contactsHelperProvider = contactsHelperProvider;
  }

  @Override
  public ContactSourcesViewModel get() {
    return new ContactSourcesViewModel(contactsHelperProvider.get());
  }

  public static ContactSourcesViewModel_Factory create(
      Provider<ContactsHelper> contactsHelperProvider) {
    return new ContactSourcesViewModel_Factory(contactsHelperProvider);
  }

  public static ContactSourcesViewModel newContactSourcesViewModel(ContactsHelper contactsHelper) {
    return new ContactSourcesViewModel(contactsHelper);
  }
}
