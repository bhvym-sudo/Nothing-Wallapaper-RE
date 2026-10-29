package F8;

/* JADX INFO: renamed from: F8.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0845x {
    public static final InterfaceC0841v a(InterfaceC0846x0 interfaceC0846x0) {
        return new C0843w(interfaceC0846x0);
    }

    public static /* synthetic */ InterfaceC0841v b(InterfaceC0846x0 interfaceC0846x0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0846x0 = null;
        }
        return a(interfaceC0846x0);
    }

    public static final boolean c(InterfaceC0841v interfaceC0841v, Object obj) {
        Throwable thD = p079h8.q.d(obj);
        return thD == null ? interfaceC0841v.B0(obj) : interfaceC0841v.A0(thD);
    }
}
