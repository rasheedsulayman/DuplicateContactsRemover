package com.r4sh33d.duplicatecontactsremover.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DuplicateContactsViewModelFactory_Factory
    implements Factory<DuplicateContactsViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

  public DuplicateContactsViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public DuplicateContactsViewModelFactory get() {
    return new DuplicateContactsViewModelFactory(creatorsProvider.get());
  }

  public static DuplicateContactsViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new DuplicateContactsViewModelFactory_Factory(creatorsProvider);
  }

  public static DuplicateContactsViewModelFactory newDuplicateContactsViewModelFactory(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
    return new DuplicateContactsViewModelFactory(creators);
  }
}
