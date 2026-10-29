package F2;

/* JADX INFO: renamed from: F2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0794a {
    protected boolean a(int[] iArr, boolean[][] zArr, int i10, int i11, int i12, int i13) {
        int i14 = 0;
        while (true) {
            int i15 = i14 + i13;
            if (i15 > i11) {
                return false;
            }
            int i16 = 0;
            while (true) {
                int i17 = i16 + i12;
                if (i17 <= i10) {
                    boolean z9 = !zArr[i16][i14];
                    for (int i18 = i16; i18 < i17; i18++) {
                        for (int i19 = i14; i19 < i15; i19++) {
                            z9 = z9 && !zArr[i18][i19];
                            if (!z9) {
                                break;
                            }
                        }
                    }
                    if (z9) {
                        iArr[0] = i16;
                        iArr[1] = i14;
                        return true;
                    }
                    i16++;
                }
            }
            i14++;
        }
    }
}
