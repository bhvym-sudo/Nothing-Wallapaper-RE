package H;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2292e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i f2293f = new i(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2297d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final i a() {
            return i.f2293f;
        }

        private a() {
        }
    }

    public i(float f10, float f11, float f12, float f13) {
        this.f2294a = f10;
        this.f2295b = f11;
        this.f2296c = f12;
        this.f2297d = f13;
    }

    public final boolean b(long j9) {
        return g.k(j9) >= this.f2294a && g.k(j9) < this.f2296c && g.l(j9) >= this.f2295b && g.l(j9) < this.f2297d;
    }

    public final float c() {
        return this.f2297d;
    }

    public final long d() {
        return h.a(this.f2294a + (j() / 2.0f), this.f2295b + (e() / 2.0f));
    }

    public final float e() {
        return this.f2297d - this.f2295b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f2294a, iVar.f2294a) == 0 && Float.compare(this.f2295b, iVar.f2295b) == 0 && Float.compare(this.f2296c, iVar.f2296c) == 0 && Float.compare(this.f2297d, iVar.f2297d) == 0;
    }

    public final float f() {
        return this.f2294a;
    }

    public final float g() {
        return this.f2296c;
    }

    public final long h() {
        return n.a(j(), e());
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f2294a) * 31) + Float.hashCode(this.f2295b)) * 31) + Float.hashCode(this.f2296c)) * 31) + Float.hashCode(this.f2297d);
    }

    public final float i() {
        return this.f2295b;
    }

    public final float j() {
        return this.f2296c - this.f2294a;
    }

    public final i k(float f10, float f11, float f12, float f13) {
        return new i(Math.max(this.f2294a, f10), Math.max(this.f2295b, f11), Math.min(this.f2296c, f12), Math.min(this.f2297d, f13));
    }

    public final boolean l() {
        return this.f2294a >= this.f2296c || this.f2295b >= this.f2297d;
    }

    public final i m(float f10, float f11) {
        return new i(this.f2294a + f10, this.f2295b + f11, this.f2296c + f10, this.f2297d + f11);
    }

    public final i n(long j9) {
        return new i(this.f2294a + g.k(j9), this.f2295b + g.l(j9), this.f2296c + g.k(j9), this.f2297d + g.l(j9));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f2294a, 1) + ", " + c.a(this.f2295b, 1) + ", " + c.a(this.f2296c, 1) + ", " + c.a(this.f2297d, 1) + ')';
    }
}
