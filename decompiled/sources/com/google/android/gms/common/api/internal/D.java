package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public final class D extends A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1226c.a f16212c;

    public D(C1226c.a aVar, p215v4.l lVar) {
        super(4, lVar);
        this.f16212c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.E
    public final /* bridge */ /* synthetic */ void d(j jVar, boolean z9) {
    }

    @Override // p015b4.r
    public final boolean f(q qVar) {
        p015b4.t tVar = (p015b4.t) qVar.w().get(this.f16212c);
        return tVar != null && tVar.f14912a.f();
    }

    @Override // p015b4.r
    public final Z3.c[] g(q qVar) {
        p015b4.t tVar = (p015b4.t) qVar.w().get(this.f16212c);
        if (tVar == null) {
            return null;
        }
        return tVar.f14912a.c();
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void h(q qVar) {
        p015b4.t tVar = (p015b4.t) qVar.w().remove(this.f16212c);
        if (tVar == null) {
            this.f16207b.e(Boolean.FALSE);
        } else {
            tVar.f14913b.b(qVar.u(), this.f16207b);
            tVar.f14912a.a();
        }
    }
}
