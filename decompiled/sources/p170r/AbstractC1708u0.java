package p170r;

import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: renamed from: r.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1708u0 extends AbstractC1707u {
    public AbstractC1708u0(a aVar) {
        super(aVar, null);
    }

    private final g1 f(C1710v0 c1710v0) {
        if (!c1710v0.i()) {
            if (c1710v0.c() != null) {
                return new A(c1710v0.c());
            }
            return c1710v0.f() != null ? new K(c1710v0.f()) : new d1(c1710v0.d());
        }
        InterfaceC1683h0 interfaceC1683h0F = c1710v0.f();
        if (interfaceC1683h0F == null) {
            Object objG = c1710v0.g();
            R0 r0E = c1710v0.e();
            if (r0E == null) {
                r0E = S0.g();
            }
            interfaceC1683h0F = S0.c(objG, r0E);
        }
        return new K(interfaceC1683h0F);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 r.g1) = (r5v5 r.g1), (r5v6 r.g1) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p170r.AbstractC1707u
    public g1 b(C1710v0 c1710v0, g1 g1Var) {
        A a10;
        g1 g1Var2;
        d1 d1Var;
        K k9;
        g1 g1Var3 = null;
        g1Var3 = null;
        g1Var3 = null;
        g1Var3 = null;
        g1Var3 = null;
        if (g1Var instanceof K) {
            if (c1710v0.i()) {
                k9 = (K) g1Var;
                k9.b().setValue(c1710v0.d());
            }
        } else if (g1Var instanceof d1) {
            if (c1710v0.j()) {
                d1Var = (d1) g1Var;
                if (n.d(c1710v0.d(), d1Var.b())) {
                    g1Var2 = a10;
                    g1Var2 = d1Var;
                    g1Var3 = g1Var2;
                }
            }
        } else if (g1Var instanceof A) {
            a10 = (A) g1Var;
            if (c1710v0.c() == a10.b()) {
                g1Var2 = a10;
                g1Var2 = d1Var;
                g1Var3 = g1Var2;
            }
        }
        if (g1Var3 == null) {
            g1Var3 = k9;
            return f(c1710v0);
        }
        g1Var3 = k9;
        return g1Var3;
    }

    public abstract C1710v0 c(Object obj);

    public final C1710v0 d(Object obj) {
        return c(obj);
    }

    public final C1710v0 e(Object obj) {
        return c(obj).h();
    }
}
