package F2;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: F2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0797d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f1554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadPoolExecutor f1555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f1556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f1557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f1558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ExecutorService f1559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f1560h;

    /* JADX INFO: renamed from: F2.d$a */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f1562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f1563c = new AtomicInteger(0);

        public a(String str, int i10) {
            this.f1562b = str;
            this.f1561a = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            Process.setThreadPriority(this.f1561a);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: F2.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1551q.b(runnable);
                }
            }, this.f1562b + this.f1563c.incrementAndGet());
        }
    }

    static {
        int iMax = Math.max(Runtime.getRuntime().availableProcessors(), 2);
        f1553a = iMax;
        f1554b = new ConcurrentHashMap();
        f1555c = new ThreadPoolExecutor(iMax, iMax, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f1556d = new i(b("BackgroundExecutor", 10));
        f1557e = new i(Looper.getMainLooper());
        f1558f = new i(b("UiThreadHelper", -2));
        f1559g = Executors.newSingleThreadExecutor(new a("preinflate-allapps-icons", 10));
        f1560h = new i(a("launcher-loader"));
    }

    public static Looper a(String str) {
        return b(str, 0);
    }

    public static Looper b(String str, int i10) {
        HandlerThread handlerThread = new HandlerThread(str, i10);
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
