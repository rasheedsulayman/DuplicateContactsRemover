package com.r4sh33d.duplicatecontactsremover.contactsources;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.r4sh33d.duplicatecontactsremover.R;
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ContactSourcesFragmentDirections {
  private ContactSourcesFragmentDirections() {
  }

  @NonNull
  public static ActionContactSourcesFragmentToDuplicateContactFixFragment actionContactSourcesFragmentToDuplicateContactFixFragment(@NonNull DuplicateCriteria duplicateCriteria) {
    return new ActionContactSourcesFragmentToDuplicateContactFixFragment(duplicateCriteria);
  }

  public static class ActionContactSourcesFragmentToDuplicateContactFixFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionContactSourcesFragmentToDuplicateContactFixFragment(@NonNull DuplicateCriteria duplicateCriteria) {
      if (duplicateCriteria == null) {
        throw new IllegalArgumentException("Argument \"duplicateCriteria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("duplicateCriteria", duplicateCriteria);
    }

    @NonNull
    public ActionContactSourcesFragmentToDuplicateContactFixFragment setDuplicateCriteria(@NonNull DuplicateCriteria duplicateCriteria) {
      if (duplicateCriteria == null) {
        throw new IllegalArgumentException("Argument \"duplicateCriteria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("duplicateCriteria", duplicateCriteria);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("duplicateCriteria")) {
        DuplicateCriteria duplicateCriteria = (DuplicateCriteria) arguments.get("duplicateCriteria");
        if (Parcelable.class.isAssignableFrom(DuplicateCriteria.class) || duplicateCriteria == null) {
          __result.putParcelable("duplicateCriteria", Parcelable.class.cast(duplicateCriteria));
        } else if (Serializable.class.isAssignableFrom(DuplicateCriteria.class)) {
          __result.putSerializable("duplicateCriteria", Serializable.class.cast(duplicateCriteria));
        } else {
          throw new UnsupportedOperationException(DuplicateCriteria.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_contactSourcesFragment_to_duplicateContactFixFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public DuplicateCriteria getDuplicateCriteria() {
      return (DuplicateCriteria) arguments.get("duplicateCriteria");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionContactSourcesFragmentToDuplicateContactFixFragment that = (ActionContactSourcesFragmentToDuplicateContactFixFragment) object;
      if (arguments.containsKey("duplicateCriteria") != that.arguments.containsKey("duplicateCriteria")) {
        return false;
      }
      if (getDuplicateCriteria() != null ? !getDuplicateCriteria().equals(that.getDuplicateCriteria()) : that.getDuplicateCriteria() != null) {
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
      result = 31 * result + (getDuplicateCriteria() != null ? getDuplicateCriteria().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionContactSourcesFragmentToDuplicateContactFixFragment(actionId=" + getActionId() + "){"
          + "duplicateCriteria=" + getDuplicateCriteria()
          + "}";
    }
  }
}
