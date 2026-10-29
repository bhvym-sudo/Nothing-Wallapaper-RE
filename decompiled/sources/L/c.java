package L;

import H.m;
import I.AbstractC0859c;
import I.AbstractC0864h;
import I.AbstractC0866j;
import I.AbstractC0867k;
import I.AbstractC0873q;
import I.AbstractC0874s;
import I.C0865i;
import I.E;
import I.F;
import I.H;
import I.InterfaceC0869m;
import I.L;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import androidx.collection.O;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p111l0.q;
import p111l0.r;
import p111l0.s;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f4208x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final g f4209y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.compose.ui.graphics.layer.a f4210a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Outline f4215f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f4219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private E f4220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private H f4221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private H f4222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private F f4224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f4225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final L.a f4226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f4228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f4229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f4230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RectF f4232w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p111l0.d f4211b = K.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f4212c = s.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f4213d = C0144c.f4234r;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f4214e = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4216g = true;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    static final class b extends o implements l {
        b() {
            super(1);
        }

        public final void a(K.f fVar) {
            H h10 = c.this.f4221l;
            if (!c.this.f4223n || !c.this.k() || h10 == null) {
                c.this.f4213d.f(fVar);
                return;
            }
            l lVar = c.this.f4213d;
            int iB = AbstractC0873q.f2737a.b();
            K.d dVarE = fVar.E();
            long jB = dVarE.b();
            dVarE.i().e();
            try {
                dVarE.c().a(h10, iB);
                lVar.f(fVar);
            } finally {
                dVarE.i().m();
                dVarE.e(jB);
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((K.f) obj);
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: L.c$c, reason: collision with other inner class name */
    static final class C0144c extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C0144c f4234r = new C0144c();

        C0144c() {
            super(1);
        }

        public final void a(K.f fVar) {
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((K.f) obj);
            return A.f21846a;
        }
    }

    static {
        f4209y = f.f4262a.a() ? h.f4264a : i.f4265a;
    }

    public c(androidx.compose.ui.graphics.layer.a aVar, f fVar) {
        this.f4210a = aVar;
        H.g.a aVar2 = H.g.f2287b;
        this.f4217h = aVar2.c();
        this.f4218i = m.f2308a.a();
        this.f4226q = new L.a();
        aVar.J(false);
        this.f4228s = p111l0.m.f22829a.a();
        this.f4229t = q.f22837a.a();
        this.f4230u = aVar2.b();
    }

    private final Outline A() {
        Outline outline = this.f4215f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f4215f = outline2;
        return outline2;
    }

    private final RectF B() {
        RectF rectF = this.f4232w;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f4232w = rectF2;
        return rectF2;
    }

    private final void C() {
        this.f4225p++;
    }

    private final void D() {
        this.f4225p--;
        f();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005a->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[EDGE_INSN: B:34:0x0094->B:31:0x0094 BREAK  A[LOOP:0: B:20:0x005a->B:30:0x0091], SYNTHETIC] */
    private final void F() {
        L.a aVar = this.f4226q;
        aVar.f4200b = aVar.f4199a;
        androidx.collection.F f10 = aVar.f4201c;
        if (f10 != null && f10.e()) {
            androidx.collection.F fA = aVar.f4202d;
            if (fA == null) {
                fA = O.a();
                aVar.f4202d = fA;
            }
            fA.i(f10);
            f10.m();
        }
        aVar.f4203e = true;
        this.f4210a.G(this.f4211b, this.f4212c, this, this.f4214e);
        aVar.f4203e = false;
        c cVar = aVar.f4200b;
        if (cVar != null) {
            cVar.D();
        }
        androidx.collection.F f11 = aVar.f4202d;
        if (f11 == null || !f11.e()) {
            return;
        }
        Object[] objArr = f11.f11289b;
        long[] jArr = f11.f11288a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            ((c) objArr[(i10 << 3) + i12]).D();
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        f11.m();
    }

    private final void G() {
        if (this.f4210a.l()) {
            return;
        }
        try {
            F();
        } catch (Throwable unused) {
        }
    }

    private final void I() {
        this.f4220k = null;
        this.f4221l = null;
        this.f4218i = m.f2308a.a();
        this.f4217h = H.g.f2287b.c();
        this.f4219j = 0.0f;
        this.f4216g = true;
        this.f4223n = false;
    }

    private final void Q(long j9, long j10) {
        this.f4210a.C(p111l0.m.d(j9), p111l0.m.e(j9), j10);
    }

    private final void a0(long j9) {
        if (q.c(this.f4229t, j9)) {
            return;
        }
        this.f4229t = j9;
        Q(this.f4228s, j9);
        if (this.f4218i == 9205357640488583168L) {
            this.f4216g = true;
            e();
        }
    }

    private final void d(c cVar) {
        if (this.f4226q.i(cVar)) {
            cVar.C();
        }
    }

    private final void e() {
        if (this.f4216g) {
            Outline outline = null;
            if (this.f4231v || u() > 0.0f) {
                H h10 = this.f4221l;
                if (h10 != null) {
                    RectF rectFB = B();
                    if (!(h10 instanceof C0865i)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((C0865i) h10).a().computeBounds(rectFB, false);
                    Outline outlineG0 = g0(h10);
                    if (outlineG0 != null) {
                        outlineG0.setAlpha(i());
                        outline = outlineG0;
                    }
                    this.f4210a.A(outline, r.a(Math.round(rectFB.width()), Math.round(rectFB.height())));
                    if (this.f4223n && this.f4231v) {
                        this.f4210a.J(false);
                        this.f4210a.g();
                    } else {
                        this.f4210a.J(this.f4231v);
                    }
                } else {
                    this.f4210a.J(this.f4231v);
                    m.f2308a.b();
                    Outline outlineA = A();
                    long jC = r.c(this.f4229t);
                    long j9 = this.f4217h;
                    long j10 = this.f4218i;
                    long j11 = j10 == 9205357640488583168L ? jC : j10;
                    outlineA.setRoundRect(Math.round(H.g.k(j9)), Math.round(H.g.l(j9)), Math.round(H.g.k(j9) + m.f(j11)), Math.round(H.g.l(j9) + m.e(j11)), this.f4219j);
                    outlineA.setAlpha(i());
                    this.f4210a.A(outlineA, r.b(j11));
                }
            } else {
                this.f4210a.J(false);
                this.f4210a.A(null, q.f22837a.a());
            }
        }
        this.f4216g = false;
    }

    private final void f() {
        if (this.f4227r && this.f4225p == 0) {
            g();
        }
    }

    private final void f0(Canvas canvas) {
        Canvas canvas2;
        float fD = p111l0.m.d(this.f4228s);
        float fE = p111l0.m.e(this.f4228s);
        float fD2 = p111l0.m.d(this.f4228s) + q.e(this.f4229t);
        float fE2 = p111l0.m.e(this.f4228s) + q.d(this.f4229t);
        float fI = i();
        l();
        int iJ = j();
        if (fI < 1.0f || !AbstractC0867k.E(iJ, AbstractC0867k.f2708a.B()) || L.b.e(m(), L.b.f4204a.c())) {
            F fA = this.f4224o;
            if (fA == null) {
                fA = AbstractC0864h.a();
                this.f4224o = fA;
            }
            fA.a(fI);
            fA.y(iJ);
            fA.x(null);
            canvas2 = canvas;
            canvas2.saveLayer(fD, fE, fD2, fE2, fA.z());
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(fD, fE);
        canvas2.concat(this.f4210a.M());
    }

    private final Outline g0(H h10) {
        Outline outlineA = A();
        j.f4266a.a(outlineA, h10);
        this.f4223n = !outlineA.canClip();
        this.f4221l = h10;
        return outlineA;
    }

    public final void E(p111l0.d dVar, s sVar, long j9, l lVar) {
        a0(j9);
        this.f4211b = dVar;
        this.f4212c = sVar;
        this.f4213d = lVar;
        this.f4210a.x(true);
        F();
    }

    public final void H() {
        if (this.f4227r) {
            return;
        }
        this.f4227r = true;
        f();
    }

    public final void J(float f10) {
        if (this.f4210a.b() == f10) {
            return;
        }
        this.f4210a.a(f10);
    }

    public final void K(long j9) {
        if (I.r.l(j9, this.f4210a.E())) {
            return;
        }
        this.f4210a.I(j9);
    }

    public final void L(float f10) {
        if (this.f4210a.p() == f10) {
            return;
        }
        this.f4210a.t(f10);
    }

    public final void M(boolean z9) {
        if (this.f4231v != z9) {
            this.f4231v = z9;
            this.f4216g = true;
            e();
        }
    }

    public final void N(int i10) {
        if (L.b.e(this.f4210a.B(), i10)) {
            return;
        }
        this.f4210a.K(i10);
    }

    public final void O(H h10) {
        I();
        this.f4221l = h10;
        e();
    }

    public final void P(long j9) {
        if (H.g.i(this.f4230u, j9)) {
            return;
        }
        this.f4230u = j9;
        this.f4210a.D(j9);
    }

    public final void R(long j9, long j10) {
        W(j9, j10, 0.0f);
    }

    public final void S(L l9) {
        this.f4210a.z();
        if (n.d(null, l9)) {
            return;
        }
        this.f4210a.j(l9);
    }

    public final void T(float f10) {
        if (this.f4210a.r() == f10) {
            return;
        }
        this.f4210a.v(f10);
    }

    public final void U(float f10) {
        if (this.f4210a.k() == f10) {
            return;
        }
        this.f4210a.c(f10);
    }

    public final void V(float f10) {
        if (this.f4210a.m() == f10) {
            return;
        }
        this.f4210a.e(f10);
    }

    public final void W(long j9, long j10, float f10) {
        if (H.g.i(this.f4217h, j9) && m.d(this.f4218i, j10) && this.f4219j == f10 && this.f4221l == null) {
            return;
        }
        I();
        this.f4217h = j9;
        this.f4218i = j10;
        this.f4219j = f10;
        e();
    }

    public final void X(float f10) {
        if (this.f4210a.d() == f10) {
            return;
        }
        this.f4210a.o(f10);
    }

    public final void Y(float f10) {
        if (this.f4210a.u() == f10) {
            return;
        }
        this.f4210a.i(f10);
    }

    public final void Z(float f10) {
        if (this.f4210a.N() == f10) {
            return;
        }
        this.f4210a.y(f10);
        this.f4216g = true;
        e();
    }

    public final void b0(long j9) {
        if (I.r.l(j9, this.f4210a.H())) {
            return;
        }
        this.f4210a.L(j9);
    }

    public final void c0(long j9) {
        if (p111l0.m.c(this.f4228s, j9)) {
            return;
        }
        this.f4228s = j9;
        Q(j9, this.f4229t);
    }

    public final void d0(float f10) {
        if (this.f4210a.q() == f10) {
            return;
        }
        this.f4210a.s(f10);
    }

    public final void e0(float f10) {
        if (this.f4210a.n() == f10) {
            return;
        }
        this.f4210a.f(f10);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void g() {
        L.a aVar = this.f4226q;
        c cVar = aVar.f4199a;
        if (cVar != null) {
            cVar.D();
            aVar.f4199a = null;
        }
        androidx.collection.F f10 = aVar.f4201c;
        if (f10 != null) {
            Object[] objArr = f10.f11289b;
            long[] jArr = f10.f11288a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                ((c) objArr[(i10 << 3) + i12]).D();
                            }
                            j9 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            f10.m();
        }
        this.f4210a.g();
    }

    public final void h(InterfaceC0869m interfaceC0869m, c cVar) {
        if (this.f4227r) {
            return;
        }
        e();
        G();
        boolean z9 = u() > 0.0f;
        if (z9) {
            interfaceC0869m.n();
        }
        Canvas canvasC = AbstractC0859c.c(interfaceC0869m);
        boolean zIsHardwareAccelerated = canvasC.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            canvasC.save();
            f0(canvasC);
        }
        boolean z10 = !zIsHardwareAccelerated && this.f4231v;
        if (z10) {
            interfaceC0869m.e();
            E eN = n();
            if (eN instanceof E.b) {
                InterfaceC0869m.h(interfaceC0869m, eN.a(), 0, 2, null);
            } else if (eN instanceof E.c) {
                H hA = this.f4222m;
                if (hA != null) {
                    hA.g();
                } else {
                    hA = AbstractC0866j.a();
                    this.f4222m = hA;
                }
                H.e(hA, ((E.c) eN).b(), null, 2, null);
                InterfaceC0869m.d(interfaceC0869m, hA, 0, 2, null);
            } else if (eN instanceof E.a) {
                InterfaceC0869m.d(interfaceC0869m, ((E.a) eN).b(), 0, 2, null);
            }
        }
        if (cVar != null) {
            cVar.d(this);
        }
        this.f4210a.F(interfaceC0869m);
        if (z10) {
            interfaceC0869m.m();
        }
        if (z9) {
            interfaceC0869m.f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasC.restore();
    }

    public final float i() {
        return this.f4210a.b();
    }

    public final int j() {
        return this.f4210a.w();
    }

    public final boolean k() {
        return this.f4231v;
    }

    public final AbstractC0874s l() {
        this.f4210a.h();
        return null;
    }

    public final int m() {
        return this.f4210a.B();
    }

    public final E n() {
        E e10 = this.f4220k;
        H h10 = this.f4221l;
        if (e10 != null) {
            return e10;
        }
        if (h10 != null) {
            E.a aVar = new E.a(h10);
            this.f4220k = aVar;
            return aVar;
        }
        long jC = r.c(this.f4229t);
        long j9 = this.f4217h;
        long j10 = this.f4218i;
        if (j10 != 9205357640488583168L) {
            jC = j10;
        }
        float fK = H.g.k(j9);
        float fL = H.g.l(j9);
        float f10 = fK + m.f(jC);
        float fE = fL + m.e(jC);
        float f11 = this.f4219j;
        E cVar = f11 > 0.0f ? new E.c(H.l.b(fK, fL, f10, fE, H.b.b(f11, 0.0f, 2, null))) : new E.b(new H.i(fK, fL, f10, fE));
        this.f4220k = cVar;
        return cVar;
    }

    public final long o() {
        return this.f4230u;
    }

    public final float p() {
        return this.f4210a.r();
    }

    public final float q() {
        return this.f4210a.k();
    }

    public final float r() {
        return this.f4210a.m();
    }

    public final float s() {
        return this.f4210a.d();
    }

    public final float t() {
        return this.f4210a.u();
    }

    public final float u() {
        return this.f4210a.N();
    }

    public final long v() {
        return this.f4229t;
    }

    public final long w() {
        return this.f4228s;
    }

    public final float x() {
        return this.f4210a.q();
    }

    public final float y() {
        return this.f4210a.n();
    }

    public final boolean z() {
        return this.f4227r;
    }
}
