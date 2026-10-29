package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class B extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p015b4.t f16208c;

    public B(p015b4.t tVar, p215v4.l lVar) {
        super(3, lVar);
        this.f16208c = tVar;
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final /* bridge */ /* synthetic */ void d(j jVar, boolean z9) {
    }

    @Override // p015b4.r
    public final boolean f(q qVar) {
        return this.f16208c.f14912a.f();
    }

    @Override // p015b4.r
    public final Z3.c[] g(q qVar) {
        return this.f16208c.f14912a.c();
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void h(q qVar) {
        this.f16208c.f14912a.d(qVar.u(), this.f16207b);
        C1226c.a aVarB = this.f16208c.f14912a.b();
        if (aVarB != null) {
            qVar.w().put(aVarB, this.f16208c);
        }
    }
}
