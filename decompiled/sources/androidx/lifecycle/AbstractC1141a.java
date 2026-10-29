package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1141a extends d0.e implements d0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p082i1.d f13361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC1157q f13362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f13363d;

    public AbstractC1141a(p082i1.f owner, Bundle bundle) {
        kotlin.jvm.internal.n.h(owner, "owner");
        this.f13361b = owner.getSavedStateRegistry();
        this.f13362c = owner.getLifecycle();
        this.f13363d = bundle;
    }

    private final a0 e(String str, Class cls) {
        p082i1.d dVar = this.f13361b;
        kotlin.jvm.internal.n.e(dVar);
        AbstractC1157q abstractC1157q = this.f13362c;
        kotlin.jvm.internal.n.e(abstractC1157q);
        T tB = C1156p.b(dVar, abstractC1157q, str, this.f13363d);
        a0 a0VarF = f(str, cls, tB.f());
        a0VarF.a("androidx.lifecycle.savedstate.vm.tag", tB);
        return a0VarF;
    }

    @Override // androidx.lifecycle.d0.c
    public a0 a(Class modelClass) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f13362c != null) {
            return e(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.d0.c
    public a0 c(Class modelClass, Z0.a extras) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        kotlin.jvm.internal.n.h(extras, "extras");
        String str = (String) extras.a(d0.d.f13402d);
        if (str != null) {
            return this.f13361b != null ? e(str, modelClass) : f(str, modelClass, U.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.d0.e
    public void d(a0 viewModel) {
        kotlin.jvm.internal.n.h(viewModel, "viewModel");
        p082i1.d dVar = this.f13361b;
        if (dVar != null) {
            kotlin.jvm.internal.n.e(dVar);
            AbstractC1157q abstractC1157q = this.f13362c;
            kotlin.jvm.internal.n.e(abstractC1157q);
            C1156p.a(viewModel, dVar, abstractC1157q);
        }
    }

    protected abstract a0 f(String str, Class cls, Q q9);
}
