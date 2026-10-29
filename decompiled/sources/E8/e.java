package E8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class e implements D8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f1453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p219v8.p f1456d;

    public static final class a implements Iterator, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f1457q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f1458r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f1459s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private B8.g f1460t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f1461u;

        a() {
            int iM = B8.h.m(e.this.f1454b, 0, e.this.f1453a.length());
            this.f1458r = iM;
            this.f1459s = iM;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void a() {
            p079h8.o oVar;
            if (this.f1459s < 0) {
                this.f1457q = 0;
                this.f1460t = null;
                return;
            }
            if (e.this.f1455c > 0) {
                int i10 = this.f1461u + 1;
                this.f1461u = i10;
                if (i10 >= e.this.f1455c) {
                    this.f1460t = new B8.g(this.f1458r, w.X(e.this.f1453a));
                    this.f1459s = -1;
                } else if (this.f1459s > e.this.f1453a.length() && (oVar = (p079h8.o) e.this.f1456d.invoke(e.this.f1453a, Integer.valueOf(this.f1459s))) != null) {
                    int iIntValue = ((Number) oVar.a()).intValue();
                    int iIntValue2 = ((Number) oVar.b()).intValue();
                    this.f1460t = B8.h.q(this.f1458r, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f1458r = i11;
                    this.f1459s = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f1460t = new B8.g(this.f1458r, w.X(e.this.f1453a));
                    this.f1459s = -1;
                }
            } else if (this.f1459s > e.this.f1453a.length()) {
                this.f1460t = new B8.g(this.f1458r, w.X(e.this.f1453a));
                this.f1459s = -1;
            } else {
                int iIntValue3 = ((Number) oVar.a()).intValue();
                int iIntValue4 = ((Number) oVar.b()).intValue();
                this.f1460t = B8.h.q(this.f1458r, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f1458r = i12;
                this.f1459s = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f1457q = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public B8.g next() {
            if (this.f1457q == -1) {
                a();
            }
            if (this.f1457q == 0) {
                throw new NoSuchElementException();
            }
            B8.g gVar = this.f1460t;
            kotlin.jvm.internal.n.f(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f1460t = null;
            this.f1457q = -1;
            return gVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1457q == -1) {
                a();
            }
            return this.f1457q == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence input, int i10, int i11, p219v8.p getNextMatch) {
        kotlin.jvm.internal.n.h(input, "input");
        kotlin.jvm.internal.n.h(getNextMatch, "getNextMatch");
        this.f1453a = input;
        this.f1454b = i10;
        this.f1455c = i11;
        this.f1456d = getNextMatch;
    }

    @Override // D8.h
    public Iterator iterator() {
        return new a();
    }
}
