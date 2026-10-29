package B8;

/* JADX INFO: loaded from: classes2.dex */
final class a implements b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float f428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f429r;

    public a(float f10, float f11) {
        this.f428q = f10;
        this.f429r = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B8.c
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return c(((Number) comparable).floatValue());
    }

    public boolean c(float f10) {
        return f10 >= this.f428q && f10 <= this.f429r;
    }

    @Override // B8.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float f() {
        return Float.valueOf(this.f429r);
    }

    @Override // B8.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Float a() {
        return Float.valueOf(this.f428q);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (g() && ((a) obj).g()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f428q == aVar.f428q && this.f429r == aVar.f429r;
    }

    public boolean g() {
        return this.f428q > this.f429r;
    }

    public int hashCode() {
        if (g()) {
            return -1;
        }
        return (Float.hashCode(this.f428q) * 31) + Float.hashCode(this.f429r);
    }

    public String toString() {
        return this.f428q + ".." + this.f429r;
    }
}
