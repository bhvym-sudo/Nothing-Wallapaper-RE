package J;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {
    public A(String str, int i10) {
        super(str, b.f3401a.c(), i10, null);
    }

    @Override // J.c
    public float c(int i10) {
        return 2.0f;
    }

    @Override // J.c
    public float d(int i10) {
        return -2.0f;
    }

    @Override // J.c
    public long h(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
    }

    @Override // J.c
    public float i(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // J.c
    public long j(float f10, float f11, float f12, float f13, c cVar) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return I.t.a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, cVar);
    }
}
