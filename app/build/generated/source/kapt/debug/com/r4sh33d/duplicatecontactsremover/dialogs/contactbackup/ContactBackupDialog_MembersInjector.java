package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactBackupDialog_MembersInjector
    implements MembersInjector<ContactBackupDialog> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ContactBackupDialog_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ContactBackupDialog> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ContactBackupDialog_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ContactBackupDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ContactBackupDialog instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
