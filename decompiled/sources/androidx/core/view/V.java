package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f12222b = i.f12237l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f12223a;

    private static class c extends b {
        c() {
        }

        c(V v9) {
            super(v9);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V f12226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        p191t0.b[] f12227b;

        d() {
            this(new V((V) null));
        }

        protected final void a() {
            p191t0.b[] bVarArr = this.f12227b;
            if (bVarArr != null) {
                p191t0.b bVarF = bVarArr[k.b(1)];
                p191t0.b bVarF2 = this.f12227b[k.b(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f12226a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f12226a.f(1);
                }
                f(p191t0.b.a(bVarF, bVarF2));
                p191t0.b bVar = this.f12227b[k.b(16)];
                if (bVar != null) {
                    e(bVar);
                }
                p191t0.b bVar2 = this.f12227b[k.b(32)];
                if (bVar2 != null) {
                    c(bVar2);
                }
                p191t0.b bVar3 = this.f12227b[k.b(64)];
                if (bVar3 != null) {
                    g(bVar3);
                }
            }
        }

        abstract V b();

        abstract void c(p191t0.b bVar);

        abstract void d(p191t0.b bVar);

        abstract void e(p191t0.b bVar);

        abstract void f(p191t0.b bVar);

        abstract void g(p191t0.b bVar);

        d(V v9) {
            this.f12226a = v9;
        }
    }

    private static class g extends f {
        g(V v9, WindowInsets windowInsets) {
            super(v9, windowInsets);
        }

        @Override // androidx.core.view.V.j
        V a() {
            return V.u(this.f12228c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.V.e, androidx.core.view.V.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f12228c, gVar.f12228c) && Objects.equals(this.f12232g, gVar.f12232g);
        }

        @Override // androidx.core.view.V.j
        C1075g f() {
            return C1075g.e(this.f12228c.getDisplayCutout());
        }

        @Override // androidx.core.view.V.j
        public int hashCode() {
            return this.f12228c.hashCode();
        }

        g(V v9, g gVar) {
            super(v9, gVar);
        }
    }

    private static class i extends h {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final V f12237l = V.u(WindowInsets.CONSUMED);

        i(V v9, WindowInsets windowInsets) {
            super(v9, windowInsets);
        }

        @Override // androidx.core.view.V.e, androidx.core.view.V.j
        final void d(View view) {
        }

        @Override // androidx.core.view.V.e, androidx.core.view.V.j
        public p191t0.b g(int i10) {
            return p191t0.b.c(this.f12228c.getInsets(l.a(i10)));
        }

        i(V v9, i iVar) {
            super(v9, iVar);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final V f12238b = new a().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final V f12239a;

        j(V v9) {
            this.f12239a = v9;
        }

        V a() {
            return this.f12239a;
        }

        V b() {
            return this.f12239a;
        }

        V c() {
            return this.f12239a;
        }

        void d(View view) {
        }

        void e(V v9) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return o() == jVar.o() && n() == jVar.n() && B0.d.a(k(), jVar.k()) && B0.d.a(i(), jVar.i()) && B0.d.a(f(), jVar.f());
        }

        C1075g f() {
            return null;
        }

        p191t0.b g(int i10) {
            return p191t0.b.f27861e;
        }

        p191t0.b h() {
            return k();
        }

        public int hashCode() {
            return B0.d.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        p191t0.b i() {
            return p191t0.b.f27861e;
        }

        p191t0.b j() {
            return k();
        }

        p191t0.b k() {
            return p191t0.b.f27861e;
        }

        p191t0.b l() {
            return k();
        }

        V m(int i10, int i11, int i12, int i13) {
            return f12238b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(p191t0.b[] bVarArr) {
        }

        void q(p191t0.b bVar) {
        }

        void r(V v9) {
        }
    }

    public static final class k {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 2;
        }

        public static int e() {
            return 1;
        }

        public static int f() {
            return 7;
        }
    }

    private static final class l {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    private V(WindowInsets windowInsets) {
        this.f12223a = new i(this, windowInsets);
    }

    static p191t0.b n(p191t0.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f27862a - i10);
        int iMax2 = Math.max(0, bVar.f27863b - i11);
        int iMax3 = Math.max(0, bVar.f27864c - i12);
        int iMax4 = Math.max(0, bVar.f27865d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : p191t0.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static V u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static V v(WindowInsets windowInsets, View view) {
        V v9 = new V((WindowInsets) B0.i.e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            v9.s(H.A(view));
            v9.d(view.getRootView());
        }
        return v9;
    }

    public V a() {
        return this.f12223a.a();
    }

    public V b() {
        return this.f12223a.b();
    }

    public V c() {
        return this.f12223a.c();
    }

    void d(View view) {
        this.f12223a.d(view);
    }

    public C1075g e() {
        return this.f12223a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return B0.d.a(this.f12223a, ((V) obj).f12223a);
        }
        return false;
    }

    public p191t0.b f(int i10) {
        return this.f12223a.g(i10);
    }

    public p191t0.b g() {
        return this.f12223a.i();
    }

    public p191t0.b h() {
        return this.f12223a.j();
    }

    public int hashCode() {
        j jVar = this.f12223a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public int i() {
        return this.f12223a.k().f27865d;
    }

    public int j() {
        return this.f12223a.k().f27862a;
    }

    public int k() {
        return this.f12223a.k().f27864c;
    }

    public int l() {
        return this.f12223a.k().f27863b;
    }

    public V m(int i10, int i11, int i12, int i13) {
        return this.f12223a.m(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f12223a.n();
    }

    public V p(int i10, int i11, int i12, int i13) {
        return new a(this).c(p191t0.b.b(i10, i11, i12, i13)).a();
    }

    void q(p191t0.b[] bVarArr) {
        this.f12223a.p(bVarArr);
    }

    void r(p191t0.b bVar) {
        this.f12223a.q(bVar);
    }

    void s(V v9) {
        this.f12223a.r(v9);
    }

    public WindowInsets t() {
        j jVar = this.f12223a;
        if (jVar instanceof e) {
            return ((e) jVar).f12228c;
        }
        return null;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f12224a;

        public a() {
            this.f12224a = new c();
        }

        public V a() {
            return this.f12224a.b();
        }

        public a b(p191t0.b bVar) {
            this.f12224a.d(bVar);
            return this;
        }

        public a c(p191t0.b bVar) {
            this.f12224a.f(bVar);
            return this;
        }

        public a(V v9) {
            this.f12224a = new c(v9);
        }
    }

    private static class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f12225c;

        b() {
            this.f12225c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.V.d
        V b() {
            a();
            V vU = V.u(this.f12225c.build());
            vU.q(this.f12227b);
            return vU;
        }

        @Override // androidx.core.view.V.d
        void c(p191t0.b bVar) {
            this.f12225c.setMandatorySystemGestureInsets(bVar.d());
        }

        @Override // androidx.core.view.V.d
        void d(p191t0.b bVar) {
            this.f12225c.setStableInsets(bVar.d());
        }

        @Override // androidx.core.view.V.d
        void e(p191t0.b bVar) {
            this.f12225c.setSystemGestureInsets(bVar.d());
        }

        @Override // androidx.core.view.V.d
        void f(p191t0.b bVar) {
            this.f12225c.setSystemWindowInsets(bVar.d());
        }

        @Override // androidx.core.view.V.d
        void g(p191t0.b bVar) {
            this.f12225c.setTappableElementInsets(bVar.d());
        }

        b(V v9) {
            WindowInsets.Builder builder;
            super(v9);
            WindowInsets windowInsetsT = v9.t();
            if (windowInsetsT != null) {
                builder = new WindowInsets.Builder(windowInsetsT);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f12225c = builder;
        }
    }

    private static class f extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p191t0.b f12233h;

        f(V v9, WindowInsets windowInsets) {
            super(v9, windowInsets);
            this.f12233h = null;
        }

        @Override // androidx.core.view.V.j
        V b() {
            return V.u(this.f12228c.consumeStableInsets());
        }

        @Override // androidx.core.view.V.j
        V c() {
            return V.u(this.f12228c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.V.j
        final p191t0.b i() {
            if (this.f12233h == null) {
                this.f12233h = p191t0.b.b(this.f12228c.getStableInsetLeft(), this.f12228c.getStableInsetTop(), this.f12228c.getStableInsetRight(), this.f12228c.getStableInsetBottom());
            }
            return this.f12233h;
        }

        @Override // androidx.core.view.V.j
        boolean n() {
            return this.f12228c.isConsumed();
        }

        f(V v9, f fVar) {
            super(v9, fVar);
            this.f12233h = null;
            this.f12233h = fVar.f12233h;
        }
    }

    private static class e extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f12228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p191t0.b[] f12229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p191t0.b f12230e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private V f12231f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        p191t0.b f12232g;

        e(V v9, WindowInsets windowInsets) {
            super(v9);
            this.f12230e = null;
            this.f12228c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private p191t0.b s(int i10, boolean z9) {
            p191t0.b bVarA = p191t0.b.f27861e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = p191t0.b.a(bVarA, t(i11, z9));
                }
            }
            return bVarA;
        }

        private p191t0.b u() {
            V v9 = this.f12231f;
            return v9 != null ? v9.g() : p191t0.b.f27861e;
        }

        private p191t0.b v(View view) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // androidx.core.view.V.j
        void d(View view) {
            p191t0.b bVarV = v(view);
            if (bVarV == null) {
                bVarV = p191t0.b.f27861e;
            }
            q(bVarV);
        }

        @Override // androidx.core.view.V.j
        void e(V v9) {
            v9.s(this.f12231f);
            v9.r(this.f12232g);
        }

        @Override // androidx.core.view.V.j
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f12232g, ((e) obj).f12232g);
            }
            return false;
        }

        @Override // androidx.core.view.V.j
        public p191t0.b g(int i10) {
            return s(i10, false);
        }

        @Override // androidx.core.view.V.j
        final p191t0.b k() {
            if (this.f12230e == null) {
                this.f12230e = p191t0.b.b(this.f12228c.getSystemWindowInsetLeft(), this.f12228c.getSystemWindowInsetTop(), this.f12228c.getSystemWindowInsetRight(), this.f12228c.getSystemWindowInsetBottom());
            }
            return this.f12230e;
        }

        @Override // androidx.core.view.V.j
        V m(int i10, int i11, int i12, int i13) {
            a aVar = new a(V.u(this.f12228c));
            aVar.c(V.n(k(), i10, i11, i12, i13));
            aVar.b(V.n(i(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // androidx.core.view.V.j
        boolean o() {
            return this.f12228c.isRound();
        }

        @Override // androidx.core.view.V.j
        public void p(p191t0.b[] bVarArr) {
            this.f12229d = bVarArr;
        }

        @Override // androidx.core.view.V.j
        void q(p191t0.b bVar) {
            this.f12232g = bVar;
        }

        @Override // androidx.core.view.V.j
        void r(V v9) {
            this.f12231f = v9;
        }

        protected p191t0.b t(int i10, boolean z9) {
            p191t0.b bVarG;
            int i11;
            if (i10 == 1) {
                return z9 ? p191t0.b.b(0, Math.max(u().f27863b, k().f27863b), 0, 0) : p191t0.b.b(0, k().f27863b, 0, 0);
            }
            if (i10 == 2) {
                if (z9) {
                    p191t0.b bVarU = u();
                    p191t0.b bVarI = i();
                    return p191t0.b.b(Math.max(bVarU.f27862a, bVarI.f27862a), 0, Math.max(bVarU.f27864c, bVarI.f27864c), Math.max(bVarU.f27865d, bVarI.f27865d));
                }
                p191t0.b bVarK = k();
                V v9 = this.f12231f;
                bVarG = v9 != null ? v9.g() : null;
                int iMin = bVarK.f27865d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f27865d);
                }
                return p191t0.b.b(bVarK.f27862a, 0, bVarK.f27864c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return p191t0.b.f27861e;
                }
                V v10 = this.f12231f;
                C1075g c1075gE = v10 != null ? v10.e() : f();
                return c1075gE != null ? p191t0.b.b(c1075gE.b(), c1075gE.d(), c1075gE.c(), c1075gE.a()) : p191t0.b.f27861e;
            }
            p191t0.b[] bVarArr = this.f12229d;
            bVarG = bVarArr != null ? bVarArr[k.b(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            p191t0.b bVarK2 = k();
            p191t0.b bVarU2 = u();
            int i12 = bVarK2.f27865d;
            if (i12 > bVarU2.f27865d) {
                return p191t0.b.b(0, 0, 0, i12);
            }
            p191t0.b bVar = this.f12232g;
            return (bVar == null || bVar.equals(p191t0.b.f27861e) || (i11 = this.f12232g.f27865d) <= bVarU2.f27865d) ? p191t0.b.f27861e : p191t0.b.b(0, 0, 0, i11);
        }

        e(V v9, e eVar) {
            this(v9, new WindowInsets(eVar.f12228c));
        }
    }

    public V(V v9) {
        if (v9 != null) {
            j jVar = v9.f12223a;
            if (jVar instanceof i) {
                this.f12223a = new i(this, (i) jVar);
            } else if (jVar instanceof h) {
                this.f12223a = new h(this, (h) jVar);
            } else if (jVar instanceof g) {
                this.f12223a = new g(this, (g) jVar);
            } else if (jVar instanceof f) {
                this.f12223a = new f(this, (f) jVar);
            } else if (jVar instanceof e) {
                this.f12223a = new e(this, (e) jVar);
            } else {
                this.f12223a = new j(this);
            }
            jVar.e(this);
            return;
        }
        this.f12223a = new j(this);
    }

    private static class h extends g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private p191t0.b f12234i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private p191t0.b f12235j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private p191t0.b f12236k;

        h(V v9, WindowInsets windowInsets) {
            super(v9, windowInsets);
            this.f12234i = null;
            this.f12235j = null;
            this.f12236k = null;
        }

        @Override // androidx.core.view.V.j
        p191t0.b h() {
            if (this.f12235j == null) {
                this.f12235j = p191t0.b.c(this.f12228c.getMandatorySystemGestureInsets());
            }
            return this.f12235j;
        }

        @Override // androidx.core.view.V.j
        p191t0.b j() {
            if (this.f12234i == null) {
                this.f12234i = p191t0.b.c(this.f12228c.getSystemGestureInsets());
            }
            return this.f12234i;
        }

        @Override // androidx.core.view.V.j
        p191t0.b l() {
            if (this.f12236k == null) {
                this.f12236k = p191t0.b.c(this.f12228c.getTappableElementInsets());
            }
            return this.f12236k;
        }

        @Override // androidx.core.view.V.e, androidx.core.view.V.j
        V m(int i10, int i11, int i12, int i13) {
            return V.u(this.f12228c.inset(i10, i11, i12, i13));
        }

        h(V v9, h hVar) {
            super(v9, hVar);
            this.f12234i = null;
            this.f12235j = null;
            this.f12236k = null;
        }
    }
}
