package p105k4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f22716a;

    public b(Context context) {
        this.f22716a = context;
    }

    public ApplicationInfo a(String str, int i10) {
        return this.f22716a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence b(String str) {
        return this.f22716a.getPackageManager().getApplicationLabel(this.f22716a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo c(String str, int i10) {
        return this.f22716a.getPackageManager().getPackageInfo(str, i10);
    }
}
