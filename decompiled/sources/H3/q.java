package H3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2521e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ExecutorService f2522f = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ProviderInfo f2526d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(Context context, String str) {
            ActivityInfo activityInfo;
            Bundle bundle;
            Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
            kotlin.jvm.internal.n.g(intentAddCategory, "addCategory(...)");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intentAddCategory, 65664);
            if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || (bundle = activityInfo.metaData) == null) {
                return null;
            }
            return bundle.getString(str);
        }

        private a() {
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public q(Context context, String str, String str2) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f2523a = context;
        this.f2524b = str;
        this.f2525c = str2;
        this.f2526d = c();
    }

    private final ProviderInfo c() {
        ProviderInfo providerInfoResolveContentProvider;
        String strB = this.f2525c;
        if (strB == null) {
            a aVar = f2521e;
            Context context = this.f2523a;
            String str = this.f2524b;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            strB = aVar.b(context, str);
        }
        if (TextUtils.isEmpty(strB)) {
            providerInfoResolveContentProvider = null;
        } else {
            PackageManager packageManager = this.f2523a.getPackageManager();
            kotlin.jvm.internal.n.e(strB);
            providerInfoResolveContentProvider = packageManager.resolveContentProvider(strB, 0);
        }
        if (providerInfoResolveContentProvider == null || TextUtils.isEmpty(providerInfoResolveContentProvider.readPermission) || this.f2523a.checkSelfPermission(providerInfoResolveContentProvider.readPermission) == 0) {
            return providerInfoResolveContentProvider;
        }
        return null;
    }

    private final ProviderInfo d() {
        ProviderInfo providerInfo = this.f2526d;
        if (providerInfo != null) {
            return providerInfo;
        }
        ProviderInfo providerInfoC = c();
        if (providerInfoC == null) {
            return null;
        }
        this.f2526d = providerInfoC;
        return providerInfoC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(q qVar, Uri uri, Bundle bundle, final b bVar) {
        final Bundle bundleCall = qVar.f2523a.getContentResolver().call(uri, "get_preview", (String) null, bundle);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: H3.p
            @Override // java.lang.Runnable
            public final void run() {
                q.h(bVar, bundleCall);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(b bVar, Bundle bundle) {
        bVar.a(bundle);
    }

    public final Uri e(String str) {
        if (d() != null) {
            Uri.Builder builderScheme = new Uri.Builder().scheme("content");
            ProviderInfo providerInfoD = d();
            if (providerInfoD != null) {
                return builderScheme.authority(providerInfoD.authority).appendPath(str).build();
            }
            throw new IllegalStateException("Required value was null.");
        }
        com.nothing.wallpaper.common.log.c.o("PreviewUtils", "getUri, providerInfo is null! authority:" + this.f2525c);
        return null;
    }

    public final void f(final Bundle bundle, final b callback) {
        kotlin.jvm.internal.n.h(callback, "callback");
        final Uri uriE = e("preview");
        if (uriE != null) {
            f2522f.submit(new Runnable() { // from class: H3.o
                @Override // java.lang.Runnable
                public final void run() {
                    q.g(this.f2515q, uriE, bundle, callback);
                }
            });
        }
    }

    public final boolean i() {
        return d() != null;
    }

    public /* synthetic */ q(Context context, String str, String str2, int i10, AbstractC1457h abstractC1457h) {
        this(context, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Context context, String authorityMetadataKey) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(authorityMetadataKey, "authorityMetadataKey");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
        this(applicationContext, authorityMetadataKey, null);
    }
}
