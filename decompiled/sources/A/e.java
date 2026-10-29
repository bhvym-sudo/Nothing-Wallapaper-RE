package A;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p219v8.l f18g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final k f19h;

    public e(int i10, n nVar, p219v8.l lVar, k kVar) {
        super(i10, nVar, null);
        this.f18g = lVar;
        this.f19h = kVar;
        kVar.m(this);
    }

    @Override // A.k
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public p219v8.l h() {
        return this.f18g;
    }

    @Override // A.k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void p(u uVar) {
        p.Z();
        throw new p079h8.f();
    }

    @Override // A.k
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public e x(p219v8.l lVar) {
        return new e(f(), g(), p.L(lVar, h(), false, 4, null), this.f19h);
    }

    @Override // A.k
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.f19h.f()) {
            b();
        }
        this.f19h.n(this);
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
    public void o() {
    }
}
