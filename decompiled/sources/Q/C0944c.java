package Q;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: Q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6499c;

    public /* synthetic */ C0944c(long j9, long j10, long j11, AbstractC1457h abstractC1457h) {
        this(j9, j10, j11);
    }

    public final long a() {
        return this.f6499c;
    }

    public final long b() {
        return this.f6498b;
    }

    public final long c() {
        return this.f6497a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f6497a + ", position=" + ((Object) H.g.q(this.f6498b)) + ')';
    }

    public /* synthetic */ C0944c(long j9, long j10, AbstractC1457h abstractC1457h) {
        this(j9, j10);
    }

    private C0944c(long j9, long j10) {
        this.f6497a = j9;
        this.f6498b = j10;
        this.f6499c = H.g.f2287b.c();
    }

    private C0944c(long j9, long j10, long j11) {
        this(j9, j10, (AbstractC1457h) null);
        this.f6499c = j11;
    }
}
