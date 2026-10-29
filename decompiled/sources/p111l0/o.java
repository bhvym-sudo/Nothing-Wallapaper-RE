package p111l0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22831e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o f22832f = new o(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22836d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final o a() {
            return o.f22832f;
        }

        private a() {
        }
    }

    public o(int i10, int i11, int i12, int i13) {
        this.f22833a = i10;
        this.f22834b = i11;
        this.f22835c = i12;
        this.f22836d = i13;
    }

    public static /* synthetic */ o c(o oVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = oVar.f22833a;
        }
        if ((i14 & 2) != 0) {
            i11 = oVar.f22834b;
        }
        if ((i14 & 4) != 0) {
            i12 = oVar.f22835c;
        }
        if ((i14 & 8) != 0) {
            i13 = oVar.f22836d;
        }
        return oVar.b(i10, i11, i12, i13);
    }

    public final o b(int i10, int i11, int i12, int i13) {
        return new o(i10, i11, i12, i13);
    }

    public final int d() {
        return this.f22836d;
    }

    public final int e() {
        return this.f22836d - this.f22834b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f22833a == oVar.f22833a && this.f22834b == oVar.f22834b && this.f22835c == oVar.f22835c && this.f22836d == oVar.f22836d;
    }

    public final int f() {
        return this.f22833a;
    }

    public final int g() {
        return this.f22835c;
    }

    public final int h() {
        return this.f22834b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f22833a) * 31) + Integer.hashCode(this.f22834b)) * 31) + Integer.hashCode(this.f22835c)) * 31) + Integer.hashCode(this.f22836d);
    }

    public final long i() {
        return n.a(this.f22833a, this.f22834b);
    }

    public final boolean j() {
        return this.f22833a >= this.f22835c || this.f22834b >= this.f22836d;
    }

    public final o k(int i10, int i11) {
        return new o(this.f22833a + i10, this.f22834b + i11, this.f22835c + i10, this.f22836d + i11);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f22833a + ", " + this.f22834b + ", " + this.f22835c + ", " + this.f22836d + ')';
    }
}
