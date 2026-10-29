package J;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3406d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3409c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, long j9, int i10, AbstractC1457h abstractC1457h) {
        this(str, j9, i10);
    }

    public final int a() {
        return b.f(this.f3408b);
    }

    public final int b() {
        return this.f3409c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f3408b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3409c == cVar.f3409c && kotlin.jvm.internal.n.d(this.f3407a, cVar.f3407a)) {
            return b.e(this.f3408b, cVar.f3408b);
        }
        return false;
    }

    public final String f() {
        return this.f3407a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f3407a.hashCode() * 31) + b.g(this.f3408b)) * 31) + this.f3409c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, c cVar);

    public String toString() {
        return this.f3407a + " (id=" + this.f3409c + ", model=" + ((Object) b.h(this.f3408b)) + ')';
    }

    private c(String str, long j9, int i10) {
        this.f3407a = str;
        this.f3408b = j9;
        this.f3409c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
