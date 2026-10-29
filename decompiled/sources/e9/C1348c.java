package e9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: e9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1348c extends C {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f20244i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f20245j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f20246k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f20247l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f20248m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C1348c f20249n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1348c f20251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20252h;

    /* JADX INFO: renamed from: e9.c$a */
    private static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C1348c c1348c, long j9, boolean z9) {
            if (C1348c.f20249n == null) {
                C1348c.f20249n = new C1348c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j9 != 0 && z9) {
                c1348c.f20252h = Math.min(j9, c1348c.c() - jNanoTime) + jNanoTime;
            } else if (j9 != 0) {
                c1348c.f20252h = j9 + jNanoTime;
            } else {
                if (!z9) {
                    throw new AssertionError();
                }
                c1348c.f20252h = c1348c.c();
            }
            long jY = c1348c.y(jNanoTime);
            C1348c c1348c2 = C1348c.f20249n;
            kotlin.jvm.internal.n.e(c1348c2);
            while (c1348c2.f20251g != null) {
                C1348c c1348c3 = c1348c2.f20251g;
                kotlin.jvm.internal.n.e(c1348c3);
                if (jY < c1348c3.y(jNanoTime)) {
                    break;
                }
                c1348c2 = c1348c2.f20251g;
                kotlin.jvm.internal.n.e(c1348c2);
            }
            c1348c.f20251g = c1348c2.f20251g;
            c1348c2.f20251g = c1348c;
            if (c1348c2 == C1348c.f20249n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C1348c c1348c) {
            for (C1348c c1348c2 = C1348c.f20249n; c1348c2 != null; c1348c2 = c1348c2.f20251g) {
                if (c1348c2.f20251g == c1348c) {
                    c1348c2.f20251g = c1348c.f20251g;
                    c1348c.f20251g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C1348c c() throws InterruptedException {
            C1348c c1348c = C1348c.f20249n;
            kotlin.jvm.internal.n.e(c1348c);
            C1348c c1348c2 = c1348c.f20251g;
            if (c1348c2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C1348c.f20247l, TimeUnit.MILLISECONDS);
                C1348c c1348c3 = C1348c.f20249n;
                kotlin.jvm.internal.n.e(c1348c3);
                if (c1348c3.f20251g != null || System.nanoTime() - jNanoTime < C1348c.f20248m) {
                    return null;
                }
                return C1348c.f20249n;
            }
            long jY = c1348c2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C1348c c1348c4 = C1348c.f20249n;
            kotlin.jvm.internal.n.e(c1348c4);
            c1348c4.f20251g = c1348c2.f20251g;
            c1348c2.f20251g = null;
            c1348c2.f20250f = 2;
            return c1348c2;
        }

        public final Condition d() {
            return C1348c.f20246k;
        }

        public final ReentrantLock e() {
            return C1348c.f20245j;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: e9.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = C1348c.f20244i.e();
                    reentrantLockE.lock();
                    try {
                        C1348c c1348cC = C1348c.f20244i.c();
                        if (c1348cC == C1348c.f20249n) {
                            a unused = C1348c.f20244i;
                            C1348c.f20249n = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            p079h8.A a10 = p079h8.A.f21846a;
                            reentrantLockE.unlock();
                            if (c1348cC != null) {
                                c1348cC.B();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockE.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e9.c$c, reason: collision with other inner class name */
    public static final class C0531c implements z {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ z f20254r;

        C0531c(z zVar) {
            this.f20254r = zVar;
        }

        @Override // e9.z
        public void Z(C1350e source, long j9) throws IOException {
            kotlin.jvm.internal.n.h(source, "source");
            AbstractC1347b.b(source.X0(), 0L, j9);
            while (true) {
                long j10 = 0;
                if (j9 <= 0) {
                    return;
                }
                w wVar = source.f20257q;
                kotlin.jvm.internal.n.e(wVar);
                while (j10 < 65536) {
                    j10 += (long) (wVar.f20309c - wVar.f20308b);
                    if (j10 >= j9) {
                        j10 = j9;
                        break;
                    } else {
                        wVar = wVar.f20312f;
                        kotlin.jvm.internal.n.e(wVar);
                    }
                }
                C1348c c1348c = C1348c.this;
                z zVar = this.f20254r;
                c1348c.v();
                try {
                    try {
                        zVar.Z(source, j10);
                        p079h8.A a10 = p079h8.A.f21846a;
                        if (c1348c.w()) {
                            throw c1348c.p(null);
                        }
                        j9 -= j10;
                    } catch (IOException e10) {
                        if (!c1348c.w()) {
                            throw e10;
                        }
                        throw c1348c.p(e10);
                    }
                } catch (Throwable th) {
                    c1348c.w();
                    throw th;
                }
            }
        }

        @Override // e9.z
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1348c e() {
            return C1348c.this;
        }

        @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1348c c1348c = C1348c.this;
            z zVar = this.f20254r;
            c1348c.v();
            try {
                try {
                    zVar.close();
                    p079h8.A a10 = p079h8.A.f21846a;
                    if (c1348c.w()) {
                        throw c1348c.p(null);
                    }
                } catch (IOException e10) {
                    if (!c1348c.w()) {
                        throw e10;
                    }
                    throw c1348c.p(e10);
                }
            } catch (Throwable th) {
                c1348c.w();
                throw th;
            }
        }

        @Override // e9.z, java.io.Flushable
        public void flush() throws IOException {
            C1348c c1348c = C1348c.this;
            z zVar = this.f20254r;
            c1348c.v();
            try {
                try {
                    zVar.flush();
                    p079h8.A a10 = p079h8.A.f21846a;
                    if (c1348c.w()) {
                        throw c1348c.p(null);
                    }
                } catch (IOException e10) {
                    if (!c1348c.w()) {
                        throw e10;
                    }
                    throw c1348c.p(e10);
                }
            } catch (Throwable th) {
                c1348c.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f20254r + ')';
        }
    }

    /* JADX INFO: renamed from: e9.c$d */
    public static final class d implements B {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ B f20256r;

        d(B b10) {
            this.f20256r = b10;
        }

        @Override // e9.B
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1348c e() {
            return C1348c.this;
        }

        @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1348c c1348c = C1348c.this;
            B b10 = this.f20256r;
            c1348c.v();
            try {
                try {
                    b10.close();
                    p079h8.A a10 = p079h8.A.f21846a;
                    if (c1348c.w()) {
                        throw c1348c.p(null);
                    }
                } catch (IOException e10) {
                    if (!c1348c.w()) {
                        throw e10;
                    }
                    throw c1348c.p(e10);
                }
            } catch (Throwable th) {
                c1348c.w();
                throw th;
            }
        }

        @Override // e9.B
        public long e1(C1350e sink, long j9) throws IOException {
            kotlin.jvm.internal.n.h(sink, "sink");
            C1348c c1348c = C1348c.this;
            B b10 = this.f20256r;
            c1348c.v();
            try {
                try {
                    long jE1 = b10.e1(sink, j9);
                    if (c1348c.w()) {
                        throw c1348c.p(null);
                    }
                    return jE1;
                } catch (IOException e10) {
                    if (c1348c.w()) {
                        throw c1348c.p(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th) {
                c1348c.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f20256r + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f20245j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.n.g(conditionNewCondition, "newCondition(...)");
        f20246k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f20247l = millis;
        f20248m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j9) {
        return this.f20252h - j9;
    }

    public final B A(B source) {
        kotlin.jvm.internal.n.h(source, "source");
        return new d(source);
    }

    protected void B() {
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f20245j;
            reentrantLock.lock();
            try {
                if (this.f20250f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f20250f = 1;
                f20244i.f(this, jH, zE);
                p079h8.A a10 = p079h8.A.f21846a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f20245j;
        reentrantLock.lock();
        try {
            int i10 = this.f20250f;
            this.f20250f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f20244i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final z z(z sink) {
        kotlin.jvm.internal.n.h(sink, "sink");
        return new C0531c(sink);
    }
}
