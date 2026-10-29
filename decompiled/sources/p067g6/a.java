package p067g6;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21295a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f21296b;

    private a() {
    }

    public static final boolean a() {
        Boolean bool = f21296b;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zA = p007a6.a.a("NTF_LINEAR_VIBRATOR");
        f21296b = Boolean.valueOf(zA);
        return zA;
    }
}
