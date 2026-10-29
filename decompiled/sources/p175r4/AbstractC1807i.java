package p175r4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: r4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1807i implements Iterator {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f26717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f26718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f26719s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1849m f26720t;

    /* synthetic */ AbstractC1807i(C1849m c1849m, AbstractC1796h abstractC1796h) {
        this.f26720t = c1849m;
        this.f26717q = c1849m.f26813u;
        this.f26718r = c1849m.f();
    }

    private final void c() {
        if (this.f26720t.f26813u != this.f26717q) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26718r >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26718r;
        this.f26719s = i10;
        Object objA = a(i10);
        this.f26718r = this.f26720t.g(this.f26718r);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c();
        AbstractC1811i3.d(this.f26719s >= 0, "no calls to next() since the last call to remove()");
        this.f26717q += 32;
        C1849m c1849m = this.f26720t;
        int i10 = this.f26719s;
        Object[] objArr = c1849m.f26811s;
        objArr.getClass();
        c1849m.remove(objArr[i10]);
        this.f26718r--;
        this.f26719s = -1;
    }
}
