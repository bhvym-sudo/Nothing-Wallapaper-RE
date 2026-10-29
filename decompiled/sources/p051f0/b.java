package p051f0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20726b;

    public b(int i10) {
        this.f20726b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f20726b == ((b) obj).f20726b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f20726b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f20726b + ')';
    }
}
