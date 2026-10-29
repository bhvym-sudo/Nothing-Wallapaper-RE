package V2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.util.ArraySet;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M2.c f8121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NotificationManager f8124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f8125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k.a f8126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArraySet f8127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList f8128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f8129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PackageManager f8130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Class f8131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Executor f8132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f8133n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f8134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PackageManager f8135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f8136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Executor f8137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final NotificationManager f8138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final i f8139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f8140g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final k.a f8141h;

        public a(Context context, PackageManager packageManager, Executor executor, Executor executor2, NotificationManager notificationManager, i iVar, List list, k.a aVar) {
            this.f8134a = context;
            this.f8135b = packageManager;
            this.f8136c = executor;
            this.f8137d = executor2;
            this.f8138e = notificationManager;
            this.f8139f = iVar;
            this.f8140g = list;
            this.f8141h = aVar;
        }

        g a(String str, M2.c cVar, Class cls, boolean z9, boolean z10) {
            return new g(this.f8134a, this.f8135b, str, cVar, cls, z9, this.f8136c, this.f8137d, z10, this.f8138e, this.f8139f, this.f8140g, this.f8141h);
        }
    }

    public static class b extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassLoader f8142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LayoutInflater f8143b;

        public b(Context context, ClassLoader classLoader) {
            super(context);
            this.f8142a = classLoader;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public ClassLoader getClassLoader() {
            return this.f8142a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f8143b == null) {
                this.f8143b = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f8143b;
        }
    }

    private void A(ComponentName componentName, String str, o.c cVar) {
        Notification.Builder color = new Notification.Builder(this.f8120a, "ALR").setStyle(new Notification.BigTextStyle()).setSmallIcon(Resources.getSystem().getIdentifier("stat_sys_warning", "drawable", "android")).setWhen(0L).setShowWhen(false).setVisibility(1).setColor(this.f8120a.getColor(Resources.getSystem().getIdentifier("system_notification_accent_color", TypedValues.Custom.S_COLOR, "android")));
        try {
            str = this.f8130k.getServiceInfo(componentName, 0).loadLabel(this.f8130k).toString();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (cVar.a()) {
            Notification.Builder contentTitle = color.setContentTitle("Plugin \"" + str + "\" is too new");
            StringBuilder sb = new StringBuilder();
            sb.append("Check to see if an OTA is available.\n");
            sb.append(cVar.getMessage());
            contentTitle.setContentText(sb.toString());
        } else {
            Notification.Builder contentTitle2 = color.setContentTitle("Plugin \"" + str + "\" is too old");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Contact plugin developer to get an updated version.\n");
            sb2.append(cVar.getMessage());
            contentTitle2.setContentText(sb2.toString());
        }
        color.addAction(new Notification.Action.Builder((Icon) null, "Disable plugin", PendingIntent.getBroadcast(this.f8120a, 0, new Intent("com.android.systemui.action.DISABLE_PLUGIN").setData(Uri.parse("package://" + componentName.flattenToString())), 67108864)).build());
        this.f8124e.notify(6, color.build());
        Log.w("PluginActionManager", "Error loading plugin; " + cVar.getMessage());
    }

    private boolean h(k kVar, int i10) {
        ComponentName componentNameF = kVar.f();
        if (k(componentNameF)) {
            return false;
        }
        Log.w("PluginActionManager", "Disabling plugin " + componentNameF.flattenToShortString());
        this.f8125f.d(componentNameF, i10);
        return true;
    }

    private void j(String str) {
        Intent intent = new Intent(this.f8122c);
        if (str != null) {
            intent.setPackage(str);
        }
        List<ResolveInfo> listQueryIntentServices = this.f8130k.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() > 1 && !this.f8123d) {
            Log.w("PluginActionManager", "Multiple plugins found for " + this.f8122c);
            return;
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            final k kVarS = s(new ComponentName(serviceInfo.packageName, serviceInfo.name));
            if (kVarS != null) {
                this.f8128i.add(kVarS);
                this.f8132m.execute(new Runnable() { // from class: V2.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8114q.l(kVarS);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str) {
        n(str);
        x(str);
    }

    private k s(ComponentName componentName) {
        ComponentName componentName2;
        Throwable th;
        if (!this.f8129j && !k(componentName)) {
            Log.w("PluginActionManager", "Plugin cannot be loaded on production build: " + componentName);
            return null;
        }
        if (!this.f8125f.a(componentName)) {
            return null;
        }
        String packageName = componentName.getPackageName();
        try {
            if (this.f8130k.checkPermission("com.android.systemui.permission.PLUGIN", packageName) != 0) {
                try {
                    Log.d("PluginActionManager", "Plugin doesn't have permission: " + packageName);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    componentName2 = componentName;
                }
            } else {
                try {
                    componentName2 = componentName;
                    try {
                        try {
                            return this.f8126g.b(this.f8120a, this.f8130k.getApplicationInfo(packageName, 0), componentName2, this.f8131l, this.f8121b);
                        } catch (o.c e10) {
                            e = e10;
                            A(componentName2, componentName2.getClassName(), e);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (o.c e11) {
                    e = e11;
                    componentName2 = componentName;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            componentName2 = componentName;
        }
        th = th;
        Log.w("PluginActionManager", "Couldn't load plugin: " + componentName2, th);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void l(k kVar) {
        n.b(this.f8120a);
        kVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void q(k kVar) {
        kVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m() {
        for (int size = this.f8128i.size() - 1; size >= 0; size--) {
            final k kVar = (k) this.f8128i.get(size);
            this.f8132m.execute(new Runnable() { // from class: V2.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8118q.o(kVar);
                }
            });
        }
        this.f8128i.clear();
        j(null);
    }

    private void x(String str) {
        if (this.f8123d || this.f8128i.size() == 0) {
            j(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void n(String str) {
        for (int size = this.f8128i.size() - 1; size >= 0; size--) {
            final k kVar = (k) this.f8128i.get(size);
            if (kVar.a().equals(str)) {
                this.f8132m.execute(new Runnable() { // from class: V2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8116q.q(kVar);
                    }
                });
                this.f8128i.remove(size);
            }
        }
    }

    public boolean g(String str) {
        boolean zH = false;
        for (k kVar : new ArrayList(this.f8128i)) {
            if (str.startsWith(kVar.a())) {
                zH |= h(kVar, 3);
            }
        }
        return zH;
    }

    public boolean i() {
        ArrayList arrayList = new ArrayList(this.f8128i);
        boolean zH = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zH |= h((k) arrayList.get(i10), 4);
        }
        return zH;
    }

    boolean k(ComponentName componentName) {
        for (String str : this.f8127h) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString == null) {
                if (str.equals(componentName.getPackageName())) {
                    return true;
                }
            } else if (componentNameUnflattenFromString.equals(componentName)) {
                return true;
            }
        }
        return false;
    }

    public void r() {
        this.f8133n.execute(new Runnable() { // from class: V2.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f8113q.m();
            }
        });
    }

    public void t(final String str) {
        this.f8133n.execute(new Runnable() { // from class: V2.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f8111q.n(str);
            }
        });
    }

    public String toString() {
        return String.format("%s@%s (action=%s)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f8122c);
    }

    public void y(final String str) {
        this.f8133n.execute(new Runnable() { // from class: V2.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f8109q.p(str);
            }
        });
    }

    private g(Context context, PackageManager packageManager, String str, M2.c cVar, Class cls, boolean z9, Executor executor, Executor executor2, boolean z10, NotificationManager notificationManager, i iVar, List list, k.a aVar) {
        ArraySet arraySet = new ArraySet();
        this.f8127h = arraySet;
        this.f8128i = new ArrayList();
        this.f8131l = cls;
        this.f8132m = executor;
        this.f8133n = executor2;
        this.f8120a = context;
        this.f8130k = packageManager;
        this.f8122c = str;
        this.f8121b = cVar;
        this.f8123d = z9;
        this.f8124e = notificationManager;
        this.f8125f = iVar;
        this.f8126g = aVar;
        arraySet.addAll(list);
        this.f8129j = z10;
    }
}
