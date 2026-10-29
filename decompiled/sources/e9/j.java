package e9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B f20273q;

    public j(B delegate) {
        kotlin.jvm.internal.n.h(delegate, "delegate");
        this.f20273q = delegate;
    }

    public final B a() {
        return this.f20273q;
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20273q.close();
    }

    @Override // e9.B
    public C e() {
        return this.f20273q.e();
    }

    @Override // e9.B
    public long e1(C1350e sink, long j9) {
        kotlin.jvm.internal.n.h(sink, "sink");
        return this.f20273q.e1(sink, j9);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f20273q + ')';
    }
}
