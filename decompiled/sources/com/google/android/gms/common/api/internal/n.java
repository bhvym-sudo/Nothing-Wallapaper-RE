package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class n implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f16286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ q f16287r;

    n(q qVar, int i10) {
        this.f16287r = qVar;
        this.f16286q = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16287r.k(this.f16286q);
    }
}
