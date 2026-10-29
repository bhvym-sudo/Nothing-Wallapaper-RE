package S3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class i implements U3.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7257c;

    private i(j jVar, M3.m mVar, int i10) {
        this.f7255a = jVar;
        this.f7256b = mVar;
        this.f7257c = i10;
    }

    public static U3.b.a b(j jVar, M3.m mVar, int i10) {
        return new i(jVar, mVar, i10);
    }

    @Override // U3.b.a
    public Object a() {
        return j.d(this.f7255a, this.f7256b, this.f7257c);
    }
}
