package p180s;

import p170r.AbstractC1696o;
import p170r.C1674d;
import p170r.InterfaceC1678f;
import p170r.O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    private static final int c(O0 o9) {
        int iZ = o9.Z();
        int iA0 = o9.a0();
        while (iA0 >= 0 && !o9.p0(iA0)) {
            iA0 = o9.B0(iA0);
        }
        int iI0 = iA0 + 1;
        int iZ0 = 0;
        while (iI0 < iZ) {
            if (o9.k0(iZ, iI0)) {
                if (o9.p0(iI0)) {
                    iZ0 = 0;
                }
                iI0++;
            } else {
                iZ0 += o9.p0(iI0) ? 1 : o9.z0(iI0);
                iI0 += o9.i0(iI0);
            }
        }
        return iZ0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(O0 o9, C1674d c1674d, InterfaceC1678f interfaceC1678f) {
        int iE = o9.E(c1674d);
        AbstractC1696o.M(o9.Z() < iE);
        e(o9, interfaceC1678f, iE);
        int iC = c(o9);
        while (o9.Z() < iE) {
            if (o9.j0(iE)) {
                if (o9.o0()) {
                    interfaceC1678f.c(o9.y0(o9.Z()));
                    iC = 0;
                }
                o9.d1();
            } else {
                iC += o9.S0();
            }
        }
        AbstractC1696o.M(o9.Z() == iE);
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(O0 o9, InterfaceC1678f interfaceC1678f, int i10) {
        while (!o9.l0(i10)) {
            o9.T0();
            if (o9.p0(o9.a0())) {
                interfaceC1678f.f();
            }
            o9.S();
        }
    }
}
