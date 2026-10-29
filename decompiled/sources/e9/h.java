package e9;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes2.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f20267t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f20268u = new h(new byte[0]);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final byte[] f20269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient int f20270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private transient String f20271s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ h e(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC1347b.c();
            }
            return aVar.d(bArr, i10, i11);
        }

        public final h a(String str) {
            kotlin.jvm.internal.n.h(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((f9.b.e(str.charAt(i11)) << 4) + f9.b.e(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h b(String str, Charset charset) {
            kotlin.jvm.internal.n.h(str, "<this>");
            kotlin.jvm.internal.n.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.n.g(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h c(String str) {
            kotlin.jvm.internal.n.h(str, "<this>");
            h hVar = new h(E.a(str));
            hVar.t(str);
            return hVar;
        }

        public final h d(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.n.h(bArr, "<this>");
            int iE = AbstractC1347b.e(bArr, i11);
            AbstractC1347b.b(bArr.length, i10, iE);
            return new h(AbstractC1439m.m(bArr, i10, iE + i10));
        }

        private a() {
        }
    }

    public h(byte[] data) {
        kotlin.jvm.internal.n.h(data, "data");
        this.f20269q = data;
    }

    public static final h g(String str) {
        return f20267t.c(str);
    }

    public String d() {
        return AbstractC1346a.b(i(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        kotlin.jvm.internal.n.h(other, "other");
        int iV = v();
        int iV2 = other.v();
        int iMin = Math.min(iV, iV2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iH = h(i10) & 255;
            int iH2 = other.h(i10) & 255;
            if (iH != iH2) {
                return iH < iH2 ? -1 : 1;
            }
        }
        if (iV == iV2) {
            return 0;
        }
        return iV < iV2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.v() == i().length && hVar.r(0, i(), 0, i().length)) {
                return true;
            }
        }
        return false;
    }

    public h f(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.n.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f20269q, 0, v());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.n.e(bArrDigest);
        return new h(bArrDigest);
    }

    public final byte h(int i10) {
        return p(i10);
    }

    public int hashCode() {
        int iK = k();
        if (iK != 0) {
            return iK;
        }
        int iHashCode = Arrays.hashCode(i());
        s(iHashCode);
        return iHashCode;
    }

    public final byte[] i() {
        return this.f20269q;
    }

    public final int k() {
        return this.f20270r;
    }

    public int l() {
        return i().length;
    }

    public final String m() {
        return this.f20271s;
    }

    public String n() {
        char[] cArr = new char[i().length * 2];
        int i10 = 0;
        for (byte b10 : i()) {
            int i11 = i10 + 1;
            cArr[i10] = f9.b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = f9.b.f()[b10 & 15];
        }
        return E8.i.x(cArr);
    }

    public byte[] o() {
        return i();
    }

    public byte p(int i10) {
        return i()[i10];
    }

    public boolean q(int i10, h other, int i11, int i12) {
        kotlin.jvm.internal.n.h(other, "other");
        return other.r(i11, i(), i10, i12);
    }

    public boolean r(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.n.h(other, "other");
        return i10 >= 0 && i10 <= i().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC1347b.a(i(), i10, other, i11, i12);
    }

    public final void s(int i10) {
        this.f20270r = i10;
    }

    public final void t(String str) {
        this.f20271s = str;
    }

    public String toString() {
        if (i().length == 0) {
            return "[size=0]";
        }
        int iC = f9.b.c(i(), 64);
        if (iC != -1) {
            String strY = y();
            String strSubstring = strY.substring(0, iC);
            kotlin.jvm.internal.n.g(strSubstring, "substring(...)");
            String strI = E8.i.I(E8.i.I(E8.i.I(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strY.length()) {
                return "[text=" + strI + ']';
            }
            return "[size=" + i().length + " text=" + strI + "…]";
        }
        if (i().length <= 64) {
            return "[hex=" + n() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(i().length);
        sb.append(" hex=");
        h hVar = this;
        int iD = AbstractC1347b.d(hVar, 64);
        if (iD > hVar.i().length) {
            throw new IllegalArgumentException(("endIndex > length(" + hVar.i().length + ')').toString());
        }
        if (iD < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (iD != hVar.i().length) {
            hVar = new h(AbstractC1439m.m(hVar.i(), 0, iD));
        }
        sb.append(hVar.n());
        sb.append("…]");
        return sb.toString();
    }

    public final h u() {
        return f("SHA-256");
    }

    public final int v() {
        return l();
    }

    public final boolean w(h prefix) {
        kotlin.jvm.internal.n.h(prefix, "prefix");
        return q(0, prefix, 0, prefix.v());
    }

    public h x() {
        for (int i10 = 0; i10 < i().length; i10++) {
            byte b10 = i()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrI = i();
                byte[] bArrCopyOf = Arrays.copyOf(bArrI, bArrI.length);
                kotlin.jvm.internal.n.g(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public String y() {
        String strM = m();
        if (strM != null) {
            return strM;
        }
        String strB = E.b(o());
        t(strB);
        return strB;
    }

    public void z(C1350e buffer, int i10, int i11) {
        kotlin.jvm.internal.n.h(buffer, "buffer");
        f9.b.d(this, buffer, i10, i11);
    }
}
