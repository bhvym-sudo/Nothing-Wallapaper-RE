package e9;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final transient byte[][] f20319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final transient int[] f20320w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(byte[][] segments, int[] directory) {
        super(h.f20268u.i());
        kotlin.jvm.internal.n.h(segments, "segments");
        kotlin.jvm.internal.n.h(directory, "directory");
        this.f20319v = segments;
        this.f20320w = directory;
    }

    private final h D() {
        return new h(C());
    }

    public final int[] A() {
        return this.f20320w;
    }

    public final byte[][] B() {
        return this.f20319v;
    }

    public byte[] C() {
        byte[] bArr = new byte[v()];
        int length = B().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = A()[length + i10];
            int i14 = A()[i10];
            int i15 = i14 - i11;
            AbstractC1439m.d(B()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // e9.h
    public String d() {
        return D().d();
    }

    @Override // e9.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.v() == v() && q(0, hVar, 0, v())) {
                return true;
            }
        }
        return false;
    }

    @Override // e9.h
    public h f(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.n.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = B().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = A()[length + i10];
            int i13 = A()[i10];
            messageDigest.update(B()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.n.e(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // e9.h
    public int hashCode() {
        int iK = k();
        if (iK != 0) {
            return iK;
        }
        int length = B().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = A()[length + i10];
            int i14 = A()[i10];
            byte[] bArr = B()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        s(i11);
        return i11;
    }

    @Override // e9.h
    public int l() {
        return A()[B().length - 1];
    }

    @Override // e9.h
    public String n() {
        return D().n();
    }

    @Override // e9.h
    public byte[] o() {
        return C();
    }

    @Override // e9.h
    public byte p(int i10) {
        AbstractC1347b.b(A()[B().length - 1], i10, 1L);
        int iB = f9.c.b(this, i10);
        return B()[iB][(i10 - (iB == 0 ? 0 : A()[iB - 1])) + A()[B().length + iB]];
    }

    @Override // e9.h
    public boolean q(int i10, h other, int i11, int i12) {
        kotlin.jvm.internal.n.h(other, "other");
        if (i10 < 0 || i10 > v() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = f9.c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : A()[iB - 1];
            int i15 = A()[iB] - i14;
            int i16 = A()[B().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.r(i11, B()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // e9.h
    public boolean r(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.n.h(other, "other");
        if (i10 < 0 || i10 > v() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = f9.c.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : A()[iB - 1];
            int i15 = A()[iB] - i14;
            int i16 = A()[B().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC1347b.a(B()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // e9.h
    public String toString() {
        return D().toString();
    }

    @Override // e9.h
    public h x() {
        return D().x();
    }

    @Override // e9.h
    public void z(C1350e buffer, int i10, int i11) {
        kotlin.jvm.internal.n.h(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = f9.c.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : A()[iB - 1];
            int i14 = A()[iB] - i13;
            int i15 = A()[B().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            w wVar = new w(B()[iB], i16, i16 + iMin, true, false);
            w wVar2 = buffer.f20257q;
            if (wVar2 == null) {
                wVar.f20313g = wVar;
                wVar.f20312f = wVar;
                buffer.f20257q = wVar;
            } else {
                kotlin.jvm.internal.n.e(wVar2);
                w wVar3 = wVar2.f20313g;
                kotlin.jvm.internal.n.e(wVar3);
                wVar3.c(wVar);
            }
            i10 += iMin;
            iB++;
        }
        buffer.W0(buffer.X0() + ((long) i11));
    }
}
