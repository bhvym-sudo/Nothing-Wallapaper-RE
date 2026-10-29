package p089i8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1442p extends AbstractC1441o {
    public static List c(Object[] objArr) {
        n.h(objArr, "<this>");
        List listA = r.a(objArr);
        n.g(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        n.h(bArr, "<this>");
        n.h(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static final float[] e(float[] fArr, float[] destination, int i10, int i11, int i12) {
        n.h(fArr, "<this>");
        n.h(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] f(int[] iArr, int[] destination, int i10, int i11, int i12) {
        n.h(iArr, "<this>");
        n.h(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] g(long[] jArr, long[] destination, int i10, int i11, int i12) {
        n.h(jArr, "<this>");
        n.h(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] h(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        n.h(objArr, "<this>");
        n.h(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] i(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return d(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] j(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return e(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] k(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return f(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] l(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return h(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] m(byte[] bArr, int i10, int i11) {
        n.h(bArr, "<this>");
        AbstractC1440n.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        n.g(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] n(Object[] objArr, int i10, int i11) {
        n.h(objArr, "<this>");
        AbstractC1440n.b(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        n.g(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void o(int[] iArr, int i10, int i11, int i12) {
        n.h(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void p(long[] jArr, long j9, int i10, int i11) {
        n.h(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j9);
    }

    public static void q(Object[] objArr, Object obj, int i10, int i11) {
        n.h(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void r(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        o(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void s(long[] jArr, long j9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        p(jArr, j9, i10, i11);
    }

    public static /* synthetic */ void t(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        q(objArr, obj, i10, i11);
    }

    public static int[] u(int[] iArr, int i10) {
        n.h(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        n.e(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] v(int[] iArr, int[] elements) {
        n.h(iArr, "<this>");
        n.h(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        n.e(iArrCopyOf);
        return iArrCopyOf;
    }

    public static Object[] w(Object[] objArr, Object obj) {
        n.h(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        n.e(objArrCopyOf);
        return objArrCopyOf;
    }

    public static final void x(Object[] objArr) {
        n.h(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static void y(Object[] objArr, Comparator comparator) {
        n.h(objArr, "<this>");
        n.h(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void z(Object[] objArr, Comparator comparator, int i10, int i11) {
        n.h(objArr, "<this>");
        n.h(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }
}
