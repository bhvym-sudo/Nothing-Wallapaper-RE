package p170r;

import B.b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
final class M0 implements b, Iterable, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final L0 f25340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f25341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f25342s;

    public M0(L0 l9, int i10, int i11) {
        this.f25340q = l9;
        this.f25341r = i10;
        this.f25342s = i11;
    }

    private final void a() {
        if (this.f25340q.v() != this.f25342s) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a();
        this.f25340q.C(this.f25341r);
        L0 l9 = this.f25340q;
        int i10 = this.f25341r;
        return new N(l9, i10 + 1, i10 + N0.I(l9.q(), this.f25341r));
    }
}
