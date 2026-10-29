package P8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f6352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f6353d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6350a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6351b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f6354e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f6355f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f6356g = new ArrayDeque();

    private final U8.e.a d(String str) {
        for (U8.e.a aVar : this.f6355f) {
            if (kotlin.jvm.internal.n.d(aVar.d(), str)) {
                return aVar;
            }
        }
        for (U8.e.a aVar2 : this.f6354e) {
            if (kotlin.jvm.internal.n.d(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f6352c;
            p079h8.A a10 = p079h8.A.f21846a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z9;
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f6354e.iterator();
                kotlin.jvm.internal.n.g(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    U8.e.a asyncCall = (U8.e.a) it.next();
                    if (this.f6355f.size() >= this.f6350a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f6351b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        kotlin.jvm.internal.n.g(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f6355f.add(asyncCall);
                    }
                }
                z9 = i() > 0;
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((U8.e.a) arrayList.get(i10)).a(c());
        }
        return z9;
    }

    public final void a(U8.e.a call) {
        U8.e.a aVarD;
        kotlin.jvm.internal.n.h(call, "call");
        synchronized (this) {
            try {
                this.f6354e.add(call);
                if (!call.b().q() && (aVarD = d(call.d())) != null) {
                    call.e(aVarD);
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(U8.e call) {
        kotlin.jvm.internal.n.h(call, "call");
        this.f6356g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f6353d == null) {
                this.f6353d = new ThreadPoolExecutor(0, SubsamplingScaleImageView.TILE_SIZE_AUTO, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Q8.d.M(Q8.d.f6933i + " Dispatcher", false));
            }
            executorService = this.f6353d;
            kotlin.jvm.internal.n.e(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void f(U8.e.a call) {
        kotlin.jvm.internal.n.h(call, "call");
        call.c().decrementAndGet();
        e(this.f6355f, call);
    }

    public final void g(U8.e call) {
        kotlin.jvm.internal.n.h(call, "call");
        e(this.f6356g, call);
    }

    public final synchronized int i() {
        return this.f6355f.size() + this.f6356g.size();
    }
}
