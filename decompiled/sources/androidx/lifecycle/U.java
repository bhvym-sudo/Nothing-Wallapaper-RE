package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z0.a.b f13345a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z0.a.b f13346b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z0.a.b f13347c = new a();

    public static final class a implements Z0.a.b {
        a() {
        }
    }

    public static final class b implements Z0.a.b {
        b() {
        }
    }

    public static final class c implements Z0.a.b {
        c() {
        }
    }

    public static final class d implements d0.c {
        d() {
        }

        @Override // androidx.lifecycle.d0.c
        public a0 c(Class modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            return new W();
        }
    }

    public static final Q a(Z0.a aVar) {
        kotlin.jvm.internal.n.h(aVar, "<this>");
        p082i1.f fVar = (p082i1.f) aVar.a(f13345a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        f0 f0Var = (f0) aVar.a(f13346b);
        if (f0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f13347c);
        String str = (String) aVar.a(d0.d.f13402d);
        if (str != null) {
            return b(fVar, f0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final Q b(p082i1.f fVar, f0 f0Var, String str, Bundle bundle) {
        V vD = d(fVar);
        W wE = e(f0Var);
        Q q9 = (Q) wE.e().get(str);
        if (q9 != null) {
            return q9;
        }
        Q qA = Q.f13334f.a(vD.a(str), bundle);
        wE.e().put(str, qA);
        return qA;
    }

    public static final void c(p082i1.f fVar) {
        kotlin.jvm.internal.n.h(fVar, "<this>");
        AbstractC1157q.b bVarB = fVar.getLifecycle().b();
        if (bVarB != AbstractC1157q.b.INITIALIZED && bVarB != AbstractC1157q.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            V v9 = new V(fVar.getSavedStateRegistry(), (f0) fVar);
            fVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", v9);
            fVar.getLifecycle().a(new S(v9));
        }
    }

    public static final V d(p082i1.f fVar) {
        kotlin.jvm.internal.n.h(fVar, "<this>");
        i1.d.c cVarC = fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        V v9 = cVarC instanceof V ? (V) cVarC : null;
        if (v9 != null) {
            return v9;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final W e(f0 f0Var) {
        kotlin.jvm.internal.n.h(f0Var, "<this>");
        return (W) new d0(f0Var, new d()).c("androidx.lifecycle.internal.SavedStateHandlesVM", W.class);
    }
}
