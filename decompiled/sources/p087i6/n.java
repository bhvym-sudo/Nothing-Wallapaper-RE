package p087i6;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f22206a = new n();

    private n() {
    }

    public static final boolean a(Context context, String key, boolean z9) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        return d(context).getBoolean(key, z9);
    }

    public static final int b(Context context, String key, int i10) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        return d(context).getInt(key, i10);
    }

    public static final long c(Context context, String key, long j9) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        return d(context).getLong(key, j9);
    }

    public static final SharedPreferences d(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("NTWallpaper_preferences", 0);
        kotlin.jvm.internal.n.g(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static final String e(Context context, String key, String defValue) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(defValue, "defValue");
        return d(context).getString(key, defValue);
    }

    public static final void f(Context context, String key, boolean z9) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        d(context).edit().putBoolean(key, z9).apply();
    }

    public static final void g(Context context, String key, int i10) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        d(context).edit().putInt(key, i10).apply();
    }

    public static final void h(Context context, String key, long j9) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        d(context).edit().putLong(key, j9).apply();
    }

    public static final void i(Context context, String key, String value) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(value, "value");
        d(context).edit().putString(key, value).apply();
    }
}
