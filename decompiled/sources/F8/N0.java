package F8;

/* JADX INFO: loaded from: classes2.dex */
final class N0 extends C0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C0826n f1828u;

    public N0(C0826n c0826n) {
        this.f1828u = c0826n;
    }

    @Override // F8.C0
    public boolean v() {
        return false;
    }

    @Override // F8.C0
    public void w(Throwable th) {
        Object objC0 = u().c0();
        if (objC0 instanceof A) {
            C0826n c0826n = this.f1828u;
            h8.q.a aVar = p079h8.q.f21862r;
            c0826n.resumeWith(p079h8.q.b(p079h8.r.a(((A) objC0).f1787a)));
        } else {
            C0826n c0826n2 = this.f1828u;
            h8.q.a aVar2 = p079h8.q.f21862r;
            c0826n2.resumeWith(p079h8.q.b(E0.h(objC0)));
        }
    }
}
