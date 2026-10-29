package F8;

/* JADX INFO: renamed from: F8.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0811f0 extends C0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final InterfaceC0807d0 f1865u;

    public C0811f0(InterfaceC0807d0 interfaceC0807d0) {
        this.f1865u = interfaceC0807d0;
    }

    @Override // F8.C0
    public boolean v() {
        return false;
    }

    @Override // F8.C0
    public void w(Throwable th) {
        this.f1865u.dispose();
    }
}
