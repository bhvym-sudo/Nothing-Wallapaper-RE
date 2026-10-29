package p085i4;

import p025c4.AbstractC1201o;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean a(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (AbstractC1201o.a(objArr[i10], obj)) {
                if (i10 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
