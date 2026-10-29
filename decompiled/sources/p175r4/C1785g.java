package p175r4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: r4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1785g extends AbstractSet {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ C1849m f26685q;

    C1785g(C1849m c1849m) {
        this.f26685q = c1849m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26685q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapL = this.f26685q.l();
        if (mapL != null) {
            return mapL.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iS = this.f26685q.s(entry.getKey());
            if (iS != -1) {
                Object[] objArr = this.f26685q.f26812t;
                objArr.getClass();
                if (AbstractC1765e1.a(objArr[iS], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1849m c1849m = this.f26685q;
        Map mapL = c1849m.l();
        return mapL != null ? mapL.entrySet().iterator() : new C1763e(c1849m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapL = this.f26685q.l();
        if (mapL != null) {
            return mapL.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C1849m c1849m = this.f26685q;
        if (c1849m.q()) {
            return false;
        }
        int iR = c1849m.r();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C1849m c1849m2 = this.f26685q;
        Object objI = C1849m.i(c1849m2);
        int[] iArr = c1849m2.f26810r;
        iArr.getClass();
        C1849m c1849m3 = this.f26685q;
        Object[] objArr = c1849m3.f26811s;
        objArr.getClass();
        Object[] objArr2 = c1849m3.f26812t;
        objArr2.getClass();
        int iB = AbstractC1859n.b(key, value, iR, objI, iArr, objArr, objArr2);
        if (iB == -1) {
            return false;
        }
        this.f26685q.p(iB, iR);
        this.f26685q.f26814v--;
        this.f26685q.n();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26685q.size();
    }
}
