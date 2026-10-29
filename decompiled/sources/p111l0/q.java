package p111l0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22837a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22838b = b(0);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return q.f22838b;
        }

        private a() {
        }
    }

    public static long b(long j9) {
        return j9;
    }

    public static final boolean c(long j9, long j10) {
        return j9 == j10;
    }

    public static final int d(long j9) {
        return (int) (j9 & 4294967295L);
    }

    public static final int e(long j9) {
        return (int) (j9 >> 32);
    }

    public abstract /* synthetic */ long f();
}
