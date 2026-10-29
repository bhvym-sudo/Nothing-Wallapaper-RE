package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f12397a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f12398b = new E();

    static D a() {
        return f12397a;
    }

    static D b() {
        return f12398b;
    }

    private static D c() {
        if (b0.f12446d) {
            return null;
        }
        try {
            return (D) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
