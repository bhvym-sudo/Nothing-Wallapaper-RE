package p058f7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20880a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f20881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Intent f20882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f20883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Intent f20884e;

    private b() {
    }

    private final ResolveInfo a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        n.g(packageManager, "getPackageManager(...)");
        return p137n6.b.a(packageManager);
    }

    private final ResolveInfo b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        n.g(packageManager, "getPackageManager(...)");
        return p137n6.b.b(packageManager);
    }

    public final boolean c(Context context) {
        n.h(context, "context");
        Boolean bool = f20883d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = a(context) != null;
        f20883d = Boolean.valueOf(z9);
        f20884e = a.a();
        return z9;
    }

    public final boolean d(Context context) {
        n.h(context, "context");
        Boolean bool = f20881b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = b(context) != null;
        f20881b = Boolean.valueOf(z9);
        f20882c = a.b();
        return z9;
    }
}
