package F8;

/* JADX INFO: loaded from: classes2.dex */
final class P0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final I f1830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC0822l f1831r;

    public P0(I i10, InterfaceC0822l interfaceC0822l) {
        this.f1830q = i10;
        this.f1831r = interfaceC0822l;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1831r.q(this.f1830q, p079h8.A.f21846a);
    }
}
