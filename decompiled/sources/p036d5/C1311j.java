package p036d5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p025c4.AbstractC1202p;
import p155p4.B;

/* JADX INFO: renamed from: d5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1311j extends B {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ThreadLocal f19583r = new ThreadLocal();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ThreadPoolExecutor f19584q;

    public C1311j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: d5.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: d5.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1311j.d(runnable);
                    }
                });
            }
        });
        this.f19584q = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void d(Runnable runnable) {
        f19583r.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Deque deque, Runnable runnable) {
        AbstractC1202p.i(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // p155p4.AbstractC1465g
    protected final /* synthetic */ Object a() {
        return this.f19584q;
    }

    @Override // p155p4.B
    protected final ExecutorService b() {
        return this.f19584q;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f19583r.get();
        if (deque == null || deque.size() > 1) {
            this.f19584q.execute(new Runnable() { // from class: d5.u
                @Override // java.lang.Runnable
                public final void run() {
                    C1311j.e((Deque) C1311j.f19583r.get(), runnable);
                }
            });
        } else {
            e(deque, runnable);
        }
    }
}
