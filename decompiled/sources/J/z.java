package J;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f3501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f3502b;

    public z(float f10, float f11) {
        this.f3501a = f10;
        this.f3502b = f11;
    }

    public final float a() {
        return this.f3501a;
    }

    public final float b() {
        return this.f3502b;
    }

    public final float[] c() {
        float f10 = this.f3501a;
        float f11 = this.f3502b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f3501a, zVar.f3501a) == 0 && Float.compare(this.f3502b, zVar.f3502b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f3501a) * 31) + Float.hashCode(this.f3502b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f3501a + ", y=" + this.f3502b + ')';
    }
}
