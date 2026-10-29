package S3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class f implements U3.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f7247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7248b;

    private f(j jVar, M3.m mVar) {
        this.f7247a = jVar;
        this.f7248b = mVar;
    }

    public static U3.b.a b(j jVar, M3.m mVar) {
        return new f(jVar, mVar);
    }

    @Override // U3.b.a
    public Object a() {
        return this.f7247a.f7260c.E0(this.f7248b);
    }
}
