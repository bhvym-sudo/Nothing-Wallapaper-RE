package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f1834a = K8.E.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V f1835b = b();

    public static final V a() {
        return f1835b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V b() {
        if (!f1834a) {
            return Q.f1832y;
        }
        H0 h0C = C0803b0.c();
        return (K8.t.c(h0C) || !(h0C instanceof V)) ? Q.f1832y : (V) h0C;
    }
}
