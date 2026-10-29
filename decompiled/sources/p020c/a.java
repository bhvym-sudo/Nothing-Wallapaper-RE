package p020c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f14990a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f14991b;

    public final void a(b listener) {
        n.h(listener, "listener");
        Context context = this.f14991b;
        if (context != null) {
            listener.a(context);
        }
        this.f14990a.add(listener);
    }

    public final void b() {
        this.f14991b = null;
    }

    public final void c(Context context) {
        n.h(context, "context");
        this.f14991b = context;
        Iterator it = this.f14990a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
