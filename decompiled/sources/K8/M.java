package K8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4150b = AtomicIntegerFieldUpdater.newUpdater(M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private N[] f4151a;

    private final N[] g() {
        N[] nArr = this.f4151a;
        if (nArr == null) {
            N[] nArr2 = new N[4];
            this.f4151a = nArr2;
            return nArr2;
        }
        if (c() < nArr.length) {
            return nArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(nArr, c() * 2);
        kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(...)");
        N[] nArr3 = (N[]) objArrCopyOf;
        this.f4151a = nArr3;
        return nArr3;
    }

    private final void k(int i10) {
        f4150b.set(this, i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= c()) {
                return;
            }
            N[] nArr = this.f4151a;
            kotlin.jvm.internal.n.e(nArr);
            int i13 = i11 + 2;
            if (i13 < c()) {
                N n9 = nArr[i13];
                kotlin.jvm.internal.n.e(n9);
                N n10 = nArr[i12];
                kotlin.jvm.internal.n.e(n10);
                if (((Comparable) n9).compareTo(n10) >= 0) {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            N n11 = nArr[i10];
            kotlin.jvm.internal.n.e(n11);
            N n12 = nArr[i13];
            kotlin.jvm.internal.n.e(n12);
            if (((Comparable) n11).compareTo(n12) <= 0) {
                return;
            }
            n(i10, i13);
            i10 = i13;
        }
    }

    private final void m(int i10) {
        while (i10 > 0) {
            N[] nArr = this.f4151a;
            kotlin.jvm.internal.n.e(nArr);
            int i11 = (i10 - 1) / 2;
            N n9 = nArr[i11];
            kotlin.jvm.internal.n.e(n9);
            N n10 = nArr[i10];
            kotlin.jvm.internal.n.e(n10);
            if (((Comparable) n9).compareTo(n10) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        N[] nArr = this.f4151a;
        kotlin.jvm.internal.n.e(nArr);
        N n9 = nArr[i11];
        kotlin.jvm.internal.n.e(n9);
        N n10 = nArr[i10];
        kotlin.jvm.internal.n.e(n10);
        nArr[i10] = n9;
        nArr[i11] = n10;
        n9.f(i10);
        n10.f(i11);
    }

    public final void a(N n9) {
        n9.h(this);
        N[] nArrG = g();
        int iC = c();
        k(iC + 1);
        nArrG[iC] = n9;
        n9.f(iC);
        m(iC);
    }

    public final N b() {
        N[] nArr = this.f4151a;
        if (nArr != null) {
            return nArr[0];
        }
        return null;
    }

    public final int c() {
        return f4150b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final N f() {
        N nB;
        synchronized (this) {
            nB = b();
        }
        return nB;
    }

    public final boolean h(N n9) {
        boolean z9;
        synchronized (this) {
            if (n9.e() == null) {
                z9 = false;
            } else {
                i(n9.g());
                z9 = true;
            }
        }
        return z9;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final N i(int i10) {
        N[] nArr = this.f4151a;
        kotlin.jvm.internal.n.e(nArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                N n9 = nArr[i10];
                kotlin.jvm.internal.n.e(n9);
                N n10 = nArr[i11];
                kotlin.jvm.internal.n.e(n10);
                if (((Comparable) n9).compareTo(n10) < 0) {
                    n(i10, i11);
                    m(i11);
                } else {
                    l(i10);
                }
            } else {
                l(i10);
            }
        }
        N n11 = nArr[c()];
        kotlin.jvm.internal.n.e(n11);
        n11.h(null);
        n11.f(-1);
        nArr[c()] = null;
        return n11;
    }

    public final N j() {
        N nI;
        synchronized (this) {
            nI = c() > 0 ? i(0) : null;
        }
        return nI;
    }
}
