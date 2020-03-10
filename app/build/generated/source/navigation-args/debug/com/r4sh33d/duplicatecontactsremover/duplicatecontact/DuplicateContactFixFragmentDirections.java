package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.r4sh33d.duplicatecontactsremover.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DuplicateContactFixFragmentDirections {
  private DuplicateContactFixFragmentDirections() {
  }

  @NonNull
  public static ActionDuplicateContactFixFragmentToLandingPageFragment actionDuplicateContactFixFragmentToLandingPageFragment(boolean showRateUsDialog) {
    return new ActionDuplicateContactFixFragmentToLandingPageFragment(showRateUsDialog);
  }

  public static class ActionDuplicateContactFixFragmentToLandingPageFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDuplicateContactFixFragmentToLandingPageFragment(boolean showRateUsDialog) {
      this.arguments.put("showRateUsDialog", showRateUsDialog);
    }

    @NonNull
    public ActionDuplicateContactFixFragmentToLandingPageFragment setShowRateUsDialog(boolean showRateUsDialog) {
      this.arguments.put("showRateUsDialog", showRateUsDialog);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("showRateUsDialog")) {
        boolean showRateUsDialog = (boolean) arguments.get("showRateUsDialog");
        __result.putBoolean("showRateUsDialog", showRateUsDialog);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_duplicateContactFixFragment_to_landingPageFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getShowRateUsDialog() {
      return (boolean) arguments.get("showRateUsDialog");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDuplicateContactFixFragmentToLandingPageFragment that = (ActionDuplicateContactFixFragmentToLandingPageFragment) object;
      if (arguments.containsKey("showRateUsDialog") != that.arguments.containsKey("showRateUsDialog")) {
        return false;
      }
      if (getShowRateUsDialog() != that.getShowRateUsDialog()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getShowRateUsDialog() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDuplicateContactFixFragmentToLandingPageFragment(actionId=" + getActionId() + "){"
          + "showRateUsDialog=" + getShowRateUsDialog()
          + "}";
    }
  }
}
