package p170r;

import p129m8.i;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final I f25326a = new I();

    public static final void a(Object obj, l lVar, InterfaceC1690l interfaceC1690l, int i10) {
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zS = interfaceC1690l.s(obj);
        Object objD = interfaceC1690l.d();
        if (zS || objD == InterfaceC1690l.f25468a.a()) {
            objD = new G(lVar);
            interfaceC1690l.q(objD);
        }
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
    }

    public static final void b(Object obj, p pVar, InterfaceC1690l interfaceC1690l, int i10) {
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        i iVarN = interfaceC1690l.n();
        boolean zS = interfaceC1690l.s(obj);
        Object objD = interfaceC1690l.d();
        if (zS || objD == InterfaceC1690l.f25468a.a()) {
            objD = new X(iVarN, pVar);
            interfaceC1690l.q(objD);
        }
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
    }
}
