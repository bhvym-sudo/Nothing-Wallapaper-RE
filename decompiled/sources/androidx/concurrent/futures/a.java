package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Future {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final boolean f12074t = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Logger f12075u = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final b f12076v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Object f12077w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    volatile Object f12078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    volatile e f12079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    volatile h f12080s;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f12081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f12082d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f12083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f12084b;

        static {
            if (a.f12074t) {
                f12082d = null;
                f12081c = null;
            } else {
                f12082d = new c(false, null);
                f12081c = new c(true, null);
            }
        }

        c(boolean z9, Throwable th) {
            this.f12083a = z9;
            this.f12084b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f12085a;
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f12086d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f12087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f12088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f12089c;

        e(Runnable runnable, Executor executor) {
            this.f12087a = runnable;
            this.f12088b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f12090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f12091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f12092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f12093d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f12094e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f12090a = atomicReferenceFieldUpdater;
            this.f12091b = atomicReferenceFieldUpdater2;
            this.f12092c = atomicReferenceFieldUpdater3;
            this.f12093d = atomicReferenceFieldUpdater4;
            this.f12094e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return this.f12093d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return this.f12094e.compareAndSet(aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return this.f12092c.compareAndSet(aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f12091b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f12090a.lazySet(hVar, thread);
        }
    }

    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f12079r != eVar) {
                        return false;
                    }
                    aVar.f12079r = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f12078q != obj) {
                        return false;
                    }
                    aVar.f12078q = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f12080s != hVar) {
                        return false;
                    }
                    aVar.f12080s = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f12097b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f12096a = thread;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f12095c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f12096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f12097b;

        h(boolean z9) {
        }

        void a(h hVar) {
            a.f12076v.d(this, hVar);
        }

        void b() {
            Thread thread = this.f12096a;
            if (thread != null) {
                this.f12096a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f12076v.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "s"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "r"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "q"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f12076v = gVar;
        if (th != null) {
            f12075u.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12077w = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        try {
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(n(objH));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e d(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f12079r;
        } while (!f12076v.a(this, eVar2, e.f12086d));
        while (true) {
            e eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                return eVar3;
            }
            eVar2 = eVar.f12089c;
            eVar.f12089c = eVar3;
        }
    }

    static void e(a aVar) {
        aVar.k();
        aVar.b();
        e eVarD = aVar.d(null);
        while (eVarD != null) {
            e eVar = eVarD.f12089c;
            f(eVarD.f12087a, eVarD.f12088b);
            eVarD = eVar;
        }
    }

    private static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f12075u.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object g(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f12084b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f12085a);
        }
        if (obj == f12077w) {
            return null;
        }
        return obj;
    }

    static Object h(Future future) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void k() {
        h hVar;
        do {
            hVar = this.f12080s;
        } while (!f12076v.c(this, hVar, h.f12095c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f12097b;
        }
    }

    private void l(h hVar) {
        hVar.f12096a = null;
        while (true) {
            h hVar2 = this.f12080s;
            if (hVar2 == h.f12095c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f12097b;
                if (hVar2.f12096a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f12097b = hVar4;
                    if (hVar3.f12096a == null) {
                    }
                } else if (!f12076v.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    private String n(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        c cVar;
        Object obj = this.f12078q;
        if (obj == null) {
            if (f12074t) {
                cVar = new c(z9, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z9 ? c.f12081c : c.f12082d;
            }
            if (f12076v.b(this, obj, cVar)) {
                if (z9) {
                    i();
                }
                e(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12078q;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f12080s;
            if (hVar != h.f12095c) {
                h hVar2 = new h();
                while (true) {
                    hVar2.a(hVar);
                    if (f12076v.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                l(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12078q;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(hVar2);
                        break;
                    }
                    hVar = this.f12080s;
                    if (hVar == h.f12095c) {
                    }
                }
            }
            return g(this.f12078q);
        }
        while (nanos > 0) {
            Object obj3 = this.f12078q;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j9 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z9 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z9) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z9) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    protected void i() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12078q instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12078q != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean m(Object obj) {
        if (obj == null) {
            obj = f12077w;
        }
        if (!f12076v.b(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e10) {
                strJ = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strJ);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12078q;
            if (obj2 != null) {
                return g(obj2);
            }
            h hVar = this.f12080s;
            if (hVar != h.f12095c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f12076v.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12078q;
                            } else {
                                l(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return g(obj);
                    }
                    hVar = this.f12080s;
                } while (hVar != h.f12095c);
            }
            return g(this.f12078q);
        }
        throw new InterruptedException();
    }
}
