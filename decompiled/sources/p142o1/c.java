package p142o1;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f23333a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        n.h(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        n.g(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        n.h(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
