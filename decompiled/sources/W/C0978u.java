package W;

/* JADX INFO: renamed from: W.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0978u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f8627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f8630g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f8624a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8625b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f8631h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f8632i = I.P.f2686a.a();

    public final void a(I.z zVar) {
        this.f8624a = zVar.d();
        this.f8625b = zVar.u();
        this.f8626c = zVar.q();
        this.f8627d = zVar.n();
        this.f8628e = zVar.r();
        this.f8629f = zVar.k();
        this.f8630g = zVar.m();
        this.f8631h = zVar.p();
        this.f8632i = zVar.G();
    }

    public final void b(C0978u c0978u) {
        this.f8624a = c0978u.f8624a;
        this.f8625b = c0978u.f8625b;
        this.f8626c = c0978u.f8626c;
        this.f8627d = c0978u.f8627d;
        this.f8628e = c0978u.f8628e;
        this.f8629f = c0978u.f8629f;
        this.f8630g = c0978u.f8630g;
        this.f8631h = c0978u.f8631h;
        this.f8632i = c0978u.f8632i;
    }

    public final boolean c(C0978u c0978u) {
        return this.f8624a == c0978u.f8624a && this.f8625b == c0978u.f8625b && this.f8626c == c0978u.f8626c && this.f8627d == c0978u.f8627d && this.f8628e == c0978u.f8628e && this.f8629f == c0978u.f8629f && this.f8630g == c0978u.f8630g && this.f8631h == c0978u.f8631h && I.P.c(this.f8632i, c0978u.f8632i);
    }
}
