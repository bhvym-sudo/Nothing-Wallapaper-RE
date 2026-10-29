package p175r4;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: r4.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1917s8 implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Iterator f27349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Collection f27350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final /* synthetic */ T8 f27351s;

    C1917s8(T8 t9, Iterator it) {
        this.f27351s = t9;
        this.f27350r = t9.f26250r;
        this.f27349q = it;
    }

    final void a() {
        this.f27351s.b();
        if (this.f27351s.f26250r != this.f27350r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f27349q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f27349q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f27349q.remove();
        this.f27351s.f26253u.f25964t--;
        this.f27351s.e();
    }

    C1917s8(T8 t9) {
        this.f27351s = t9;
        Collection collection = t9.f26250r;
        this.f27350r = collection;
        this.f27349q = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
