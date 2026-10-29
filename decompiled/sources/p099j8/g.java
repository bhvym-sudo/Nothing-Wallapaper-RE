package p099j8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1432f;
import p229w8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends AbstractC1432f implements Collection, b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f22580q;

    public g(d backing) {
        n.h(backing, "backing");
        this.f22580q = backing;
    }

    @Override // p089i8.AbstractC1432f
    public int a() {
        return this.f22580q.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        n.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f22580q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f22580q.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f22580q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f22580q.Q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f22580q.O(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        n.h(elements, "elements");
        this.f22580q.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        n.h(elements, "elements");
        this.f22580q.n();
        return super.retainAll(elements);
    }
}
