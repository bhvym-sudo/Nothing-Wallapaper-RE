package p165q4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class V5 extends Q5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient P5 f24399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient N5 f24400t;

    V5(P5 p9, N5 n9) {
        this.f24399s = p9;
        this.f24400t = n9;
    }

    @Override // p165q4.M4
    final int a(Object[] objArr, int i10) {
        return this.f24400t.a(objArr, 0);
    }

    @Override // p165q4.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f24399s.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f24400t.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f24399s.size();
    }
}
