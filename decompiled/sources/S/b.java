package S;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f7119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7121d;

    public b(float f10, float f11, long j9, int i10) {
        this.f7118a = f10;
        this.f7119b = f11;
        this.f7120c = j9;
        this.f7121d = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f7118a == this.f7118a && bVar.f7119b == this.f7119b && bVar.f7120c == this.f7120c && bVar.f7121d == this.f7121d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f7118a) * 31) + Float.hashCode(this.f7119b)) * 31) + Long.hashCode(this.f7120c)) * 31) + Integer.hashCode(this.f7121d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f7118a + ",horizontalScrollPixels=" + this.f7119b + ",uptimeMillis=" + this.f7120c + ",deviceId=" + this.f7121d + ')';
    }
}
