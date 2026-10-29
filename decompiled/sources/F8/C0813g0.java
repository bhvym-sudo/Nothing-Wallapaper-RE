package F8;

/* JADX INFO: renamed from: F8.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0813g0 implements InterfaceC0838t0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f1866q;

    public C0813g0(boolean z9) {
        this.f1866q = z9;
    }

    @Override // F8.InterfaceC0838t0
    public boolean a() {
        return this.f1866q;
    }

    @Override // F8.InterfaceC0838t0
    public I0 b() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
