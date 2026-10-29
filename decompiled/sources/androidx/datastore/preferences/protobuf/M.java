package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K f12412a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K f12413b = new L();

    static K a() {
        return f12412a;
    }

    static K b() {
        return f12413b;
    }

    private static K c() {
        if (b0.f12446d) {
            return null;
        }
        try {
            return (K) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
