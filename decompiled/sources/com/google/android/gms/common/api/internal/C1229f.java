package com.google.android.gms.common.api.internal;

import p025c4.AbstractC1202p;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1229f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1228e f16260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1231h f16261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f16262c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.f$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p015b4.i f16263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p015b4.i f16264b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C1226c f16266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Z3.c[] f16267e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16269g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f16265c = new Runnable() { // from class: b4.u
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16268f = true;

        /* synthetic */ a(p015b4.v vVar) {
        }

        public C1229f a() {
            AbstractC1202p.b(this.f16263a != null, "Must set register function");
            AbstractC1202p.b(this.f16264b != null, "Must set unregister function");
            AbstractC1202p.b(this.f16266d != null, "Must set holder");
            return new C1229f(new x(this, this.f16266d, this.f16267e, this.f16268f, this.f16269g), new y(this, (C1226c.a) AbstractC1202p.j(this.f16266d.b(), "Key must not be null")), this.f16265c, null);
        }

        public a b(p015b4.i iVar) {
            this.f16263a = iVar;
            return this;
        }

        public a c(boolean z9) {
            this.f16268f = z9;
            return this;
        }

        public a d(Z3.c... cVarArr) {
            this.f16267e = cVarArr;
            return this;
        }

        public a e(int i10) {
            this.f16269g = i10;
            return this;
        }

        public a f(p015b4.i iVar) {
            this.f16264b = iVar;
            return this;
        }

        public a g(C1226c c1226c) {
            this.f16266d = c1226c;
            return this;
        }
    }

    /* synthetic */ C1229f(AbstractC1228e abstractC1228e, AbstractC1231h abstractC1231h, Runnable runnable, p015b4.w wVar) {
        this.f16260a = abstractC1228e;
        this.f16261b = abstractC1231h;
        this.f16262c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
