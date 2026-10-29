package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V f12438a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final V f12439b = new W();

    static V a() {
        return f12438a;
    }

    static V b() {
        return f12439b;
    }

    private static V c() {
        if (b0.f12446d) {
            return null;
        }
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
