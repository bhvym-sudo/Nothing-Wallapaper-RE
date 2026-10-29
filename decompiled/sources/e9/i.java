package e9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements z {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z f20272q;

    public i(z delegate) {
        kotlin.jvm.internal.n.h(delegate, "delegate");
        this.f20272q = delegate;
    }

    @Override // e9.z
    public void Z(C1350e source, long j9) {
        kotlin.jvm.internal.n.h(source, "source");
        this.f20272q.Z(source, j9);
    }

    @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20272q.close();
    }

    @Override // e9.z
    public C e() {
        return this.f20272q.e();
    }

    @Override // e9.z, java.io.Flushable
    public void flush() {
        this.f20272q.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f20272q + ')';
    }
}
