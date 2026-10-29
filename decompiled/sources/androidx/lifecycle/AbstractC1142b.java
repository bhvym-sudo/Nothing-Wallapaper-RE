package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1142b extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Application f13365b;

    public AbstractC1142b(Application application) {
        kotlin.jvm.internal.n.h(application, "application");
        this.f13365b = application;
    }

    public Application e() {
        Application application = this.f13365b;
        kotlin.jvm.internal.n.f(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return application;
    }
}
