package K8;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f4145a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f4145a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
