package L8;

import F8.A;
import F8.E0;
import F8.W0;
import F8.X;
import K8.K;
import K8.z;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.I;
import p079h8.q;
import p079h8.r;
import p129m8.e;
import p129m8.i;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, e eVar) {
        e eVarA = h.a(eVar);
        try {
            i context = eVarA.getContext();
            Object objI = K.i(context, null);
            try {
                h.b(eVarA);
                Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? p139n8.b.d(pVar, obj, eVarA) : ((p) I.d(pVar, 2)).invoke(obj, eVarA);
                K.f(context, objI);
                if (objD != p139n8.b.e()) {
                    eVarA.resumeWith(q.b(objD));
                }
            } catch (Throwable th) {
                K.f(context, objI);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof X) {
                th = ((X) th).getCause();
            }
            q.a aVar = q.f21862r;
            eVarA.resumeWith(q.b(r.a(th)));
        }
    }

    public static final Object b(z zVar, Object obj, p pVar) {
        Object a10;
        Object objO0;
        try {
            a10 = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? p139n8.b.d(pVar, obj, zVar) : ((p) I.d(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            a10 = new A(th, false, 2, null);
        }
        if (a10 != p139n8.b.e() && (objO0 = zVar.o0(a10)) != E0.f1808b) {
            zVar.Y0();
            if (objO0 instanceof A) {
                throw ((A) objO0).f1787a;
            }
            return E0.h(objO0);
        }
        return p139n8.b.e();
    }

    public static final Object c(z zVar, Object obj, p pVar) throws Throwable {
        Object a10;
        Object objO0;
        try {
            a10 = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? p139n8.b.d(pVar, obj, zVar) : ((p) I.d(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            a10 = new A(th, false, 2, null);
        }
        if (a10 != p139n8.b.e() && (objO0 = zVar.o0(a10)) != E0.f1808b) {
            zVar.Y0();
            if (objO0 instanceof A) {
                Throwable th2 = ((A) objO0).f1787a;
                if (!(th2 instanceof W0) || ((W0) th2).f1840q != zVar) {
                    throw th2;
                }
                if (a10 instanceof A) {
                    throw ((A) a10).f1787a;
                }
            } else {
                a10 = E0.h(objO0);
            }
            return a10;
        }
        return p139n8.b.e();
    }
}
