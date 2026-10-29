package F8;

import K8.C0915h;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z extends M8.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1849s;

    public Z(int i10) {
        this.f1849s = i10;
    }

    public void c(Object obj, Throwable th) {
    }

    public abstract p129m8.e d();

    public Throwable e(Object obj) {
        A a10 = obj instanceof A ? (A) obj : null;
        if (a10 != null) {
            return a10.f1787a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th) {
        K.a(d().getContext(), new O("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            p129m8.e eVarD = d();
            kotlin.jvm.internal.n.f(eVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0915h c0915h = (C0915h) eVarD;
            p129m8.e eVar = c0915h.f4164u;
            Object obj = c0915h.f4166w;
            p129m8.i context = eVar.getContext();
            Object objI = K8.K.i(context, obj);
            InterfaceC0846x0 interfaceC0846x0 = null;
            a1 a1VarM = objI != K8.K.f4146a ? G.m(eVar, context, objI) : null;
            try {
                p129m8.i context2 = eVar.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null && AbstractC0801a0.b(this.f1849s)) {
                    interfaceC0846x0 = (InterfaceC0846x0) context2.b(InterfaceC0846x0.f1901e);
                }
                if (interfaceC0846x0 != null && !interfaceC0846x0.a()) {
                    CancellationException cancellationExceptionK = interfaceC0846x0.K();
                    c(objH, cancellationExceptionK);
                    h8.q.a aVar = p079h8.q.f21862r;
                    eVar.resumeWith(p079h8.q.b(p079h8.r.a(cancellationExceptionK)));
                } else if (thE != null) {
                    h8.q.a aVar2 = p079h8.q.f21862r;
                    eVar.resumeWith(p079h8.q.b(p079h8.r.a(thE)));
                } else {
                    h8.q.a aVar3 = p079h8.q.f21862r;
                    eVar.resumeWith(p079h8.q.b(f(objH)));
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } finally {
                if (a1VarM == null || a1VarM.Z0()) {
                    K8.K.f(context, objI);
                }
            }
        } catch (X e10) {
            K.a(d().getContext(), e10.getCause());
        } catch (Throwable th) {
            g(th);
        }
    }
}
