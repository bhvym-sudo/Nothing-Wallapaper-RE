package p089i8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1452c;
import kotlin.jvm.internal.AbstractC1456g;
import kotlin.jvm.internal.n;
import p229w8.a;

/* JADX INFO: renamed from: i8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1437k implements Collection, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object[] f22269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f22270r;

    public C1437k(Object[] values, boolean z9) {
        n.h(values, "values");
        this.f22269q = values;
        this.f22270r = z9;
    }

    public int a() {
        return this.f22269q.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1443q.C(this.f22269q, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        n.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f22269q.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC1452c.a(this.f22269q);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        n.h(array, "array");
        return AbstractC1456g.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1445t.b(this.f22269q, this.f22270r);
    }
}
