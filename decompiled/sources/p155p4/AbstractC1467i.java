package p155p4;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: renamed from: p4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1467i {
    static int a(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        return i12 < 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i12;
    }
}
