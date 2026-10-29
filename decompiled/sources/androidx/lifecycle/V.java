package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V implements i1.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p082i1.d f13348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f13350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p079h8.h f13351d;

    static final class a extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f0 f13352r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var) {
            super(0);
            this.f13352r = f0Var;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return U.e(this.f13352r);
        }
    }

    public V(p082i1.d savedStateRegistry, f0 viewModelStoreOwner) {
        kotlin.jvm.internal.n.h(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.n.h(viewModelStoreOwner, "viewModelStoreOwner");
        this.f13348a = savedStateRegistry;
        this.f13351d = p079h8.i.b(new a(viewModelStoreOwner));
    }

    private final W b() {
        return (W) this.f13351d.getValue();
    }

    public final Bundle a(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        c();
        Bundle bundle = this.f13350c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f13350c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f13350c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f13350c = null;
        }
        return bundle2;
    }

    public final void c() {
        if (this.f13349b) {
            return;
        }
        Bundle bundleB = this.f13348a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f13350c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f13350c = bundle;
        this.f13349b = true;
        b();
    }

    @Override // i1.d.c
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f13350c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : b().e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleSaveState = ((Q) entry.getValue()).g().saveState();
            if (!kotlin.jvm.internal.n.d(bundleSaveState, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleSaveState);
            }
        }
        this.f13349b = false;
        return bundle;
    }
}
