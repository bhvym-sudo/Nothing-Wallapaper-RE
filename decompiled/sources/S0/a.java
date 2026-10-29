package S0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final SimpleDateFormat f7142U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final SimpleDateFormat f7143V;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final d[] f7147Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final d[] f7148a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d[] f7149b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d[] f7150c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final d[] f7151d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final d f7152e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final d[] f7153f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final d[] f7154g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final d[] f7155h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final d[] f7156i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    static final d[][] f7157j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final d[] f7158k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f7159l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashMap[] f7160m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Set f7161n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final HashMap f7162o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Charset f7163p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final byte[] f7164q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final byte[] f7165r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f7166s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f7167t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f7168u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f7170v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f7176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f7177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f7180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f7181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f7182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f7188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f7193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f7194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f7169v = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f7171w = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List f7172x = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f7173y = {8, 8, 8};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7174z = {4};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f7122A = {8};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final byte[] f7123B = {-1, -40, -1};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final byte[] f7124C = {102, 116, 121, 112};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final byte[] f7125D = {109, 105, 102, 49};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final byte[] f7126E = {104, 101, 105, 99};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final byte[] f7127F = {97, 118, 105, 102};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final byte[] f7128G = {97, 118, 105, 115};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final byte[] f7129H = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final byte[] f7130I = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final byte[] f7131J = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final byte[] f7132K = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final byte[] f7133L = {82, 73, 70, 70};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final byte[] f7134M = {87, 69, 66, 80};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f7135N = {69, 88, 73, 70};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f7136O = {-99, 1, 42};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final byte[] f7137P = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f7138Q = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final byte[] f7139R = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final byte[] f7140S = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final byte[] f7141T = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String[] f7144W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final int[] f7145X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final byte[] f7146Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: S0.a$a, reason: collision with other inner class name */
    class C0260a extends MediaDataSource {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        long f7196q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f7197r;

        C0260a(f fVar) {
            this.f7197r = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j9, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j9 < 0) {
                return -1;
            }
            try {
                long j10 = this.f7196q;
                if (j10 != j9) {
                    if (j10 >= 0 && j9 >= j10 + ((long) this.f7197r.available())) {
                        return -1;
                    }
                    this.f7197r.z(j9);
                    this.f7196q = j9;
                }
                if (i11 > this.f7197r.available()) {
                    i11 = this.f7197r.available();
                }
                int i12 = this.f7197r.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f7196q += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f7196q = -1L;
            return -1;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f7207d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f7163p0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j9, ByteOrder byteOrder) {
            return c(new long[]{j9}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f7145X[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j9 : jArr) {
                byteBufferWrap.putInt((int) j9);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f7145X[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f7212a);
                byteBufferWrap.putInt((int) eVar.f7213b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f7145X[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i10 < eVarArr.length) {
                sb.append(eVarArr[i10].f7212a);
                sb.append('/');
                sb.append(eVarArr[i10].f7213b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:165:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:193:? A[SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0032: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x0031 */
        Object k(ByteOrder byteOrder) throws Throwable {
            Throwable th;
            IOException iOException;
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            int length = 0;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f7207d);
                    try {
                        bVar.j(byteOrder);
                        switch (this.f7204a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f7207d;
                                if (bArr.length != 1 || (b10 = bArr[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr, a.f7163p0);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (this.f7205b >= a.f7146Y.length) {
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= a.f7146Y.length) {
                                            length = a.f7146Y.length;
                                        } else if (this.f7207d[i10] == a.f7146Y[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f7205b && (b11 = this.f7207d[length]) != 0) {
                                    if (b11 >= 32) {
                                        sb.append((char) b11);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                String string = sb.toString();
                                try {
                                    bVar.close();
                                    return string;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return string;
                                }
                            case 3:
                                int[] iArr = new int[this.f7205b];
                                while (length < this.f7205b) {
                                    iArr[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return iArr;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return iArr;
                                }
                            case 4:
                                long[] jArr = new long[this.f7205b];
                                while (length < this.f7205b) {
                                    jArr[length] = bVar.g();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return jArr;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return jArr;
                                }
                            case 5:
                                e[] eVarArr = new e[this.f7205b];
                                while (length < this.f7205b) {
                                    eVarArr[length] = new e(bVar.g(), bVar.g(), null);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return eVarArr;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return eVarArr;
                                }
                            case 8:
                                int[] iArr2 = new int[this.f7205b];
                                while (length < this.f7205b) {
                                    iArr2[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return iArr2;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return iArr2;
                                }
                            case 9:
                                int[] iArr3 = new int[this.f7205b];
                                while (length < this.f7205b) {
                                    iArr3[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return iArr3;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return iArr3;
                                }
                            case 10:
                                e[] eVarArr2 = new e[this.f7205b];
                                while (length < this.f7205b) {
                                    eVarArr2[length] = new e(bVar.readInt(), bVar.readInt(), null);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return eVarArr2;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                    return eVarArr2;
                                }
                            case 11:
                                double[] dArr = new double[this.f7205b];
                                while (length < this.f7205b) {
                                    dArr[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return dArr;
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                    return dArr;
                                }
                            case 12:
                                double[] dArr2 = new double[this.f7205b];
                                while (length < this.f7205b) {
                                    dArr2[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return dArr2;
                                } catch (IOException e20) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                                    return dArr2;
                                }
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e21) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                                    return null;
                                }
                        }
                    } catch (IOException e22) {
                        iOException = e22;
                        Log.w("ExifInterface", "IOException occurred during reading a value", iOException);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e23) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        throw th;
                    }
                    try {
                        inputStream2.close();
                        throw th;
                    } catch (IOException e24) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e24);
                        throw th;
                    }
                }
            } catch (IOException e25) {
                iOException = e25;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    throw th;
                }
                inputStream2.close();
                throw th;
            }
        }

        public String toString() {
            return "(" + a.f7144W[this.f7204a] + ", data length:" + this.f7207d.length + ")";
        }

        c(int i10, int i11, long j9, byte[] bArr) {
            this.f7204a = i10;
            this.f7205b = i11;
            this.f7206c = j9;
            this.f7207d = bArr;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7213b;

        /* synthetic */ e(long j9, long j10, C0260a c0260a) {
            this(j9, j10);
        }

        public double a() {
            return this.f7212a / this.f7213b;
        }

        public String toString() {
            return this.f7212a + "/" + this.f7213b;
        }

        private e(long j9, long j10) {
            if (j10 == 0) {
                this.f7212a = 0L;
                this.f7213b = 1L;
            } else {
                this.f7212a = j9;
                this.f7213b = j10;
            }
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", Optimizer.OPTIMIZATION_STANDARD, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", TypedValues.TransitionType.TYPE_DURATION, 1)};
        f7147Z = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f7148a0 = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f7149b0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f7150c0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", Optimizer.OPTIMIZATION_STANDARD, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", SubsamplingScaleImageView.ORIENTATION_270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", TypedValues.AttributesType.TYPE_PIVOT_TARGET, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f7151d0 = dVarArr5;
        f7152e0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f7153f0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", Optimizer.OPTIMIZATION_STANDARD, 4), new d("PreviewImageLength", 258, 4)};
        f7154g0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f7155h0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f7156i0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f7157j0 = dVarArr10;
        f7158k0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f7159l0 = new HashMap[dVarArr10.length];
        f7160m0 = new HashMap[dVarArr10.length];
        f7161n0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f7162o0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f7163p0 = charsetForName;
        f7164q0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f7165r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f7142U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f7143V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f7157j0;
            if (i10 >= dVarArr11.length) {
                HashMap map = f7162o0;
                d[] dVarArr12 = f7158k0;
                map.put(Integer.valueOf(dVarArr12[0].f7208a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f7208a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f7208a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f7208a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f7208a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f7208a), 8);
                f7166s0 = Pattern.compile(".*[1-9].*");
                f7167t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f7168u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f7170v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f7159l0[i10] = new HashMap();
            f7160m0[i10] = new HashMap();
            for (d dVar : dVarArr11[i10]) {
                f7159l0[i10].put(Integer.valueOf(dVar.f7208a), dVar);
                f7160m0[i10].put(dVar.f7209b, dVar);
            }
            i10++;
        }
    }

    public a(String str) throws Throwable {
        d[][] dVarArr = f7157j0;
        this.f7180f = new HashMap[dVarArr.length];
        this.f7181g = new HashSet(dVarArr.length);
        this.f7182h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        v(str);
    }

    private boolean A(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean B(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderJ = J(bVar2);
                this.f7182h = byteOrderJ;
                bVar2.j(byteOrderJ);
                boolean z9 = bVar2.readShort() == 85;
                bVar2.close();
                return z9;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean C(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f7169v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean D(HashMap map) {
        c cVar;
        int i10;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f7182h);
            int[] iArr2 = f7173y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f7178d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f7182h)) == 1 && Arrays.equals(iArr, f7122A)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f7169v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean E(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f7182h) <= 512 && cVar2.i(this.f7182h) <= 512;
    }

    private boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f7133L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f7134M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f7133L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void G(InputStream inputStream) {
        for (int i10 = 0; i10 < f7157j0.length; i10++) {
            try {
                try {
                    this.f7180f[i10] = new HashMap();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z9 = f7169v;
                    if (z9) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    e();
                    if (z9) {
                        I();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                e();
                if (f7169v) {
                    I();
                }
                throw th;
            }
        }
        if (!this.f7179e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f7178d = k(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (P(this.f7178d)) {
            f fVar = new f(inputStream);
            if (!this.f7179e) {
                int i11 = this.f7178d;
                if (i11 == 12 || i11 == 15) {
                    i(fVar, i11);
                } else if (i11 == 7) {
                    l(fVar);
                } else if (i11 == 10) {
                    p(fVar);
                } else {
                    o(fVar);
                }
            } else if (!q(fVar)) {
                e();
                if (f7169v) {
                    I();
                    return;
                }
                return;
            }
            fVar.z(this.f7190p);
            O(fVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f7178d;
            if (i12 == 4) {
                j(bVar, 0, 0);
            } else if (i12 == 13) {
                m(bVar);
            } else if (i12 == 9) {
                n(bVar);
            } else if (i12 == 14) {
                r(bVar);
            }
        }
        e();
        if (f7169v) {
            I();
        }
    }

    private void H(b bVar) throws IOException {
        ByteOrder byteOrderJ = J(bVar);
        this.f7182h = byteOrderJ;
        bVar.j(byteOrderJ);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f7178d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.u(i12);
        }
    }

    private void I() {
        for (int i10 = 0; i10 < this.f7180f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f7180f[i10].size());
            for (Map.Entry entry : this.f7180f[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f7182h) + "'");
            }
        }
    }

    private ByteOrder J(b bVar) throws IOException {
        short s9 = bVar.readShort();
        if (s9 == 18761) {
            if (f7169v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s9 == 19789) {
            if (f7169v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s9));
    }

    private void K(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        H(fVar);
        L(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x030a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0336  */
    /* JADX WARN: Code duplicated, block: B:147:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x0204 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:77:0x020a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0217  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0221  */
    /* JADX WARN: Code duplicated, block: B:86:0x0228  */
    /* JADX WARN: Code duplicated, block: B:89:0x0242  */
    /* JADX WARN: Code duplicated, block: B:98:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x028d  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x02a4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01dd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x028d, please report this as an issue */
    private void L(f fVar, int i10) throws IOException {
        int i11;
        d dVar;
        long j9;
        boolean z9;
        boolean z10;
        d dVar2;
        Integer num;
        int unsignedShort;
        long jG;
        String str;
        int i12;
        this.f7181g.add(Integer.valueOf(fVar.b()));
        short s9 = fVar.readShort();
        if (f7169v) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s9));
        }
        if (s9 <= 0) {
            return;
        }
        short s10 = 0;
        while (s10 < s9) {
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i13 = fVar.readInt();
            long jB = ((long) fVar.b()) + 4;
            d dVar3 = (d) f7159l0[i10].get(Integer.valueOf(unsignedShort2));
            boolean z11 = f7169v;
            if (z11) {
                i11 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), dVar3 != null ? dVar3.f7209b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            } else {
                i11 = 4;
            }
            if (dVar3 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f7145X;
                    if (unsignedShort3 < iArr.length) {
                        if (dVar3.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = dVar3.f7210c;
                            }
                            dVar = dVar3;
                            j9 = ((long) i13) * ((long) iArr[unsignedShort3]);
                            if (j9 < 0 || j9 > 2147483647L) {
                                if (z11) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i13);
                                }
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                        } else if (z11) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f7144W[unsignedShort3] + ") is unexpected for tag: " + dVar3.f7209b);
                        }
                    }
                    if (z9) {
                        if (j9 > 4) {
                            i12 = fVar.readInt();
                            if (z11) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f7178d == 7) {
                                dVar2 = dVar;
                                z10 = z11;
                                if ("MakerNote".equals(dVar2.f7209b)) {
                                    this.f7191q = i12;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar2.f7209b)) {
                                    this.f7192r = i12;
                                    this.f7193s = i13;
                                    c cVarF = c.f(6, this.f7182h);
                                    c cVarB = c.b(this.f7192r, this.f7182h);
                                    c cVarB2 = c.b(this.f7193s, this.f7182h);
                                    this.f7180f[i11].put("Compression", cVarF);
                                    this.f7180f[i11].put("JPEGInterchangeFormat", cVarB);
                                    this.f7180f[i11].put("JPEGInterchangeFormatLength", cVarB2);
                                }
                            } else {
                                z10 = z11;
                                dVar2 = dVar;
                            }
                            fVar.z(i12);
                        } else {
                            z10 = z11;
                            unsignedShort2 = unsignedShort2;
                            i13 = i13;
                            dVar2 = dVar;
                        }
                        num = (Integer) f7162o0.get(Integer.valueOf(unsignedShort2));
                        if (z10) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j9);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i11) {
                                    jG = fVar.g();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    jG = -1;
                                }
                                if (z10) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jG), dVar2.f7209b));
                                }
                                if (jG > 0 || (fVar.a() != -1 && jG >= fVar.a())) {
                                    if (z10) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                        if (fVar.a() != -1) {
                                            str = str + " (total length: " + fVar.a() + ")";
                                        }
                                        Log.d("ExifInterface", str);
                                    }
                                } else if (!this.f7181g.contains(Integer.valueOf((int) jG))) {
                                    fVar.z(jG);
                                    L(fVar, num.intValue());
                                } else if (z10) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jG + ")");
                                }
                                fVar.z(jB);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            jG = unsignedShort;
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jG), dVar2.f7209b));
                            }
                            if (jG > 0) {
                                if (z10) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                    if (fVar.a() != -1) {
                                        str = str + " (total length: " + fVar.a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            fVar.z(jB);
                        } else {
                            int iB = fVar.b() + this.f7190p;
                            byte[] bArr = new byte[(int) j9];
                            fVar.readFully(bArr);
                            c cVar = new c(unsignedShort3, i13, iB, bArr);
                            this.f7180f[i10].put(dVar2.f7209b, cVar);
                            if ("DNGVersion".equals(dVar2.f7209b)) {
                                this.f7178d = 3;
                            }
                            if (((!"Make".equals(dVar2.f7209b) || "Model".equals(dVar2.f7209b)) && cVar.j(this.f7182h).contains("PENTAX")) || ("Compression".equals(dVar2.f7209b) && cVar.i(this.f7182h) == 65535)) {
                                this.f7178d = 8;
                            }
                            if (fVar.b() != jB) {
                                fVar.z(jB);
                            }
                        }
                    } else {
                        fVar.z(jB);
                    }
                    s10 = (short) (s10 + 1);
                    s9 = s9;
                }
                dVar = dVar3;
                if (z11) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j9 = 0;
                z9 = false;
                if (z9) {
                    fVar.z(jB);
                } else {
                    if (j9 > 4) {
                        i12 = fVar.readInt();
                        if (z11) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f7178d == 7) {
                            dVar2 = dVar;
                            z10 = z11;
                            if ("MakerNote".equals(dVar2.f7209b)) {
                                this.f7191q = i12;
                            } else if (i10 != 6) {
                            }
                        } else {
                            z10 = z11;
                            dVar2 = dVar;
                        }
                        fVar.z(i12);
                    } else {
                        z10 = z11;
                        unsignedShort2 = unsignedShort2;
                        i13 = i13;
                        dVar2 = dVar;
                    }
                    num = (Integer) f7162o0.get(Integer.valueOf(unsignedShort2));
                    if (z10) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j9);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i11) {
                                jG = fVar.g();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jG), dVar2.f7209b));
                            }
                            if (jG > 0) {
                                if (z10) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                    if (fVar.a() != -1) {
                                        str = str + " (total length: " + fVar.a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            fVar.z(jB);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        jG = unsignedShort;
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jG), dVar2.f7209b));
                        }
                        if (jG > 0) {
                            if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z10) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jG;
                            if (fVar.a() != -1) {
                                str = str + " (total length: " + fVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        fVar.z(jB);
                    } else {
                        int iB2 = fVar.b() + this.f7190p;
                        byte[] bArr2 = new byte[(int) j9];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(unsignedShort3, i13, iB2, bArr2);
                        this.f7180f[i10].put(dVar2.f7209b, cVar2);
                        if ("DNGVersion".equals(dVar2.f7209b)) {
                            this.f7178d = 3;
                        }
                        if (!"Make".equals(dVar2.f7209b)) {
                        }
                        this.f7178d = 8;
                        if (fVar.b() != jB) {
                            fVar.z(jB);
                        }
                    }
                }
                s10 = (short) (s10 + 1);
                s9 = s9;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            dVar = dVar3;
            j9 = 0;
            z9 = false;
            if (z9) {
                fVar.z(jB);
            } else {
                if (j9 > 4) {
                    i12 = fVar.readInt();
                    if (z11) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f7178d == 7) {
                        dVar2 = dVar;
                        z10 = z11;
                        if ("MakerNote".equals(dVar2.f7209b)) {
                            this.f7191q = i12;
                        } else if (i10 != 6) {
                        }
                    } else {
                        z10 = z11;
                        dVar2 = dVar;
                    }
                    fVar.z(i12);
                } else {
                    z10 = z11;
                    unsignedShort2 = unsignedShort2;
                    i13 = i13;
                    dVar2 = dVar;
                }
                num = (Integer) f7162o0.get(Integer.valueOf(unsignedShort2));
                if (z10) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j9);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jG = fVar.g();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jG), dVar2.f7209b));
                        }
                        if (jG > 0) {
                            if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jG;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z10) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jG;
                            if (fVar.a() != -1) {
                                str = str + " (total length: " + fVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        fVar.z(jB);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    jG = unsignedShort;
                    if (z10) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jG), dVar2.f7209b));
                    }
                    if (jG > 0) {
                        if (z10) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jG;
                            if (fVar.a() != -1) {
                                str = str + " (total length: " + fVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                    } else if (z10) {
                        str = "Skip jump into the IFD since its offset is invalid: " + jG;
                        if (fVar.a() != -1) {
                            str = str + " (total length: " + fVar.a() + ")";
                        }
                        Log.d("ExifInterface", str);
                    }
                    fVar.z(jB);
                } else {
                    int iB3 = fVar.b() + this.f7190p;
                    byte[] bArr3 = new byte[(int) j9];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(unsignedShort3, i13, iB3, bArr3);
                    this.f7180f[i10].put(dVar2.f7209b, cVar3);
                    if ("DNGVersion".equals(dVar2.f7209b)) {
                        this.f7178d = 3;
                    }
                    if (!"Make".equals(dVar2.f7209b)) {
                    }
                    this.f7178d = 8;
                    if (fVar.b() != jB) {
                        fVar.z(jB);
                    }
                }
            }
            s10 = (short) (s10 + 1);
            s9 = s9;
        }
        int i14 = fVar.readInt();
        boolean z12 = f7169v;
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i14)));
        }
        long j10 = i14;
        if (j10 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        if (this.f7181g.contains(Integer.valueOf(i14))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        fVar.z(j10);
        if (this.f7180f[4].isEmpty()) {
            L(fVar, 4);
        } else if (this.f7180f[5].isEmpty()) {
            L(fVar, 5);
        }
    }

    private void M(int i10, String str, String str2) {
        if (this.f7180f[i10].isEmpty() || this.f7180f[i10].get(str) == null) {
            return;
        }
        HashMap map = this.f7180f[i10];
        map.put(str2, (c) map.get(str));
        this.f7180f[i10].remove(str);
    }

    private void N(f fVar, int i10) throws Throwable {
        c cVar = (c) this.f7180f[i10].get("ImageLength");
        c cVar2 = (c) this.f7180f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f7180f[i10].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f7180f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f7182h);
            int i12 = cVar3.i(this.f7182h);
            fVar.z(i11);
            byte[] bArr = new byte[i12];
            fVar.readFully(bArr);
            j(new b(bArr), i11, i10);
        }
    }

    private void O(b bVar) throws Throwable {
        HashMap map = this.f7180f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f7189o = 6;
            t(bVar, map);
            return;
        }
        int i10 = cVar.i(this.f7182h);
        this.f7189o = i10;
        if (i10 != 1) {
            if (i10 == 6) {
                t(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        if (D(map)) {
            u(bVar, map);
        }
    }

    private static boolean P(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void Q(int i10, int i11) throws Throwable {
        if (this.f7180f[i10].isEmpty() || this.f7180f[i11].isEmpty()) {
            if (f7169v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f7180f[i10].get("ImageLength");
        c cVar2 = (c) this.f7180f[i10].get("ImageWidth");
        c cVar3 = (c) this.f7180f[i11].get("ImageLength");
        c cVar4 = (c) this.f7180f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f7169v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f7169v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = cVar.i(this.f7182h);
        int i13 = cVar2.i(this.f7182h);
        int i14 = cVar3.i(this.f7182h);
        int i15 = cVar4.i(this.f7182h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap[] mapArr = this.f7180f;
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private static void R(CRC32 crc32, int i10) {
        crc32.update(i10 >>> 24);
        crc32.update(i10 >>> 16);
        crc32.update(i10 >>> 8);
        crc32.update(i10);
    }

    private void S(f fVar, int i10) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = (c) this.f7180f[i10].get("DefaultCropSize");
        c cVar2 = (c) this.f7180f[i10].get("SensorTopBorder");
        c cVar3 = (c) this.f7180f[i10].get("SensorLeftBorder");
        c cVar4 = (c) this.f7180f[i10].get("SensorBottomBorder");
        c cVar5 = (c) this.f7180f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                N(fVar, i10);
                return;
            }
            int i11 = cVar2.i(this.f7182h);
            int i12 = cVar4.i(this.f7182h);
            int i13 = cVar5.i(this.f7182h);
            int i14 = cVar3.i(this.f7182h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c cVarF3 = c.f(i12 - i11, this.f7182h);
            c cVarF4 = c.f(i13 - i14, this.f7182h);
            this.f7180f[i10].put("ImageLength", cVarF3);
            this.f7180f[i10].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f7204a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f7182h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f7182h);
            cVarF2 = c.d(eVarArr[1], this.f7182h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f7182h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f7182h);
            cVarF2 = c.f(iArr[1], this.f7182h);
        }
        this.f7180f[i10].put("ImageWidth", cVarF);
        this.f7180f[i10].put("ImageLength", cVarF2);
    }

    private void T() throws Throwable {
        Q(0, 5);
        Q(0, 4);
        Q(5, 4);
        c cVar = (c) this.f7180f[1].get("PixelXDimension");
        c cVar2 = (c) this.f7180f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f7180f[0].put("ImageWidth", cVar);
            this.f7180f[0].put("ImageLength", cVar2);
        }
        if (this.f7180f[4].isEmpty() && E(this.f7180f[5])) {
            HashMap[] mapArr = this.f7180f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!E(this.f7180f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        M(0, "ThumbnailOrientation", "Orientation");
        M(0, "ThumbnailImageLength", "ImageLength");
        M(0, "ThumbnailImageWidth", "ImageWidth");
        M(5, "ThumbnailOrientation", "Orientation");
        M(5, "ThumbnailImageLength", "ImageLength");
        M(5, "ThumbnailImageWidth", "ImageWidth");
        M(4, "Orientation", "ThumbnailOrientation");
        M(4, "ImageLength", "ThumbnailImageLength");
        M(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void e() {
        String strF = f("DateTimeOriginal");
        if (strF != null && f("DateTime") == null) {
            this.f7180f[0].put("DateTime", c.a(strF));
        }
        if (f("ImageWidth") == null) {
            this.f7180f[0].put("ImageWidth", c.b(0L, this.f7182h));
        }
        if (f("ImageLength") == null) {
            this.f7180f[0].put("ImageLength", c.b(0L, this.f7182h));
        }
        if (f("Orientation") == null) {
            this.f7180f[0].put("Orientation", c.b(0L, this.f7182h));
        }
        if (f("LightSource") == null) {
            this.f7180f[1].put("LightSource", c.b(0L, this.f7182h));
        }
    }

    private c h(String str) {
        c cVar;
        c cVar2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f7169v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && s(this.f7178d) == 2 && (cVar2 = this.f7194t) != null) {
            return cVar2;
        }
        for (int i10 = 0; i10 < f7157j0.length; i10++) {
            c cVar3 = (c) this.f7180f[i10].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f7194t) == null) {
            return null;
        }
        return cVar;
    }

    private void i(f fVar, int i10) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i11;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                S0.b.a.a(mediaMetadataRetriever, new C0260a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f7180f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f7182h));
                }
                if (strExtractMetadata2 != null) {
                    this.f7180f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata2), this.f7182h));
                }
                if (strExtractMetadata3 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata3);
                    if (i12 == 90) {
                        i11 = 6;
                    } else if (i12 != 180) {
                        i11 = i12 != 270 ? 1 : 8;
                    } else {
                        i11 = 3;
                    }
                    this.f7180f[0].put("Orientation", c.f(i11, this.f7182h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i13 = Integer.parseInt(strExtractMetadata4);
                    int i14 = Integer.parseInt(strExtractMetadata5);
                    if (i14 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.z(i13);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i15 = i13 + 6;
                    int i16 = i14 - 6;
                    if (!Arrays.equals(bArr, f7164q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i16];
                    fVar.readFully(bArr2);
                    this.f7190p = i15;
                    K(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i17 = Integer.parseInt(strExtractMetadata8);
                    int i18 = Integer.parseInt(strExtractMetadata9);
                    long j9 = i17;
                    fVar.z(j9);
                    byte[] bArr3 = new byte[i18];
                    fVar.readFully(bArr3);
                    this.f7194t = new c(1, i18, j9, bArr3);
                    this.f7195u = true;
                }
                if (f7169v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e10) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e10);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[LOOP:0: B:10:0x0037->B:55:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ad. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void j(S0.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.a.j(S0.a$b, int, int):void");
    }

    private int k(BufferedInputStream bufferedInputStream) throws Throwable {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (x(bArr)) {
            return 4;
        }
        if (A(bArr)) {
            return 9;
        }
        int iW = w(bArr);
        if (iW != 0) {
            return iW;
        }
        if (y(bArr)) {
            return 7;
        }
        if (B(bArr)) {
            return 10;
        }
        if (z(bArr)) {
            return 13;
        }
        return F(bArr) ? 14 : 0;
    }

    private void l(f fVar) throws Throwable {
        int i10;
        int i11;
        o(fVar);
        c cVar = (c) this.f7180f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f7207d);
            fVar2.j(this.f7182h);
            byte[] bArr = f7129H;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.z(0L);
            byte[] bArr3 = f7130I;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.z(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.z(12L);
            }
            L(fVar2, 6);
            c cVar2 = (c) this.f7180f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f7180f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f7180f[5].put("JPEGInterchangeFormat", cVar2);
                this.f7180f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f7180f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f7182h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarF = c.f(i14, this.f7182h);
                c cVarF2 = c.f(i15, this.f7182h);
                this.f7180f[0].put("ImageWidth", cVarF);
                this.f7180f[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void m(b bVar) throws Throwable {
        if (f7169v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.j(ByteOrder.BIG_ENDIAN);
        int iB = bVar.b();
        bVar.u(f7131J.length);
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            if (z9 && z10) {
                break;
            }
            try {
                int i10 = bVar.readInt();
                int i11 = bVar.readInt();
                int iB2 = bVar.b() + i10 + 4;
                if (bVar.b() - iB == 16 && i11 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i11 == 1229278788) {
                    break;
                }
                if (i11 == 1700284774 && !z9) {
                    this.f7190p = bVar.b() - iB;
                    byte[] bArr = new byte[i10];
                    bVar.readFully(bArr);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    R(crc32, i11);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i12) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                    }
                    K(bArr, 0);
                    T();
                    O(new b(bArr));
                    z9 = true;
                } else if (i11 == 1767135348 && !z10) {
                    byte[] bArr2 = f7132K;
                    if (i10 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int iB3 = bVar.b() - iB;
                            int i13 = i10 - length;
                            byte[] bArr4 = new byte[i13];
                            bVar.readFully(bArr4);
                            this.f7194t = new c(1, i13, iB3, bArr4);
                            z10 = true;
                        }
                    }
                }
                bVar.u(iB2 - bVar.b());
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt PNG file.", e10);
            }
        }
        this.f7195u = z10;
    }

    private void n(b bVar) throws Throwable {
        boolean z9 = f7169v;
        if (z9) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.u(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.u(i10 - bVar.b());
        bVar.readFully(bArr4);
        j(new b(bArr4), i10, 5);
        bVar.u(i12 - bVar.b());
        bVar.j(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f7152e0.f7208a) {
                short s9 = bVar.readShort();
                short s10 = bVar.readShort();
                c cVarF = c.f(s9, this.f7182h);
                c cVarF2 = c.f(s10, this.f7182h);
                this.f7180f[0].put("ImageLength", cVarF);
                this.f7180f[0].put("ImageWidth", cVarF2);
                if (f7169v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s9) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.u(unsignedShort2);
        }
    }

    private void o(f fVar) throws Throwable {
        c cVar;
        H(fVar);
        L(fVar, 0);
        S(fVar, 0);
        S(fVar, 5);
        S(fVar, 4);
        T();
        if (this.f7178d != 8 || (cVar = (c) this.f7180f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f7207d);
        fVar2.j(this.f7182h);
        fVar2.u(6);
        L(fVar2, 9);
        c cVar2 = (c) this.f7180f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f7180f[1].put("ColorSpace", cVar2);
        }
    }

    private void p(f fVar) throws Throwable {
        if (f7169v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        o(fVar);
        c cVar = (c) this.f7180f[0].get("JpgFromRaw");
        if (cVar != null) {
            j(new b(cVar.f7207d), (int) cVar.f7206c, 5);
        }
        c cVar2 = (c) this.f7180f[0].get("ISO");
        c cVar3 = (c) this.f7180f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f7180f[1].put("PhotographicSensitivity", cVar2);
    }

    private boolean q(f fVar) throws IOException {
        byte[] bArr = f7164q0;
        byte[] bArr2 = new byte[bArr.length];
        fVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrF = fVar.f();
        this.f7190p = bArr.length;
        K(bArrF, 0);
        return true;
    }

    private void r(b bVar) throws Throwable {
        if (f7169v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.j(ByteOrder.LITTLE_ENDIAN);
        bVar.u(f7133L.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f7134M;
        bVar.u(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f7135N, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i11];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f7164q0;
                    if (S0.b.c(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i11);
                    }
                    this.f7190p = i12;
                    K(bArrCopyOfRange, 0);
                    O(new b(bArrCopyOfRange));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.u(i11);
            } catch (EOFException e10) {
                throw new IOException("Encountered corrupt WebP file.", e10);
            }
        }
    }

    private static int s(int i10) {
        if (i10 != 4) {
            return (i10 == 9 || i10 == 15 || i10 == 12 || i10 == 13) ? 2 : 1;
        }
        return 3;
    }

    private void t(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f7182h);
        int i11 = cVar2.i(this.f7182h);
        if (this.f7178d == 7) {
            i10 += this.f7191q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f7183i = true;
            if (this.f7175a == null && this.f7177c == null && this.f7176b == null) {
                byte[] bArr = new byte[i11];
                bVar.u(i10);
                bVar.readFully(bArr);
                this.f7188n = bArr;
            }
            this.f7186l = i10;
            this.f7187m = i11;
        }
        if (f7169v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    private void u(b bVar, HashMap map) throws IOException {
        int i10;
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrB = S0.b.b(cVar.k(this.f7182h));
        long[] jArrB2 = S0.b.b(cVar2.k(this.f7182h));
        if (jArrB == null || jArrB.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrB2 == null || jArrB2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrB.length != jArrB2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j9 = 0;
        for (long j10 : jArrB2) {
            j9 += j10;
        }
        int i11 = (int) j9;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f7185k = true;
        this.f7184j = true;
        this.f7183i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrB.length) {
            int i16 = (int) jArrB[i13];
            int i17 = (int) jArrB2[i13];
            if (i13 < jArrB.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrB[i10 + 1]) {
                    this.f7185k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.u(i18);
                int i19 = i14 + i18;
                byte[] bArr2 = new byte[i17];
                try {
                    bVar.readFully(bArr2);
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    i12 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f7188n = bArr;
        if (this.f7185k) {
            this.f7186l = (int) jArrB[0];
            this.f7187m = i11;
        }
    }

    private void v(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f7177c = null;
        this.f7175a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (C(fileInputStream2.getFD())) {
                    this.f7176b = fileInputStream2.getFD();
                } else {
                    this.f7176b = null;
                }
                G(fileInputStream2);
                S0.b.a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                S0.b.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private int w(byte[] bArr) throws Throwable {
        long j9;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, f7124C)) {
                        bVar2.close();
                        return 0;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j9 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return 0;
                        }
                    } else {
                        j9 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j10 = length - j9;
                    if (j10 < 8) {
                        bVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z9 = false;
                    boolean z10 = false;
                    boolean z11 = false;
                    for (long j11 = 0; j11 < j10 / 4; j11++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j11 != 1) {
                                if (Arrays.equals(bArr3, f7125D)) {
                                    z9 = true;
                                } else if (Arrays.equals(bArr3, f7126E)) {
                                    z10 = true;
                                } else if (Arrays.equals(bArr3, f7127F) || Arrays.equals(bArr3, f7128G)) {
                                    z11 = true;
                                }
                                if (!z9) {
                                    continue;
                                } else {
                                    if (z10) {
                                        bVar2.close();
                                        return 12;
                                    }
                                    if (z11) {
                                        bVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return 0;
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f7169v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean x(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f7123B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean y(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderJ = J(bVar2);
                this.f7182h = byteOrderJ;
                bVar2.j(byteOrderJ);
                short s9 = bVar2.readShort();
                boolean z9 = s9 == 20306 || s9 == 21330;
                bVar2.close();
                return z9;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean z(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f7131J;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public String f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarH = h(str);
        if (cVarH == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!f7161n0.contains(str)) {
                return cVarH.j(this.f7182h);
            }
            try {
                return Double.toString(cVarH.h(this.f7182h));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i10 = cVarH.f7204a;
        if (i10 != 5 && i10 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarH.f7204a);
            return null;
        }
        e[] eVarArr = (e[]) cVarH.k(this.f7182h);
        if (eVarArr == null || eVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
            return null;
        }
        e eVar = eVarArr[0];
        Integer numValueOf = Integer.valueOf((int) (eVar.f7212a / eVar.f7213b));
        e eVar2 = eVarArr[1];
        Integer numValueOf2 = Integer.valueOf((int) (eVar2.f7212a / eVar2.f7213b));
        e eVar3 = eVarArr[2];
        return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f7212a / eVar3.f7213b)));
    }

    public int g(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarH = h(str);
        if (cVarH != null) {
            try {
                return cVarH.i(this.f7182h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        protected final DataInputStream f7199q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        protected int f7200r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ByteOrder f7201s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private byte[] f7202t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f7203u;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f7203u = bArr.length;
        }

        public int a() {
            return this.f7203u;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f7199q.available();
        }

        public int b() {
            return this.f7200r;
        }

        public byte[] f() throws IOException {
            byte[] bArrCopyOf = new byte[Optimizer.OPTIMIZATION_GROUPING];
            int i10 = 0;
            while (true) {
                if (i10 == bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                }
                int i11 = this.f7199q.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
                if (i11 == -1) {
                    return Arrays.copyOf(bArrCopyOf, i10);
                }
                i10 += i11;
                this.f7200r += i11;
            }
        }

        public long g() {
            return ((long) readInt()) & 4294967295L;
        }

        public void j(ByteOrder byteOrder) {
            this.f7201s = byteOrder;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f7200r++;
            return this.f7199q.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f7200r++;
            return this.f7199q.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f7200r++;
            int i10 = this.f7199q.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f7200r += 2;
            return this.f7199q.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f7200r += i11;
            this.f7199q.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f7200r += 4;
            int i10 = this.f7199q.read();
            int i11 = this.f7199q.read();
            int i12 = this.f7199q.read();
            int i13 = this.f7199q.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7201s;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f7201s);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f7200r += 8;
            int i10 = this.f7199q.read();
            int i11 = this.f7199q.read();
            int i12 = this.f7199q.read();
            int i13 = this.f7199q.read();
            int i14 = this.f7199q.read();
            int i15 = this.f7199q.read();
            int i16 = this.f7199q.read();
            int i17 = this.f7199q.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7201s;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f7201s);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i10;
            this.f7200r += 2;
            int i11 = this.f7199q.read();
            int i12 = this.f7199q.read();
            if ((i11 | i12) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7201s;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                i10 = (i12 << 8) + i11;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f7201s);
                }
                i10 = (i11 << 8) + i12;
            }
            return (short) i10;
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f7200r += 2;
            return this.f7199q.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f7200r++;
            return this.f7199q.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f7200r += 2;
            int i10 = this.f7199q.read();
            int i11 = this.f7199q.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f7201s;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f7201s);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void u(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f7199q.skip(i12);
                if (iSkip <= 0) {
                    if (this.f7202t == null) {
                        this.f7202t = new byte[8192];
                    }
                    iSkip = this.f7199q.read(this.f7202t, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f7200r += i11;
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f7199q.read(bArr, i10, i11);
            this.f7200r += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f7200r += bArr.length;
            this.f7199q.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f7199q = dataInputStream;
            dataInputStream.mark(0);
            this.f7200r = 0;
            this.f7201s = byteOrder;
            this.f7203u = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f7199q.mark(SubsamplingScaleImageView.TILE_SIZE_AUTO);
        }

        public void z(long j9) throws IOException {
            int i10 = this.f7200r;
            if (i10 > j9) {
                this.f7200r = 0;
                this.f7199q.reset();
            } else {
                j9 -= (long) i10;
            }
            u((int) j9);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f7199q.mark(SubsamplingScaleImageView.TILE_SIZE_AUTO);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7211d;

        d(String str, int i10, int i11) {
            this.f7209b = str;
            this.f7208a = i10;
            this.f7210c = i11;
            this.f7211d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f7210c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f7211d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f7209b = str;
            this.f7208a = i10;
            this.f7210c = i11;
            this.f7211d = i12;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    public a(InputStream inputStream, int i10) {
        d[][] dVarArr = f7157j0;
        this.f7180f = new HashMap[dVarArr.length];
        this.f7181g = new HashSet(dVarArr.length);
        this.f7182h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f7175a = null;
            boolean z9 = i10 == 1;
            this.f7179e = z9;
            if (z9) {
                this.f7177c = null;
                this.f7176b = null;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f7177c = (AssetManager.AssetInputStream) inputStream;
                this.f7176b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (C(fileInputStream.getFD())) {
                    this.f7177c = null;
                    this.f7176b = fileInputStream.getFD();
                } else {
                    this.f7177c = null;
                    this.f7176b = null;
                }
            } else {
                this.f7177c = null;
                this.f7176b = null;
            }
            G(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
