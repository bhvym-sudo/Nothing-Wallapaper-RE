package e9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class k extends C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C f20274f;

    public k(C delegate) {
        kotlin.jvm.internal.n.h(delegate, "delegate");
        this.f20274f = delegate;
    }

    @Override // e9.C
    public C a() {
        return this.f20274f.a();
    }

    @Override // e9.C
    public C b() {
        return this.f20274f.b();
    }

    @Override // e9.C
    public long c() {
        return this.f20274f.c();
    }

    @Override // e9.C
    public C d(long j9) {
        return this.f20274f.d(j9);
    }

    @Override // e9.C
    public boolean e() {
        return this.f20274f.e();
    }

    @Override // e9.C
    public void f() throws InterruptedIOException {
        this.f20274f.f();
    }

    @Override // e9.C
    public C g(long j9, TimeUnit unit) {
        kotlin.jvm.internal.n.h(unit, "unit");
        return this.f20274f.g(j9, unit);
    }

    public final C i() {
        return this.f20274f;
    }

    public final k j(C delegate) {
        kotlin.jvm.internal.n.h(delegate, "delegate");
        this.f20274f = delegate;
        return this;
    }
}
