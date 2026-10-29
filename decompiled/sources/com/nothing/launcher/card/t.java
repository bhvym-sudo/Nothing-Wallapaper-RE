package com.nothing.launcher.card;

import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends C2.b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f18156M = new a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f18157F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final ComponentName f18158G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f18159H = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f18160I = -1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f18161J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f18162K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f18163L;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public t(int i10, ComponentName componentName) {
        this.f18157F = i10;
        this.f18158G = componentName;
        this.f597u = -1;
        this.f598v = -1;
        this.f593q = i10;
        this.f591C = Process.myUserHandle();
    }

    @Override // C2.b
    protected String b() {
        return super.b() + " providerName=" + this.f18158G + " widgetId=" + this.f18157F;
    }

    @Override // C2.b
    public ComponentName d() {
        return this.f18158G;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f18157F == tVar.f18157F && kotlin.jvm.internal.n.d(this.f18158G, tVar.f18158G);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f18157F) * 31;
        ComponentName componentName = this.f18158G;
        return iHashCode + (componentName == null ? 0 : componentName.hashCode());
    }

    public final int k() {
        return this.f18159H;
    }

    public final int l() {
        return this.f18160I;
    }

    public final int m() {
        return this.f18157F;
    }

    public final boolean n() {
        return this.f18161J;
    }

    public final boolean o(t other) {
        kotlin.jvm.internal.n.h(other, "other");
        return this.f18157F == other.f18157F && this.f595s == other.f595s && this.f596t == other.f596t && this.f597u == other.f597u && this.f598v == other.f598v && this.f18159H == other.f18159H && this.f18160I == other.f18160I;
    }

    public final boolean p() {
        int i10 = this.f18162K;
        return (i10 & 1) == 0 || (i10 & 16) == 16;
    }

    public final void q(Context launcher, com.nothing.cardhost.g hostView) {
        kotlin.jvm.internal.n.h(launcher, "launcher");
        kotlin.jvm.internal.n.h(hostView, "hostView");
        if (this.f18163L) {
            return;
        }
        V5.a.f(hostView, launcher, this.f597u, this.f598v);
        this.f18163L = true;
    }

    public final void r(int i10) {
        this.f18159H = i10;
    }

    public final void s(int i10) {
        this.f18160I = i10;
    }

    public final void t(boolean z9) {
        this.f18161J = z9;
    }
}
