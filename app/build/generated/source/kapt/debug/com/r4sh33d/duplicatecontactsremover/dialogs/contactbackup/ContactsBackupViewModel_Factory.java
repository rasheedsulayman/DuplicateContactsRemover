package com.r4sh33d.duplicatecontactsremover.dialogs.contactbackup;

import com.r4sh33d.duplicatecontactsremover.util.VcfExporter;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ContactsBackupViewModel_Factory implements Factory<ContactsBackupViewModel> {
  private final Provider<VcfExporter> vcfExporterProvider;

  public ContactsBackupViewModel_Factory(Provider<VcfExporter> vcfExporterProvider) {
    this.vcfExporterProvider = vcfExporterProvider;
  }

  @Override
  public ContactsBackupViewModel get() {
    return new ContactsBackupViewModel(vcfExporterProvider.get());
  }

  public static ContactsBackupViewModel_Factory create(Provider<VcfExporter> vcfExporterProvider) {
    return new ContactsBackupViewModel_Factory(vcfExporterProvider);
  }

  public static ContactsBackupViewModel newContactsBackupViewModel(VcfExporter vcfExporter) {
    return new ContactsBackupViewModel(vcfExporter);
  }
}
