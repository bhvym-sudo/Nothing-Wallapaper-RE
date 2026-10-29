package p175r4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class O extends AbstractC1978z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient AbstractC1968y f26100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient Object[] f26101t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f26102u;

    O(AbstractC1968y abstractC1968y, Object[] objArr, int i10, int i11) {
        this.f26100s = abstractC1968y;
        this.f26101t = objArr;
        this.f26102u = i11;
    }

    @Override // p175r4.r
    final int a(Object[] objArr, int i10) {
        return g().a(objArr, 0);
    }

    @Override // p175r4.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26100s.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // p175r4.AbstractC1978z
    final AbstractC1948w j() {
        return new N(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26102u;
    }
}
