package com.r4sh33d.duplicatecontactsremover.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LocalDataModule_ProvideGlobalSharedPreferenceFactory
    implements Factory<SharedPreferences> {
  private final LocalDataModule module;

  private final Provider<Context> appProvider;

  public LocalDataModule_ProvideGlobalSharedPreferenceFactory(
      LocalDataModule module, Provider<Context> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public SharedPreferences get() {
    return proxyProvideGlobalSharedPreference(module, appProvider.get());
  }

  public static LocalDataModule_ProvideGlobalSharedPreferenceFactory create(
      LocalDataModule module, Provider<Context> appProvider) {
    return new LocalDataModule_ProvideGlobalSharedPreferenceFactory(module, appProvider);
  }

  public static SharedPreferences proxyProvideGlobalSharedPreference(
      LocalDataModule instance, Context app) {
    return Preconditions.checkNotNull(
        instance.provideGlobalSharedPreference(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
