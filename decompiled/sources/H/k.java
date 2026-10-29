package H;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f2298i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final k f2299j = l.b(0.0f, 0.0f, 0.0f, 0.0f, H.a.f2281a.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f2304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f2305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f2306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f2307h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ k(float f10, float f11, float f12, float f13, long j9, long j10, long j11, long j12, AbstractC1457h abstractC1457h) {
        this(f10, f11, f12, f13, j9, j10, j11, j12);
    }

    public final float a() {
        return this.f2303d;
    }

    public final long b() {
        return this.f2307h;
    }

    public final long c() {
        return this.f2306g;
    }

    public final float d() {
        return this.f2303d - this.f2301b;
    }

    public final float e() {
        return this.f2300a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f2300a, kVar.f2300a) == 0 && Float.compare(this.f2301b, kVar.f2301b) == 0 && Float.compare(this.f2302c, kVar.f2302c) == 0 && Float.compare(this.f2303d, kVar.f2303d) == 0 && H.a.c(this.f2304e, kVar.f2304e) && H.a.c(this.f2305f, kVar.f2305f) && H.a.c(this.f2306g, kVar.f2306g) && H.a.c(this.f2307h, kVar.f2307h);
    }

    public final float f() {
        return this.f2302c;
    }

    public final float g() {
        return this.f2301b;
    }

    public final long h() {
        return this.f2304e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f2300a) * 31) + Float.hashCode(this.f2301b)) * 31) + Float.hashCode(this.f2302c)) * 31) + Float.hashCode(this.f2303d)) * 31) + H.a.f(this.f2304e)) * 31) + H.a.f(this.f2305f)) * 31) + H.a.f(this.f2306g)) * 31) + H.a.f(this.f2307h);
    }

    public final long i() {
        return this.f2305f;
    }

    public final float j() {
        return this.f2302c - this.f2300a;
    }

    public String toString() {
        long j9 = this.f2304e;
        long j10 = this.f2305f;
        long j11 = this.f2306g;
        long j12 = this.f2307h;
        String str = c.a(this.f2300a, 1) + ", " + c.a(this.f2301b, 1) + ", " + c.a(this.f2302c, 1) + ", " + c.a(this.f2303d, 1);
        if (!H.a.c(j9, j10) || !H.a.c(j10, j11) || !H.a.c(j11, j12)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) H.a.g(j9)) + ", topRight=" + ((Object) H.a.g(j10)) + ", bottomRight=" + ((Object) H.a.g(j11)) + ", bottomLeft=" + ((Object) H.a.g(j12)) + ')';
        }
        if (H.a.d(j9) == H.a.e(j9)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(H.a.d(j9), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(H.a.d(j9), 1) + ", y=" + c.a(H.a.e(j9), 1) + ')';
    }

    private k(float f10, float f11, float f12, float f13, long j9, long j10, long j11, long j12) {
        this.f2300a = f10;
        this.f2301b = f11;
        this.f2302c = f12;
        this.f2303d = f13;
        this.f2304e = j9;
        this.f2305f = j10;
        this.f2306g = j11;
        this.f2307h = j12;
    }
}
