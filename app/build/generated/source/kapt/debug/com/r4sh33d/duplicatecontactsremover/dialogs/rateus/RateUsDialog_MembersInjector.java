package com.r4sh33d.duplicatecontactsremover.dialogs.rateus;

import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RateUsDialog_MembersInjector implements MembersInjector<RateUsDialog> {
  private final Provider<PrefsUtils> prefsUtilsProvider;

  public RateUsDialog_MembersInjector(Provider<PrefsUtils> prefsUtilsProvider) {
    this.prefsUtilsProvider = prefsUtilsProvider;
  }

  public static MembersInjector<RateUsDialog> create(Provider<PrefsUtils> prefsUtilsProvider) {
    return new RateUsDialog_MembersInjector(prefsUtilsProvider);
  }

  @Override
  public void injectMembers(RateUsDialog instance) {
    injectPrefsUtils(instance, prefsUtilsProvider.get());
  }

  public static void injectPrefsUtils(RateUsDialog instance, PrefsUtils prefsUtils) {
    instance.prefsUtils = prefsUtils;
  }
}
