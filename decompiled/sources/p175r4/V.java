package p175r4;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class V implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Iterator f26277q;

    V(Iterator it) {
        it.getClass();
        this.f26277q = it;
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26277q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f26277q.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26277q.remove();
    }
}
