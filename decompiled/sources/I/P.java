package I;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2686a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f2687b = Q.a(0.5f, 0.5f);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return P.f2687b;
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

    public static final float d(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float e(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }
}
