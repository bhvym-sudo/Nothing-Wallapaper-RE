package A;

import p170r.AbstractC1672c;

/* JADX INFO: loaded from: classes.dex */
public final class y extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p219v8.l f112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p219v8.l f113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f115m;

    public y(k kVar, p219v8.l lVar, boolean z9, boolean z10) {
        p219v8.l lVarH;
        super(0, n.f38u.a(), null);
        this.f109g = kVar;
        this.f110h = z9;
        this.f111i = z10;
        this.f112j = p.K(lVar, (kVar == null || (lVarH = kVar.h()) == null) ? ((a) p.f59j.get()).h() : lVarH, z9);
        this.f114l = AbstractC1672c.a();
        this.f115m = this;
    }

    private final k A() {
        k kVar = this.f109g;
        return kVar == null ? (k) p.f59j.get() : kVar;
    }

    @Override // A.k
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p219v8.l h() {
        return this.f112j;
    }

    public final long C() {
        return this.f114l;
    }

    @Override // A.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.k
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    public void F(p219v8.l lVar) {
        this.f112j = lVar;
    }

    @Override // A.k
    public void d() {
        k kVar;
        t(true);
        if (!this.f111i || (kVar = this.f109g) == null) {
            return;
        }
        kVar.d();
    }

    @Override // A.k
    public int f() {
        return A().f();
    }

    @Override // A.k
    public n g() {
        return A().g();
    }

    @Override // A.k
    public boolean i() {
        return A().i();
    }

    @Override // A.k
    public p219v8.l k() {
        return this.f113k;
    }

    @Override // A.k
    public void o() {
        A().o();
    }

    @Override // A.k
    public void p(u uVar) {
        A().p(uVar);
    }

    @Override // A.k
    public k x(p219v8.l lVar) {
        p219v8.l lVarL = p.L(lVar, h(), false, 4, null);
        return !this.f110h ? p.D(A().x(null), lVarL, true) : A().x(lVarL);
    }
}
