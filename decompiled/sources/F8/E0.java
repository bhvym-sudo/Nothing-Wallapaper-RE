package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K8.D f1807a = new K8.D("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K8.D f1808b = new K8.D("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final K8.D f1809c = new K8.D("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final K8.D f1810d = new K8.D("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final K8.D f1811e = new K8.D("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0813g0 f1812f = new C0813g0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0813g0 f1813g = new C0813g0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0838t0 ? new C0840u0((InterfaceC0838t0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0838t0 interfaceC0838t0;
        C0840u0 c0840u0 = obj instanceof C0840u0 ? (C0840u0) obj : null;
        return (c0840u0 == null || (interfaceC0838t0 = c0840u0.f1897a) == null) ? obj : interfaceC0838t0;
    }
}
