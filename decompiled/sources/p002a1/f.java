package p002a1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f9597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f9599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f9600d;

    public f() {
        this.f9597a = new e();
        this.f9598b = new LinkedHashMap();
        this.f9599c = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        n.h(key, "key");
        n.h(closeable, "closeable");
        if (this.f9600d) {
            f(closeable);
            return;
        }
        synchronized (this.f9597a) {
            autoCloseable = (AutoCloseable) this.f9598b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f9600d) {
            return;
        }
        this.f9600d = true;
        synchronized (this.f9597a) {
            try {
                Iterator it = this.f9598b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f9599c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f9599c.clear();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        n.h(key, "key");
        synchronized (this.f9597a) {
            autoCloseable = (AutoCloseable) this.f9598b.get(key);
        }
        return autoCloseable;
    }

    public f(AutoCloseable... closeables) {
        n.h(closeables, "closeables");
        this.f9597a = new e();
        this.f9598b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f9599c = linkedHashSet;
        AbstractC1444s.A(linkedHashSet, closeables);
    }
}
