package com.android.launcher3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.android.launcher3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1220b implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f15493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Handler f15495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private k f15496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f15497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f15498v;

    public RunnableC1220b() {
        this(Looper.myLooper());
    }

    public void a() {
        this.f15497u = false;
    }

    public void b(long j9) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f15497u = true;
        long j10 = this.f15493q;
        long j11 = jUptimeMillis + j9;
        this.f15493q = j11;
        this.f15498v = j9;
        if (this.f15494r && j10 > j11) {
            this.f15495s.removeCallbacks(this);
            this.f15494r = false;
        }
        if (this.f15494r) {
            return;
        }
        this.f15495s.postDelayed(this, this.f15493q - jUptimeMillis);
        this.f15494r = true;
    }

    public void c(k kVar) {
        this.f15496t = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15494r = false;
        if (this.f15497u) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j9 = this.f15493q;
            if (j9 > jUptimeMillis) {
                this.f15495s.postDelayed(this, Math.max(0L, j9 - jUptimeMillis));
                this.f15494r = true;
                return;
            }
            this.f15497u = false;
            k kVar = this.f15496t;
            if (kVar != null) {
                kVar.a(this);
            }
        }
    }

    public RunnableC1220b(Looper looper) {
        this.f15497u = false;
        this.f15495s = new Handler(looper);
    }
}
