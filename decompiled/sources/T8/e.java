package T8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f7737h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f7738i = new e(new c(Q8.d.M(Q8.d.f6933i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f7739j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f7744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f7745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f7746g;

    public interface a {
        void a(e eVar, long j9);

        void b(e eVar);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final Logger a() {
            return e.f7739j;
        }

        private b() {
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f7747a;

        public c(ThreadFactory threadFactory) {
            n.h(threadFactory, "threadFactory");
            this.f7747a = new ThreadPoolExecutor(0, SubsamplingScaleImageView.TILE_SIZE_AUTO, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // T8.e.a
        public void a(e taskRunner, long j9) throws InterruptedException {
            n.h(taskRunner, "taskRunner");
            long j10 = j9 / 1000000;
            long j11 = j9 - (1000000 * j10);
            if (j10 > 0 || j9 > 0) {
                taskRunner.wait(j10, (int) j11);
            }
        }

        @Override // T8.e.a
        public void b(e taskRunner) {
            n.h(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // T8.e.a
        public long c() {
            return System.nanoTime();
        }

        @Override // T8.e.a
        public void execute(Runnable runnable) {
            n.h(runnable, "runnable");
            this.f7747a.execute(runnable);
        }
    }

    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            T8.a aVarD;
            long jC;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                T8.d dVarD = aVarD.d();
                n.e(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f7737h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jC = dVarD.h().g().c();
                    T8.b.c(aVarD, dVarD, "starting");
                } else {
                    jC = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        A a10 = A.f21846a;
                        if (zIsLoggable) {
                            T8.b.c(aVarD, dVarD, "finished run in " + T8.b.b(dVarD.h().g().c() - jC));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            T8.b.c(aVarD, dVarD, "failed a run in " + T8.b.b(dVarD.h().g().c() - jC));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        n.g(logger, "getLogger(TaskRunner::class.java.name)");
        f7739j = logger;
    }

    public e(a backend) {
        n.h(backend, "backend");
        this.f7740a = backend;
        this.f7741b = 10000;
        this.f7744e = new ArrayList();
        this.f7745f = new ArrayList();
        this.f7746g = new d();
    }

    private final void c(T8.a aVar, long j9) {
        if (Q8.d.f6932h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        T8.d dVarD = aVar.d();
        n.e(dVarD);
        if (dVarD.c() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f7744e.remove(dVarD);
        if (j9 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j9, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f7745f.add(dVarD);
    }

    private final void e(T8.a aVar) {
        if (Q8.d.f6932h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        T8.d dVarD = aVar.d();
        n.e(dVarD);
        dVarD.e().remove(aVar);
        this.f7745f.remove(dVarD);
        dVarD.l(aVar);
        this.f7744e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(T8.a aVar) {
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                A a10 = A.f21846a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                A a11 = A.f21846a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final T8.a d() {
        boolean z9;
        if (Q8.d.f6932h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f7745f.isEmpty()) {
            long jC = this.f7740a.c();
            Iterator it = this.f7745f.iterator();
            long jMin = Long.MAX_VALUE;
            T8.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z9 = false;
                    break;
                }
                T8.a aVar2 = (T8.a) ((T8.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jC);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z9 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z9 || (!this.f7742c && !this.f7745f.isEmpty())) {
                    this.f7740a.execute(this.f7746g);
                }
                return aVar;
            }
            if (this.f7742c) {
                if (jMin < this.f7743d - jC) {
                    this.f7740a.b(this);
                }
                return null;
            }
            this.f7742c = true;
            this.f7743d = jC + jMin;
            try {
                try {
                    this.f7740a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.f7742c = false;
            } catch (Throwable th) {
                this.f7742c = false;
                throw th;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f7744e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((T8.d) this.f7744e.get(size)).b();
            }
        }
        for (int size2 = this.f7745f.size() - 1; -1 < size2; size2--) {
            T8.d dVar = (T8.d) this.f7745f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f7745f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f7740a;
    }

    public final void h(T8.d taskQueue) {
        n.h(taskQueue, "taskQueue");
        if (Q8.d.f6932h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f7745f.remove(taskQueue);
            } else {
                Q8.d.c(this.f7745f, taskQueue);
            }
        }
        if (this.f7742c) {
            this.f7740a.b(this);
        } else {
            this.f7740a.execute(this.f7746g);
        }
    }

    public final T8.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f7741b;
            this.f7741b = i10 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i10);
        return new T8.d(this, sb.toString());
    }
}
