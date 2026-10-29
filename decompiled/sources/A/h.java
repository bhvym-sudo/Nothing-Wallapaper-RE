package A;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p219v8.l f21g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22h;

    public h(int i10, n nVar, p219v8.l lVar) {
        super(i10, nVar, null);
        this.f21g = lVar;
        this.f22h = 1;
    }

    @Override // A.k
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p219v8.l h() {
        return this.f21g;
    }

    @Override // A.k
    public void d() {
        if (e()) {
            return;
        }
        n(this);
        super.d();
    }

    @Override // A.k
    public boolean i() {
        return true;
    }

    @Override // A.k
    public p219v8.l k() {
        return null;
    }

    @Override // A.k
    public void m(k kVar) {
        this.f22h++;
    }

    @Override // A.k
    public void n(k kVar) {
        int i10 = this.f22h - 1;
        this.f22h = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // A.k
    public void o() {
    }

    @Override // A.k
    public void p(u uVar) {
        p.Z();
        throw new p079h8.f();
    }

    @Override // A.k
    public k x(p219v8.l lVar) {
        p.g0(this);
        return new e(f(), g(), p.L(lVar, h(), false, 4, null), this);
    }
}
