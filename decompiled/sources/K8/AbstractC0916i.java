package K8;

import F8.AbstractC0815h0;
import F8.InterfaceC0846x0;
import F8.V0;
import F8.X;
import F8.a1;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: K8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0916i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f4167a = new D("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f4168b = new D("REUSABLE_CLAIMED");

    public static final void b(p129m8.e eVar, Object obj) {
        if (!(eVar instanceof C0915h)) {
            eVar.resumeWith(obj);
            return;
        }
        C0915h c0915h = (C0915h) eVar;
        Object objB = F8.C.b(obj);
        if (d(c0915h.f4163t, c0915h.getContext())) {
            c0915h.f4165v = objB;
            c0915h.f1849s = 1;
            c(c0915h.f4163t, c0915h.getContext(), c0915h);
            return;
        }
        AbstractC0815h0 abstractC0815h0B = V0.f1836a.b();
        if (abstractC0815h0B.s1()) {
            c0915h.f4165v = objB;
            c0915h.f1849s = 1;
            abstractC0815h0B.o1(c0915h);
            return;
        }
        abstractC0815h0B.q1(true);
        try {
            InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) c0915h.getContext().b(InterfaceC0846x0.f1901e);
            if (interfaceC0846x0 == null || interfaceC0846x0.a()) {
                p129m8.e eVar2 = c0915h.f4164u;
                Object obj2 = c0915h.f4166w;
                p129m8.i context = eVar2.getContext();
                Object objI = K.i(context, obj2);
                a1 a1VarM = objI != K.f4146a ? F8.G.m(eVar2, context, objI) : null;
                try {
                    c0915h.f4164u.resumeWith(obj);
                    p079h8.A a10 = p079h8.A.f21846a;
                    if (a1VarM == null || a1VarM.Z0()) {
                        K.f(context, objI);
                    }
                } catch (Throwable th) {
                    if (a1VarM == null || a1VarM.Z0()) {
                        K.f(context, objI);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionK = interfaceC0846x0.K();
                c0915h.c(objB, cancellationExceptionK);
                h8.q.a aVar = p079h8.q.f21862r;
                c0915h.resumeWith(p079h8.q.b(p079h8.r.a(cancellationExceptionK)));
            }
            while (abstractC0815h0B.v1()) {
            }
        } catch (Throwable th2) {
            try {
                c0915h.g(th2);
            } finally {
                abstractC0815h0B.l1(true);
            }
        }
    }

    public static final void c(F8.I i10, p129m8.i iVar, Runnable runnable) {
        try {
            i10.g1(iVar, runnable);
        } catch (Throwable th) {
            throw new X(th, i10, iVar);
        }
    }

    public static final boolean d(F8.I i10, p129m8.i iVar) throws X {
        try {
            return i10.i1(iVar);
        } catch (Throwable th) {
            throw new X(th, i10, iVar);
        }
    }

    public static final boolean e(C0915h c0915h) {
        p079h8.A a10 = p079h8.A.f21846a;
        AbstractC0815h0 abstractC0815h0B = V0.f1836a.b();
        if (abstractC0815h0B.t1()) {
            return false;
        }
        if (abstractC0815h0B.s1()) {
            c0915h.f4165v = a10;
            c0915h.f1849s = 1;
            abstractC0815h0B.o1(c0915h);
            return true;
        }
        abstractC0815h0B.q1(true);
        try {
            c0915h.run();
            do {
            } while (abstractC0815h0B.v1());
        } catch (Throwable th) {
            try {
                c0915h.g(th);
            } finally {
                abstractC0815h0B.l1(true);
            }
        }
        return false;
    }
}
