package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
final class G extends p015b4.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f16216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ H f16217b;

    G(H h10, Dialog dialog) {
        this.f16217b = h10;
        this.f16216a = dialog;
    }

    @Override // p015b4.p
    public final void a() {
        this.f16217b.f16219r.o();
        if (this.f16216a.isShowing()) {
            this.f16216a.dismiss();
        }
    }
}
