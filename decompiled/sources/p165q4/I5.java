package p165q4;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class I5 {
    public static void a(C1650x5 c1650x5, int i10, int i11, long j9, int i12, int i13, int i14, int i15) {
        c1650x5.c(b(i10, i11, j9, i12, i13, i14, i15), F3.INPUT_IMAGE_CONSTRUCTION);
    }

    private static H5 b(int i10, int i11, long j9, int i12, int i13, int i14, int i15) {
        return new H5(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j9, i15);
    }
}
