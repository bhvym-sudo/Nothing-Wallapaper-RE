package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class M implements InterfaceC1160u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f13298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1144d.a f13299r;

    M(Object obj) {
        this.f13298q = obj;
        this.f13299r = C1144d.f13384c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
        this.f13299r.a(interfaceC1163x, aVar, this.f13298q);
    }
}
