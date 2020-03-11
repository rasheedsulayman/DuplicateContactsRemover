package com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact;

import androidx.lifecycle.ViewModelProvider;
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteContactsDialog_MembersInjector
    implements MembersInjector<DeleteContactsDialog> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<PrefsUtils> prefsUtilsProvider;

  public DeleteContactsDialog_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<PrefsUtils> prefsUtilsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.prefsUtilsProvider = prefsUtilsProvider;
  }

  public static MembersInjector<DeleteContactsDialog> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<PrefsUtils> prefsUtilsProvider) {
    return new DeleteContactsDialog_MembersInjector(viewModelFactoryProvider, prefsUtilsProvider);
  }

  @Override
  public void injectMembers(DeleteContactsDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectPrefsUtils(instance, prefsUtilsProvider.get());
  }

  public static void injectViewModelFactory(
      DeleteContactsDialog instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectPrefsUtils(DeleteContactsDialog instance, PrefsUtils prefsUtils) {
    instance.prefsUtils = prefsUtils;
  }
}
