package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V0 f1836a = new V0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f1837b = K8.L.a(new K8.D("ThreadLocalEventLoop"));

    private V0() {
    }

    public final AbstractC0815h0 a() {
        return (AbstractC0815h0) f1837b.get();
    }

    public final AbstractC0815h0 b() {
        ThreadLocal threadLocal = f1837b;
        AbstractC0815h0 abstractC0815h0 = (AbstractC0815h0) threadLocal.get();
        if (abstractC0815h0 != null) {
            return abstractC0815h0;
        }
        AbstractC0815h0 abstractC0815h0A = AbstractC0821k0.a();
        threadLocal.set(abstractC0815h0A);
        return abstractC0815h0A;
    }

    public final void c() {
        f1837b.set(null);
    }

    public final void d(AbstractC0815h0 abstractC0815h0) {
        f1837b.set(abstractC0815h0);
    }
}
