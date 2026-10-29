package K8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class G {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) E.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j9, long j10, long j11) {
        String strD = E.d(str);
        if (strD == null) {
            return j9;
        }
        Long lT = E8.i.t(strD);
        if (lT == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lT.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = E.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z9) {
        String strD = E.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z9;
    }

    public static /* synthetic */ int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        return E.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long f(String str, long j9, long j10, long j11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 1;
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return E.c(str, j9, j12, j11);
    }
}
