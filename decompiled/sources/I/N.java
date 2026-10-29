package I;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2681d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final N f2682e = new N(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f2684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2685c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ N(long j9, long j10, float f10, AbstractC1457h abstractC1457h) {
        this(j9, j10, f10);
    }

    public final float a() {
        return this.f2685c;
    }

    public final long b() {
        return this.f2683a;
    }

    public final long c() {
        return this.f2684b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n9 = (N) obj;
        return r.l(this.f2683a, n9.f2683a) && H.g.i(this.f2684b, n9.f2684b) && this.f2685c == n9.f2685c;
    }

    public int hashCode() {
        return (((r.r(this.f2683a) * 31) + H.g.m(this.f2684b)) * 31) + Float.hashCode(this.f2685c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) r.s(this.f2683a)) + ", offset=" + ((Object) H.g.q(this.f2684b)) + ", blurRadius=" + this.f2685c + ')';
    }

    private N(long j9, long j10, float f10) {
        this.f2683a = j9;
        this.f2684b = j10;
        this.f2685c = f10;
    }

    public /* synthetic */ N(long j9, long j10, float f10, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? t.c(4278190080L) : j9, (i10 & 2) != 0 ? H.g.f2287b.c() : j10, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
