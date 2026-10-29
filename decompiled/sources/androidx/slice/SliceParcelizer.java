package androidx.slice;

/* JADX INFO: loaded from: classes.dex */
public final class SliceParcelizer {
    public static Slice read(androidx.versionedparcelable.a aVar) {
        Slice slice = new Slice();
        slice.f13681a = (SliceSpec) aVar.C(slice.f13681a, 1);
        slice.f13682b = (SliceItem[]) aVar.i(slice.f13682b, 2);
        slice.f13683c = (String[]) aVar.i(slice.f13683c, 3);
        slice.f13684d = aVar.z(slice.f13684d, 4);
        return slice;
    }

    public static void write(Slice slice, androidx.versionedparcelable.a aVar) {
        aVar.E(true, false);
        aVar.Z(slice.f13681a, 1);
        aVar.G(slice.f13682b, 2);
        aVar.G(slice.f13683c, 3);
        aVar.V(slice.f13684d, 4);
    }
}
