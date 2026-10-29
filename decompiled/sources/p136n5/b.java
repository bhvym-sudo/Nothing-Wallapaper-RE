package p136n5;

import p106k5.a;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f23269l = {0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f23270m = {45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double[] f23271n = {120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public b(p116l5.b bVar, boolean z9, double d10) {
        p106k5.b bVar2 = p106k5.b.EXPRESSIVE;
        p126m5.a aVarB = p126m5.a.b(p156p5.b.e(bVar.d() + 240.0d), 40.0d);
        double[] dArr = f23269l;
        super(bVar, bVar2, z9, d10, aVarB, p126m5.a.b(a.a(bVar, dArr, f23270m), 24.0d), p126m5.a.b(a.a(bVar, dArr, f23271n), 32.0d), p126m5.a.b(p156p5.b.e(bVar.d() + 15.0d), 8.0d), p126m5.a.b(p156p5.b.e(bVar.d() + 15.0d), 12.0d));
    }
}
