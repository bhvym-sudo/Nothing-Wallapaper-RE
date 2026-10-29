package I;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static final long a(float f10, float f11) {
        return P.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
