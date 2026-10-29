package p165q4;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class T5 extends N5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ U5 f24374s;

    T5(U5 u9) {
        this.f24374s = u9;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        G1.a(i10, this.f24374s.f24386u, "index");
        U5 u9 = this.f24374s;
        int i11 = i10 + i10;
        Object obj = u9.f24385t[i11];
        obj.getClass();
        Object obj2 = u9.f24385t[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24374s.f24386u;
    }
}
