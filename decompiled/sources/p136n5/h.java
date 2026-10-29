package p136n5;

import p106k5.a;
import p116l5.b;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f23272l = {0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f23273m = {18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final double[] f23274n = {35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d};

    /* JADX WARN: Illegal instructions before constructor call */
    public h(b bVar, boolean z9, double d10) {
        p106k5.b bVar2 = p106k5.b.VIBRANT;
        p126m5.a aVarB = p126m5.a.b(bVar.d(), 200.0d);
        double[] dArr = f23272l;
        super(bVar, bVar2, z9, d10, aVarB, p126m5.a.b(a.a(bVar, dArr, f23273m), 24.0d), p126m5.a.b(a.a(bVar, dArr, f23274n), 32.0d), p126m5.a.b(bVar.d(), 10.0d), p126m5.a.b(bVar.d(), 12.0d));
    }
}
