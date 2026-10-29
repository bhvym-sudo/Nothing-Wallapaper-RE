package p025c4;

/* JADX INFO: renamed from: c4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1203q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C1203q f15213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r f15214c = new r(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f15215a;

    private C1203q() {
    }

    public static synchronized C1203q b() {
        try {
            if (f15213b == null) {
                f15213b = new C1203q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15213b;
    }

    public r a() {
        return this.f15215a;
    }

    public final synchronized void c(r rVar) {
        try {
            if (rVar == null) {
                this.f15215a = f15214c;
                return;
            }
            r rVar2 = this.f15215a;
            if (rVar2 == null || rVar2.e() < rVar.e()) {
                this.f15215a = rVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
