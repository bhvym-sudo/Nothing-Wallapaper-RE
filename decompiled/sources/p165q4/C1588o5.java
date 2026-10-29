package p165q4;

/* JADX INFO: renamed from: q4.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1588o5 extends AbstractC1615s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24708c;

    /* synthetic */ C1588o5(String str, boolean z9, int i10, AbstractC1574m5 abstractC1574m5) {
        this.f24706a = str;
        this.f24707b = z9;
        this.f24708c = i10;
    }

    @Override // p165q4.AbstractC1615s5
    public final int a() {
        return this.f24708c;
    }

    @Override // p165q4.AbstractC1615s5
    public final String b() {
        return this.f24706a;
    }

    @Override // p165q4.AbstractC1615s5
    public final boolean c() {
        return this.f24707b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1615s5) {
            AbstractC1615s5 abstractC1615s5 = (AbstractC1615s5) obj;
            if (this.f24706a.equals(abstractC1615s5.b()) && this.f24707b == abstractC1615s5.c() && this.f24708c == abstractC1615s5.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f24706a.hashCode() ^ 1000003;
        return this.f24708c ^ (((iHashCode * 1000003) ^ (true != this.f24707b ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f24706a + ", enableFirelog=" + this.f24707b + ", firelogEventType=" + this.f24708c + "}";
    }
}
