package e9;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f20235d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f20236e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f20239c;

    public static final class a extends C {
        a() {
        }

        @Override // e9.C
        public C d(long j9) {
            return this;
        }

        @Override // e9.C
        public void f() {
        }

        @Override // e9.C
        public C g(long j9, TimeUnit unit) {
            kotlin.jvm.internal.n.h(unit, "unit");
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public C a() {
        this.f20237a = false;
        return this;
    }

    public C b() {
        this.f20239c = 0L;
        return this;
    }

    public long c() {
        if (this.f20237a) {
            return this.f20238b;
        }
        throw new IllegalStateException("No deadline");
    }

    public C d(long j9) {
        this.f20237a = true;
        this.f20238b = j9;
        return this;
    }

    public boolean e() {
        return this.f20237a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f20237a && this.f20238b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C g(long j9, TimeUnit unit) {
        kotlin.jvm.internal.n.h(unit, "unit");
        if (j9 >= 0) {
            this.f20239c = unit.toNanos(j9);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j9).toString());
    }

    public long h() {
        return this.f20239c;
    }
}
