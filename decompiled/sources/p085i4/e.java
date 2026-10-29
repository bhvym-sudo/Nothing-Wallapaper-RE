package p085i4;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f22157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f22158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f22159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f22160d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f22160d == null) {
            boolean z9 = false;
            if (g.f() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z9 = true;
            }
            f22160d = Boolean.valueOf(z9);
        }
        return f22160d.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f22157a == null) {
            boolean z9 = false;
            if (g.c() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z9 = true;
            }
            f22157a = Boolean.valueOf(z9);
        }
        return f22157a.booleanValue();
    }

    public static boolean c(Context context) {
        if (b(context) && !g.e()) {
            return true;
        }
        if (d(context)) {
            return !g.f() || g.h();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f22158b == null) {
            boolean z9 = false;
            if (g.d() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z9 = true;
            }
            f22158b = Boolean.valueOf(z9);
        }
        return f22158b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f22159c == null) {
            boolean z9 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z9 = false;
            }
            f22159c = Boolean.valueOf(z9);
        }
        return f22159c.booleanValue();
    }
}
