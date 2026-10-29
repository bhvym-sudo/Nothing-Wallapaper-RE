package p241y0;

import B0.i;
import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f30142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f30143b;

        /* JADX INFO: renamed from: y0.h$a$a, reason: collision with other inner class name */
        private static class C0742a extends Thread {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final int f30144q;

            C0742a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f30144q = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f30144q);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f30142a = str;
            this.f30143b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0742a(runnable, this.f30142a, this.f30143b);
        }
    }

    private static class b implements Executor {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Handler f30145q;

        b(Handler handler) {
            this.f30145q = (Handler) i.e(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f30145q.post((Runnable) i.e(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f30145q + " is shutting down");
        }
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Callable f30146q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private B0.a f30147r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Handler f30148s;

        class a implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ B0.a f30149q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Object f30150r;

            a(B0.a aVar, Object obj) {
                this.f30149q = aVar;
                this.f30150r = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f30149q.accept(this.f30150r);
            }
        }

        c(Handler handler, Callable callable, B0.a aVar) {
            this.f30146q = callable;
            this.f30147r = aVar;
            this.f30148s = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f30146q.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f30148s.post(new a(this.f30147r, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, B0.a aVar) {
        executor.execute(new c(p241y0.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
