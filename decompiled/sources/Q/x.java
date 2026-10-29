package Q;

import W.C0975q;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W.B f6582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f6583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u f6584c = new u();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0975q f6585d = new C0975q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6586e;

    public x(W.B b10) {
        this.f6582a = b10;
        this.f6583b = new d(b10.d());
    }

    public final void a() {
        this.f6583b.b();
    }

    public final int b(v vVar, B b10, boolean z9) {
        int i10;
        boolean z10;
        if (this.f6586e) {
            return y.a(false, false);
        }
        boolean z11 = true;
        try {
            this.f6586e = true;
            e eVarB = this.f6584c.b(vVar, b10);
            int iO = eVarB.b().o();
            while (true) {
                if (i10 >= iO) {
                    z10 = true;
                    break;
                }
                t tVar = (t) eVarB.b().p(i10);
                i10 = (tVar.g() || tVar.i()) ? 0 : i10 + 1;
                z10 = false;
                break;
            }
            int iO2 = eVarB.b().o();
            for (int i11 = 0; i11 < iO2; i11++) {
                t tVar2 = (t) eVarB.b().p(i11);
                if (z10 || l.a(tVar2)) {
                    W.B.h0(this.f6582a, tVar2.f(), this.f6585d, A.g(tVar2.j(), A.f6488a.d()), false, 8, null);
                    if (!this.f6585d.isEmpty()) {
                        this.f6583b.a(tVar2.e(), this.f6585d, l.a(tVar2));
                        this.f6585d.clear();
                    }
                }
            }
            this.f6583b.e();
            boolean zC = this.f6583b.c(eVarB, z9);
            if (eVarB.d()) {
                z11 = false;
                break;
            }
            int iO3 = eVarB.b().o();
            int i12 = 0;
            while (true) {
                if (i12 >= iO3) {
                    z11 = false;
                    break;
                }
                t tVar3 = (t) eVarB.b().p(i12);
                if (l.e(tVar3) && tVar3.k()) {
                    break;
                }
                i12++;
            }
            return y.a(zC, z11);
        } finally {
            this.f6586e = false;
        }
    }

    public final void c() {
        if (this.f6586e) {
            return;
        }
        this.f6584c.a();
        this.f6583b.d();
    }
}
