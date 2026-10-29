package p116l5;

import p156p5.a;
import p156p5.b;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f22952k = a(50.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f22953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f22954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f22955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f22956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f22957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f22958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double[] f22959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f22960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f22961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double f22962j;

    private d(double d10, double d11, double d12, double d13, double d14, double d15, double[] dArr, double d16, double d17, double d18) {
        this.f22958f = d10;
        this.f22953a = d11;
        this.f22954b = d12;
        this.f22955c = d13;
        this.f22956d = d14;
        this.f22957e = d15;
        this.f22959g = dArr;
        this.f22960h = d16;
        this.f22961i = d17;
        this.f22962j = d18;
    }

    public static d a(double d10) {
        return l(a.m(), (a.o(50.0d) * 63.66197723675813d) / 100.0d, d10, 2.0d, false);
    }

    public static d l(double[] dArr, double d10, double d11, double d12, boolean z9) {
        double dMax = Math.max(0.1d, d11);
        double[][] dArr2 = a.f22932k;
        double d13 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d14 = dArr3[0] * d13;
        double d15 = dArr[1];
        double d16 = d14 + (dArr3[1] * d15);
        double d17 = dArr[2];
        double d18 = d16 + (dArr3[2] * d17);
        double[] dArr4 = dArr2[1];
        double d19 = (dArr4[0] * d13) + (dArr4[1] * d15) + (dArr4[2] * d17);
        double[] dArr5 = dArr2[2];
        double d20 = (d13 * dArr5[0]) + (d15 * dArr5[1]) + (d17 * dArr5[2]);
        double d21 = (d12 / 10.0d) + 0.8d;
        double dC = d21 >= 0.9d ? b.c(0.59d, 0.69d, (d21 - 0.9d) * 10.0d) : b.c(0.525d, 0.59d, (d21 - 0.8d) * 10.0d);
        double dA = b.a(0.0d, 1.0d, z9 ? 1.0d : (1.0d - (Math.exp(((-d10) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d21);
        double[] dArr6 = {(((100.0d / d18) * dA) + 1.0d) - dA, (((100.0d / d19) * dA) + 1.0d) - dA, (((100.0d / d20) * dA) + 1.0d) - dA};
        double d22 = 5.0d * d10;
        double d23 = 1.0d / (d22 + 1.0d);
        double d24 = d23 * d23 * d23 * d23;
        double d25 = 1.0d - d24;
        double dCbrt = (d24 * d10) + (d25 * 0.1d * d25 * Math.cbrt(d22));
        double dO = a.o(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dO) + 1.48d;
        double dPow = 0.725d / Math.pow(dO, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d18) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d20) / 100.0d, 0.42d)};
        double d26 = dArr7[0];
        double d27 = (d26 * 400.0d) / (d26 + 27.13d);
        double d28 = dArr7[1];
        double d29 = (d28 * 400.0d) / (d28 + 27.13d);
        double d30 = dArr7[2];
        double[] dArr8 = {d27, d29, (400.0d * d30) / (d30 + 27.13d)};
        return new d(dO, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dC, d21, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double b() {
        return this.f22953a;
    }

    double c() {
        return this.f22956d;
    }

    double d() {
        return this.f22960h;
    }

    public double e() {
        return this.f22961i;
    }

    public double f() {
        return this.f22958f;
    }

    public double g() {
        return this.f22954b;
    }

    double h() {
        return this.f22957e;
    }

    double i() {
        return this.f22955c;
    }

    public double[] j() {
        return this.f22959g;
    }

    double k() {
        return this.f22962j;
    }
}
