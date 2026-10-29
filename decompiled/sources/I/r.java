package I;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2740b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f2741c = t.c(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f2742d = t.c(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f2743e = t.c(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f2744f = t.c(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f2745g = t.c(4294967295L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f2746h = t.c(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f2747i = t.c(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f2748j = t.c(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f2749k = t.c(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f2750l = t.c(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f2751m = t.c(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f2752n = t.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f2753o = t.a(0.0f, 0.0f, 0.0f, 0.0f, J.g.f3410a.j());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2754a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return r.f2741c;
        }

        public final long b() {
            return r.f2748j;
        }

        public final long c() {
            return r.f2746h;
        }

        public final long d() {
            return r.f2752n;
        }

        public final long e() {
            return r.f2753o;
        }

        private a() {
        }
    }

    private /* synthetic */ r(long j9) {
        this.f2754a = j9;
    }

    public static final /* synthetic */ r f(long j9) {
        return new r(j9);
    }

    public static long g(long j9) {
        return j9;
    }

    public static final long h(long j9, J.c cVar) {
        return J.d.i(o(j9), cVar, 0, 2, null).a(j9);
    }

    public static final long i(long j9, float f10, float f11, float f12, float f13) {
        return t.a(f11, f12, f13, f10, o(j9));
    }

    public static /* synthetic */ long j(long j9, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m(j9);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = q(j9);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = p(j9);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = n(j9);
        }
        return i(j9, f14, f15, f16, f13);
    }

    public static boolean k(long j9, Object obj) {
        return (obj instanceof r) && j9 == ((r) obj).t();
    }

    public static final boolean l(long j9, long j10) {
        return p079h8.x.e(j9, j10);
    }

    public static final float m(long j9) {
        float fA;
        float f10;
        if (p079h8.x.d(63 & j9) == 0) {
            fA = (float) p079h8.C.a(p079h8.x.d(p079h8.x.d(j9 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fA = (float) p079h8.C.a(p079h8.x.d(p079h8.x.d(j9 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fA / f10;
    }

    public static final float n(long j9) {
        int i10;
        int i11;
        int i12;
        if (p079h8.x.d(63 & j9) == 0) {
            return ((float) p079h8.C.a(p079h8.x.d(p079h8.x.d(j9 >>> 32) & 255))) / 255.0f;
        }
        short sD = (short) p079h8.x.d(p079h8.x.d(j9 >>> 16) & 65535);
        int i13 = Short.MIN_VALUE & sD;
        int i14 = ((65535 & sD) >>> 10) & 31;
        int i15 = sD & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f2777c;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final J.c o(long j9) {
        J.g gVar = J.g.f3410a;
        return gVar.e()[(int) p079h8.x.d(j9 & 63)];
    }

    public static final float p(long j9) {
        int i10;
        int i11;
        int i12;
        if (p079h8.x.d(63 & j9) == 0) {
            return ((float) p079h8.C.a(p079h8.x.d(p079h8.x.d(j9 >>> 40) & 255))) / 255.0f;
        }
        short sD = (short) p079h8.x.d(p079h8.x.d(j9 >>> 32) & 65535);
        int i13 = Short.MIN_VALUE & sD;
        int i14 = ((65535 & sD) >>> 10) & 31;
        int i15 = sD & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f2777c;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float q(long j9) {
        int i10;
        int i11;
        int i12;
        if (p079h8.x.d(63 & j9) == 0) {
            return ((float) p079h8.C.a(p079h8.x.d(p079h8.x.d(j9 >>> 48) & 255))) / 255.0f;
        }
        short sD = (short) p079h8.x.d(p079h8.x.d(j9 >>> 48) & 65535);
        int i13 = Short.MIN_VALUE & sD;
        int i14 = ((65535 & sD) >>> 10) & 31;
        int i15 = sD & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f2777c;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static int r(long j9) {
        return p079h8.x.f(j9);
    }

    public static String s(long j9) {
        return "Color(" + q(j9) + ", " + p(j9) + ", " + n(j9) + ", " + m(j9) + ", " + o(j9).f() + ')';
    }

    public boolean equals(Object obj) {
        return k(this.f2754a, obj);
    }

    public int hashCode() {
        return r(this.f2754a);
    }

    public final /* synthetic */ long t() {
        return this.f2754a;
    }

    public String toString() {
        return s(this.f2754a);
    }
}
