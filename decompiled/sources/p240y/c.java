package p240y;

import kotlin.jvm.internal.n;
import p170r.AbstractC1696o;
import p170r.C1714x0;
import p170r.InterfaceC1690l;
import p170r.InterfaceC1712w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f30090a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final a b(int i10, boolean z9, Object obj) {
        return new b(i10, z9, obj);
    }

    public static final int c(int i10) {
        return a(2, i10);
    }

    public static final a d(int i10, boolean z9, Object obj, InterfaceC1690l interfaceC1690l, int i11) {
        if (AbstractC1696o.G()) {
            AbstractC1696o.O(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object objD = interfaceC1690l.d();
        if (objD == InterfaceC1690l.f25468a.a()) {
            objD = new b(i10, z9, obj);
            interfaceC1690l.q(objD);
        }
        b bVar = (b) objD;
        bVar.k(obj);
        if (AbstractC1696o.G()) {
            AbstractC1696o.N();
        }
        return bVar;
    }

    public static final boolean e(InterfaceC1712w0 interfaceC1712w0, InterfaceC1712w0 interfaceC1712w1) {
        if (interfaceC1712w0 == null) {
            return true;
        }
        if (!(interfaceC1712w0 instanceof C1714x0) || !(interfaceC1712w1 instanceof C1714x0)) {
            return false;
        }
        C1714x0 c1714x0 = (C1714x0) interfaceC1712w0;
        return !c1714x0.q() || n.d(interfaceC1712w0, interfaceC1712w1) || n.d(c1714x0.i(), ((C1714x0) interfaceC1712w1).i());
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
