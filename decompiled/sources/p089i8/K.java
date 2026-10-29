package p089i8;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import p229w8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Iterator f22256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22257r;

    public K(Iterator iterator) {
        n.h(iterator, "iterator");
        this.f22256q = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I next() {
        int i10 = this.f22257r;
        this.f22257r = i10 + 1;
        if (i10 < 0) {
            AbstractC1446u.t();
        }
        return new I(i10, this.f22256q.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22256q.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
