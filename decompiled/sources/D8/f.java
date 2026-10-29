package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.l f1149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v8.l f1150c;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Iterator f1151q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Iterator f1152r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f1153s;

        a() {
            this.f1151q = f.this.f1148a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f1152r;
            if (it != null && it.hasNext()) {
                this.f1153s = 1;
                return true;
            }
            while (this.f1151q.hasNext()) {
                Iterator it2 = (Iterator) f.this.f1150c.f(f.this.f1149b.f(this.f1151q.next()));
                if (it2.hasNext()) {
                    this.f1152r = it2;
                    this.f1153s = 1;
                    return true;
                }
            }
            this.f1153s = 2;
            this.f1152r = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f1153s;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f1153s;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f1153s = 0;
            Iterator it = this.f1152r;
            kotlin.jvm.internal.n.e(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h sequence, p219v8.l transformer, p219v8.l iterator) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        kotlin.jvm.internal.n.h(transformer, "transformer");
        kotlin.jvm.internal.n.h(iterator, "iterator");
        this.f1148a = sequence;
        this.f1149b = transformer;
        this.f1150c = iterator;
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a();
    }
}
