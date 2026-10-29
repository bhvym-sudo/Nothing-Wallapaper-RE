package Z3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static h f9462b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9463a;

    public h(Context context) {
        this.f9463a = context.getApplicationContext();
    }

    public static h a(Context context) {
        AbstractC1202p.i(context);
        synchronized (h.class) {
            try {
                if (f9462b == null) {
                    v.a(context);
                    f9462b = new h(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9462b;
    }

    static final r b(PackageInfo packageInfo, r... rVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        s sVar = new s(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10].equals(sVar)) {
                return rVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z9) {
        if (z9 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z9 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z9 ? b(packageInfo, u.f9474a) : b(packageInfo, u.f9474a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
