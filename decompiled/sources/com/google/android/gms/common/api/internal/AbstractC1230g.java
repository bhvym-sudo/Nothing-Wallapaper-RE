package com.google.android.gms.common.api.internal;

import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1230g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z3.c[] f16270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16272c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.g$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p015b4.i f16273a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Z3.c[] f16275c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16274b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16276d = 0;

        /* synthetic */ a(p015b4.B b10) {
        }

        public AbstractC1230g a() {
            AbstractC1202p.b(this.f16273a != null, "execute parameter required");
            return new z(this, this.f16275c, this.f16274b, this.f16276d);
        }

        public a b(p015b4.i iVar) {
            this.f16273a = iVar;
            return this;
        }

        public a c(boolean z9) {
            this.f16274b = z9;
            return this;
        }

        public a d(Z3.c... cVarArr) {
            this.f16275c = cVarArr;
            return this;
        }

        public a e(int i10) {
            this.f16276d = i10;
            return this;
        }
    }

    protected AbstractC1230g(Z3.c[] cVarArr, boolean z9, int i10) {
        this.f16270a = cVarArr;
        boolean z10 = false;
        if (cVarArr != null && z9) {
            z10 = true;
        }
        this.f16271b = z10;
        this.f16272c = i10;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a4.a.b bVar, p215v4.l lVar);

    public boolean c() {
        return this.f16271b;
    }

    public final int d() {
        return this.f16272c;
    }

    public final Z3.c[] e() {
        return this.f16270a;
    }
}
