package p111l0;

import kotlin.jvm.internal.n;
import p121m0.a;

/* JADX INFO: loaded from: classes.dex */
final class g implements d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f22819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f22820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f22821s;

    public g(float f10, float f11, a aVar) {
        this.f22819q = f10;
        this.f22820r = f11;
        this.f22821s = aVar;
    }

    @Override // p111l0.k
    public float A() {
        return this.f22820r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f22819q, gVar.f22819q) == 0 && Float.compare(this.f22820r, gVar.f22820r) == 0 && n.d(this.f22821s, gVar.f22821s);
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f22819q;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f22819q) * 31) + Float.hashCode(this.f22820r)) * 31) + this.f22821s.hashCode();
    }

    @Override // p111l0.k
    public float l(long j9) {
        if (w.g(u.g(j9), w.f22847b.b())) {
            return h.d(this.f22821s.a(u.h(j9)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f22819q + ", fontScale=" + this.f22820r + ", converter=" + this.f22821s + ')';
    }
}
