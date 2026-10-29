package F8;

/* JADX INFO: loaded from: classes2.dex */
final class X0 extends K8.z implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f1842u;

    public X0(long j9, p129m8.e eVar) {
        super(eVar.getContext(), eVar);
        this.f1842u = j9;
    }

    @Override // F8.AbstractC0800a, F8.D0
    public String p0() {
        return super.p0() + "(timeMillis=" + this.f1842u + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        D(Y0.a(this.f1842u, W.c(getContext()), this));
    }
}
