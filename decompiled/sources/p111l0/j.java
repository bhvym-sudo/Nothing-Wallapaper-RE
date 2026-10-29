package p111l0;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22826a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22827b = b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22828c = b(9205357640488583168L);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a() {
            return j.f22827b;
        }

        private a() {
        }
    }

    public static long b(long j9) {
        return j9;
    }

    public static final float c(long j9) {
        return h.d(Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    public static final float d(long j9) {
        return h.d(Float.intBitsToFloat((int) (j9 >> 32)));
    }
}
