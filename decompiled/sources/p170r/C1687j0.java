package p170r;

/* JADX INFO: renamed from: r.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1687j0 implements InterfaceC1678f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1678f f25463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25465c;

    public C1687j0(InterfaceC1678f interfaceC1678f, int i10) {
        this.f25463a = interfaceC1678f;
        this.f25464b = i10;
    }

    @Override // p170r.InterfaceC1678f
    public void a(int i10, int i11) {
        this.f25463a.a(i10 + (this.f25465c == 0 ? this.f25464b : 0), i11);
    }

    @Override // p170r.InterfaceC1678f
    public void b(int i10, Object obj) {
        this.f25463a.b(i10 + (this.f25465c == 0 ? this.f25464b : 0), obj);
    }

    @Override // p170r.InterfaceC1678f
    public void c(Object obj) {
        this.f25465c++;
        this.f25463a.c(obj);
    }

    @Override // p170r.InterfaceC1678f
    public void clear() {
        AbstractC1696o.r("Clear is not valid on OffsetApplier");
    }

    @Override // p170r.InterfaceC1678f
    public void e(int i10, int i11, int i12) {
        int i13 = this.f25465c == 0 ? this.f25464b : 0;
        this.f25463a.e(i10 + i13, i11 + i13, i12);
    }

    @Override // p170r.InterfaceC1678f
    public void f() {
        if (!(this.f25465c > 0)) {
            AbstractC1696o.r("OffsetApplier up called with no corresponding down");
        }
        this.f25465c--;
        this.f25463a.f();
    }

    @Override // p170r.InterfaceC1678f
    public void g(int i10, Object obj) {
        this.f25463a.g(i10 + (this.f25465c == 0 ? this.f25464b : 0), obj);
    }
}
