package com.r4sh33d.duplicatecontactsremover.landingpage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LandingPageFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private LandingPageFragmentArgs() {
  }

  private LandingPageFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static LandingPageFragmentArgs fromBundle(@NonNull Bundle bundle) {
    LandingPageFragmentArgs __result = new LandingPageFragmentArgs();
    bundle.setClassLoader(LandingPageFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("showRateUsDialog")) {
      boolean showRateUsDialog;
      showRateUsDialog = bundle.getBoolean("showRateUsDialog");
      __result.arguments.put("showRateUsDialog", showRateUsDialog);
    } else {
      throw new IllegalArgumentException("Required argument \"showRateUsDialog\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getShowRateUsDialog() {
    return (boolean) arguments.get("showRateUsDialog");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("showRateUsDialog")) {
      boolean showRateUsDialog = (boolean) arguments.get("showRateUsDialog");
      __result.putBoolean("showRateUsDialog", showRateUsDialog);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    LandingPageFragmentArgs that = (LandingPageFragmentArgs) object;
    if (arguments.containsKey("showRateUsDialog") != that.arguments.containsKey("showRateUsDialog")) {
      return false;
    }
    if (getShowRateUsDialog() != that.getShowRateUsDialog()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getShowRateUsDialog() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "LandingPageFragmentArgs{"
        + "showRateUsDialog=" + getShowRateUsDialog()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(LandingPageFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(boolean showRateUsDialog) {
      this.arguments.put("showRateUsDialog", showRateUsDialog);
    }

    @NonNull
    public LandingPageFragmentArgs build() {
      LandingPageFragmentArgs result = new LandingPageFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setShowRateUsDialog(boolean showRateUsDialog) {
      this.arguments.put("showRateUsDialog", showRateUsDialog);
      return this;
    }

    @SuppressWarnings("unchecked")
    public boolean getShowRateUsDialog() {
      return (boolean) arguments.get("showRateUsDialog");
    }
  }
}
