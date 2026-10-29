package A;

import androidx.collection.F;
import java.util.Map;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f16s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17t;

    public d(int i10, n nVar, p219v8.l lVar, p219v8.l lVar2, c cVar) {
        super(i10, nVar, lVar, lVar2);
        this.f16s = cVar;
        cVar.m(this);
    }

    private final void T() {
        if (this.f17t) {
            return;
        }
        this.f17t = true;
        this.f16s.n(this);
    }

    @Override // A.c
    public l C() {
        Map mapR;
        if (this.f16s.D() || this.f16s.e()) {
            return new l.a(this);
        }
        F fE = E();
        int iF = f();
        if (fE != null) {
            c cVar = this.f16s;
            mapR = p.R(cVar, this, cVar.g());
        } else {
            mapR = null;
        }
        synchronized (p.I()) {
            try {
                p.g0(this);
                if (fE == null || fE.c() == 0) {
                    b();
                } else {
                    l lVarI = I(this.f16s.f(), mapR, this.f16s.g());
                    if (!kotlin.jvm.internal.n.d(lVarI, l.b.f32a)) {
                        return lVarI;
                    }
                    F fE2 = this.f16s.E();
                    if (fE2 != null) {
                        fE2.i(fE);
                    } else {
                        this.f16s.P(fE);
                        P(null);
                    }
                }
                if (this.f16s.f() < iF) {
                    this.f16s.B();
                }
                c cVar2 = this.f16s;
                cVar2.v(cVar2.g().o(iF).n(F()));
                this.f16s.J(iF);
                this.f16s.L(y());
                this.f16s.K(F());
                this.f16s.M(G());
                A a10 = A.f21846a;
                O(true);
                T();
                return l.b.f32a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.c, A.k
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        T();
    }
}
