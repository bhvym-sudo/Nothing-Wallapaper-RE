package S4;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final v f7312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Y4.b f7313r;

    private k(v vVar, Y4.b bVar) {
        this.f7312q = vVar;
        this.f7313r = bVar;
    }

    public static Runnable a(v vVar, Y4.b bVar) {
        return new k(vVar, bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7312q.a(this.f7313r);
    }
}
