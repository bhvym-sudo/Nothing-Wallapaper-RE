package p121m0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p121m0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23093c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f23094d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f23095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f23096b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float fA;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                float f14 = 0.0f;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return f10 * (f16 / f15);
                }
                if (i11 == -1) {
                    f11 = fArr[0];
                    f13 = fArr2[0];
                    f12 = 0.0f;
                } else {
                    f14 = fArr[i11];
                    f11 = fArr[i10];
                    f12 = fArr2[i11];
                    f13 = fArr2[i10];
                }
                fA = d.f23097a.a(f12, f13, f14, f11, fAbs);
            }
            return fSignum * fA;
        }

        private a() {
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f23095a = fArr;
        this.f23096b = fArr2;
    }

    @Override // p121m0.a
    public float a(float f10) {
        return f23093c.b(f10, this.f23095a, this.f23096b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f23095a, cVar.f23095a) && Arrays.equals(this.f23096b, cVar.f23096b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f23095a) * 31) + Arrays.hashCode(this.f23096b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f23095a);
        n.g(string, "toString(this)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f23096b);
        n.g(string2, "toString(this)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
