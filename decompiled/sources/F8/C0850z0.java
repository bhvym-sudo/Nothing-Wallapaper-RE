package F8;

/* JADX INFO: renamed from: F8.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0850z0 extends D0 implements InterfaceC0847y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f1909s;

    public C0850z0(InterfaceC0846x0 interfaceC0846x0) {
        super(true);
        h0(interfaceC0846x0);
        this.f1909s = S0();
    }

    private final boolean S0() {
        D0 d0U;
        InterfaceC0835s interfaceC0835sA0 = a0();
        C0837t c0837t = interfaceC0835sA0 instanceof C0837t ? (C0837t) interfaceC0835sA0 : null;
        if (c0837t != null && (d0U = c0837t.u()) != null) {
            while (!d0U.V()) {
                InterfaceC0835s interfaceC0835sA1 = d0U.a0();
                C0837t c0837t2 = interfaceC0835sA1 instanceof C0837t ? (C0837t) interfaceC0835sA1 : null;
                if (c0837t2 == null || (d0U = c0837t2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // F8.D0
    public boolean V() {
        return this.f1909s;
    }

    @Override // F8.D0
    public boolean W() {
        return true;
    }
}
