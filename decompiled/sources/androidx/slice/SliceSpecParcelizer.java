package androidx.slice;

/* JADX INFO: loaded from: classes.dex */
public final class SliceSpecParcelizer {
    public static SliceSpec read(androidx.versionedparcelable.a aVar) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.f13699a = aVar.z(sliceSpec.f13699a, 1);
        sliceSpec.f13700b = aVar.s(sliceSpec.f13700b, 2);
        return sliceSpec;
    }

    public static void write(SliceSpec sliceSpec, androidx.versionedparcelable.a aVar) {
        aVar.E(true, false);
        aVar.V(sliceSpec.f13699a, 1);
        aVar.O(sliceSpec.f13700b, 2);
    }
}
