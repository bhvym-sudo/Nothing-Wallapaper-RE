package p097j6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final int a(int i10, int i11, int i12, int i13) {
        int i14 = i11 / 2;
        int i15 = i10 / 2;
        int i16 = 0;
        while ((i14 >> i16) >= i13 && (i15 >> i16) >= i12) {
            i16++;
        }
        return 1 << i16;
    }
}
