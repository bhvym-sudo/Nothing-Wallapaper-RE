package D8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1137b;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Iterator f1138q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1139r;

        a(b bVar) {
            this.f1138q = bVar.f1136a.iterator();
            this.f1139r = bVar.f1137b;
        }

        private final void a() {
            while (this.f1139r > 0 && this.f1138q.hasNext()) {
                this.f1138q.next();
                this.f1139r--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f1138q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f1138q.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h sequence, int i10) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        this.f1136a = sequence;
        this.f1137b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // D8.c
    public h a(int i10) {
        int i11 = this.f1137b;
        int i12 = i11 + i10;
        return i12 < 0 ? new u(this, i10) : new t(this.f1136a, i11, i12);
    }

    @Override // D8.c
    public h b(int i10) {
        int i11 = this.f1137b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f1136a, i11);
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a(this);
    }
}
