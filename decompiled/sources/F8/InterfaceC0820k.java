package F8;

/* JADX INFO: renamed from: F8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0820k extends L0 {

    /* JADX INFO: renamed from: F8.k$a */
    public static final class a implements InterfaceC0820k {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final p219v8.l f1880q;

        public a(p219v8.l lVar) {
            this.f1880q = lVar;
        }

        @Override // F8.InterfaceC0820k
        public void e(Throwable th) {
            this.f1880q.f(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + P.a(this.f1880q) + '@' + P.b(this) + ']';
        }
    }

    void e(Throwable th);
}
