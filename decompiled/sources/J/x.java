package J;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class x extends J.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f3475t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final j f3476u = new j() { // from class: J.q
        @Override // J.j
        public final double a(double d10) {
            return x.t(d10);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f3477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f3478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f3479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y f3480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f3481i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float[] f3482j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f3483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j f3484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final p219v8.l f3485m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f3486n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final j f3487o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p219v8.l f3488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f3489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f3490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f3491s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }

        private final boolean f(double d10, j jVar, j jVar2) {
            return Math.abs(jVar.a(d10) - jVar2.a(d10)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] fArr, z zVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float fA = zVar.a();
            float fB = zVar.b();
            float f16 = 1;
            float f17 = (f16 - f10) / f11;
            float f18 = (f16 - f12) / f13;
            float f19 = (f16 - f14) / f15;
            float f20 = (f16 - fA) / fB;
            float f21 = f10 / f11;
            float f22 = (f12 / f13) - f21;
            float f23 = (fA / fB) - f21;
            float f24 = f18 - f17;
            float f25 = (f14 / f15) - f21;
            float f26 = (((f20 - f17) * f22) - (f23 * f24)) / (((f19 - f17) * f22) - (f24 * f25));
            float f27 = (f23 - (f25 * f26)) / f22;
            float f28 = (1.0f - f27) - f26;
            float f29 = f28 / f11;
            float f30 = f27 / f13;
            float f31 = f26 / f15;
            return new float[]{f29 * f10, f28, f29 * ((1.0f - f10) - f11), f30 * f12, f27, f30 * ((1.0f - f12) - f13), f31 * f14, f26, f31 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[2] - fArr2[2];
            float f15 = fArr[3] - fArr2[3];
            float f16 = fArr[4];
            float f17 = fArr2[4];
            float f18 = fArr[5];
            float f19 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, f14, f15, f16 - f17, f18 - f19};
            return i(fArr3[0], fArr3[1], f11 - f17, f13 - f19) >= 0.0f && i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) >= 0.0f && i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) >= 0.0f && i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) >= 0.0f && i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) >= 0.0f && i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) >= 0.0f;
        }

        private final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] fArr, z zVar, j jVar, j jVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            g gVar = g.f3410a;
            if (!d.g(fArr, gVar.i()) || !d.f(zVar, k.f3445a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            x xVarH = gVar.h();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, jVar, xVarH.H()) || !f(d10, jVar2, xVarH.E())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] fArr, float f10, float f11) {
            float fE = e(fArr);
            g gVar = g.f3410a;
            if (fE / e(gVar.f()) <= 0.9f || !h(fArr, gVar.i())) {
                return f10 < 0.0f && f11 > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                AbstractC1439m.j(fArr, fArr2, 0, 0, 6, 6, null);
                return fArr2;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = f10 + f11 + fArr[2];
            fArr2[0] = f10 / f12;
            fArr2[1] = f11 / f12;
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = f13 + f14 + fArr[5];
            fArr2[2] = f13 / f15;
            fArr2[3] = f14 / f15;
            float f16 = fArr[6];
            float f17 = fArr[7];
            float f18 = f16 + f17 + fArr[8];
            fArr2[4] = f16 / f18;
            fArr2[5] = f17 / f18;
            return fArr2;
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {
        b() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(x.this.E().a(B8.h.k(d10, x.this.f3478f, x.this.f3479g)));
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {
        c() {
            super(1);
        }

        public final Double a(double d10) {
            return Double.valueOf(B8.h.k(x.this.H().a(d10), x.this.f3478f, x.this.f3479g));
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    public x(String str, float[] fArr, z zVar, float[] fArr2, j jVar, j jVar2, float f10, float f11, y yVar, int i10) {
        super(str, J.b.f3401a.b(), i10, null);
        this.f3477e = zVar;
        this.f3478f = f10;
        this.f3479g = f11;
        this.f3480h = yVar;
        this.f3484l = jVar;
        this.f3485m = new c();
        this.f3486n = new j() { // from class: J.o
            @Override // J.j
            public final double a(double d10) {
                return x.K(this.f3467a, d10);
            }
        };
        this.f3487o = jVar2;
        this.f3488p = new b();
        this.f3489q = new j() { // from class: J.p
            @Override // J.j
            public final double a(double d10) {
                return x.C(this.f3468a, d10);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        a aVar = f3475t;
        float[] fArrL = aVar.l(fArr);
        this.f3481i = fArrL;
        if (fArr2 == null) {
            this.f3482j = aVar.g(fArrL, zVar);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f3482j = fArr2;
        }
        this.f3483k = d.k(this.f3482j);
        this.f3490r = aVar.k(fArrL, f10, f11);
        this.f3491s = aVar.j(fArrL, zVar, jVar, jVar2, f10, f11, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(x xVar, double d10) {
        return xVar.f3487o.a(B8.h.k(d10, xVar.f3478f, xVar.f3479g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double K(x xVar, double d10) {
        return B8.h.k(xVar.f3484l.a(d10), xVar.f3478f, xVar.f3479g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double t(double d10) {
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double v(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double w(y yVar, double d10) {
        return d.o(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(y yVar, double d10) {
        return d.p(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(y yVar, double d10) {
        return d.q(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(y yVar, double d10) {
        return d.r(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    public final j D() {
        return this.f3489q;
    }

    public final j E() {
        return this.f3487o;
    }

    public final float[] F() {
        return this.f3483k;
    }

    public final j G() {
        return this.f3486n;
    }

    public final j H() {
        return this.f3484l;
    }

    public final float[] I() {
        return this.f3482j;
    }

    public final z J() {
        return this.f3477e;
    }

    @Override // J.c
    public float c(int i10) {
        return this.f3479g;
    }

    @Override // J.c
    public float d(int i10) {
        return this.f3478f;
    }

    @Override // J.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(xVar.f3478f, this.f3478f) != 0 || Float.compare(xVar.f3479g, this.f3479g) != 0 || !kotlin.jvm.internal.n.d(this.f3477e, xVar.f3477e) || !Arrays.equals(this.f3481i, xVar.f3481i)) {
            return false;
        }
        y yVar = this.f3480h;
        if (yVar != null) {
            return kotlin.jvm.internal.n.d(yVar, xVar.f3480h);
        }
        if (xVar.f3480h == null) {
            return true;
        }
        if (kotlin.jvm.internal.n.d(this.f3484l, xVar.f3484l)) {
            return kotlin.jvm.internal.n.d(this.f3487o, xVar.f3487o);
        }
        return false;
    }

    @Override // J.c
    public boolean g() {
        return this.f3491s;
    }

    @Override // J.c
    public long h(float f10, float f11, float f12) {
        float fA = (float) this.f3489q.a(f10);
        float fA2 = (float) this.f3489q.a(f11);
        float fA3 = (float) this.f3489q.a(f12);
        float[] fArr = this.f3482j;
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // J.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.f3477e.hashCode()) * 31) + Arrays.hashCode(this.f3481i)) * 31;
        float f10 = this.f3478f;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f3479g;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        y yVar = this.f3480h;
        int iHashCode2 = iFloatToIntBits2 + (yVar != null ? yVar.hashCode() : 0);
        return this.f3480h == null ? (((iHashCode2 * 31) + this.f3484l.hashCode()) * 31) + this.f3487o.hashCode() : iHashCode2;
    }

    @Override // J.c
    public float i(float f10, float f11, float f12) {
        float fA = (float) this.f3489q.a(f10);
        float fA2 = (float) this.f3489q.a(f11);
        float fA3 = (float) this.f3489q.a(f12);
        float[] fArr = this.f3482j;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // J.c
    public long j(float f10, float f11, float f12, float f13, J.c cVar) {
        float[] fArr = this.f3483k;
        return I.t.a((float) this.f3486n.a((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12)), (float) this.f3486n.a((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12)), (float) this.f3486n.a((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12)), f13, cVar);
    }

    public x(String str, float[] fArr, z zVar, final y yVar, int i10) {
        this(str, fArr, zVar, null, (yVar.e() == 0.0d && yVar.f() == 0.0d) ? new j() { // from class: J.t
            @Override // J.j
            public final double a(double d10) {
                return x.w(yVar, d10);
            }
        } : new j() { // from class: J.u
            @Override // J.j
            public final double a(double d10) {
                return x.x(yVar, d10);
            }
        }, (yVar.e() == 0.0d && yVar.f() == 0.0d) ? new j() { // from class: J.v
            @Override // J.j
            public final double a(double d10) {
                return x.y(yVar, d10);
            }
        } : new j() { // from class: J.w
            @Override // J.j
            public final double a(double d10) {
                return x.z(yVar, d10);
            }
        }, 0.0f, 1.0f, yVar, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String str, float[] fArr, z zVar, final double d10, float f10, float f11, int i10) {
        j jVar;
        j jVar2;
        if (d10 == 1.0d) {
            jVar = f3476u;
        } else {
            jVar = new j() { // from class: J.r
                @Override // J.j
                public final double a(double d11) {
                    return x.u(d10, d11);
                }
            };
        }
        j jVar3 = jVar;
        if (d10 == 1.0d) {
            jVar2 = f3476u;
        } else {
            jVar2 = new j() { // from class: J.s
                @Override // J.j
                public final double a(double d11) {
                    return x.v(d10, d11);
                }
            };
        }
        this(str, fArr, zVar, null, jVar3, jVar2, f10, f11, new y(d10, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i10);
    }

    public x(x xVar, float[] fArr, z zVar) {
        this(xVar.f(), xVar.f3481i, zVar, fArr, xVar.f3484l, xVar.f3487o, xVar.f3478f, xVar.f3479g, xVar.f3480h, -1);
    }
}
