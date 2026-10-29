package com.google.android.gms.common.api.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ Z3.a f16305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ t f16306r;

    s(t tVar, Z3.a aVar) {
        this.f16306r = tVar;
        this.f16305q = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f16306r;
        q qVar = (q) tVar.f16312f.f16245l.get(tVar.f16308b);
        if (qVar == null) {
            return;
        }
        if (!this.f16305q.e()) {
            qVar.G(this.f16305q, null);
            return;
        }
        this.f16306r.f16311e = true;
        if (this.f16306r.f16307a.o()) {
            this.f16306r.h();
            return;
        }
        try {
            t tVar2 = this.f16306r;
            tVar2.f16307a.i(null, tVar2.f16307a.b());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f16306r.f16307a.c("Failed to get service from broker.");
            qVar.G(new Z3.a(10), null);
        }
    }
}
