package S4;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map.Entry f7334q;

    private r(Map.Entry entry, X4.a aVar) {
        this.f7334q = entry;
    }

    public static Runnable a(Map.Entry entry, X4.a aVar) {
        return new r(entry, aVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        s.c(this.f7334q, null);
    }
}
