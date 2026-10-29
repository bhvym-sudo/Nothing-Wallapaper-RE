package p155p4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: p4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1478u extends AbstractC1475q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient AbstractC1474p f23751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient Object[] f23752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f23753u;

    C1478u(AbstractC1474p abstractC1474p, Object[] objArr, int i10, int i11) {
        this.f23751s = abstractC1474p;
        this.f23752t = objArr;
        this.f23753u = i11;
    }

    @Override // p155p4.AbstractC1468j
    final int a(Object[] objArr, int i10) {
        return g().a(objArr, 0);
    }

    @Override // p155p4.AbstractC1468j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f23751s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // p155p4.AbstractC1475q
    final AbstractC1471m j() {
        return new C1477t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23753u;
    }
}
