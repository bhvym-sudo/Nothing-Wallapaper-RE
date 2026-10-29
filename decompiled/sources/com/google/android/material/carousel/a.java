package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f16703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f16704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f16705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f16706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f16707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f16708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f16709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f16710h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f16703a = i10;
        this.f16704b = p221w0.a.a(f10, f11, f12);
        this.f16705c = i11;
        this.f16707e = f13;
        this.f16706d = i12;
        this.f16708f = f14;
        this.f16709g = i13;
        d(f15, f11, f12, f14);
        this.f16710h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = i10;
        float f13 = i11 / 2.0f;
        return (f10 - ((f12 + f13) * f11)) / (i12 + f13);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f16708f) * this.f16703a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f16710h < aVar.f16710h) {
                        if (aVar2.f16710h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f16705c;
        if (i10 > 0 && f14 > 0.0f) {
            float f15 = this.f16704b;
            this.f16704b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < 0.0f) {
            float f16 = this.f16704b;
            this.f16704b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f16705c;
        float f17 = i11 > 0 ? this.f16704b : 0.0f;
        this.f16704b = f17;
        float fA = a(f10, i11, f17, this.f16706d, this.f16709g);
        this.f16708f = fA;
        float f18 = (this.f16704b + fA) / 2.0f;
        this.f16707e = f18;
        int i12 = this.f16706d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f16709g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > 0.0f) {
            this.f16707e -= fMin / this.f16706d;
            this.f16708f += fMin / this.f16709g;
        } else {
            this.f16707e += fMin / this.f16706d;
            this.f16708f -= fMin / this.f16709g;
        }
    }

    private float f() {
        return (this.f16708f * this.f16709g) + (this.f16707e * this.f16706d) + (this.f16704b * this.f16705c);
    }

    private boolean g() {
        int i10 = this.f16709g;
        if (i10 <= 0 || this.f16705c <= 0 || this.f16706d <= 0) {
            return i10 <= 0 || this.f16705c <= 0 || this.f16708f > this.f16704b;
        }
        float f10 = this.f16708f;
        float f11 = this.f16707e;
        return f10 > f11 && f11 > this.f16704b;
    }

    int e() {
        return this.f16705c + this.f16706d + this.f16709g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f16703a + ", smallCount=" + this.f16705c + ", smallSize=" + this.f16704b + ", mediumCount=" + this.f16706d + ", mediumSize=" + this.f16707e + ", largeCount=" + this.f16709g + ", largeSize=" + this.f16708f + ", cost=" + this.f16710h + "]";
    }
}
