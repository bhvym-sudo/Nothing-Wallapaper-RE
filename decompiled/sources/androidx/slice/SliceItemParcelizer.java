package androidx.slice;

/* JADX INFO: loaded from: classes.dex */
public final class SliceItemParcelizer {
    public static SliceItem read(androidx.versionedparcelable.a aVar) {
        SliceItem sliceItem = new SliceItem();
        sliceItem.f13689a = (String[]) aVar.i(sliceItem.f13689a, 1);
        sliceItem.f13690b = aVar.z(sliceItem.f13690b, 2);
        sliceItem.f13691c = aVar.z(sliceItem.f13691c, 3);
        sliceItem.f13693e = (SliceItemHolder) aVar.C(sliceItem.f13693e, 4);
        sliceItem.p();
        return sliceItem;
    }

    public static void write(SliceItem sliceItem, androidx.versionedparcelable.a aVar) {
        aVar.E(true, true);
        sliceItem.q(aVar.g());
        aVar.G(sliceItem.f13689a, 1);
        aVar.V(sliceItem.f13690b, 2);
        aVar.V(sliceItem.f13691c, 3);
        aVar.Z(sliceItem.f13693e, 4);
    }
}
