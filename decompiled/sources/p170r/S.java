package p170r;

/* JADX INFO: loaded from: classes.dex */
final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1714x0 f25384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f25386c;

    public S(C1714x0 c1714x0, int i10, Object obj) {
        this.f25384a = c1714x0;
        this.f25385b = i10;
        this.f25386c = obj;
    }

    public final Object a() {
        return this.f25386c;
    }

    public final int b() {
        return this.f25385b;
    }

    public final C1714x0 c() {
        return this.f25384a;
    }

    public final boolean d() {
        return this.f25384a.t(this.f25386c);
    }

    public final void e(Object obj) {
        this.f25386c = obj;
    }
}
