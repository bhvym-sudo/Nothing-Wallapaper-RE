package F8;

import K8.C0915h;

/* JADX INFO: renamed from: F8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0830p {
    public static final void a(InterfaceC0822l interfaceC0822l, InterfaceC0807d0 interfaceC0807d0) {
        c(interfaceC0822l, new C0809e0(interfaceC0807d0));
    }

    public static final C0826n b(p129m8.e eVar) {
        if (!(eVar instanceof C0915h)) {
            return new C0826n(eVar, 1);
        }
        C0826n c0826nL = ((C0915h) eVar).l();
        if (c0826nL != null) {
            if (!c0826nL.Q()) {
                c0826nL = null;
            }
            if (c0826nL != null) {
                return c0826nL;
            }
        }
        return new C0826n(eVar, 2);
    }

    public static final void c(InterfaceC0822l interfaceC0822l, InterfaceC0820k interfaceC0820k) {
        if (!(interfaceC0822l instanceof C0826n)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C0826n) interfaceC0822l).J(interfaceC0820k);
    }
}
