package S3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n f7272q;

    private l(n nVar) {
        this.f7272q = nVar;
    }

    public static Runnable a(n nVar) {
        return new l(nVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        n nVar = this.f7272q;
        nVar.f7277d.a(m.b(nVar));
    }
}
