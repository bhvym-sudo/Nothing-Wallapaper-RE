package S3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f7243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final M3.m f7244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f7245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f7246t;

    private e(j jVar, M3.m mVar, int i10, Runnable runnable) {
        this.f7243q = jVar;
        this.f7244r = mVar;
        this.f7245s = i10;
        this.f7246t = runnable;
    }

    public static Runnable a(j jVar, M3.m mVar, int i10, Runnable runnable) {
        return new e(jVar, mVar, i10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        j.e(this.f7243q, this.f7244r, this.f7245s, this.f7246t);
    }
}
