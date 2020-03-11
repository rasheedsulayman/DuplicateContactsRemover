package com.r4sh33d.duplicatecontactsremover.contactsources;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactSourcesFragment_MembersInjector
    implements MembersInjector<ContactSourcesFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ContactSourcesFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ContactSourcesFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ContactSourcesFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(ContactSourcesFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  public static void injectViewModelFactory(
      ContactSourcesFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
