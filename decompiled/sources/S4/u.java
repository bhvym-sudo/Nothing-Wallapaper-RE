package S4;

/* JADX INFO: loaded from: classes.dex */
public class u implements Y4.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f7338c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f7339a = f7338c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Y4.b f7340b;

    public u(Y4.b bVar) {
        this.f7340b = bVar;
    }

    @Override // Y4.b
    public Object get() {
        Object obj;
        Object obj2 = this.f7339a;
        Object obj3 = f7338c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7339a;
                if (obj == obj3) {
                    obj = this.f7340b.get();
                    this.f7339a = obj;
                    this.f7340b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
