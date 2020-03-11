package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DuplicateContactViewModel_Factory implements Factory<DuplicateContactViewModel> {
  private final Provider<ContactsHelper> contactsHelperProvider;

  public DuplicateContactViewModel_Factory(Provider<ContactsHelper> contactsHelperProvider) {
    this.contactsHelperProvider = contactsHelperProvider;
  }

  @Override
  public DuplicateContactViewModel get() {
    return new DuplicateContactViewModel(contactsHelperProvider.get());
  }

  public static DuplicateContactViewModel_Factory create(
      Provider<ContactsHelper> contactsHelperProvider) {
    return new DuplicateContactViewModel_Factory(contactsHelperProvider);
  }

  public static DuplicateContactViewModel newDuplicateContactViewModel(
      ContactsHelper contactsHelper) {
    return new DuplicateContactViewModel(contactsHelper);
  }
}
