package p175r4;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: r4.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1839l extends AbstractCollection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ C1849m f26785q;

    C1839l(C1849m c1849m) {
        this.f26785q = c1849m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f26785q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1849m c1849m = this.f26785q;
        Map mapL = c1849m.l();
        return mapL != null ? mapL.values().iterator() : new C1774f(c1849m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f26785q.size();
    }
}
