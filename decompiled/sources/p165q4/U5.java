package p165q4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class U5 extends Q5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient P5 f24384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient Object[] f24385t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f24386u;

    U5(P5 p9, Object[] objArr, int i10, int i11) {
        this.f24384s = p9;
        this.f24385t = objArr;
        this.f24386u = i11;
    }

    @Override // p165q4.M4
    final int a(Object[] objArr, int i10) {
        return g().a(objArr, 0);
    }

    @Override // p165q4.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f24384s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // p165q4.Q5
    final N5 j() {
        return new T5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24386u;
    }
}
