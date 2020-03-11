package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import androidx.lifecycle.ViewModelProvider;
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DuplicateContactFixFragment_MembersInjector
    implements MembersInjector<DuplicateContactFixFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<PrefsUtils> prefsUtilsProvider;

  public DuplicateContactFixFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<PrefsUtils> prefsUtilsProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.prefsUtilsProvider = prefsUtilsProvider;
  }

  public static MembersInjector<DuplicateContactFixFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<PrefsUtils> prefsUtilsProvider) {
    return new DuplicateContactFixFragment_MembersInjector(
        viewModelFactoryProvider, prefsUtilsProvider);
  }

  @Override
  public void injectMembers(DuplicateContactFixFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectPrefsUtils(instance, prefsUtilsProvider.get());
  }

  public static void injectViewModelFactory(
      DuplicateContactFixFragment instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  public static void injectPrefsUtils(DuplicateContactFixFragment instance, PrefsUtils prefsUtils) {
    instance.prefsUtils = prefsUtils;
  }
}
