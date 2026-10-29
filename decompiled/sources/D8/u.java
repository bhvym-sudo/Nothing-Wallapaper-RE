package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1179b;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f1180q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Iterator f1181r;

        a(u uVar) {
            this.f1180q = uVar.f1179b;
            this.f1181r = uVar.f1178a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1180q > 0 && this.f1181r.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f1180q;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f1180q = i10 - 1;
            return this.f1181r.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(h sequence, int i10) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        this.f1178a = sequence;
        this.f1179b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // D8.c
    public h a(int i10) {
        return i10 >= this.f1179b ? this : new u(this.f1178a, i10);
    }

    @Override // D8.c
    public h b(int i10) {
        int i11 = this.f1179b;
        return i10 >= i11 ? p.g() : new t(this.f1178a, i10, i11);
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a(this);
    }
}
