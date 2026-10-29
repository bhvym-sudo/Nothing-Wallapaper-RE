package Z0;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // Z0.a
    public Object a(a.b key) {
        n.h(key, "key");
        return b().get(key);
    }

    public final void c(a.b key, Object obj) {
        n.h(key, "key");
        b().put(key, obj);
    }

    public b(a initialExtras) {
        n.h(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ b(a aVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? a.C0345a.f9384b : aVar);
    }
}
