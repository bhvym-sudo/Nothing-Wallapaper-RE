package p156p5;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final double[][] f23763a = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[][] f23764b = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final double[] f23765c = {95.047d, 100.0d, 108.883d};

    public static int a(double[] dArr) {
        return c(e(dArr[0]), e(dArr[1]), e(dArr[2]));
    }

    public static int b(double d10) {
        int iE = e(o(d10));
        return c(iE, iE, iE);
    }

    public static int c(int i10, int i11, int i12) {
        return ((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255);
    }

    public static int d(int i10) {
        return i10 & 255;
    }

    public static int e(double d10) {
        double d11 = d10 / 100.0d;
        return b.b(0, 255, (int) Math.round((d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int f(int i10) {
        return (i10 >> 8) & 255;
    }

    static double g(double d10) {
        return d10 > 0.008856451679035631d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double[] h(int i10) {
        double dJ = j(l(i10));
        double dJ2 = j(f(i10));
        double dJ3 = j(d(i10));
        double[][] dArr = f23763a;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[0] * dJ) + (dArr2[1] * dJ2) + (dArr2[2] * dJ3);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[0] * dJ) + (dArr3[1] * dJ2) + (dArr3[2] * dJ3);
        double[] dArr4 = dArr[2];
        double d12 = (dArr4[0] * dJ) + (dArr4[1] * dJ2) + (dArr4[2] * dJ3);
        double[] dArr5 = f23765c;
        double d13 = d10 / dArr5[0];
        double d14 = d11 / dArr5[1];
        double d15 = d12 / dArr5[2];
        double dG = g(d13);
        double dG2 = g(d14);
        return new double[]{(116.0d * dG2) - 16.0d, (dG - dG2) * 500.0d, (dG2 - g(d15)) * 200.0d};
    }

    static double i(double d10) {
        double d11 = d10 * d10 * d10;
        return d11 > 0.008856451679035631d ? d11 : ((d10 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double j(int i10) {
        double d10 = ((double) i10) / 255.0d;
        return (d10 <= 0.040449936d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static double k(int i10) {
        return (g(n(i10)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static int l(int i10) {
        return (i10 >> 16) & 255;
    }

    public static double[] m() {
        return f23765c;
    }

    public static double[] n(int i10) {
        return b.d(new double[]{j(l(i10)), j(f(i10)), j(d(i10))}, f23763a);
    }

    public static double o(double d10) {
        return i((d10 + 16.0d) / 116.0d) * 100.0d;
    }
}
