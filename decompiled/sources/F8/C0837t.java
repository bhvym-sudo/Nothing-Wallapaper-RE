package F8;

/* JADX INFO: renamed from: F8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0837t extends C0 implements InterfaceC0835s {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0839u f1896u;

    public C0837t(InterfaceC0839u interfaceC0839u) {
        this.f1896u = interfaceC0839u;
    }

    @Override // F8.InterfaceC0835s
    public boolean d(Throwable th) {
        return u().M(th);
    }

    @Override // F8.InterfaceC0835s
    public InterfaceC0846x0 getParent() {
        return u();
    }

    @Override // F8.C0
    public boolean v() {
        return true;
    }

    @Override // F8.C0
    public void w(Throwable th) {
        this.f1896u.q0(u());
    }
}
