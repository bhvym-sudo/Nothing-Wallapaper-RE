package androidx.slice;

/* JADX INFO: loaded from: classes.dex */
public final class SliceItemHolderParcelizer {
    public static SliceItemHolder read(androidx.versionedparcelable.a aVar) {
        SliceItemHolder sliceItemHolder = new SliceItemHolder();
        sliceItemHolder.f13694a = aVar.C(sliceItemHolder.f13694a, 1);
        sliceItemHolder.f13695b = aVar.w(sliceItemHolder.f13695b, 2);
        sliceItemHolder.f13696c = aVar.z(sliceItemHolder.f13696c, 3);
        sliceItemHolder.f13697d = aVar.s(sliceItemHolder.f13697d, 4);
        sliceItemHolder.f13698e = aVar.u(sliceItemHolder.f13698e, 5);
        return sliceItemHolder;
    }

    public static void write(SliceItemHolder sliceItemHolder, androidx.versionedparcelable.a aVar) {
        aVar.E(true, true);
        aVar.Z(sliceItemHolder.f13694a, 1);
        aVar.S(sliceItemHolder.f13695b, 2);
        aVar.V(sliceItemHolder.f13696c, 3);
        aVar.O(sliceItemHolder.f13697d, 4);
        aVar.Q(sliceItemHolder.f13698e, 5);
    }
}
