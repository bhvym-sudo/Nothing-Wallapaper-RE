package p240y;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f30096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f30097c;

    public h(int i10, long[] jArr, Object[] objArr) {
        this.f30095a = i10;
        this.f30096b = jArr;
        this.f30097c = objArr;
    }

    private final int a(long j9) {
        int i10 = this.f30095a - 1;
        if (i10 != -1) {
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j10 = this.f30096b[i12] - j9;
                    if (j10 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j10 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j11 = this.f30096b[0];
            if (j11 == j9) {
                return 0;
            }
            if (j11 > j9) {
                return -2;
            }
        }
        return -1;
    }

    public final Object b(long j9) {
        int iA = a(j9);
        if (iA >= 0) {
            return this.f30097c[iA];
        }
        return null;
    }

    public final h c(long j9, Object obj) {
        int i10 = this.f30095a;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : this.f30097c) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr = new long[i13];
        Object[] objArr = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (i11 < i13 && i14 < i10) {
                long j10 = this.f30096b[i14];
                Object obj3 = this.f30097c[i14];
                if (j10 > j9) {
                    jArr[i11] = j9;
                    objArr[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i11] = j10;
                    objArr[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr[i12] = j9;
                objArr[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j11 = this.f30096b[i14];
                    Object obj4 = this.f30097c[i14];
                    if (obj4 != null) {
                        jArr[i11] = j11;
                        objArr[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr[0] = j9;
            objArr[0] = obj;
        }
        return new h(i13, jArr, objArr);
    }

    public final boolean d(long j9, Object obj) {
        int iA = a(j9);
        if (iA < 0) {
            return false;
        }
        this.f30097c[iA] = obj;
        return true;
    }
}
