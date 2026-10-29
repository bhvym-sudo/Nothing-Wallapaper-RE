package p017b6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static int a(double d10) {
        return c(Double.doubleToLongBits(d10));
    }

    public static int b(float f10) {
        return Float.floatToIntBits(f10);
    }

    public static int c(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    public static int d(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            if (obj.equals(obj2)) {
                return true;
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    return Arrays.equals((Object[]) obj, (Object[]) obj2);
                }
                if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                }
                if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    return Arrays.equals((byte[]) obj, (byte[]) obj2);
                }
                if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    return Arrays.equals((char[]) obj, (char[]) obj2);
                }
                if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    return Arrays.equals((double[]) obj, (double[]) obj2);
                }
                if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    return Arrays.equals((float[]) obj, (float[]) obj2);
                }
                if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    return Arrays.equals((int[]) obj, (int[]) obj2);
                }
                if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    return Arrays.equals((long[]) obj, (long[]) obj2);
                }
                if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    return Arrays.equals((short[]) obj, (short[]) obj2);
                }
            }
        }
        return false;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return m((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return o((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return g((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return h((char[]) obj);
            }
            if (obj instanceof double[]) {
                return i((double[]) obj);
            }
            if (obj instanceof float[]) {
                return j((float[]) obj);
            }
            if (obj instanceof int[]) {
                return k((int[]) obj);
            }
            if (obj instanceof long[]) {
                return l((long[]) obj);
            }
            if (obj instanceof short[]) {
                return n((short[]) obj);
            }
        }
        return obj.hashCode();
    }

    public static int g(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i10 = 7;
        for (byte b10 : bArr) {
            i10 = (i10 * 31) + b10;
        }
        return i10;
    }

    public static int h(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int i10 = 7;
        for (char c10 : cArr) {
            i10 = (i10 * 31) + c10;
        }
        return i10;
    }

    public static int i(double[] dArr) {
        if (dArr == null) {
            return 0;
        }
        int iA = 7;
        for (double d10 : dArr) {
            iA = (iA * 31) + a(d10);
        }
        return iA;
    }

    public static int j(float[] fArr) {
        if (fArr == null) {
            return 0;
        }
        int iB = 7;
        for (float f10 : fArr) {
            iB = (iB * 31) + b(f10);
        }
        return iB;
    }

    public static int k(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i10 = 7;
        for (int i11 : iArr) {
            i10 = (i10 * 31) + i11;
        }
        return i10;
    }

    public static int l(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int iC = 7;
        for (long j9 : jArr) {
            iC = (iC * 31) + c(j9);
        }
        return iC;
    }

    public static int m(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int iF = 7;
        for (Object obj : objArr) {
            iF = (iF * 31) + f(obj);
        }
        return iF;
    }

    public static int n(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int i10 = 7;
        for (short s9 : sArr) {
            i10 = (i10 * 31) + s9;
        }
        return i10;
    }

    public static int o(boolean[] zArr) {
        if (zArr == null) {
            return 0;
        }
        int iD = 7;
        for (boolean z9 : zArr) {
            iD = (iD * 31) + d(z9);
        }
        return iD;
    }
}
