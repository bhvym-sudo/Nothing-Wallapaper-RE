package Z3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import p025c4.i0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9456a = g.f9459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f9457b = new e();

    e() {
    }

    public static e e() {
        return f9457b;
    }

    public Intent a(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            return i0.c("com.google.android.gms");
        }
        if (context != null && p085i4.e.c(context)) {
            return i0.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f9456a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(p105k4.c.a(context).c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return i0.b("com.google.android.gms", sb.toString());
    }

    public PendingIntent b(Context context, int i10, int i11) {
        return c(context, i10, i11, null);
    }

    public PendingIntent c(Context context, int i10, int i11, String str) {
        Intent intentA = a(context, i10, str);
        if (intentA == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, intentA, p145o4.d.f23436a | 134217728);
    }

    public String d(int i10) {
        return g.a(i10);
    }

    public int f(Context context) {
        return g(context, f9456a);
    }

    public int g(Context context, int i10) {
        int iC = g.c(context, i10);
        if (g.d(context, iC)) {
            return 18;
        }
        return iC;
    }

    public boolean h(Context context, String str) {
        return g.g(context, str);
    }

    public boolean i(int i10) {
        return g.f(i10);
    }
}
