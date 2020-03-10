package com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact;

import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteContactsViewModel_Factory implements Factory<DeleteContactsViewModel> {
  private final Provider<ContactsHelper> contactsHelperProvider;

  public DeleteContactsViewModel_Factory(Provider<ContactsHelper> contactsHelperProvider) {
    this.contactsHelperProvider = contactsHelperProvider;
  }

  @Override
  public DeleteContactsViewModel get() {
    return new DeleteContactsViewModel(contactsHelperProvider.get());
  }

  public static DeleteContactsViewModel_Factory create(
      Provider<ContactsHelper> contactsHelperProvider) {
    return new DeleteContactsViewModel_Factory(contactsHelperProvider);
  }

  public static DeleteContactsViewModel newDeleteContactsViewModel(ContactsHelper contactsHelper) {
    return new DeleteContactsViewModel(contactsHelper);
  }
}
