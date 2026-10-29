package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1104n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f12533a = c();

    public static C1105o a() {
        C1105o c1105oB = b("getEmptyRegistry");
        return c1105oB != null ? c1105oB : C1105o.f12541c;
    }

    private static final C1105o b(String str) {
        Class cls = f12533a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1105o) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
