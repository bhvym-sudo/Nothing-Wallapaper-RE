package L0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: L0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0925b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f4304a;

    public C0925b(int i10) {
        this.f4304a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f4304a.decrementAndGet();
    }

    public final int b() {
        return this.f4304a.get();
    }

    public final int c() {
        return this.f4304a.getAndIncrement();
    }

    public final int d() {
        return this.f4304a.incrementAndGet();
    }
}
