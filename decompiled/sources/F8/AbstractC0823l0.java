package F8;

/* JADX INFO: renamed from: F8.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0823l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final K8.D f1881a = new K8.D("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K8.D f1882b = new K8.D("CLOSED_EMPTY");

    public static final long c(long j9) {
        if (j9 <= 0) {
            return 0L;
        }
        if (j9 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j9 * 1000000;
    }
}
