package H1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ProviderInfo f2335c;

    public j(Context context, String str) {
        Bundle bundle;
        this.f2333a = context;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65664);
        if (resolveInfoResolveActivity == null || (bundle = resolveInfoResolveActivity.activityInfo.metaData) == null) {
            this.f2334b = null;
        } else {
            this.f2334b = bundle.getString(str);
        }
        ProviderInfo providerInfoResolveContentProvider = TextUtils.isEmpty(this.f2334b) ? null : context.getPackageManager().resolveContentProvider(this.f2334b, 0);
        this.f2335c = providerInfoResolveContentProvider;
        if (providerInfoResolveContentProvider == null || TextUtils.isEmpty(providerInfoResolveContentProvider.readPermission) || context.checkSelfPermission(this.f2335c.readPermission) == 0) {
            return;
        }
        this.f2335c = null;
    }

    Uri a(String str) {
        return new Uri.Builder().scheme("content").authority(this.f2335c.authority).appendPath(str).build();
    }

    boolean b() {
        return this.f2335c != null;
    }
}
