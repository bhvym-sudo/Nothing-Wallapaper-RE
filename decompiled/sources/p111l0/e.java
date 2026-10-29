package p111l0;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f22817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f22818r;

    public e(float f10, float f11) {
        this.f22817q = f10;
        this.f22818r = f11;
    }

    @Override // p111l0.k
    public float A() {
        return this.f22818r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f22817q, eVar.f22817q) == 0 && Float.compare(this.f22818r, eVar.f22818r) == 0;
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f22817q;
    }

    public int hashCode() {
        return (Float.hashCode(this.f22817q) * 31) + Float.hashCode(this.f22818r);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f22817q + ", fontScale=" + this.f22818r + ')';
    }
}
