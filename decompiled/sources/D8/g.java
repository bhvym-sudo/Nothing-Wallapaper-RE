package D8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.a f1155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.l f1156b;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Object f1157q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1158r = -2;

        a() {
        }

        private final void a() {
            Object objF;
            if (this.f1158r == -2) {
                objF = g.this.f1155a.invoke();
            } else {
                p219v8.l lVar = g.this.f1156b;
                Object obj = this.f1157q;
                kotlin.jvm.internal.n.e(obj);
                objF = lVar.f(obj);
            }
            this.f1157q = objF;
            this.f1158r = objF == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1158r < 0) {
                a();
            }
            return this.f1158r == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f1158r < 0) {
                a();
            }
            if (this.f1158r == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f1157q;
            kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f1158r = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(p219v8.a getInitialValue, p219v8.l getNextValue) {
        kotlin.jvm.internal.n.h(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.n.h(getNextValue, "getNextValue");
        this.f1155a = getInitialValue;
        this.f1156b = getNextValue;
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a();
    }
}
