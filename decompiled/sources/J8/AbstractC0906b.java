package J8;

import I8.O;
import java.util.Arrays;

/* JADX INFO: renamed from: J8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0906b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d[] f3884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f3886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private B f3887t;

    protected final d j() {
        d dVarK;
        B b10;
        synchronized (this) {
            try {
                d[] dVarArrM = this.f3884q;
                if (dVarArrM == null) {
                    dVarArrM = m(2);
                    this.f3884q = dVarArrM;
                } else if (this.f3885r >= dVarArrM.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrM, dVarArrM.length * 2);
                    kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(...)");
                    this.f3884q = (d[]) objArrCopyOf;
                    dVarArrM = (d[]) objArrCopyOf;
                }
                int i10 = this.f3886s;
                do {
                    dVarK = dVarArrM[i10];
                    if (dVarK == null) {
                        dVarK = k();
                        dVarArrM[i10] = dVarK;
                    }
                    i10++;
                    if (i10 >= dVarArrM.length) {
                        i10 = 0;
                    }
                    kotlin.jvm.internal.n.f(dVarK, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarK.a(this));
                this.f3886s = i10;
                this.f3885r++;
                b10 = this.f3887t;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b10 != null) {
            b10.c0(1);
        }
        return dVarK;
    }

    protected abstract d k();

    public final O l() {
        B b10;
        synchronized (this) {
            b10 = this.f3887t;
            if (b10 == null) {
                b10 = new B(this.f3885r);
                this.f3887t = b10;
            }
        }
        return b10;
    }

    protected abstract d[] m(int i10);

    protected final void n(d dVar) {
        B b10;
        int i10;
        p129m8.e[] eVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f3885r - 1;
                this.f3885r = i11;
                b10 = this.f3887t;
                if (i11 == 0) {
                    this.f3886s = 0;
                }
                kotlin.jvm.internal.n.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                eVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p129m8.e eVar : eVarArrB) {
            if (eVar != null) {
                h8.q.a aVar = p079h8.q.f21862r;
                eVar.resumeWith(p079h8.q.b(p079h8.A.f21846a));
            }
        }
        if (b10 != null) {
            b10.c0(-1);
        }
    }

    protected final int o() {
        return this.f3885r;
    }

    protected final d[] p() {
        return this.f3884q;
    }
}
