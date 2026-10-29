package p210v;

import java.util.Collection;
import java.util.Iterator;
import p089i8.AbstractC1432f;
import p229w8.b;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1432f implements Collection, b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f28067q;

    public l(f fVar) {
        this.f28067q = fVar;
    }

    @Override // p089i8.AbstractC1432f
    public int a() {
        return this.f28067q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f28067q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f28067q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new m(this.f28067q);
    }
}
