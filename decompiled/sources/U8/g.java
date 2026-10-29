package U8;

import P8.C0935a;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f8067f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T8.d f8070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f8071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f8072e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends T8.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // T8.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(T8.e taskRunner, int i10, long j9, TimeUnit timeUnit) {
        n.h(taskRunner, "taskRunner");
        n.h(timeUnit, "timeUnit");
        this.f8068a = i10;
        this.f8069b = timeUnit.toNanos(j9);
        this.f8070c = taskRunner.i();
        this.f8071d = new b(Q8.d.f6933i + " ConnectionPool");
        this.f8072e = new ConcurrentLinkedQueue();
        if (j9 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j9).toString());
    }

    private final int d(f fVar, long j9) {
        if (Q8.d.f6932h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listO = fVar.o();
        int i10 = 0;
        while (i10 < listO.size()) {
            Reference reference = (Reference) listO.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                n.f(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                Z8.h.f9546a.g().l("A connection to " + fVar.A().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listO.remove(i10);
                fVar.D(true);
                if (listO.isEmpty()) {
                    fVar.C(j9 - this.f8069b);
                    return 0;
                }
            }
        }
        return listO.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    public final boolean a(C0935a address, e call, List list, boolean z9) {
        n.h(address, "address");
        n.h(call, "call");
        for (f connection : this.f8072e) {
            n.g(connection, "connection");
            synchronized (connection) {
                if (z9) {
                    try {
                        if (connection.w()) {
                            if (connection.u(address, list)) {
                                call.e(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (connection.u(address, list)) {
                    call.e(connection);
                    return true;
                }
                A a10 = A.f21846a;
            }
        }
        return false;
    }

    public final long b(long j9) {
        int i10 = 0;
        long j10 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f8072e) {
            n.g(connection, "connection");
            synchronized (connection) {
                if (d(connection, j9) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jP = j9 - connection.p();
                    if (jP > j10) {
                        fVar = connection;
                        j10 = jP;
                    }
                    A a10 = A.f21846a;
                }
            }
        }
        long j11 = this.f8069b;
        if (j10 < j11 && i10 <= this.f8068a) {
            if (i10 > 0) {
                return j11 - j10;
            }
            if (i11 > 0) {
                return j11;
            }
            return -1L;
        }
        n.e(fVar);
        synchronized (fVar) {
            if (!fVar.o().isEmpty()) {
                return 0L;
            }
            if (fVar.p() + j10 != j9) {
                return 0L;
            }
            fVar.D(true);
            this.f8072e.remove(fVar);
            Q8.d.n(fVar.E());
            if (this.f8072e.isEmpty()) {
                this.f8070c.a();
            }
            return 0L;
        }
    }

    public final boolean c(f connection) {
        n.h(connection, "connection");
        if (Q8.d.f6932h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.q() && this.f8068a != 0) {
            T8.d.j(this.f8070c, this.f8071d, 0L, 2, null);
            return false;
        }
        connection.D(true);
        this.f8072e.remove(connection);
        if (this.f8072e.isEmpty()) {
            this.f8070c.a();
        }
        return true;
    }

    public final void e(f connection) {
        n.h(connection, "connection");
        if (!Q8.d.f6932h || Thread.holdsLock(connection)) {
            this.f8072e.add(connection);
            T8.d.j(this.f8070c, this.f8071d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
