package M3;

/* JADX INFO: loaded from: classes.dex */
final class p implements K3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f4976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K3.b f4978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K3.e f4979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f4980e;

    p(m mVar, String str, K3.b bVar, K3.e eVar, q qVar) {
        this.f4976a = mVar;
        this.f4977b = str;
        this.f4978c = bVar;
        this.f4979d = eVar;
        this.f4980e = qVar;
    }

    static /* synthetic */ void b(Exception exc) {
    }

    @Override // K3.f
    public void a(K3.c cVar) {
        c(cVar, o.b());
    }

    public void c(K3.c cVar, K3.h hVar) {
        this.f4980e.a(l.a().e(this.f4976a).c(cVar).f(this.f4977b).d(this.f4979d).b(this.f4978c).a(), hVar);
    }
}
