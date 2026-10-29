package p105k4;

import android.content.Context;
import p085i4.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f22714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f22715b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f22714a;
        if (context2 != null && (bool = f22715b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f22715b = null;
        if (g.f()) {
            f22715b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f22715b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f22715b = Boolean.FALSE;
            }
        }
        f22714a = applicationContext;
        return f22715b.booleanValue();
    }
}
