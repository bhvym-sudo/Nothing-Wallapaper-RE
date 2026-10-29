package H2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f2338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f2340e;

    public a(String tag, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.n.h(tag, "tag");
        this.f2336a = tag;
        this.f2337b = f10;
        this.f2338c = f11;
        this.f2339d = f12;
        this.f2340e = f13;
    }

    public final float a() {
        return this.f2340e;
    }

    public final float b() {
        return this.f2338c;
    }

    public final float c() {
        return this.f2339d;
    }

    public final float d() {
        return this.f2337b;
    }

    public final String e() {
        return this.f2336a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.n.d(this.f2336a, aVar.f2336a) && Float.compare(this.f2337b, aVar.f2337b) == 0 && Float.compare(this.f2338c, aVar.f2338c) == 0 && Float.compare(this.f2339d, aVar.f2339d) == 0 && Float.compare(this.f2340e, aVar.f2340e) == 0;
    }

    public int hashCode() {
        return (((((((this.f2336a.hashCode() * 31) + Float.hashCode(this.f2337b)) * 31) + Float.hashCode(this.f2338c)) * 31) + Float.hashCode(this.f2339d)) * 31) + Float.hashCode(this.f2340e);
    }

    public String toString() {
        return "AxisDefinition(tag=" + this.f2336a + ", minValue=" + this.f2337b + ", defaultValue=" + this.f2338c + ", maxValue=" + this.f2339d + ", animationStep=" + this.f2340e + ")";
    }
}
