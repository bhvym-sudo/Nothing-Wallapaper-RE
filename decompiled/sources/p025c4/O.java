package p025c4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import p105k4.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f15074a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f15075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f15076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15077d;

    public static int a(Context context) {
        b(context);
        return f15077d;
    }

    private static void b(Context context) {
        synchronized (f15074a) {
            try {
                if (f15075b) {
                    return;
                }
                f15075b = true;
                try {
                    Bundle bundle = c.a(context).a(context.getPackageName(), Optimizer.OPTIMIZATION_GRAPH_WRAP).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f15076c = bundle.getString("com.google.app.id");
                    f15077d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
