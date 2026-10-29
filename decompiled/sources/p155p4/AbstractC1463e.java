package p155p4;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1463e extends A {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f23728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23729r;

    protected AbstractC1463e(int i10, int i11) {
        AbstractC1461c.b(i11, i10, "index");
        this.f23728q = i10;
        this.f23729r = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23729r < this.f23728q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23729r > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23729r;
        this.f23729r = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23729r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f23729r - 1;
        this.f23729r = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23729r - 1;
    }
}
