package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class x extends AbstractC1228e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ C1229f.a f16324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C1229f.a aVar, C1226c c1226c, Z3.c[] cVarArr, boolean z9, int i10) {
        super(c1226c, cVarArr, z9, i10);
        this.f16324e = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1228e
    protected final void d(a4.a.b bVar, p215v4.l lVar) {
        this.f16324e.f16263a.accept(bVar, lVar);
    }
}
