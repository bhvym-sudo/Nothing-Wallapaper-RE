package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.collection.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1027g implements Iterator, p229w8.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11319q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11321s;

    public AbstractC1027g(int i10) {
        this.f11319q = i10;
    }

    protected abstract Object a(int i10);

    protected abstract void c(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f11320r < this.f11319q;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f11320r);
        this.f11320r++;
        this.f11321s = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f11321s) {
            p150p.d.b("Call next() before removing an element.");
        }
        int i10 = this.f11320r - 1;
        this.f11320r = i10;
        c(i10);
        this.f11319q--;
        this.f11321s = false;
    }
}
