package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1228e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1226c f16256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z3.c[] f16257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16259d;

    protected AbstractC1228e(C1226c c1226c, Z3.c[] cVarArr, boolean z9, int i10) {
        this.f16256a = c1226c;
        this.f16257b = cVarArr;
        this.f16258c = z9;
        this.f16259d = i10;
    }

    public void a() {
        this.f16256a.a();
    }

    public C1226c.a b() {
        return this.f16256a.b();
    }

    public Z3.c[] c() {
        return this.f16257b;
    }

    protected abstract void d(a4.a.b bVar, p215v4.l lVar);

    public final int e() {
        return this.f16259d;
    }

    public final boolean f() {
        return this.f16258c;
    }
}
