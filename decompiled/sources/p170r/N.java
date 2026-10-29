package p170r;

import B.b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
final class N implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final L0 f25343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f25344r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f25345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f25346t;

    public N(L0 l9, int i10, int i11) {
        this.f25343q = l9;
        this.f25344r = i11;
        this.f25345s = i10;
        this.f25346t = l9.v();
        if (l9.w()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void c() {
        if (this.f25343q.v() != this.f25346t) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b next() {
        c();
        int i10 = this.f25345s;
        this.f25345s = N0.I(this.f25343q.q(), i10) + i10;
        return new M0(this.f25343q, i10, this.f25346t);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f25345s < this.f25344r;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
