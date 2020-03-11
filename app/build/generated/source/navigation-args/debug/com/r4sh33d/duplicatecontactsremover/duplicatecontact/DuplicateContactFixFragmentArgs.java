package com.r4sh33d.duplicatecontactsremover.duplicatecontact;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.r4sh33d.duplicatecontactsremover.util.DuplicateCriteria;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DuplicateContactFixFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DuplicateContactFixFragmentArgs() {
  }

  private DuplicateContactFixFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DuplicateContactFixFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DuplicateContactFixFragmentArgs __result = new DuplicateContactFixFragmentArgs();
    bundle.setClassLoader(DuplicateContactFixFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("duplicateCriteria")) {
      DuplicateCriteria duplicateCriteria;
      if (Parcelable.class.isAssignableFrom(DuplicateCriteria.class) || Serializable.class.isAssignableFrom(DuplicateCriteria.class)) {
        duplicateCriteria = (DuplicateCriteria) bundle.get("duplicateCriteria");
      } else {
        throw new UnsupportedOperationException(DuplicateCriteria.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (duplicateCriteria == null) {
        throw new IllegalArgumentException("Argument \"duplicateCriteria\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("duplicateCriteria", duplicateCriteria);
    } else {
      throw new IllegalArgumentException("Required argument \"duplicateCriteria\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public DuplicateCriteria getDuplicateCriteria() {
    return (DuplicateCriteria) arguments.get("duplicateCriteria");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DuplicateContactFixFragmentArgs that = (DuplicateContactFixFragmentArgs) object;
    if (arguments.containsKey("duplicateCriteria") != that.arguments.containsKey("duplicateCriteria")) {
      return false;
    }
    if (getDuplicateCriteria() != null ? !getDuplicateCriteria().equals(that.getDuplicateCriteria()) : that.getDuplicateCriteria() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getDuplicateCriteria() != null ? getDuplicateCriteria().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DuplicateContactFixFragmentArgs{"
        + "duplicateCriteria=" + getDuplicateCriteria()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DuplicateContactFixFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull DuplicateCriteria duplicateCriteria) {
      if (duplicateCriteria == null) {
        throw new IllegalArgumentException("Argument \"duplicateCriteria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("duplicateCriteria", duplicateCriteria);
    }

    @NonNull
    public DuplicateContactFixFragmentArgs build() {
      DuplicateContactFixFragmentArgs result = new DuplicateContactFixFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setDuplicateCriteria(@NonNull DuplicateCriteria duplicateCriteria) {
      if (duplicateCriteria == null) {
        throw new IllegalArgumentException("Argument \"duplicateCriteria\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("duplicateCriteria", duplicateCriteria);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public DuplicateCriteria getDuplicateCriteria() {
      return (DuplicateCriteria) arguments.get("duplicateCriteria");
    }
  }
}
