package S3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class g implements U3.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f7249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N3.g f7250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Iterable f7251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M3.m f7252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7253e;

    private g(j jVar, N3.g gVar, Iterable iterable, M3.m mVar, int i10) {
        this.f7249a = jVar;
        this.f7250b = gVar;
        this.f7251c = iterable;
        this.f7252d = mVar;
        this.f7253e = i10;
    }

    public static U3.b.a b(j jVar, N3.g gVar, Iterable iterable, M3.m mVar, int i10) {
        return new g(jVar, gVar, iterable, mVar, i10);
    }

    @Override // U3.b.a
    public Object a() {
        return j.c(this.f7249a, this.f7250b, this.f7251c, this.f7252d, this.f7253e);
    }
}
