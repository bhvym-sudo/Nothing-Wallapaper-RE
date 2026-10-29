package p232x1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.SystemProperties;
import android.util.Log;
import java.util.Arrays;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f29752a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Resources f29753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f29754c;

    private k() {
    }

    public static final boolean a(Context context) {
        Resources resources;
        n.h(context, "context");
        int identifier = 0;
        boolean z9 = SystemProperties.getBoolean("persist.systemui.flag_monet", false);
        if (z9) {
            return z9;
        }
        if (f29753b == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.android.systemui", 1048704);
                n.g(applicationInfo, "getApplicationInfo(...)");
                f29753b = packageManager.getResourcesForApplication(applicationInfo);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("ColorUtils", "Couldn't read color flag, skipping section", e10);
            }
        }
        if (f29754c == 0) {
            Resources resources2 = f29753b;
            if (resources2 != null) {
                n.e(resources2);
                identifier = resources2.getIdentifier("flag_monet", "bool", "com.android.systemui");
            }
            f29754c = identifier;
        }
        if (f29754c <= 0 || (resources = f29753b) == null) {
            return z9;
        }
        n.e(resources);
        return resources.getBoolean(f29754c);
    }

    public static final String b(int i10) {
        H h10 = H.f22782a;
        String str = String.format("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i10 & 16777215)}, 1));
        n.g(str, "format(...)");
        return str;
    }
}
