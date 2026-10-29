package p017b6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static void a(Exception exc) {
        if (exc instanceof ReflectiveOperationException) {
            throw new RuntimeException(exc.getMessage());
        }
    }
}
