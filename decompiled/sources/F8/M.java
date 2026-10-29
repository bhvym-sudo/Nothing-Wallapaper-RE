package F8;

import K8.C0911d;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {
    public static final L a(p129m8.i iVar) {
        if (iVar.b(InterfaceC0846x0.f1901e) == null) {
            iVar = iVar.z(B0.b(null, 1, null));
        }
        return new C0911d(iVar);
    }

    public static final L b() {
        return new C0911d(T0.b(null, 1, null).z(C0803b0.c()));
    }

    public static final void c(L l9, CancellationException cancellationException) {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) l9.w0().b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 != null) {
            interfaceC0846x0.f(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l9).toString());
    }

    public static /* synthetic */ void d(L l9, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(l9, cancellationException);
    }

    public static final Object e(p219v8.p pVar, p129m8.e eVar) {
        K8.z zVar = new K8.z(eVar.getContext(), eVar);
        Object objB = L8.b.b(zVar, zVar, pVar);
        if (objB == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objB;
    }

    public static final void f(L l9) {
        A0.j(l9.w0());
    }

    public static final boolean g(L l9) {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) l9.w0().b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 != null) {
            return interfaceC0846x0.a();
        }
        return true;
    }

    public static final L h(L l9, p129m8.i iVar) {
        return new C0911d(l9.w0().z(iVar));
    }
}
