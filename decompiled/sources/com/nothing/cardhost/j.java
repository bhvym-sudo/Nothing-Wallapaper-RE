package com.nothing.cardhost;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f17984a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray f17985b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HandlerThread f17986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Handler f17987d;

    private j() {
    }

    public final synchronized void a() {
        e();
        SparseArray sparseArray = f17985b;
        sparseArray.clear();
        G5.c.f1948a.g("Clear periodWorkArray.size = " + sparseArray.size());
    }

    public final synchronized Handler b() {
        Handler handler;
        try {
            if (f17987d == null) {
                HandlerThread handlerThread = new HandlerThread("PeriodRefreshWork");
                handlerThread.start();
                f17986c = handlerThread;
                HandlerThread handlerThread2 = f17986c;
                n.e(handlerThread2);
                f17987d = new Handler(handlerThread2.getLooper());
            }
            handler = f17987d;
            n.e(handler);
        } catch (Throwable th) {
            throw th;
        }
        return handler;
    }

    public final synchronized i c(int i10) {
        return (i) f17985b.get(i10);
    }

    public final synchronized void d(int i10, i work) {
        n.h(work, "work");
        SparseArray sparseArray = f17985b;
        sparseArray.put(i10, work);
        G5.c.f1948a.g("Put periodWorkArray.size = " + sparseArray.size());
    }

    public final synchronized void e() {
        try {
            Handler handler = f17987d;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = f17986c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            f17987d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(int i10) {
        try {
            SparseArray sparseArray = f17985b;
            i iVar = (i) sparseArray.get(i10);
            if (iVar != null) {
                iVar.h();
            }
            sparseArray.remove(i10);
            G5.c.f1948a.g("Remove periodWorkArray.size = " + sparseArray.size());
        } catch (Throwable th) {
            throw th;
        }
    }
}
