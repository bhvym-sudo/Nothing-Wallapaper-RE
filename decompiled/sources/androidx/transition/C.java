package androidx.transition;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f14048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f14049b = new float[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14050c = 0;

    C() {
        long[] jArr = new long[20];
        this.f14048a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float c(float f10) {
        return (float) (((double) Math.signum(f10)) * Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void a(long j9, float f10) {
        int i10 = (this.f14050c + 1) % 20;
        this.f14050c = i10;
        this.f14048a[i10] = j9;
        this.f14049b[i10] = f10;
    }

    float b() {
        int i10 = this.f14050c;
        if (i10 == 0 && this.f14048a[i10] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j9 = this.f14048a[i10];
        int i11 = 0;
        long j10 = j9;
        while (true) {
            long j11 = this.f14048a[i10];
            if (j11 == Long.MIN_VALUE) {
                break;
            }
            float f10 = j9 - j11;
            float fAbs = Math.abs(j11 - j10);
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            j10 = j11;
        }
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = this.f14050c;
            int i13 = i12 == 0 ? 19 : i12 - 1;
            long[] jArr = this.f14048a;
            float f11 = jArr[i12] - jArr[i13];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f14049b;
            return ((fArr[i12] - fArr[i13]) / f11) * 1000.0f;
        }
        int i14 = this.f14050c;
        int i15 = ((i14 - i11) + 21) % 20;
        int i16 = (i14 + 21) % 20;
        long j12 = this.f14048a[i15];
        float f12 = this.f14049b[i15];
        int i17 = i15 + 1;
        float fC = 0.0f;
        for (int i18 = i17 % 20; i18 != i16; i18 = (i18 + 1) % 20) {
            long j13 = this.f14048a[i18];
            float f13 = j13 - j12;
            if (f13 != 0.0f) {
                float f14 = this.f14049b[i18];
                float f15 = (f14 - f12) / f13;
                fC += (f15 - c(fC)) * Math.abs(f15);
                if (i18 == i17) {
                    fC *= 0.5f;
                }
                f12 = f14;
                j12 = j13;
            }
        }
        return c(fC) * 1000.0f;
    }
}
