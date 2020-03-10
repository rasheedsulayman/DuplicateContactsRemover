package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.r4sh33d.duplicatecontactsremover.DataBinderMapperImpl());
  }
}
