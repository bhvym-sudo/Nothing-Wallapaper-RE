package p175r4;

/* JADX INFO: loaded from: classes.dex */
final class S8 extends X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26229c;

    /* synthetic */ S8(String str, boolean z9, int i10, R8 r9) {
        this.f26227a = str;
        this.f26228b = z9;
        this.f26229c = i10;
    }

    @Override // p175r4.X8
    public final int a() {
        return this.f26229c;
    }

    @Override // p175r4.X8
    public final String b() {
        return this.f26227a;
    }

    @Override // p175r4.X8
    public final boolean c() {
        return this.f26228b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X8) {
            X8 x9 = (X8) obj;
            if (this.f26227a.equals(x9.b()) && this.f26228b == x9.c() && this.f26229c == x9.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f26227a.hashCode() ^ 1000003;
        return this.f26229c ^ (((iHashCode * 1000003) ^ (true != this.f26228b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f26227a + ", enableFirelog=" + this.f26228b + ", firelogEventType=" + this.f26229c + "}";
    }
}
