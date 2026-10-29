package K8;

/* JADX INFO: renamed from: K8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0919l {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final F8.I b(F8.I i10, String str) {
        return str != null ? new v(i10, str) : i10;
    }
}
