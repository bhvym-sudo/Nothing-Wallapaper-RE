package S4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7306b;

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f7307a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f7307a), Optimizer.OPTIMIZATION_GRAPH_WRAP);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f7307a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // S4.f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class cls) {
            this.f7307a = cls;
        }
    }

    interface c {
        List a(Object obj);
    }

    f(Object obj, c cVar) {
        this.f7305a = obj;
        this.f7306b = cVar;
    }

    public static f b(Context context, Class cls) {
        return new f(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (h.class.isAssignableFrom(cls)) {
                return (h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new t(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new t(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new t(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new t(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new t(String.format("Could not instantiate %s", str), e13);
        }
    }

    public List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7306b.a(this.f7305a).iterator();
        while (it.hasNext()) {
            arrayList.add(e.a((String) it.next()));
        }
        return arrayList;
    }
}
