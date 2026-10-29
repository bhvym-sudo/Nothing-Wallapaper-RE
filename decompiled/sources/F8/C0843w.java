package F8;

/* JADX INFO: renamed from: F8.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0843w extends D0 implements InterfaceC0841v {
    public C0843w(InterfaceC0846x0 interfaceC0846x0) {
        super(true);
        h0(interfaceC0846x0);
    }

    @Override // F8.InterfaceC0841v
    public boolean A0(Throwable th) {
        return n0(new A(th, false, 2, null));
    }

    @Override // F8.InterfaceC0841v
    public boolean B0(Object obj) {
        return n0(obj);
    }

    @Override // F8.T
    public Object P0(p129m8.e eVar) throws Throwable {
        Object objA = A(eVar);
        p139n8.b.e();
        return objA;
    }

    @Override // F8.D0
    public boolean W() {
        return true;
    }
}
