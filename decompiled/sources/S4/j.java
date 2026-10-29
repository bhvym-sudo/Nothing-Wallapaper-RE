package S4;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z f7310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Y4.b f7311r;

    private j(z zVar, Y4.b bVar) {
        this.f7310q = zVar;
        this.f7311r = bVar;
    }

    public static Runnable a(z zVar, Y4.b bVar) {
        return new j(zVar, bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7310q.d(this.f7311r);
    }
}
