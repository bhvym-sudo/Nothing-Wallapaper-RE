package V2;

import android.app.ActivityThread;
import android.app.LoadedApk;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class k implements M2.b, M2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M2.c f8147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f8148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f8149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8151f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BiConsumer f8152g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f8153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private M2.a f8154i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassLoader f8155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f8156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f8157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f8158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f8159e;

        public a(ClassLoader classLoader, b bVar, d dVar, List list, boolean z9) {
            this.f8159e = list;
            this.f8155a = classLoader;
            this.f8156b = bVar;
            this.f8157c = dVar;
            this.f8158d = z9;
        }

        private ClassLoader c(ApplicationInfo applicationInfo, ClassLoader classLoader) {
            if (this.f8158d || e(applicationInfo.packageName)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                LoadedApk.makePaths((ActivityThread) null, true, applicationInfo, arrayList, arrayList2);
                String str = File.pathSeparator;
                return new PathClassLoader(TextUtils.join(str, arrayList), TextUtils.join(str, arrayList2), d(classLoader));
            }
            Log.w("PluginInstance", "Cannot get class loader for non-privileged plugin. Src:" + applicationInfo.sourceDir + ", pkg: " + applicationInfo.packageName);
            return null;
        }

        private ClassLoader d(ClassLoader classLoader) {
            return new l.a(classLoader, "androidx.constraintlayout.widget", "com.android.systemui.common", "com.android.systemui.log", "com.android.systemui.plugin");
        }

        private boolean e(String str) {
            for (String str2 : this.f8159e) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                if (componentNameUnflattenFromString != null) {
                    if (componentNameUnflattenFromString.getPackageName().equals(str)) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ClassLoader f(ApplicationInfo applicationInfo) {
            return c(applicationInfo, this.f8155a);
        }

        public k b(Context context, final ApplicationInfo applicationInfo, ComponentName componentName, Class cls, M2.c cVar) {
            return new k(context, cVar, componentName, new c(context, this.f8156b, applicationInfo, componentName, this.f8157c, cls, new Supplier() { // from class: V2.j
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f8144a.f(applicationInfo);
                }
            }), null);
        }
    }

    public static class b {
        M2.a a(Class cls) {
            return (M2.a) cls.newInstance();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f8160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f8161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ApplicationInfo f8162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ComponentName f8163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final d f8164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Class f8165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Supplier f8166g;

        public c(Context context, b bVar, ApplicationInfo applicationInfo, ComponentName componentName, d dVar, Class cls, Supplier supplier) {
            this.f8160a = context;
            this.f8161b = bVar;
            this.f8162c = applicationInfo;
            this.f8163d = componentName;
            this.f8164e = dVar;
            this.f8165f = cls;
            this.f8166g = supplier;
        }

        public boolean a(M2.a aVar) {
            if (aVar == null) {
                aVar = b(null);
            }
            return this.f8164e.a(aVar.getClass(), this.f8165f, aVar);
        }

        public M2.a b(M2.f fVar) {
            try {
                M2.a aVarA = this.f8161b.a(Class.forName(this.f8163d.getClassName(), true, (ClassLoader) this.f8166g.get()));
                Log.v("PluginInstance", "Created plugin: " + aVarA);
                return (M2.a) M2.e.a(aVarA, fVar);
            } catch (ReflectiveOperationException e10) {
                Log.wtf("PluginInstance", "Failed to load plugin", e10);
                return null;
            }
        }

        public Context c() {
            try {
                return new g.b(this.f8160a.createApplicationContext(this.f8162c, 0), (ClassLoader) this.f8166g.get());
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("PluginInstance", "Failed to create plugin context", e10);
                return null;
            }
        }
    }

    public interface d {
        boolean a(Class cls, Class cls2, M2.a aVar);
    }

    public static class e implements d {
        @Override // V2.k.d
        public boolean a(Class cls, Class cls2, M2.a aVar) {
            o oVarB = new o().b(cls2);
            o oVarB2 = new o().b(cls);
            if (!oVarB2.g()) {
                return aVar == null || aVar.getVersion() == oVarB.f();
            }
            oVarB.d(oVarB2);
            return true;
        }
    }

    public k(Context context, M2.c cVar, ComponentName componentName, c cVar2, M2.a aVar) {
        this.f8146a = context;
        this.f8147b = cVar;
        this.f8148c = componentName;
        this.f8149d = cVar2;
        this.f8154i = aVar;
        this.f8150e = "PluginInstance[" + componentName.getShortClassName() + "]@" + Integer.toHexString(hashCode());
        if (this.f8154i != null) {
            this.f8153h = cVar2.c();
        }
    }

    private synchronized boolean e() {
        if (this.f8151f) {
            return false;
        }
        M2.a aVar = this.f8154i;
        if (aVar == null) {
            return true;
        }
        if (this.f8149d.a(aVar)) {
            return true;
        }
        Log.wtf("PluginInstance", "Version check failed for " + this.f8154i.getClass().getSimpleName());
        this.f8151f = true;
        d();
        this.f8147b.a(this);
        return false;
    }

    private void g(String str) {
        BiConsumer biConsumer = this.f8152g;
        if (biConsumer != null) {
            biConsumer.accept(this.f8150e, str);
        }
    }

    @Override // M2.b
    public String a() {
        return this.f8148c.getPackageName();
    }

    @Override // M2.b
    public synchronized void b() {
        if (this.f8151f) {
            g("Previous Fatal Exception detected for plugin class");
            return;
        }
        if (this.f8154i != null) {
            g("Load request when already loaded");
            return;
        }
        this.f8154i = this.f8149d.b(this);
        Context contextC = this.f8149d.c();
        this.f8153h = contextC;
        if (this.f8154i != null && contextC != null) {
            if (!e()) {
                g("loadPlugin: version check failed");
                return;
            }
            g("Loaded plugin; running callbacks");
            this.f8154i.onCreate(this.f8146a, this.f8153h);
            this.f8147b.b(this.f8154i, this.f8153h, this);
            return;
        }
        Log.e(this.f8150e, "Requested load, but failed");
    }

    @Override // M2.b
    public void c(BiConsumer biConsumer) {
        this.f8152g = biConsumer;
    }

    @Override // M2.b
    public synchronized void d() {
        if (this.f8154i == null) {
            g("Unload request when already unloaded");
            return;
        }
        g("Unloading plugin, running callbacks");
        this.f8147b.d(this.f8154i, this);
        this.f8154i.onDestroy();
        this.f8154i = null;
        this.f8153h = null;
    }

    public ComponentName f() {
        return this.f8148c;
    }

    public synchronized void h() {
        if (this.f8151f) {
            g("Previous Fatal Exception detected for plugin class");
            return;
        }
        if (!this.f8147b.c(this)) {
            if (this.f8154i != null) {
                g("onCreate: auto-unload");
                d();
            }
        } else if (this.f8154i == null) {
            g("onCreate: auto-load");
            b();
        } else {
            if (!e()) {
                g("onCreate: version check failed");
                return;
            }
            g("onCreate: load callbacks");
            this.f8154i.onCreate(this.f8146a, this.f8153h);
            this.f8147b.b(this.f8154i, this.f8153h, this);
        }
    }

    public synchronized void i() {
        if (this.f8151f) {
            g("onDestroy - no-op");
            return;
        }
        g("onDestroy");
        d();
        this.f8147b.a(this);
    }

    public String toString() {
        return this.f8150e;
    }
}
