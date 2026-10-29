package F8;

import K8.AbstractC0919l;
import p089i8.C1438l;

/* JADX INFO: renamed from: F8.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0815h0 extends I {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f1867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C1438l f1869u;

    public static /* synthetic */ void m1(AbstractC0815h0 abstractC0815h0, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        abstractC0815h0.l1(z9);
    }

    private final long n1(boolean z9) {
        return z9 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void r1(AbstractC0815h0 abstractC0815h0, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        abstractC0815h0.q1(z9);
    }

    @Override // F8.I
    public final I j1(int i10, String str) {
        AbstractC0919l.a(i10);
        return AbstractC0919l.b(this, str);
    }

    public final void l1(boolean z9) {
        long jN1 = this.f1867s - n1(z9);
        this.f1867s = jN1;
        if (jN1 <= 0 && this.f1868t) {
            shutdown();
        }
    }

    public final void o1(Z z9) {
        C1438l c1438l = this.f1869u;
        if (c1438l == null) {
            c1438l = new C1438l();
            this.f1869u = c1438l;
        }
        c1438l.addLast(z9);
    }

    protected long p1() {
        C1438l c1438l = this.f1869u;
        return (c1438l == null || c1438l.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void q1(boolean z9) {
        this.f1867s += n1(z9);
        if (z9) {
            return;
        }
        this.f1868t = true;
    }

    public final boolean s1() {
        return this.f1867s >= n1(true);
    }

    public abstract void shutdown();

    public final boolean t1() {
        C1438l c1438l = this.f1869u;
        if (c1438l != null) {
            return c1438l.isEmpty();
        }
        return true;
    }

    public abstract long u1();

    public final boolean v1() {
        Z z9;
        C1438l c1438l = this.f1869u;
        if (c1438l == null || (z9 = (Z) c1438l.t()) == null) {
            return false;
        }
        z9.run();
        return true;
    }

    public boolean w1() {
        return false;
    }
}
