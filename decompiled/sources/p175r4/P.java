package p175r4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class P extends AbstractC1978z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient AbstractC1968y f26129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient AbstractC1948w f26130t;

    P(AbstractC1968y abstractC1968y, AbstractC1948w abstractC1948w) {
        this.f26129s = abstractC1968y;
        this.f26130t = abstractC1948w;
    }

    @Override // p175r4.r
    final int a(Object[] objArr, int i10) {
        return this.f26130t.a(objArr, 0);
    }

    @Override // p175r4.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f26129s.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f26130t.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26129s.size();
    }
}
