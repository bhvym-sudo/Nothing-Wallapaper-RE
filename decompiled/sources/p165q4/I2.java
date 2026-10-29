package p165q4;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class I2 extends AbstractC1505d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f24230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24231r;

    protected I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f24230q = i10;
        this.f24231r = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f24231r < this.f24230q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f24231r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24231r;
        this.f24231r = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f24231r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f24231r - 1;
        this.f24231r = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f24231r - 1;
    }
}
