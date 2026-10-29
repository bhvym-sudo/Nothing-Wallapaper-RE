package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1106p f12570a = new C1107q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1106p f12571b = c();

    static AbstractC1106p a() {
        AbstractC1106p abstractC1106p = f12571b;
        if (abstractC1106p != null) {
            return abstractC1106p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1106p b() {
        return f12570a;
    }

    private static AbstractC1106p c() {
        if (b0.f12446d) {
            return null;
        }
        try {
            return (AbstractC1106p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
