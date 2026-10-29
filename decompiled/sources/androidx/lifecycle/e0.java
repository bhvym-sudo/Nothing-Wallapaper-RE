package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13404a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f13404a.values().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).b();
        }
        this.f13404a.clear();
    }

    public final a0 b(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        return (a0) this.f13404a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f13404a.keySet());
    }

    public final void d(String key, a0 viewModel) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(viewModel, "viewModel");
        a0 a0Var = (a0) this.f13404a.put(key, viewModel);
        if (a0Var != null) {
            a0Var.b();
        }
    }
}
