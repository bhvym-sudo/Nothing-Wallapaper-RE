package I8;

import F8.InterfaceC0846x0;

/* JADX INFO: loaded from: classes2.dex */
final class B implements E, InterfaceC0880f, J8.q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ E f3137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC0846x0 f3138r;

    public B(E e10, InterfaceC0846x0 interfaceC0846x0) {
        this.f3137q = e10;
        this.f3138r = interfaceC0846x0;
    }

    @Override // I8.E, I8.InterfaceC0880f
    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        return this.f3137q.a(interfaceC0881g, eVar);
    }

    @Override // J8.q
    public InterfaceC0880f e(p129m8.i iVar, int i10, H8.a aVar) {
        return G.e(this, iVar, i10, aVar);
    }
}
