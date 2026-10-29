package V2;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemProperties;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l extends BroadcastReceiver implements M2.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f8167j = "l";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayMap f8168a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f8169b = new ArrayMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArraySet f8170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f8171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g.a f8172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f8174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f8175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8176i;

    static class a extends ClassLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f8177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClassLoader f8178b;

        a(ClassLoader classLoader, String... strArr) {
            super(ClassLoader.getSystemClassLoader());
            this.f8178b = classLoader;
            this.f8177a = strArr;
        }

        @Override // java.lang.ClassLoader
        protected Class loadClass(String str, boolean z9) {
            for (String str2 : this.f8177a) {
                if (str.startsWith(str2)) {
                    return this.f8178b.loadClass(str);
                }
            }
            return super.loadClass(str, z9);
        }
    }

    public static class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    private class c implements Thread.UncaughtExceptionHandler {
        private boolean a(Throwable th) {
            boolean zG;
            if (th == null) {
                return false;
            }
            synchronized (this) {
                try {
                    zG = false;
                    for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                        Iterator it = l.this.f8168a.values().iterator();
                        while (it.hasNext()) {
                            zG |= ((g) it.next()).g(stackTraceElement.getClassName());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return a(th.getCause()) | zG;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (SystemProperties.getBoolean("plugin.debugging", false)) {
                return;
            }
            boolean zA = a(th);
            if (!zA) {
                synchronized (this) {
                    try {
                        Iterator it = l.this.f8168a.values().iterator();
                        while (it.hasNext()) {
                            zA |= ((g) it.next()).i();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (zA) {
                new b(th);
            }
        }

        private c() {
        }
    }

    public l(Context context, g.a aVar, boolean z9, Y2.b bVar, i iVar, n nVar, List list) {
        ArraySet arraySet = new ArraySet();
        this.f8170c = arraySet;
        this.f8171d = context;
        this.f8172e = aVar;
        this.f8173f = z9;
        arraySet.addAll(list);
        this.f8174g = nVar;
        this.f8175h = iVar;
        if (bVar != null) {
            bVar.d(new c());
        }
    }

    private boolean d(String str) {
        return this.f8169b.remove(str) != null;
    }

    private boolean f(ComponentName componentName) {
        for (String str : this.f8170c) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                if (componentNameUnflattenFromString.equals(componentName)) {
                    return true;
                }
            } else if (str.equals(componentName.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    private void g() {
        if (this.f8176i) {
            return;
        }
        this.f8176i = true;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        this.f8171d.registerReceiver(this, intentFilter);
        intentFilter.addAction("com.android.systemui.action.PLUGIN_CHANGED");
        intentFilter.addAction("com.android.systemui.action.DISABLE_PLUGIN");
        intentFilter.addDataScheme("package");
        this.f8171d.registerReceiver(this, intentFilter, "com.android.systemui.permission.PLUGIN", null, 2);
        this.f8171d.registerReceiver(this, new IntentFilter("android.intent.action.USER_UNLOCKED"));
    }

    @Override // M2.d
    public void a(M2.c cVar, Class cls, boolean z9) {
        c(M2.d.a.a(cls), cVar, cls, z9);
    }

    public void c(String str, M2.c cVar, Class cls, boolean z9) {
        this.f8174g.a(str);
        g gVarA = this.f8172e.a(str, cVar, cls, z9, e());
        gVarA.r();
        synchronized (this) {
            this.f8168a.put(cVar, gVarA);
        }
        g();
    }

    public boolean e() {
        return this.f8173f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int iC;
        if ("android.intent.action.USER_UNLOCKED".equals(intent.getAction())) {
            synchronized (this) {
                try {
                    Iterator it = this.f8168a.values().iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if ("com.android.systemui.action.DISABLE_PLUGIN".equals(intent.getAction())) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(intent.getData().toString().substring(10));
            if (f(componentNameUnflattenFromString)) {
                return;
            }
            this.f8175h.d(componentNameUnflattenFromString, 2);
            ((NotificationManager) this.f8171d.getSystemService(NotificationManager.class)).cancel(componentNameUnflattenFromString.getClassName(), 6);
            return;
        }
        String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
        ComponentName componentNameUnflattenFromString2 = ComponentName.unflattenFromString(encodedSchemeSpecificPart);
        if (d(encodedSchemeSpecificPart)) {
            if (Build.IS_ENG) {
                Toast.makeText(this.f8171d, "Reloading " + encodedSchemeSpecificPart, 1).show();
            } else {
                Log.v(f8167j, "Reloading " + encodedSchemeSpecificPart);
            }
        }
        if ("android.intent.action.PACKAGE_REPLACED".equals(intent.getAction()) && componentNameUnflattenFromString2 != null && ((iC = this.f8175h.c(componentNameUnflattenFromString2)) == 3 || iC == 4 || iC == 2)) {
            Log.i(f8167j, "Re-enabling previously disabled plugin that has been updated: " + componentNameUnflattenFromString2.flattenToShortString());
            this.f8175h.b(componentNameUnflattenFromString2);
        }
        synchronized (this) {
            try {
                if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_CHANGED".equals(intent.getAction()) || "android.intent.action.PACKAGE_REPLACED".equals(intent.getAction())) {
                    Iterator it2 = this.f8168a.values().iterator();
                    while (it2.hasNext()) {
                        ((g) it2.next()).y(encodedSchemeSpecificPart);
                    }
                } else {
                    Iterator it3 = this.f8168a.values().iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).t(encodedSchemeSpecificPart);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
