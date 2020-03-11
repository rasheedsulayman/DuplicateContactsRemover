package com.r4sh33d.duplicatecontactsremover.shared;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsOperationSharedViewModel_Factory
    implements Factory<ContactsOperationSharedViewModel> {
  private static final ContactsOperationSharedViewModel_Factory INSTANCE =
      new ContactsOperationSharedViewModel_Factory();

  @Override
  public ContactsOperationSharedViewModel get() {
    return new ContactsOperationSharedViewModel();
  }

  public static ContactsOperationSharedViewModel_Factory create() {
    return INSTANCE;
  }

  public static ContactsOperationSharedViewModel newContactsOperationSharedViewModel() {
    return new ContactsOperationSharedViewModel();
  }
}
