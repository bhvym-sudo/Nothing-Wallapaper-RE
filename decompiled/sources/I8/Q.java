package I8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K8.D f3204a = new K8.D("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K8.D f3205b = new K8.D("PENDING");

    public static final A a(Object obj) {
        if (obj == null) {
            obj = J8.t.f3956a;
        }
        return new P(obj);
    }

    public static final InterfaceC0880f d(O o9, p129m8.i iVar, int i10, H8.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != H8.a.DROP_OLDEST) ? G.e(o9, iVar, i10, aVar) : o9;
    }
}
