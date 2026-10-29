package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C1022b;
import p015b4.C1182b;
import p015b4.InterfaceC1186f;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public final class k extends I {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final C1022b f16282v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final C1225b f16283w;

    k(InterfaceC1186f interfaceC1186f, C1225b c1225b, Z3.d dVar) {
        super(interfaceC1186f, dVar);
        this.f16282v = new C1022b();
        this.f16283w = c1225b;
        this.f16224q.d("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C1225b c1225b, C1182b c1182b) {
        InterfaceC1186f interfaceC1186fC = LifecycleCallback.c(activity);
        k kVar = (k) interfaceC1186fC.w("ConnectionlessLifecycleHelper", k.class);
        if (kVar == null) {
            kVar = new k(interfaceC1186fC, c1225b, Z3.d.l());
        }
        AbstractC1202p.j(c1182b, "ApiKey cannot be null");
        kVar.f16282v.add(c1182b);
        c1225b.c(kVar);
    }

    private final void v() {
        if (this.f16282v.isEmpty()) {
            return;
        }
        this.f16283w.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.I, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.I, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f16283w.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.I
    protected final void m(Z3.a aVar, int i10) {
        this.f16283w.H(aVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.I
    protected final void n() {
        this.f16283w.a();
    }

    final C1022b t() {
        return this.f16282v;
    }
}
