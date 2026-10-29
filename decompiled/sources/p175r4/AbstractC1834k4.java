package p175r4;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: r4.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1834k4 extends X {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f26782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26783r;

    protected AbstractC1834k4(int i10, int i11) {
        AbstractC1811i3.b(i11, i10, "index");
        this.f26782q = i10;
        this.f26783r = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26783r < this.f26782q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26783r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26783r;
        this.f26783r = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26783r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26783r - 1;
        this.f26783r = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26783r - 1;
    }
}
