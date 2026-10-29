package p180s;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p170r.AbstractC1675d0;
import p170r.AbstractC1696o;
import p170r.AbstractC1700q;
import p170r.C1674d;
import p170r.C1677e0;
import p170r.C1692m;
import p170r.F0;
import p170r.InterfaceC1698p;
import p170r.K0;
import p170r.L0;
import p170r.Q;
import p170r.a1;
import p219v8.l;
import p240y.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f27576m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f27577n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1692m f27578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p180s.a f27579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27580c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27584g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27589l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f27581d = new Q();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27582e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a1 f27585h = new a1();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27586i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27587j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27588k = -1;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(C1692m c1692m, p180s.a aVar) {
        this.f27578a = c1692m;
        this.f27579b = aVar;
    }

    private final void A() {
        int i10 = this.f27584g;
        if (i10 > 0) {
            this.f27579b.D(i10);
            this.f27584g = 0;
        }
        if (this.f27585h.d()) {
            this.f27579b.j(this.f27585h.i());
            this.f27585h.a();
        }
    }

    private final void B() {
        H(this, false, 1, null);
        J();
    }

    private final void C(boolean z9) {
        G(z9);
    }

    static /* synthetic */ void D(b bVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        bVar.C(z9);
    }

    private final void E(int i10, int i11, int i12) {
        z();
        this.f27579b.t(i10, i11, i12);
    }

    private final void F() {
        int i10 = this.f27589l;
        if (i10 > 0) {
            int i11 = this.f27586i;
            if (i11 >= 0) {
                I(i11, i10);
                this.f27586i = -1;
            } else {
                E(this.f27588k, this.f27587j, i10);
                this.f27587j = -1;
                this.f27588k = -1;
            }
            this.f27589l = 0;
        }
    }

    private final void G(boolean z9) {
        int iT = z9 ? p().t() : p().j();
        int i10 = iT - this.f27583f;
        if (!(i10 >= 0)) {
            AbstractC1696o.r("Tried to seek backward");
        }
        if (i10 > 0) {
            this.f27579b.e(i10);
            this.f27583f = iT;
        }
    }

    static /* synthetic */ void H(b bVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        bVar.G(z9);
    }

    private final void I(int i10, int i11) {
        z();
        this.f27579b.w(i10, i11);
    }

    private final void j(C1674d c1674d) {
        D(this, false, 1, null);
        this.f27579b.n(c1674d);
        this.f27580c = true;
    }

    private final void k() {
        if (this.f27580c || !this.f27582e) {
            return;
        }
        D(this, false, 1, null);
        this.f27579b.o();
        this.f27580c = true;
    }

    private final K0 p() {
        return this.f27578a.g0();
    }

    private final void z() {
        A();
    }

    public final void J() {
        K0 k0P;
        int iT;
        if (p().w() <= 0 || this.f27581d.h(-2) == (iT = (k0P = p()).t())) {
            return;
        }
        k();
        if (iT > 0) {
            C1674d c1674dA = k0P.a(iT);
            this.f27581d.j(iT);
            j(c1674dA);
        }
    }

    public final void K(F0 f10) {
        this.f27579b.u(f10);
    }

    public final void L() {
        B();
        this.f27579b.v();
        this.f27583f += p().o();
    }

    public final void M(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                AbstractC1696o.r("Invalid remove index " + i10);
            }
            if (this.f27586i == i10) {
                this.f27589l += i11;
                return;
            }
            F();
            this.f27586i = i10;
            this.f27589l = i11;
        }
    }

    public final void N() {
        this.f27579b.x();
    }

    public final void O() {
        this.f27580c = false;
        this.f27581d.a();
        this.f27583f = 0;
    }

    public final void P(p180s.a aVar) {
        this.f27579b = aVar;
    }

    public final void Q(boolean z9) {
        this.f27582e = z9;
    }

    public final void R() {
        this.f27579b.y();
    }

    public final void S(int i10) {
        if (i10 > 0) {
            B();
            this.f27579b.z(i10);
        }
    }

    public final void T(Object obj, C1674d c1674d, int i10) {
        this.f27579b.A(obj, c1674d, i10);
    }

    public final void U(Object obj) {
        D(this, false, 1, null);
        this.f27579b.B(obj);
    }

    public final void V(Object obj, int i10) {
        C(true);
        this.f27579b.C(obj, i10);
    }

    public final void a(C1674d c1674d, Object obj) {
        this.f27579b.f(c1674d, obj);
    }

    public final void b(List list, d dVar) {
        this.f27579b.g(list, dVar);
    }

    public final void c(AbstractC1675d0 abstractC1675d0, AbstractC1700q abstractC1700q, C1677e0 c1677e0, C1677e0 c1677e1) {
        this.f27579b.h(abstractC1675d0, abstractC1700q, c1677e0, c1677e1);
    }

    public final void d(d dVar, C1674d c1674d) {
        A();
        this.f27579b.i(dVar, c1674d);
    }

    public final void e(l lVar, InterfaceC1698p interfaceC1698p) {
        this.f27579b.k(lVar, interfaceC1698p);
    }

    public final void f() {
        int iT = p().t();
        if (!(this.f27581d.h(-1) <= iT)) {
            AbstractC1696o.r("Missed recording an endGroup");
        }
        if (this.f27581d.h(-1) == iT) {
            D(this, false, 1, null);
            this.f27581d.i();
            this.f27579b.l();
        }
    }

    public final void g() {
        this.f27579b.m();
        this.f27583f = 0;
    }

    public final void h() {
        F();
    }

    public final void i() {
        if (this.f27580c) {
            D(this, false, 1, null);
            D(this, false, 1, null);
            this.f27579b.l();
            this.f27580c = false;
        }
    }

    public final void l() {
        A();
        if (this.f27581d.d()) {
            return;
        }
        AbstractC1696o.r("Missed recording an endGroup()");
    }

    public final p180s.a m() {
        return this.f27579b;
    }

    public final boolean n() {
        return this.f27582e;
    }

    public final boolean o() {
        return p().t() - this.f27583f < 0;
    }

    public final void q(p180s.a aVar, d dVar) {
        this.f27579b.p(aVar, dVar);
    }

    public final void r(C1674d c1674d, L0 l9) {
        A();
        B();
        F();
        this.f27579b.q(c1674d, l9);
    }

    public final void s(C1674d c1674d, L0 l9, c cVar) {
        A();
        B();
        F();
        this.f27579b.r(c1674d, l9, cVar);
    }

    public final void t(int i10) {
        B();
        this.f27579b.s(i10);
    }

    public final void u(Object obj) {
        F();
        this.f27585h.h(obj);
    }

    public final void v(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f27589l;
            if (i13 > 0 && this.f27587j == i10 - i13 && this.f27588k == i11 - i13) {
                this.f27589l = i13 + i12;
                return;
            }
            F();
            this.f27587j = i10;
            this.f27588k = i11;
            this.f27589l = i12;
        }
    }

    public final void w(int i10) {
        this.f27583f += i10 - p().j();
    }

    public final void x(int i10) {
        this.f27583f = i10;
    }

    public final void y() {
        F();
        if (this.f27585h.d()) {
            this.f27585h.g();
        } else {
            this.f27584g++;
        }
    }
}
