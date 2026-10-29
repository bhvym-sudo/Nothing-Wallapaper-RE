package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1174c;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Iterator f1175q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1176r;

        a() {
            this.f1175q = t.this.f1172a.iterator();
        }

        private final void a() {
            while (this.f1176r < t.this.f1173b && this.f1175q.hasNext()) {
                this.f1175q.next();
                this.f1176r++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f1176r < t.this.f1174c && this.f1175q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (this.f1176r >= t.this.f1174c) {
                throw new NoSuchElementException();
            }
            this.f1176r++;
            return this.f1175q.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(h sequence, int i10, int i11) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        this.f1172a = sequence;
        this.f1173b = i10;
        this.f1174c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f1174c - this.f1173b;
    }

    @Override // D8.c
    public h a(int i10) {
        if (i10 >= f()) {
            return this;
        }
        h hVar = this.f1172a;
        int i11 = this.f1173b;
        return new t(hVar, i11, i10 + i11);
    }

    @Override // D8.c
    public h b(int i10) {
        return i10 >= f() ? p.g() : new t(this.f1172a, this.f1173b + i10, this.f1174c);
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a();
    }
}
