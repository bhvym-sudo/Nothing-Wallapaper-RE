package p222w1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f28551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f28552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Resources f28553c;

    public c(Context context, String str) {
        this.f28551a = context;
        this.f28552b = str;
        Resources resourcesForApplication = null;
        if (TextUtils.isEmpty(str)) {
            this.f28553c = null;
            return;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 1048704);
            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ResourcesApkProvider", String.format("Stub APK for %s not found.", this.f28552b));
        } finally {
            this.f28553c = null;
        }
    }

    protected int b(String str, String str2) {
        return this.f28553c.getColor(this.f28553c.getIdentifier(String.format("%s%s", str, str2), TypedValues.Custom.S_COLOR, this.f28552b), null);
    }

    protected String c(String str, String str2) {
        return this.f28553c.getString(this.f28553c.getIdentifier(String.format("%s%s", str, str2), TypedValues.Custom.S_STRING, this.f28552b));
    }

    protected String[] d(String str) {
        return this.f28553c.getStringArray(this.f28553c.getIdentifier(str, "array", this.f28552b));
    }

    public boolean e() {
        return this.f28553c != null;
    }
}
