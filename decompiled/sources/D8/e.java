package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p219v8.l f1143c;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Iterator f1144q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1145r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Object f1146s;

        a() {
            this.f1144q = e.this.f1141a.iterator();
        }

        private final void a() {
            while (this.f1144q.hasNext()) {
                Object next = this.f1144q.next();
                if (((Boolean) e.this.f1143c.f(next)).booleanValue() == e.this.f1142b) {
                    this.f1146s = next;
                    this.f1145r = 1;
                    return;
                }
            }
            this.f1145r = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1145r == -1) {
                a();
            }
            return this.f1145r == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1145r == -1) {
                a();
            }
            if (this.f1145r == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f1146s;
            this.f1146s = null;
            this.f1145r = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(h sequence, boolean z9, p219v8.l predicate) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        kotlin.jvm.internal.n.h(predicate, "predicate");
        this.f1141a = sequence;
        this.f1142b = z9;
        this.f1143c = predicate;
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a();
    }
}
