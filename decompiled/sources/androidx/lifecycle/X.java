package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class X extends d0.e implements d0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f13354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0.c f13355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f13356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1157q f13357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p082i1.d f13358f;

    public X(Application application, p082i1.f owner, Bundle bundle) {
        kotlin.jvm.internal.n.h(owner, "owner");
        this.f13358f = owner.getSavedStateRegistry();
        this.f13357e = owner.getLifecycle();
        this.f13356d = bundle;
        this.f13354b = application;
        this.f13355c = application != null ? d0.a.f13394f.a(application) : new d0.a();
    }

    @Override // androidx.lifecycle.d0.c
    public a0 a(Class modelClass) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.d0.c
    public a0 c(Class modelClass, Z0.a extras) {
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        kotlin.jvm.internal.n.h(extras, "extras");
        String str = (String) extras.a(d0.d.f13402d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(U.f13345a) == null || extras.a(U.f13346b) == null) {
            if (this.f13357e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(d0.a.f13396h);
        boolean zIsAssignableFrom = AbstractC1142b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? Y.c(modelClass, Y.f13360b) : Y.c(modelClass, Y.f13359a);
        if (constructorC == null) {
            return this.f13355c.c(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? Y.d(modelClass, constructorC, U.a(extras)) : Y.d(modelClass, constructorC, application, U.a(extras));
    }

    @Override // androidx.lifecycle.d0.e
    public void d(a0 viewModel) {
        kotlin.jvm.internal.n.h(viewModel, "viewModel");
        if (this.f13357e != null) {
            p082i1.d dVar = this.f13358f;
            kotlin.jvm.internal.n.e(dVar);
            AbstractC1157q abstractC1157q = this.f13357e;
            kotlin.jvm.internal.n.e(abstractC1157q);
            C1156p.a(viewModel, dVar, abstractC1157q);
        }
    }

    public final a0 e(String key, Class modelClass) {
        a0 a0VarD;
        Application application;
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(modelClass, "modelClass");
        AbstractC1157q abstractC1157q = this.f13357e;
        if (abstractC1157q == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1142b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.f13354b == null) ? Y.c(modelClass, Y.f13360b) : Y.c(modelClass, Y.f13359a);
        if (constructorC == null) {
            return this.f13354b != null ? this.f13355c.a(modelClass) : d0.d.f13400b.a().a(modelClass);
        }
        p082i1.d dVar = this.f13358f;
        kotlin.jvm.internal.n.e(dVar);
        T tB = C1156p.b(dVar, abstractC1157q, key, this.f13356d);
        if (!zIsAssignableFrom || (application = this.f13354b) == null) {
            a0VarD = Y.d(modelClass, constructorC, tB.f());
        } else {
            kotlin.jvm.internal.n.e(application);
            a0VarD = Y.d(modelClass, constructorC, application, tB.f());
        }
        a0VarD.a("androidx.lifecycle.savedstate.vm.tag", tB);
        return a0VarD;
    }
}
