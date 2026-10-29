package p022c1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f15038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f15039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f15040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f15041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f15042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f15043j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float[] f15044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f15045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float[] f15046c = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f15047d = true;

    static {
        c cVar = new c();
        f15038e = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f15039f = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        f15040g = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        f15041h = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        f15042i = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        f15043j = cVar6;
        l(cVar6);
        n(cVar6);
    }

    c() {
        float[] fArr = new float[3];
        this.f15044a = fArr;
        float[] fArr2 = new float[3];
        this.f15045b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(c cVar) {
        float[] fArr = cVar.f15045b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(c cVar) {
        float[] fArr = cVar.f15045b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(c cVar) {
        float[] fArr = cVar.f15044a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(c cVar) {
        float[] fArr = cVar.f15045b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(c cVar) {
        float[] fArr = cVar.f15044a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.f15046c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f15046c[1];
    }

    public float b() {
        return this.f15045b[2];
    }

    public float c() {
        return this.f15044a[2];
    }

    public float d() {
        return this.f15045b[0];
    }

    public float e() {
        return this.f15044a[0];
    }

    public float f() {
        return this.f15046c[2];
    }

    public float g() {
        return this.f15046c[0];
    }

    public float h() {
        return this.f15045b[1];
    }

    public float i() {
        return this.f15044a[1];
    }

    public boolean j() {
        return this.f15047d;
    }

    void k() {
        int length = this.f15046c.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = this.f15046c[i10];
            if (f11 > 0.0f) {
                f10 += f11;
            }
        }
        if (f10 != 0.0f) {
            int length2 = this.f15046c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f15046c;
                float f12 = fArr[i11];
                if (f12 > 0.0f) {
                    fArr[i11] = f12 / f10;
                }
            }
        }
    }
}
