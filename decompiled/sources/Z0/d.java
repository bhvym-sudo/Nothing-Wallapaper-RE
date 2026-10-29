package Z0;

import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import kotlin.jvm.internal.n;
import p002a1.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f9386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0.c f9387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9388c;

    public d(e0 store, d0.c factory, a extras) {
        n.h(store, "store");
        n.h(factory, "factory");
        n.h(extras, "extras");
        this.f9386a = store;
        this.f9387b = factory;
        this.f9388c = extras;
    }

    public static /* synthetic */ a0 b(d dVar, C8.c cVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = g.f9601a.c(cVar);
        }
        return dVar.a(cVar, str);
    }

    public final a0 a(C8.c modelClass, String key) {
        n.h(modelClass, "modelClass");
        n.h(key, "key");
        a0 a0VarB = this.f9386a.b(key);
        if (!modelClass.d(a0VarB)) {
            b bVar = new b(this.f9388c);
            bVar.c(g.a.f9602a, key);
            a0 a0VarA = e.a(this.f9387b, modelClass, bVar);
            this.f9386a.d(key, a0VarA);
            return a0VarA;
        }
        Object obj = this.f9387b;
        if (obj instanceof d0.e) {
            n.e(a0VarB);
            ((d0.e) obj).d(a0VarB);
        }
        n.f(a0VarB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return a0VarB;
    }
}
