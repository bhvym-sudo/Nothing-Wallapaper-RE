package B8;

import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends i {
    public static double d(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float e(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long g(long j9, long j10) {
        return j9 < j10 ? j10 : j9;
    }

    public static float h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long j(long j9, long j10) {
        return j9 > j10 ? j10 : j9;
    }

    public static double k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static e n(int i10, int i11) {
        return e.f432t.a(i10, i11, -1);
    }

    public static e o(e eVar) {
        n.h(eVar, "<this>");
        return e.f432t.a(eVar.m(), eVar.g(), -eVar.n());
    }

    public static e p(e eVar, int i10) {
        n.h(eVar, "<this>");
        i.a(i10 > 0, Integer.valueOf(i10));
        e.a aVar = e.f432t;
        int iG = eVar.g();
        int iM = eVar.m();
        if (eVar.n() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iG, iM, i10);
    }

    public static g q(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? g.f440u.a() : new g(i10, i11 - 1);
    }
}
