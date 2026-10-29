package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1156p f13442a = new C1156p();

    /* JADX INFO: renamed from: androidx.lifecycle.p$a */
    public static final class a implements i1.d.a {
        @Override // i1.d.a
        public void a(p082i1.f owner) {
            kotlin.jvm.internal.n.h(owner, "owner");
            if (!(owner instanceof f0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            e0 viewModelStore = ((f0) owner).getViewModelStore();
            p082i1.d savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                a0 a0VarB = viewModelStore.b((String) it.next());
                kotlin.jvm.internal.n.e(a0VarB);
                C1156p.a(a0VarB, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.p$b */
    public static final class b implements InterfaceC1160u {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ AbstractC1157q f13443q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p082i1.d f13444r;

        b(AbstractC1157q abstractC1157q, p082i1.d dVar) {
            this.f13443q = abstractC1157q;
            this.f13444r = dVar;
        }

        @Override // androidx.lifecycle.InterfaceC1160u
        public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
            kotlin.jvm.internal.n.h(source, "source");
            kotlin.jvm.internal.n.h(event, "event");
            if (event == AbstractC1157q.a.ON_START) {
                this.f13443q.d(this);
                this.f13444r.i(a.class);
            }
        }
    }

    private C1156p() {
    }

    public static final void a(a0 viewModel, p082i1.d registry, AbstractC1157q lifecycle) {
        kotlin.jvm.internal.n.h(viewModel, "viewModel");
        kotlin.jvm.internal.n.h(registry, "registry");
        kotlin.jvm.internal.n.h(lifecycle, "lifecycle");
        T t9 = (T) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (t9 == null || t9.u()) {
            return;
        }
        t9.a(registry, lifecycle);
        f13442a.c(registry, lifecycle);
    }

    public static final T b(p082i1.d registry, AbstractC1157q lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.n.h(registry, "registry");
        kotlin.jvm.internal.n.h(lifecycle, "lifecycle");
        kotlin.jvm.internal.n.e(str);
        T t9 = new T(str, Q.f13334f.a(registry.b(str), bundle));
        t9.a(registry, lifecycle);
        f13442a.c(registry, lifecycle);
        return t9;
    }

    private final void c(p082i1.d dVar, AbstractC1157q abstractC1157q) {
        AbstractC1157q.b bVarB = abstractC1157q.b();
        if (bVarB == AbstractC1157q.b.INITIALIZED || bVarB.e(AbstractC1157q.b.STARTED)) {
            dVar.i(a.class);
        } else {
            abstractC1157q.a(new b(abstractC1157q, dVar));
        }
    }
}
