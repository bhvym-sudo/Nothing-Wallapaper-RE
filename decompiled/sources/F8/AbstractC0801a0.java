package F8;

import K8.AbstractC0916i;
import K8.C0915h;

/* JADX INFO: renamed from: F8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0801a0 {
    public static final void a(Z z9, int i10) {
        p129m8.e eVarD = z9.d();
        boolean z10 = i10 == 4;
        if (z10 || !(eVarD instanceof C0915h) || b(i10) != b(z9.f1849s)) {
            d(z9, eVarD, z10);
            return;
        }
        C0915h c0915h = (C0915h) eVarD;
        I i11 = c0915h.f4163t;
        p129m8.i context = c0915h.getContext();
        if (AbstractC0916i.d(i11, context)) {
            AbstractC0916i.c(i11, context, z9);
        } else {
            e(z9);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(Z z9, p129m8.e eVar, boolean z10) {
        Object objF;
        Object objH = z9.h();
        Throwable thE = z9.e(objH);
        if (thE != null) {
            h8.q.a aVar = p079h8.q.f21862r;
            objF = p079h8.r.a(thE);
        } else {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objF = z9.f(objH);
        }
        Object objB = p079h8.q.b(objF);
        if (!z10) {
            eVar.resumeWith(objB);
            return;
        }
        kotlin.jvm.internal.n.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0915h c0915h = (C0915h) eVar;
        p129m8.e eVar2 = c0915h.f4164u;
        Object obj = c0915h.f4166w;
        p129m8.i context = eVar2.getContext();
        Object objI = K8.K.i(context, obj);
        a1 a1VarM = objI != K8.K.f4146a ? G.m(eVar2, context, objI) : null;
        try {
            c0915h.f4164u.resumeWith(objB);
            p079h8.A a10 = p079h8.A.f21846a;
        } finally {
            if (a1VarM == null || a1VarM.Z0()) {
                K8.K.f(context, objI);
            }
        }
    }

    private static final void e(Z z9) {
        AbstractC0815h0 abstractC0815h0B = V0.f1836a.b();
        if (abstractC0815h0B.s1()) {
            abstractC0815h0B.o1(z9);
            return;
        }
        abstractC0815h0B.q1(true);
        try {
            d(z9, z9.d(), true);
            do {
            } while (abstractC0815h0B.v1());
        } catch (Throwable th) {
            try {
                z9.g(th);
            } finally {
                abstractC0815h0B.l1(true);
            }
        }
    }
}
