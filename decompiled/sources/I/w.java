package I;

import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f2765q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final short f2766r = e(5120);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final short f2767s = e(-1025);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final short f2768t = e(31743);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final short f2769u = e(1024);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final short f2770v = e(1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final short f2771w = e(32256);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final short f2772x = e(-1024);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final short f2773y = e(Short.MIN_VALUE);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final short f2774z = e(31744);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final short f2764A = e(0);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static short d(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else {
                if (i16 > 0) {
                    i15 = i13 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    } else {
                        i14 = i16;
                    }
                    return e((short) i10);
                }
                if (i16 >= -10) {
                    int i17 = (8388608 | i13) >> (1 - i16);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i14 = 0;
                    i15 = i17 >> 13;
                } else {
                    i14 = 0;
                }
            }
        } else if (i13 != 0) {
            i15 = Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return e((short) i10);
    }

    public static short e(short s9) {
        return s9;
    }
}
