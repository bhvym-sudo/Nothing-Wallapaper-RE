package D8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f1182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.l f1183b;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Iterator f1184q;

        a() {
            this.f1184q = v.this.f1182a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1184q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return v.this.f1183b.f(this.f1184q.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(h sequence, p219v8.l transformer) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        kotlin.jvm.internal.n.h(transformer, "transformer");
        this.f1182a = sequence;
        this.f1183b = transformer;
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a();
    }
}
