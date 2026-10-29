package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T0 {
    public static final InterfaceC0847y a(InterfaceC0846x0 interfaceC0846x0) {
        return new S0(interfaceC0846x0);
    }

    public static /* synthetic */ InterfaceC0847y b(InterfaceC0846x0 interfaceC0846x0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0846x0 = null;
        }
        return a(interfaceC0846x0);
    }

    public static final Object c(p219v8.p pVar, p129m8.e eVar) {
        R0 r9 = new R0(eVar.getContext(), eVar);
        Object objB = L8.b.b(r9, r9, pVar);
        if (objB == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objB;
    }
}
