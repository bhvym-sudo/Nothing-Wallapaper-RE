package p170r;

import B.b;
import java.util.ArrayList;
import java.util.Iterator;
import p079h8.f;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
final class X0 implements Iterator, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final L0 f25413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f25414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final P f25415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Y0 f25416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f25417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25418v;

    public X0(L0 l9, int i10, P p9, Y0 y9) {
        this.f25413q = l9;
        this.f25414r = i10;
        this.f25415s = p9;
        this.f25416t = y9;
        this.f25417u = l9.v();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b next() {
        Object obj;
        ArrayList arrayListB = this.f25415s.b();
        if (arrayListB != null) {
            int i10 = this.f25418v;
            this.f25418v = i10 + 1;
            obj = arrayListB.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C1674d) {
            return new M0(this.f25413q, ((C1674d) obj).a(), this.f25417u);
        }
        if (obj instanceof P) {
            return new Z0(this.f25413q, this.f25414r, (P) obj, new D0(this.f25416t, this.f25418v - 1));
        }
        AbstractC1696o.s("Unexpected group information structure");
        throw new f();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListB = this.f25415s.b();
        return arrayListB != null && this.f25418v < arrayListB.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
