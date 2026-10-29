package A;

import androidx.collection.F;
import p170r.AbstractC1672c;

/* JADX INFO: loaded from: classes.dex */
public final class x extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c f103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p219v8.l f106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p219v8.l f107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f108x;

    public x(c cVar, p219v8.l lVar, p219v8.l lVar2, boolean z9, boolean z10) {
        p219v8.l lVarK;
        p219v8.l lVarH;
        super(0, n.f38u.a(), p.K(lVar, (cVar == null || (lVarH = cVar.h()) == null) ? ((a) p.f59j.get()).h() : lVarH, z9), p.M(lVar2, (cVar == null || (lVarK = cVar.k()) == null) ? ((a) p.f59j.get()).k() : lVarK));
        this.f103s = cVar;
        this.f104t = z9;
        this.f105u = z10;
        this.f106v = super.h();
        this.f107w = super.k();
        this.f108x = AbstractC1672c.a();
    }

    private final c T() {
        c cVar = this.f103s;
        return cVar == null ? (c) p.f59j.get() : cVar;
    }

    @Override // A.c
    public l C() {
        return T().C();
    }

    @Override // A.c
    public F E() {
        return T().E();
    }

    @Override // A.c, A.k
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public p219v8.l h() {
        return this.f106v;
    }

    @Override // A.c
    public void P(F f10) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.c
    public c Q(p219v8.l lVar, p219v8.l lVar2) {
        p219v8.l lVarL = p.L(lVar, h(), false, 4, null);
        p219v8.l lVarM = p.M(lVar2, k());
        return !this.f104t ? new x(T().Q(null, lVarM), lVarL, lVarM, false, true) : T().Q(lVarL, lVarM);
    }

    public final long U() {
        return this.f108x;
    }

    @Override // A.c, A.k
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void m(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.c, A.k
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void n(k kVar) {
        r.a();
        throw new p079h8.f();
    }

    public void X(p219v8.l lVar) {
        this.f106v = lVar;
    }

    public void Y(p219v8.l lVar) {
        this.f107w = lVar;
    }

    @Override // A.c, A.k
    public void d() {
        c cVar;
        t(true);
        if (!this.f105u || (cVar = this.f103s) == null) {
            return;
        }
        cVar.d();
    }

    @Override // A.k
    public int f() {
        return T().f();
    }

    @Override // A.k
    public n g() {
        return T().g();
    }

    @Override // A.c, A.k
    public boolean i() {
        return T().i();
    }

    @Override // A.c, A.k
    public int j() {
        return T().j();
    }

    @Override // A.c, A.k
    public p219v8.l k() {
        return this.f107w;
    }

    @Override // A.c, A.k
    public void o() {
        T().o();
    }

    @Override // A.c, A.k
    public void p(u uVar) {
        T().p(uVar);
    }

    @Override // A.k
    public void u(int i10) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.k
    public void v(n nVar) {
        r.a();
        throw new p079h8.f();
    }

    @Override // A.c, A.k
    public void w(int i10) {
        T().w(i10);
    }

    @Override // A.c, A.k
    public k x(p219v8.l lVar) {
        p219v8.l lVarL = p.L(lVar, h(), false, 4, null);
        return !this.f104t ? p.D(T().x(null), lVarL, true) : T().x(lVarL);
    }
}
