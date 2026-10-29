package H;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f2284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2286d;

    public e(float f10, float f11, float f12, float f13) {
        this.f2283a = f10;
        this.f2284b = f11;
        this.f2285c = f12;
        this.f2286d = f13;
    }

    public final float a() {
        return this.f2286d;
    }

    public final float b() {
        return this.f2283a;
    }

    public final float c() {
        return this.f2285c;
    }

    public final float d() {
        return this.f2284b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f2283a = Math.max(f10, this.f2283a);
        this.f2284b = Math.max(f11, this.f2284b);
        this.f2285c = Math.min(f12, this.f2285c);
        this.f2286d = Math.min(f13, this.f2286d);
    }

    public final boolean f() {
        return this.f2283a >= this.f2285c || this.f2284b >= this.f2286d;
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f2283a = f10;
        this.f2284b = f11;
        this.f2285c = f12;
        this.f2286d = f13;
    }

    public final void h(float f10) {
        this.f2286d = f10;
    }

    public final void i(float f10) {
        this.f2283a = f10;
    }

    public final void j(float f10) {
        this.f2285c = f10;
    }

    public final void k(float f10) {
        this.f2284b = f10;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f2283a, 1) + ", " + c.a(this.f2284b, 1) + ", " + c.a(this.f2285c, 1) + ", " + c.a(this.f2286d, 1) + ')';
    }
}
