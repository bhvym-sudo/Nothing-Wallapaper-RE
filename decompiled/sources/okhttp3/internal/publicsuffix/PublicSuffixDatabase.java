package okhttp3.internal.publicsuffix;

import D8.k;
import E8.i;
import Q8.d;
import Z8.h;
import e9.g;
import e9.l;
import e9.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.n;
import p079h8.A;
import p089i8.AbstractC1444s;
import p189s8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23555e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f23556f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f23557g = AbstractC1444s.e("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f23558h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f23559a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f23560b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f23561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f23562d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iD;
            boolean z9;
            int iD2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z10 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z10) {
                        iD = 46;
                        z9 = false;
                    } else {
                        boolean z11 = z10;
                        iD = d.d(bArr2[i17][i18], 255);
                        z9 = z11;
                    }
                    iD2 = iD - d.d(bArr[i14 + i19], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z10 = z9;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z10 = true;
                        i18 = -1;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                n.g(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f23558h;
        }

        private a() {
        }
    }

    private final List b(List list) {
        String str;
        String strB;
        String str2;
        List listL;
        List listL2;
        if (this.f23559a.get() || !this.f23559a.compareAndSet(false, true)) {
            try {
                this.f23560b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f23561c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = (String) list.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            n.g(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            n.g(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            a aVar = f23555e;
            byte[] bArr2 = this.f23561c;
            if (bArr2 == null) {
                n.r("publicSuffixListBytes");
                bArr2 = null;
            }
            strB = aVar.b(bArr2, bArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            bArr3[i12] = f23556f;
            a aVar2 = f23555e;
            byte[] bArr4 = this.f23561c;
            if (bArr4 == null) {
                n.r("publicSuffixListBytes");
                bArr4 = null;
            }
            String strB2 = aVar2.b(bArr4, bArr3, i12);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i12++;
        }
        if (str2 != null) {
            int i13 = size - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                a aVar3 = f23555e;
                byte[] bArr5 = this.f23562d;
                if (bArr5 == null) {
                    n.r("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String strB3 = aVar3.b(bArr5, bArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return i.C0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f23557g;
        }
        if (strB == null || (listL = i.C0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listL = AbstractC1444s.l();
        }
        if (str2 == null || (listL2 = i.C0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listL2 = AbstractC1444s.l();
        }
        return listL.size() > listL2.size() ? listL : listL2;
    }

    private final void d() {
        try {
            E e10 = new E();
            E e11 = new E();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                g gVarD = o.d(new l(o.k(resourceAsStream)));
                try {
                    e10.f22779q = gVarD.C0(gVarD.readInt());
                    e11.f22779q = gVarD.C0(gVarD.readInt());
                    A a10 = A.f21846a;
                    b.a(gVarD, null);
                    synchronized (this) {
                        Object obj = e10.f22779q;
                        n.e(obj);
                        this.f23561c = (byte[]) obj;
                        Object obj2 = e11.f22779q;
                        n.e(obj2);
                        this.f23562d = (byte[]) obj2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.a(gVarD, th);
                        throw th2;
                    }
                }
            }
            this.f23560b.countDown();
        } catch (Throwable th3) {
            this.f23560b.countDown();
            throw th3;
        }
    }

    private final void e() {
        boolean z9 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z9 = true;
                } catch (IOException e10) {
                    h.f9546a.g().j("Failed to read public suffix list", 5, e10);
                    if (!z9) {
                        return;
                    }
                }
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z9) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    private final List f(String str) {
        List listC0 = i.C0(str, new char[]{'.'}, false, 0, 6, null);
        return n.d(AbstractC1444s.c0(listC0), "") ? AbstractC1444s.O(listC0, 1) : listC0;
    }

    public final String c(String domain) {
        int size;
        int size2;
        n.h(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        n.g(unicodeDomain, "unicodeDomain");
        List listF = f(unicodeDomain);
        List listB = b(listF);
        if (listF.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return k.w(k.n(AbstractC1444s.K(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
