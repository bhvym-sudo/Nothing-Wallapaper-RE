package V2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f8180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f8181b;

    public n(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("plugin_prefs", 0);
        this.f8181b = sharedPreferences;
        this.f8180a = new ArraySet(sharedPreferences.getStringSet("actions", null));
    }

    public static void b(Context context) {
        context.getSharedPreferences("plugin_prefs", 0).edit().putBoolean("plugins", true).apply();
    }

    public synchronized void a(String str) {
        if (this.f8180a.add(str)) {
            this.f8181b.edit().putStringSet("actions", this.f8180a).apply();
        }
    }
}
