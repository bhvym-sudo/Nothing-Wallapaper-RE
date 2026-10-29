package U8;

import P8.F;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8074a = new LinkedHashSet();

    public final synchronized void a(F route) {
        n.h(route, "route");
        this.f8074a.remove(route);
    }

    public final synchronized void b(F failedRoute) {
        n.h(failedRoute, "failedRoute");
        this.f8074a.add(failedRoute);
    }

    public final synchronized boolean c(F route) {
        n.h(route, "route");
        return this.f8074a.contains(route);
    }
}
