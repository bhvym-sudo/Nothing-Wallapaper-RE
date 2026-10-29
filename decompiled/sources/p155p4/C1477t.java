package p155p4;

import java.util.AbstractMap;

/* JADX INFO: renamed from: p4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1477t extends AbstractC1471m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1478u f23750t;

    C1477t(C1478u c1478u) {
        this.f23750t = c1478u;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC1461c.a(i10, this.f23750t.f23753u, "index");
        C1478u c1478u = this.f23750t;
        int i11 = i10 + i10;
        Object obj = c1478u.f23752t[i11];
        obj.getClass();
        Object obj2 = c1478u.f23752t[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23750t.f23753u;
    }
}
