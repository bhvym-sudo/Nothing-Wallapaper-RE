package p165q4;

/* JADX INFO: loaded from: classes.dex */
public abstract class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static F5 f24205a;

    public static synchronized C1650x5 a(AbstractC1615s5 abstractC1615s5) {
        try {
            if (f24205a == null) {
                f24205a = new F5(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1650x5) f24205a.b(abstractC1615s5);
    }

    public static synchronized C1650x5 b(String str) {
        return a(AbstractC1615s5.d("vision-common").c());
    }
}
