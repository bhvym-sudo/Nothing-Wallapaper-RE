package p116l5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final double[][] f22932k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final double[][] f22933l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f22934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f22935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f22936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f22937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f22938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f22939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f22940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f22941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final double f22942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double[] f22943j = {0.0d, 0.0d, 0.0d};

    private a(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f22934a = d10;
        this.f22935b = d11;
        this.f22936c = d12;
        this.f22937d = d13;
        this.f22938e = d14;
        this.f22939f = d15;
        this.f22940g = d16;
        this.f22941h = d17;
        this.f22942i = d18;
    }

    public static a a(int i10) {
        return b(i10, d.f22952k);
    }

    static a b(int i10, d dVar) {
        double dJ = p156p5.a.j((16711680 & i10) >> 16);
        double dJ2 = p156p5.a.j((65280 & i10) >> 8);
        double dJ3 = p156p5.a.j(i10 & 255);
        return c((0.41233895d * dJ) + (0.35762064d * dJ2) + (0.18051042d * dJ3), (0.2126d * dJ) + (0.7152d * dJ2) + (0.0722d * dJ3), (dJ * 0.01932141d) + (dJ2 * 0.11916382d) + (dJ3 * 0.95034478d), dVar);
    }

    static a c(double d10, double d11, double d12, d dVar) {
        double[][] dArr = f22932k;
        double[] dArr2 = dArr[0];
        double d13 = (dArr2[0] * d10) + (dArr2[1] * d11) + (dArr2[2] * d12);
        double[] dArr3 = dArr[1];
        double d14 = (dArr3[0] * d10) + (dArr3[1] * d11) + (dArr3[2] * d12);
        double[] dArr4 = dArr[2];
        double d15 = (dArr4[0] * d10) + (dArr4[1] * d11) + (dArr4[2] * d12);
        double d16 = dVar.j()[0] * d13;
        double d17 = dVar.j()[1] * d14;
        double d18 = dVar.j()[2] * d15;
        double dPow = Math.pow((dVar.d() * Math.abs(d16)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((dVar.d() * Math.abs(d17)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((dVar.d() * Math.abs(d18)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d16) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d17) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d18) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d19 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d20 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d21 = dSignum2 * 20.0d;
        double d22 = (((dSignum * 20.0d) + d21) + (21.0d * dSignum3)) / 20.0d;
        double d23 = (((dSignum * 40.0d) + d21) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d20, d19));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d24 = degrees;
        double radians = Math.toRadians(d24);
        double dPow4 = Math.pow((d23 * dVar.g()) / dVar.b(), dVar.c() * dVar.k()) * 100.0d;
        double d25 = dPow4 / 100.0d;
        double dC = (4.0d / dVar.c()) * Math.sqrt(d25) * (dVar.b() + 4.0d) * dVar.e();
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, dVar.f()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d24 < 20.14d ? d24 + 360.0d : d24) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * dVar.h()) * dVar.i()) * Math.hypot(d19, d20)) / (d22 + 0.305d), 0.9d);
        double dSqrt = dPow5 * Math.sqrt(d25);
        double dE = dSqrt * dVar.e();
        double dSqrt2 = Math.sqrt((dPow5 * dVar.c()) / (dVar.b() + 4.0d)) * 50.0d;
        double d26 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * dE) * 43.859649122807014d;
        return new a(d24, dSqrt, dPow4, dC, dE, dSqrt2, d26, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public double d() {
        return this.f22935b;
    }

    public double e() {
        return this.f22934a;
    }
}
