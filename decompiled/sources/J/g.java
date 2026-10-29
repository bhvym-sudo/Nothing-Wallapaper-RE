package J;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3410a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f3411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f3412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y f3413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final y f3414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x f3415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final x f3416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final x f3417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final x f3418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final x f3419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final x f3420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final x f3421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final x f3422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final x f3423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final x f3424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final x f3425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final x f3426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final x f3427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final x f3428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c f3429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final c f3430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final x f3431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final c f3432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final c[] f3433x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f3411b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f3412c = fArr2;
        y yVar = new y(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f3413d = yVar;
        y yVar2 = new y(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f3414e = yVar2;
        k kVar = k.f3445a;
        x xVar = new x("sRGB IEC61966-2.1", fArr, kVar.e(), yVar, 0);
        f3415f = xVar;
        x xVar2 = new x("sRGB IEC61966-2.1 (Linear)", fArr, kVar.e(), 1.0d, 0.0f, 1.0f, 1);
        f3416g = xVar2;
        x xVar3 = new x("scRGB-nl IEC 61966-2-2:2003", fArr, kVar.e(), null, new j() { // from class: J.e
            @Override // J.j
            public final double a(double d10) {
                return g.c(d10);
            }
        }, new j() { // from class: J.f
            @Override // J.j
            public final double a(double d10) {
                return g.d(d10);
            }
        }, -0.799f, 2.399f, yVar, 2);
        f3417h = xVar3;
        x xVar4 = new x("scRGB IEC 61966-2-2:2003", fArr, kVar.e(), 1.0d, -0.5f, 7.499f, 3);
        f3418i = xVar4;
        x xVar5 = new x("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f3419j = xVar5;
        x xVar6 = new x("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, kVar.e(), new y(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f3420k = xVar6;
        x xVar7 = new x("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new z(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f3421l = xVar7;
        x xVar8 = new x("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, kVar.e(), yVar, 7);
        f3422m = xVar8;
        x xVar9 = new x("NTSC (1953)", fArr2, kVar.a(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f3423n = xVar9;
        x xVar10 = new x("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, kVar.e(), new y(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f3424o = xVar10;
        x xVar11 = new x("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, kVar.e(), 2.2d, 0.0f, 1.0f, 10);
        f3425p = xVar11;
        x xVar12 = new x("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, kVar.b(), new y(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f3426q = xVar12;
        x xVar13 = new x("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 12);
        f3427r = xVar13;
        x xVar14 = new x("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, kVar.d(), 1.0d, -65504.0f, 65504.0f, 13);
        f3428s = xVar14;
        A a10 = new A("Generic XYZ", 14);
        f3429t = a10;
        l lVar = new l("Generic L*a*b*", 15);
        f3430u = lVar;
        x xVar15 = new x("None", fArr, kVar.e(), yVar2, 16);
        f3431v = xVar15;
        m mVar = new m("Oklab", 17);
        f3432w = mVar;
        f3433x = new c[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, a10, lVar, xVar15, mVar};
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double c(double d10) {
        return d.a(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(double d10) {
        return d.b(d10, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final c[] e() {
        return f3433x;
    }

    public final float[] f() {
        return f3412c;
    }

    public final c g() {
        return f3432w;
    }

    public final x h() {
        return f3415f;
    }

    public final float[] i() {
        return f3411b;
    }

    public final x j() {
        return f3431v;
    }
}
