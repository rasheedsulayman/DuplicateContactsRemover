package com.r4sh33d.duplicatecontactsremover.di;

import android.content.SharedPreferences;
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LocalDataModule_ProvidePrefsUtilsFactory implements Factory<PrefsUtils> {
  private final LocalDataModule module;

  private final Provider<SharedPreferences> prefsProvider;

  public LocalDataModule_ProvidePrefsUtilsFactory(
      LocalDataModule module, Provider<SharedPreferences> prefsProvider) {
    this.module = module;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public PrefsUtils get() {
    return proxyProvidePrefsUtils(module, prefsProvider.get());
  }

  public static LocalDataModule_ProvidePrefsUtilsFactory create(
      LocalDataModule module, Provider<SharedPreferences> prefsProvider) {
    return new LocalDataModule_ProvidePrefsUtilsFactory(module, prefsProvider);
  }

  public static PrefsUtils proxyProvidePrefsUtils(
      LocalDataModule instance, SharedPreferences prefs) {
    return Preconditions.checkNotNull(
        instance.providePrefsUtils(prefs),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
