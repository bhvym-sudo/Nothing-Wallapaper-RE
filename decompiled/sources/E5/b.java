package E5;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1285a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f1286b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f1287c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f1288d = new ConcurrentHashMap();

    private b() {
    }

    public final ClassLoader a(String signature, String pkgName) {
        n.h(signature, "signature");
        n.h(pkgName, "pkgName");
        if (n.d((String) f1288d.get(pkgName), signature)) {
            return (ClassLoader) f1287c.get(pkgName);
        }
        return null;
    }

    public final Object b() {
        return f1286b;
    }

    public final void c(String signature, String pkgName, ClassLoader classLoader) {
        n.h(signature, "signature");
        n.h(pkgName, "pkgName");
        n.h(classLoader, "classLoader");
        f1288d.put(pkgName, signature);
        f1287c.put(pkgName, classLoader);
    }

    public final void d(String pkgName) {
        n.h(pkgName, "pkgName");
        G5.c.f1948a.g("Remove class loader: " + pkgName);
        f1288d.remove(pkgName);
        f1287c.remove(pkgName);
    }
}
