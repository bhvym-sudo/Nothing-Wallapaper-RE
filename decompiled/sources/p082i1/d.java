package p082i1;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f21896g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f21899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p082i1.b.C0547b f21901e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p120m.b f21897a = new p120m.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21902f = true;

    public interface a {
        void a(f fVar);
    }

    private static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d this$0, InterfaceC1163x interfaceC1163x, AbstractC1157q.a event) {
        n.h(this$0, "this$0");
        n.h(interfaceC1163x, "<anonymous parameter 0>");
        n.h(event, "event");
        if (event == AbstractC1157q.a.ON_START) {
            this$0.f21902f = true;
        } else if (event == AbstractC1157q.a.ON_STOP) {
            this$0.f21902f = false;
        }
    }

    public final Bundle b(String key) {
        n.h(key, "key");
        if (!this.f21900d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f21899c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f21899c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f21899c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f21899c = null;
        return bundle2;
    }

    public final c c(String key) {
        n.h(key, "key");
        for (Map.Entry components : this.f21897a) {
            n.g(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (n.d(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC1157q lifecycle) {
        n.h(lifecycle, "lifecycle");
        if (this.f21898b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC1160u() { // from class: i1.c
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                d.d(this.f21895q, interfaceC1163x, aVar);
            }
        });
        this.f21898b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f21898b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f21900d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f21899c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f21900d = true;
    }

    public final void g(Bundle outBundle) {
        n.h(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f21899c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        m.b.d dVarE = this.f21897a.e();
        n.g(dVarE, "this.components.iteratorWithAdditions()");
        while (dVarE.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarE.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        n.h(key, "key");
        n.h(provider, "provider");
        if (((c) this.f21897a.j(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) {
        n.h(clazz, "clazz");
        if (!this.f21902f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        p082i1.b.C0547b c0547b = this.f21901e;
        if (c0547b == null) {
            c0547b = new p082i1.b.C0547b(this);
        }
        this.f21901e = c0547b;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            p082i1.b.C0547b c0547b2 = this.f21901e;
            if (c0547b2 != null) {
                String name = clazz.getName();
                n.g(name, "clazz.name");
                c0547b2.a(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void j(String key) {
        n.h(key, "key");
        this.f21897a.m(key);
    }
}
