package p074h3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Log;
import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: renamed from: h3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1381v implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f21737b;

    public C1381v(Context context) {
        Pair pairC = c(context.getPackageManager());
        if (pairC != null) {
            this.f21736a = (String) pairC.first;
            this.f21737b = (Resources) pairC.second;
        } else {
            this.f21736a = null;
            this.f21737b = null;
        }
    }

    @Override // p074h3.P
    public Resources a() {
        return this.f21737b;
    }

    @Override // p074h3.P
    public String b() {
        return this.f21736a;
    }

    protected Pair c(PackageManager packageManager) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(new Intent("com.android.launcher3.action.PARTNER_CUSTOMIZATION"), 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (activityInfo.applicationInfo.flags & 1) != 0) {
                String str = activityInfo.packageName;
                try {
                    return Pair.create(str, packageManager.getResourcesForApplication(str));
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("DefaultPartnerProvider", "Failed to find resources for " + str);
                }
            }
        }
        return null;
    }
}
