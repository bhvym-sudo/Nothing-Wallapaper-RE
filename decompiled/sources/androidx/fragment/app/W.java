package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.InterfaceC1155o;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;

/* JADX INFO: loaded from: classes.dex */
class W implements InterfaceC1155o, p082i1.f, f0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractComponentCallbacksC1132q f13039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e0 f13040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f13041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.lifecycle.d0.c f13042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private C1165z f13043u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private p082i1.e f13044v = null;

    W(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q, e0 e0Var, Runnable runnable) {
        this.f13039q = abstractComponentCallbacksC1132q;
        this.f13040r = e0Var;
        this.f13041s = runnable;
    }

    void a(AbstractC1157q.a aVar) {
        this.f13043u.i(aVar);
    }

    void b() {
        if (this.f13043u == null) {
            this.f13043u = new C1165z(this);
            p082i1.e eVarA = p082i1.e.a(this);
            this.f13044v = eVarA;
            eVarA.c();
            this.f13041s.run();
        }
    }

    boolean c() {
        return this.f13043u != null;
    }

    void d(Bundle bundle) {
        this.f13044v.d(bundle);
    }

    void e(Bundle bundle) {
        this.f13044v.e(bundle);
    }

    void g(AbstractC1157q.b bVar) {
        this.f13043u.n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC1155o
    public Z0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f13039q.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        Z0.b bVar = new Z0.b();
        if (application != null) {
            bVar.c(androidx.lifecycle.d0.a.f13396h, application);
        }
        bVar.c(androidx.lifecycle.U.f13345a, this.f13039q);
        bVar.c(androidx.lifecycle.U.f13346b, this);
        if (this.f13039q.getArguments() != null) {
            bVar.c(androidx.lifecycle.U.f13347c, this.f13039q.getArguments());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.InterfaceC1155o
    public androidx.lifecycle.d0.c getDefaultViewModelProviderFactory() {
        Application application;
        androidx.lifecycle.d0.c defaultViewModelProviderFactory = this.f13039q.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f13039q.mDefaultFactory)) {
            this.f13042t = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f13042t == null) {
            Context applicationContext = this.f13039q.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = this.f13039q;
            this.f13042t = new androidx.lifecycle.X(application, abstractComponentCallbacksC1132q, abstractComponentCallbacksC1132q.getArguments());
        }
        return this.f13042t;
    }

    @Override // androidx.lifecycle.InterfaceC1163x
    public AbstractC1157q getLifecycle() {
        b();
        return this.f13043u;
    }

    @Override // p082i1.f
    public p082i1.d getSavedStateRegistry() {
        b();
        return this.f13044v.b();
    }

    @Override // androidx.lifecycle.f0
    public e0 getViewModelStore() {
        b();
        return this.f13040r;
    }
}
