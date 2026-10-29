package p105k4;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f22717b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f22718a = null;

    public static b a(Context context) {
        return f22717b.b(context);
    }

    public final synchronized b b(Context context) {
        try {
            if (this.f22718a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f22718a = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22718a;
    }
}
