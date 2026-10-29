package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f12858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f12859b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final J.k f12860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f12861b;

        public a(J.k callback, boolean z9) {
            kotlin.jvm.internal.n.h(callback, "callback");
            this.f12860a = callback;
            this.f12861b = z9;
        }

        public final J.k a() {
            return this.f12860a;
        }

        public final boolean b() {
            return this.f12861b;
        }
    }

    public C(J fragmentManager) {
        kotlin.jvm.internal.n.h(fragmentManager, "fragmentManager");
        this.f12858a = fragmentManager;
        this.f12859b = new CopyOnWriteArrayList();
    }

    public final void a(AbstractComponentCallbacksC1132q f10, Bundle bundle, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().a(f10, bundle, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentActivityCreated(this.f12858a, f10, bundle);
            }
        }
    }

    public final void b(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        Context contextH = this.f12858a.y0().h();
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().b(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentAttached(this.f12858a, f10, contextH);
            }
        }
    }

    public final void c(AbstractComponentCallbacksC1132q f10, Bundle bundle, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().c(f10, bundle, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentCreated(this.f12858a, f10, bundle);
            }
        }
    }

    public final void d(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().d(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentDestroyed(this.f12858a, f10);
            }
        }
    }

    public final void e(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().e(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentDetached(this.f12858a, f10);
            }
        }
    }

    public final void f(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().f(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentPaused(this.f12858a, f10);
            }
        }
    }

    public final void g(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        Context contextH = this.f12858a.y0().h();
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().g(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentPreAttached(this.f12858a, f10, contextH);
            }
        }
    }

    public final void h(AbstractComponentCallbacksC1132q f10, Bundle bundle, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().h(f10, bundle, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentPreCreated(this.f12858a, f10, bundle);
            }
        }
    }

    public final void i(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().i(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentResumed(this.f12858a, f10);
            }
        }
    }

    public final void j(AbstractComponentCallbacksC1132q f10, Bundle outState, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        kotlin.jvm.internal.n.h(outState, "outState");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().j(f10, outState, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentSaveInstanceState(this.f12858a, f10, outState);
            }
        }
    }

    public final void k(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().k(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentStarted(this.f12858a, f10);
            }
        }
    }

    public final void l(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().l(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentStopped(this.f12858a, f10);
            }
        }
    }

    public final void m(AbstractComponentCallbacksC1132q f10, View v9, Bundle bundle, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        kotlin.jvm.internal.n.h(v9, "v");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().m(f10, v9, bundle, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentViewCreated(this.f12858a, f10, v9, bundle);
            }
        }
    }

    public final void n(AbstractComponentCallbacksC1132q f10, boolean z9) {
        kotlin.jvm.internal.n.h(f10, "f");
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qB0 = this.f12858a.B0();
        if (abstractComponentCallbacksC1132qB0 != null) {
            J parentFragmentManager = abstractComponentCallbacksC1132qB0.getParentFragmentManager();
            kotlin.jvm.internal.n.g(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.A0().n(f10, true);
        }
        for (a aVar : this.f12859b) {
            if (!z9 || aVar.b()) {
                aVar.a().onFragmentViewDestroyed(this.f12858a, f10);
            }
        }
    }

    public final void o(J.k cb, boolean z9) {
        kotlin.jvm.internal.n.h(cb, "cb");
        this.f12859b.add(new a(cb, z9));
    }

    public final void p(J.k cb) {
        kotlin.jvm.internal.n.h(cb, "cb");
        synchronized (this.f12859b) {
            try {
                int size = this.f12859b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((a) this.f12859b.get(i10)).a() == cb) {
                        this.f12859b.remove(i10);
                        break;
                    }
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
