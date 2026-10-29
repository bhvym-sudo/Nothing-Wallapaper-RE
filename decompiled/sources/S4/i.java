package S4;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class i implements Y4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f7308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7309b;

    private i(m mVar, c cVar) {
        this.f7308a = mVar;
        this.f7309b = cVar;
    }

    public static Y4.b a(m mVar, c cVar) {
        return new i(mVar, cVar);
    }

    @Override // Y4.b
    public Object get() {
        m mVar = this.f7308a;
        c cVar = this.f7309b;
        return cVar.d().a(new B(cVar, mVar));
    }
}
