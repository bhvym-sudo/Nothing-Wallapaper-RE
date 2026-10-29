package e9;

/* JADX INFO: renamed from: e9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1347b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1350e.a f20242a = new C1350e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f20243b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        kotlin.jvm.internal.n.h(a10, "a");
        kotlin.jvm.internal.n.h(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException("size=" + j9 + " offset=" + j10 + " byteCount=" + j11);
        }
    }

    public static final int c() {
        return f20243b;
    }

    public static final int d(h hVar, int i10) {
        kotlin.jvm.internal.n.h(hVar, "<this>");
        return i10 == f20243b ? hVar.v() : i10;
    }

    public static final int e(byte[] bArr, int i10) {
        kotlin.jvm.internal.n.h(bArr, "<this>");
        return i10 == f20243b ? bArr.length : i10;
    }

    public static final int f(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short g(short s9) {
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public static final String h(byte b10) {
        return E8.i.x(new char[]{f9.b.f()[(b10 >> 4) & 15], f9.b.f()[b10 & 15]});
    }

    public static final String i(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {f9.b.f()[(i10 >> 28) & 15], f9.b.f()[(i10 >> 24) & 15], f9.b.f()[(i10 >> 20) & 15], f9.b.f()[(i10 >> 16) & 15], f9.b.f()[(i10 >> 12) & 15], f9.b.f()[(i10 >> 8) & 15], f9.b.f()[(i10 >> 4) & 15], f9.b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return E8.i.y(cArr, i11, 8);
    }
}
