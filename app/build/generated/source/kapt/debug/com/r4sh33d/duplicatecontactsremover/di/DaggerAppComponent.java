package com.r4sh33d.duplicatecontactsremover.di;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.ViewModel;
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesFragment;
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesFragment_MembersInjector;
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel;
import com.r4sh33d.duplicatecontactsremover.contactsources.ContactSourcesViewModel_Factory;
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog;
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactBackupDialog_MembersInjector;
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupViewModel;
import com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup.ContactsBackupViewModel_Factory;
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog;
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsDialog_MembersInjector;
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsViewModel;
import com.r4sh33d.duplicatecontactsremover.dialogs.deletecontact.DeleteContactsViewModel_Factory;
import com.r4sh33d.duplicatecontactsremover.dialogs.rateus.RateUsDialog;
import com.r4sh33d.duplicatecontactsremover.dialogs.rateus.RateUsDialog_MembersInjector;
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactFixFragment;
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactFixFragment_MembersInjector;
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel;
import com.r4sh33d.duplicatecontactsremover.duplicatecontact.DuplicateContactViewModel_Factory;
import com.r4sh33d.duplicatecontactsremover.shared.ContactsOperationSharedViewModel;
import com.r4sh33d.duplicatecontactsremover.shared.ContactsOperationSharedViewModel_Factory;
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper;
import com.r4sh33d.duplicatecontactsremover.util.ContactsHelper_Factory;
import com.r4sh33d.duplicatecontactsremover.util.PrefsUtils;
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter;
import com.r4sh33d.duplicatecontactsremover.util.VcfExporter_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Context> contextProvider;

  private Provider<ContactsHelper> contactsHelperProvider;

  private Provider<ContactSourcesViewModel> contactSourcesViewModelProvider;

  private Provider<DuplicateContactViewModel> duplicateContactViewModelProvider;

  private Provider<VcfExporter> vcfExporterProvider;

  private Provider<ContactsBackupViewModel> contactsBackupViewModelProvider;

  private Provider<DeleteContactsViewModel> deleteContactsViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<DuplicateContactsViewModelFactory> duplicateContactsViewModelFactoryProvider;

  private Provider<SharedPreferences> provideGlobalSharedPreferenceProvider;

  private Provider<PrefsUtils> providePrefsUtilsProvider;

  private DaggerAppComponent(LocalDataModule localDataModuleParam, Context contextParam) {

    initialize(localDataModuleParam, contextParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final LocalDataModule localDataModuleParam, final Context contextParam) {
    this.contextProvider = InstanceFactory.create(contextParam);
    this.contactsHelperProvider =
        DoubleCheck.provider(ContactsHelper_Factory.create(contextProvider));
    this.contactSourcesViewModelProvider =
        ContactSourcesViewModel_Factory.create(contactsHelperProvider);
    this.duplicateContactViewModelProvider =
        DuplicateContactViewModel_Factory.create(contactsHelperProvider);
    this.vcfExporterProvider = DoubleCheck.provider(VcfExporter_Factory.create(contextProvider));
    this.contactsBackupViewModelProvider =
        ContactsBackupViewModel_Factory.create(vcfExporterProvider);
    this.deleteContactsViewModelProvider =
        DeleteContactsViewModel_Factory.create(contactsHelperProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(5)
            .put(ContactSourcesViewModel.class, (Provider) contactSourcesViewModelProvider)
            .put(DuplicateContactViewModel.class, (Provider) duplicateContactViewModelProvider)
            .put(ContactsBackupViewModel.class, (Provider) contactsBackupViewModelProvider)
            .put(DeleteContactsViewModel.class, (Provider) deleteContactsViewModelProvider)
            .put(
                ContactsOperationSharedViewModel.class,
                (Provider) ContactsOperationSharedViewModel_Factory.create())
            .build();
    this.duplicateContactsViewModelFactoryProvider =
        DoubleCheck.provider(
            DuplicateContactsViewModelFactory_Factory.create(
                mapOfClassOfAndProviderOfViewModelProvider));
    this.provideGlobalSharedPreferenceProvider =
        DoubleCheck.provider(
            LocalDataModule_ProvideGlobalSharedPreferenceFactory.create(
                localDataModuleParam, contextProvider));
    this.providePrefsUtilsProvider =
        DoubleCheck.provider(
            LocalDataModule_ProvidePrefsUtilsFactory.create(
                localDataModuleParam, provideGlobalSharedPreferenceProvider));
  }

  @Override
  public void inject(ContactSourcesFragment target) {
    injectContactSourcesFragment(target);
  }

  @Override
  public void inject(DuplicateContactFixFragment target) {
    injectDuplicateContactFixFragment(target);
  }

  @Override
  public void inject(ContactBackupDialog target) {
    injectContactBackupDialog(target);
  }

  @Override
  public void inject(DeleteContactsDialog target) {
    injectDeleteContactsDialog(target);
  }

  @Override
  public void inject(RateUsDialog target) {
    injectRateUsDialog(target);
  }

  private ContactSourcesFragment injectContactSourcesFragment(ContactSourcesFragment instance) {
    ContactSourcesFragment_MembersInjector.injectViewModelFactory(
        instance, duplicateContactsViewModelFactoryProvider.get());
    return instance;
  }

  private DuplicateContactFixFragment injectDuplicateContactFixFragment(
      DuplicateContactFixFragment instance) {
    DuplicateContactFixFragment_MembersInjector.injectViewModelFactory(
        instance, duplicateContactsViewModelFactoryProvider.get());
    DuplicateContactFixFragment_MembersInjector.injectPrefsUtils(
        instance, providePrefsUtilsProvider.get());
    return instance;
  }

  private ContactBackupDialog injectContactBackupDialog(ContactBackupDialog instance) {
    ContactBackupDialog_MembersInjector.injectViewModelFactory(
        instance, duplicateContactsViewModelFactoryProvider.get());
    return instance;
  }

  private DeleteContactsDialog injectDeleteContactsDialog(DeleteContactsDialog instance) {
    DeleteContactsDialog_MembersInjector.injectViewModelFactory(
        instance, duplicateContactsViewModelFactoryProvider.get());
    DeleteContactsDialog_MembersInjector.injectPrefsUtils(
        instance, providePrefsUtilsProvider.get());
    return instance;
  }

  private RateUsDialog injectRateUsDialog(RateUsDialog instance) {
    RateUsDialog_MembersInjector.injectPrefsUtils(instance, providePrefsUtilsProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private LocalDataModule localDataModule;

    private Context context;

    @Override
    public Builder context(Context app) {
      this.context = Preconditions.checkNotNull(app);
      return this;
    }

    @Override
    public AppComponent build() {
      if (localDataModule == null) {
        this.localDataModule = new LocalDataModule();
      }
      Preconditions.checkBuilderRequirement(context, Context.class);
      return new DaggerAppComponent(localDataModule, context);
    }
  }
}
