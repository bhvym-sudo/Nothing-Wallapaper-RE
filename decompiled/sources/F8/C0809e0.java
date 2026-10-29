package F8;

/* JADX INFO: renamed from: F8.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0809e0 implements InterfaceC0820k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC0807d0 f1863q;

    public C0809e0(InterfaceC0807d0 interfaceC0807d0) {
        this.f1863q = interfaceC0807d0;
    }

    @Override // F8.InterfaceC0820k
    public void e(Throwable th) {
        this.f1863q.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f1863q + ']';
    }
}
