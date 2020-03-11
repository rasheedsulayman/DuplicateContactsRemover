package com.r4sh33d.duplicatecontactsremover.util;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VcfExporter_Factory implements Factory<VcfExporter> {
  private final Provider<Context> contextProvider;

  public VcfExporter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public VcfExporter get() {
    return new VcfExporter(contextProvider.get());
  }

  public static VcfExporter_Factory create(Provider<Context> contextProvider) {
    return new VcfExporter_Factory(contextProvider);
  }

  public static VcfExporter newVcfExporter(Context context) {
    return new VcfExporter(context);
  }
}
