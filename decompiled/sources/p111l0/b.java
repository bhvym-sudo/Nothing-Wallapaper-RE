package p111l0;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22815b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22816a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final long a(int i10, int i11, int i12, int i13) {
            int iMin = Math.min(i12, 262142);
            int iMin2 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int iMin3 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int iJ = c.j(iMin3 == Integer.MAX_VALUE ? iMin : iMin3);
            if (i11 != Integer.MAX_VALUE) {
                iMin2 = Math.min(iJ, i11);
            }
            return c.a(Math.min(iJ, i10), iMin2, iMin, iMin3);
        }

        private a() {
        }
    }

    private /* synthetic */ b(long j9) {
        this.f22816a = j9;
    }

    public static final /* synthetic */ b a(long j9) {
        return new b(j9);
    }

    public static long b(long j9) {
        return j9;
    }

    public static boolean c(long j9, Object obj) {
        return (obj instanceof b) && j9 == ((b) obj).m();
    }

    public static final boolean d(long j9, long j10) {
        return j9 == j10;
    }

    public static final boolean e(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j9 >> (i11 + 15))) & i12;
        int i14 = ((int) (j9 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i14 - 1);
    }

    public static final boolean f(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = (1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1;
        int i12 = ((int) (j9 >> 2)) & i11;
        int i13 = ((int) (j9 >> 33)) & i11;
        return i12 == (i13 == 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i13 - 1);
    }

    public static final int g(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j9 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        return i12 == 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i12 - 1;
    }

    public static final int h(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = ((int) (j9 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        return i11 == 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i11 - 1;
    }

    public static final int i(long j9) {
        int i10 = (int) (3 & j9);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j9 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int j(long j9) {
        int i10 = (int) (3 & j9);
        return ((int) (j9 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int k(long j9) {
        return Long.hashCode(j9);
    }

    public static String l(long j9) {
        int iH = h(j9);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j9);
        return "Constraints(minWidth = " + j(j9) + ", maxWidth = " + strValueOf + ", minHeight = " + i(j9) + ", maxHeight = " + (iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f22816a, obj);
    }

    public int hashCode() {
        return k(this.f22816a);
    }

    public final /* synthetic */ long m() {
        return this.f22816a;
    }

    public String toString() {
        return l(this.f22816a);
    }
}
