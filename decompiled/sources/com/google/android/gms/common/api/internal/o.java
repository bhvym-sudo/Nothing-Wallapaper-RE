package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class o implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ p f16288q;

    o(p pVar) {
        this.f16288q = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f16288q.f16289a;
        qVar.f16294r.c(qVar.f16294r.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
