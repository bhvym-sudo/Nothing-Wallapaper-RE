package p155p4;

/* JADX INFO: loaded from: classes.dex */
final class G extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23702c;

    /* synthetic */ G(String str, boolean z9, int i10, F f10) {
        this.f23700a = str;
        this.f23701b = z9;
        this.f23702c = i10;
    }

    @Override // p155p4.J
    public final int a() {
        return this.f23702c;
    }

    @Override // p155p4.J
    public final String b() {
        return this.f23700a;
    }

    @Override // p155p4.J
    public final boolean c() {
        return this.f23701b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j9 = (J) obj;
            if (this.f23700a.equals(j9.b()) && this.f23701b == j9.c() && this.f23702c == j9.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23700a.hashCode() ^ 1000003;
        return this.f23702c ^ (((iHashCode * 1000003) ^ (true != this.f23701b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f23700a + ", enableFirelog=" + this.f23701b + ", firelogEventType=" + this.f23702c + "}";
    }
}
