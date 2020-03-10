package com.r4sh33d.duplicatecontactsremover;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentContactSourcesBindingImpl;
import com.r4sh33d.duplicatecontactsremover.databinding.FragmentDuplicateContactFixBindingImpl;
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactGroupLabelBindingImpl;
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactListBindingImpl;
import com.r4sh33d.duplicatecontactsremover.databinding.ItemContactSourceBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCONTACTSOURCES = 1;

  private static final int LAYOUT_FRAGMENTDUPLICATECONTACTFIX = 2;

  private static final int LAYOUT_ITEMCONTACTGROUPLABEL = 3;

  private static final int LAYOUT_ITEMCONTACTLIST = 4;

  private static final int LAYOUT_ITEMCONTACTSOURCE = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.r4sh33d.duplicatecontactsremover.R.layout.fragment_contact_sources, LAYOUT_FRAGMENTCONTACTSOURCES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.r4sh33d.duplicatecontactsremover.R.layout.fragment_duplicate_contact_fix, LAYOUT_FRAGMENTDUPLICATECONTACTFIX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_group_label, LAYOUT_ITEMCONTACTGROUPLABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_list, LAYOUT_ITEMCONTACTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_source, LAYOUT_ITEMCONTACTSOURCE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCONTACTSOURCES: {
          if ("layout/fragment_contact_sources_0".equals(tag)) {
            return new FragmentContactSourcesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contact_sources is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDUPLICATECONTACTFIX: {
          if ("layout/fragment_duplicate_contact_fix_0".equals(tag)) {
            return new FragmentDuplicateContactFixBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_duplicate_contact_fix is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCONTACTGROUPLABEL: {
          if ("layout/item_contact_group_label_0".equals(tag)) {
            return new ItemContactGroupLabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_contact_group_label is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCONTACTLIST: {
          if ("layout/item_contact_list_0".equals(tag)) {
            return new ItemContactListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_contact_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCONTACTSOURCE: {
          if ("layout/item_contact_source_0".equals(tag)) {
            return new ItemContactSourceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_contact_source is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "contact");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "groupLabel");
      sKeys.put(4, "account");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/fragment_contact_sources_0", com.r4sh33d.duplicatecontactsremover.R.layout.fragment_contact_sources);
      sKeys.put("layout/fragment_duplicate_contact_fix_0", com.r4sh33d.duplicatecontactsremover.R.layout.fragment_duplicate_contact_fix);
      sKeys.put("layout/item_contact_group_label_0", com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_group_label);
      sKeys.put("layout/item_contact_list_0", com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_list);
      sKeys.put("layout/item_contact_source_0", com.r4sh33d.duplicatecontactsremover.R.layout.item_contact_source);
    }
  }
}
