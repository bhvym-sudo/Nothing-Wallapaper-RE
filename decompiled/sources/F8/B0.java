package F8;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class B0 {

    /* synthetic */ class a extends kotlin.jvm.internal.l implements p219v8.l {
        a(Object obj) {
            super(1, obj, C0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            g((Throwable) obj);
            return p079h8.A.f21846a;
        }

        public final void g(Throwable th) {
            ((C0) this.receiver).w(th);
        }
    }

    public static final InterfaceC0847y a(InterfaceC0846x0 interfaceC0846x0) {
        return new C0850z0(interfaceC0846x0);
    }

    public static /* synthetic */ InterfaceC0847y b(InterfaceC0846x0 interfaceC0846x0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0846x0 = null;
        }
        return A0.a(interfaceC0846x0);
    }

    public static final void c(InterfaceC0846x0 interfaceC0846x0, String str, Throwable th) {
        interfaceC0846x0.f(AbstractC0825m0.a(str, th));
    }

    public static final void d(p129m8.i iVar, CancellationException cancellationException) {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 != null) {
            interfaceC0846x0.f(cancellationException);
        }
    }

    public static /* synthetic */ void e(InterfaceC0846x0 interfaceC0846x0, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        A0.c(interfaceC0846x0, str, th);
    }

    public static /* synthetic */ void f(p129m8.i iVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        A0.d(iVar, cancellationException);
    }

    public static final Object g(InterfaceC0846x0 interfaceC0846x0, p129m8.e eVar) {
        InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        Object objQ = interfaceC0846x0.Q(eVar);
        return objQ == p139n8.b.e() ? objQ : p079h8.A.f21846a;
    }

    public static final InterfaceC0807d0 h(InterfaceC0846x0 interfaceC0846x0, InterfaceC0807d0 interfaceC0807d0) {
        return m(interfaceC0846x0, false, new C0811f0(interfaceC0807d0), 1, null);
    }

    public static final void i(InterfaceC0846x0 interfaceC0846x0) {
        if (!interfaceC0846x0.a()) {
            throw interfaceC0846x0.K();
        }
    }

    public static final void j(p129m8.i iVar) {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 != null) {
            A0.i(interfaceC0846x0);
        }
    }

    public static final InterfaceC0846x0 k(p129m8.i iVar) {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 != null) {
            return interfaceC0846x0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final InterfaceC0807d0 l(InterfaceC0846x0 interfaceC0846x0, boolean z9, C0 c10) {
        return interfaceC0846x0 instanceof D0 ? ((D0) interfaceC0846x0).i0(z9, c10) : interfaceC0846x0.I(c10.v(), z9, new a(c10));
    }

    public static /* synthetic */ InterfaceC0807d0 m(InterfaceC0846x0 interfaceC0846x0, boolean z9, C0 c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return A0.l(interfaceC0846x0, z9, c10);
    }
}
