package p155p4;

import java.util.Iterator;

/* JADX INFO: renamed from: p4.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1479v extends AbstractC1475q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient AbstractC1474p f23754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient AbstractC1471m f23755t;

    C1479v(AbstractC1474p abstractC1474p, AbstractC1471m abstractC1471m) {
        this.f23754s = abstractC1474p;
        this.f23755t = abstractC1471m;
    }

    @Override // p155p4.AbstractC1468j
    final int a(Object[] objArr, int i10) {
        return this.f23755t.a(objArr, 0);
    }

    @Override // p155p4.AbstractC1468j, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f23754s.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f23755t.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23754s.size();
    }
}
