package p111l0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22829a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22830b = b(0);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return m.f22830b;
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
        return (int) (j9 >> 32);
    }

    public static final int e(long j9) {
        return (int) (j9 & 4294967295L);
    }

    public static final long f(long j9, long j10) {
        return b((((long) (((int) (j9 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L));
    }

    public static final long g(long j9, long j10) {
        return b((((long) (((int) (j9 >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L));
    }
}
