package p111l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static final long a(float f10, float f11) {
        return x.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
