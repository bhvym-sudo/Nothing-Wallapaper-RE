package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1094d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f12453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f12454b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f12455c;

    static {
        f12455c = (f12453a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f12454b;
    }

    static boolean c() {
        if (f12453a) {
            return true;
        }
        return (f12454b == null || f12455c) ? false : true;
    }
}
