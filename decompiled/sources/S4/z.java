package S4;

/* JADX INFO: loaded from: classes.dex */
class z implements Y4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Y4.a f7345c = x.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Y4.b f7346d = y.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Y4.a f7347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Y4.b f7348b;

    private z(Y4.a aVar, Y4.b bVar) {
        this.f7347a = aVar;
        this.f7348b = bVar;
    }

    static z a() {
        return new z(f7345c, f7346d);
    }

    static /* synthetic */ void b(Y4.b bVar) {
    }

    static /* synthetic */ Object c() {
        return null;
    }

    void d(Y4.b bVar) {
        Y4.a aVar;
        if (this.f7348b != f7346d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f7347a;
            this.f7347a = null;
            this.f7348b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // Y4.b
    public Object get() {
        return this.f7348b.get();
    }
}
