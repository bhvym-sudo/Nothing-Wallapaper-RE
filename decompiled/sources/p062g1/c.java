package p062g1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p142o1.g;
import p142o1.h;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f21001m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f21002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f21003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f21004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f21005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f21006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f21007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f21010i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f21012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f21013l;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public c(long j9, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        n.h(autoCloseTimeUnit, "autoCloseTimeUnit");
        n.h(autoCloseExecutor, "autoCloseExecutor");
        this.f21003b = new Handler(Looper.getMainLooper());
        this.f21005d = new Object();
        this.f21006e = autoCloseTimeUnit.toMillis(j9);
        this.f21007f = autoCloseExecutor;
        this.f21009h = SystemClock.uptimeMillis();
        this.f21012k = new Runnable() { // from class: g1.a
            @Override // java.lang.Runnable
            public final void run() {
                c.f(this.f20999q);
            }
        };
        this.f21013l = new Runnable() { // from class: g1.b
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f21000q);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0) {
        A a10;
        n.h(this$0, "this$0");
        synchronized (this$0.f21005d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f21009h < this$0.f21006e) {
                    return;
                }
                if (this$0.f21008g != 0) {
                    return;
                }
                Runnable runnable = this$0.f21004c;
                if (runnable != null) {
                    runnable.run();
                    a10 = A.f21846a;
                } else {
                    a10 = null;
                }
                if (a10 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                g gVar = this$0.f21010i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f21010i = null;
                A a11 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0) {
        n.h(this$0, "this$0");
        this$0.f21007f.execute(this$0.f21013l);
    }

    public final void d() {
        synchronized (this.f21005d) {
            try {
                this.f21011j = true;
                g gVar = this.f21010i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f21010i = null;
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f21005d) {
            try {
                int i10 = this.f21008g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f21008g = i11;
                if (i11 == 0) {
                    if (this.f21010i == null) {
                        return;
                    } else {
                        this.f21003b.postDelayed(this.f21012k, this.f21006e);
                    }
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(l block) {
        n.h(block, "block");
        try {
            return block.f(j());
        } finally {
            e();
        }
    }

    public final g h() {
        return this.f21010i;
    }

    public final h i() {
        h hVar = this.f21002a;
        if (hVar != null) {
            return hVar;
        }
        n.r("delegateOpenHelper");
        return null;
    }

    public final g j() {
        synchronized (this.f21005d) {
            this.f21003b.removeCallbacks(this.f21012k);
            this.f21008g++;
            if (this.f21011j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            g gVar = this.f21010i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            g gVarE0 = i().e0();
            this.f21010i = gVarE0;
            return gVarE0;
        }
    }

    public final void k(h delegateOpenHelper) {
        n.h(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        n.h(onAutoClose, "onAutoClose");
        this.f21004c = onAutoClose;
    }

    public final void m(h hVar) {
        n.h(hVar, "<set-?>");
        this.f21002a = hVar;
    }
}
