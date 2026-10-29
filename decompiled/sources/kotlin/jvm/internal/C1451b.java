package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1451b implements Iterator, p229w8.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object[] f22790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22791r;

    public C1451b(Object[] array) {
        n.h(array, "array");
        this.f22790q = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22791r < this.f22790q.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f22790q;
            int i10 = this.f22791r;
            this.f22791r = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f22791r--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
