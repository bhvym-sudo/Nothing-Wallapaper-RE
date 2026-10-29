package p170r;

import kotlin.jvm.internal.n;
import p240y.e;
import p240y.f;

/* JADX INFO: renamed from: r.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1713x {
    public static final boolean a(InterfaceC1699p0 interfaceC1699p0, AbstractC1707u abstractC1707u) {
        n.f(abstractC1707u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return interfaceC1699p0.containsKey(abstractC1707u);
    }

    public static final Object b(InterfaceC1699p0 interfaceC1699p0, AbstractC1707u abstractC1707u) {
        n.f(abstractC1707u, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objA = interfaceC1699p0.get(abstractC1707u);
        if (objA == null) {
            objA = abstractC1707u.a();
        }
        return ((g1) objA).a(interfaceC1699p0);
    }

    public static final InterfaceC1699p0 c(C1710v0[] c1710v0Arr, InterfaceC1699p0 interfaceC1699p0, InterfaceC1699p0 interfaceC1699p1) {
        e.a aVarJ = f.a().j();
        for (C1710v0 c1710v0 : c1710v0Arr) {
            AbstractC1707u abstractC1707uB = c1710v0.b();
            n.f(abstractC1707uB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            AbstractC1708u0 abstractC1708u0 = (AbstractC1708u0) abstractC1707uB;
            if (c1710v0.a() || !a(interfaceC1699p0, abstractC1708u0)) {
                g1 g1Var = (g1) interfaceC1699p1.get(abstractC1708u0);
                n.f(c1710v0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarJ.put(abstractC1708u0, abstractC1708u0.b(c1710v0, g1Var));
            }
        }
        return aVarJ.f();
    }

    public static /* synthetic */ InterfaceC1699p0 d(C1710v0[] c1710v0Arr, InterfaceC1699p0 interfaceC1699p0, InterfaceC1699p0 interfaceC1699p1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC1699p1 = f.a();
        }
        return c(c1710v0Arr, interfaceC1699p0, interfaceC1699p1);
    }
}
