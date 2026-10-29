package androidx.datastore.preferences.protobuf;

import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1114y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f12696a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f12697b = Charset.forName(Key.STRING_CHARSET_NAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f12698c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f12699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f12700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1098h f12701f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends List, RandomAccess {
        void c();

        b d(int i10);

        boolean l();
    }

    static {
        byte[] bArr = new byte[0];
        f12699d = bArr;
        f12700e = ByteBuffer.wrap(bArr);
        f12701f = AbstractC1098h.i(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int iG = g(i11, bArr, i10, i11);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    static int g(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
