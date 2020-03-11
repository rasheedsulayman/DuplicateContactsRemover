package com.r4sh33d.duplicatecontactsremover.util;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrefsUtils_Factory implements Factory<PrefsUtils> {
  private final Provider<SharedPreferences> sharedPrefProvider;

  public PrefsUtils_Factory(Provider<SharedPreferences> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public PrefsUtils get() {
    return new PrefsUtils(sharedPrefProvider.get());
  }

  public static PrefsUtils_Factory create(Provider<SharedPreferences> sharedPrefProvider) {
    return new PrefsUtils_Factory(sharedPrefProvider);
  }

  public static PrefsUtils newPrefsUtils(SharedPreferences sharedPref) {
    return new PrefsUtils(sharedPref);
  }
}
