package com.nothing.cardhost;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f17975h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SoftReference f17980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SoftReference f17981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f17982g;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler = (Handler) i.this.f17981f.get();
            if (handler != null) {
                handler.removeCallbacks(this);
            }
            if (i.this.f()) {
                long jAbs = Math.abs(SystemClock.elapsedRealtime() - i.this.f17979d);
                boolean z9 = jAbs > i.this.f17977b;
                if (z9) {
                    i.this.g();
                }
                long j9 = z9 ? i.this.f17977b : i.this.f17977b - jAbs;
                Handler handler2 = (Handler) i.this.f17981f.get();
                if (handler2 != null) {
                    handler2.postDelayed(this, j9);
                }
                G5.c.f1948a.h("PeriodRefreshWork", "Delay to update widget, refresh time = " + j9 + " ms");
            }
        }
    }

    public i(int i10, Handler periodHandler, h timeOutCallback) {
        n.h(periodHandler, "periodHandler");
        n.h(timeOutCallback, "timeOutCallback");
        this.f17976a = i10;
        this.f17977b = ((long) i10) * 60000;
        this.f17979d = SystemClock.elapsedRealtime();
        this.f17980e = new SoftReference(timeOutCallback);
        this.f17981f = new SoftReference(periodHandler);
        this.f17982g = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        return this.f17976a > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        h hVar = (h) this.f17980e.get();
        G5.c.f1948a.h("PeriodRefreshWork", "notifyTimeUp hostCallback:" + hVar + ", isValidPeriodTime():" + f());
        if (hVar == null || !f()) {
            return;
        }
        this.f17979d = SystemClock.elapsedRealtime();
        hVar.a();
    }

    public final void h() {
        G5.c.f1948a.g("PeriodRefreshWork recycled");
        Handler handler = (Handler) this.f17981f.get();
        if (handler != null) {
            handler.removeCallbacks(this.f17982g);
        }
    }

    public final void i(Handler periodHandler, h timeOutCallback) {
        n.h(periodHandler, "periodHandler");
        n.h(timeOutCallback, "timeOutCallback");
        if (this.f17980e.get() == null) {
            this.f17980e = new SoftReference(timeOutCallback);
        }
        if (this.f17981f.get() == null) {
            this.f17981f = new SoftReference(periodHandler);
        }
    }

    public final void j() {
        if (f()) {
            this.f17978c = true;
            this.f17982g.run();
        } else {
            Handler handler = (Handler) this.f17981f.get();
            if (handler != null) {
                handler.removeCallbacks(this.f17982g);
            }
        }
    }

    public final void k(boolean z9) {
        if (f()) {
            boolean z10 = this.f17978c;
            if (!z10 && z9) {
                this.f17978c = true;
                this.f17982g.run();
            } else {
                if (!z10 || z9) {
                    return;
                }
                this.f17978c = false;
                Handler handler = (Handler) this.f17981f.get();
                if (handler != null) {
                    handler.removeCallbacks(this.f17982g);
                }
            }
        }
    }

    public final void l(int i10) {
        this.f17976a = i10;
        this.f17977b = ((long) i10) * 60000;
        if (f()) {
            this.f17979d = SystemClock.elapsedRealtime();
            return;
        }
        Handler handler = (Handler) this.f17981f.get();
        if (handler != null) {
            handler.removeCallbacks(this.f17982g);
        }
    }
}
