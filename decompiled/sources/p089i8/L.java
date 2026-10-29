package p089i8;

import java.util.Iterator;
import p229w8.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L implements Iterator, a {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
