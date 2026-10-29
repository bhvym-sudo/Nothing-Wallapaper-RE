package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
final class H implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final F f16218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ I f16219r;

    H(I i10, F f10) {
        this.f16219r = i10;
        this.f16218q = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16219r.f16220r) {
            Z3.a aVarB = this.f16218q.b();
            if (aVarB.d()) {
                I i10 = this.f16219r;
                i10.f16224q.startActivityForResult(GoogleApiActivity.a(i10.b(), (PendingIntent) AbstractC1202p.i(aVarB.c()), this.f16218q.a(), false), 1);
                return;
            }
            I i11 = this.f16219r;
            if (i11.f16223u.a(i11.b(), aVarB.a(), null) != null) {
                I i12 = this.f16219r;
                i12.f16223u.u(i12.b(), this.f16219r.f16224q, aVarB.a(), 2, this.f16219r);
            } else {
                if (aVarB.a() != 18) {
                    this.f16219r.l(aVarB, this.f16218q.a());
                    return;
                }
                I i13 = this.f16219r;
                Dialog dialogP = i13.f16223u.p(i13.b(), this.f16219r);
                I i14 = this.f16219r;
                i14.f16223u.q(i14.b().getApplicationContext(), new G(this, dialogP));
            }
        }
    }
}
