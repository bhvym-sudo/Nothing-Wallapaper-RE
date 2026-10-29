package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p172r1.b;
import p172r1.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f14031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f14032e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f14035c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f14034b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f14033a = new HashMap();

    a(Context context) {
        this.f14035c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objB;
        if (p182s1.a.c()) {
            try {
                p182s1.a.a(cls.getSimpleName());
            } catch (Throwable th) {
                p182s1.a.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f14033a.containsKey(cls)) {
            objB = this.f14033a.get(cls);
        } else {
            set.add(cls);
            try {
                p172r1.a aVar = (p172r1.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = aVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f14033a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = aVar.b(this.f14035c);
                set.remove(cls);
                this.f14033a.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        p182s1.a.b();
        return objB;
    }

    public static a e(Context context) {
        if (f14031d == null) {
            synchronized (f14032e) {
                try {
                    if (f14031d == null) {
                        f14031d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14031d;
    }

    void a() {
        try {
            try {
                p182s1.a.a("Startup");
                b(this.f14035c.getPackageManager().getProviderInfo(new ComponentName(this.f14035c.getPackageName(), InitializationProvider.class.getName()), Optimizer.OPTIMIZATION_GRAPH_WRAP).metaData);
                p182s1.a.b();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new c(e10);
            }
        } catch (Throwable th) {
            p182s1.a.b();
            throw th;
        }
    }

    void b(Bundle bundle) {
        String string = this.f14035c.getString(b.f25615a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (p172r1.a.class.isAssignableFrom(cls)) {
                            this.f14034b.add(cls);
                        }
                    }
                }
                Iterator it = this.f14034b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c(e10);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f14032e) {
            try {
                objD = this.f14033a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f14034b.contains(cls);
    }
}
