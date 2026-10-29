package W;

/* JADX INFO: loaded from: classes.dex */
final class i0 implements e0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final U.q f8591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final J f8592r;

    public i0(U.q qVar, J j9) {
        this.f8591q = qVar;
        this.f8592r = j9;
    }

    public final J a() {
        return this.f8592r;
    }

    public final U.q b() {
        return this.f8591q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.n.d(this.f8591q, i0Var.f8591q) && kotlin.jvm.internal.n.d(this.f8592r, i0Var.f8592r);
    }

    @Override // W.e0
    public boolean g() {
        return this.f8592r.m0().t();
    }

    public int hashCode() {
        return (this.f8591q.hashCode() * 31) + this.f8592r.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.f8591q + ", placeable=" + this.f8592r + ')';
    }
}
