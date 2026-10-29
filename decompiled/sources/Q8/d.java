package Q8;

import E8.g;
import E8.i;
import P8.C;
import P8.D;
import P8.E;
import P8.InterfaceC0939e;
import P8.u;
import P8.v;
import P8.z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import e9.B;
import e9.C1350e;
import e9.f;
import e9.h;
import e9.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1452c;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.n;
import p079h8.AbstractC1388c;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p089i8.L;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f6926b = u.f6376r.g(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E f6927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f6928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r f6929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f6930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g f6931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f6932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f6933i;

    static {
        byte[] bArr = new byte[0];
        f6925a = bArr;
        f6927c = E.b.d(E.f6124r, bArr, null, 1, null);
        f6928d = C.a.g(C.f6090a, bArr, null, 0, 0, 7, null);
        r.a aVar = r.f20287t;
        h.a aVar2 = h.f20267t;
        f6929e = aVar.d(aVar2.a("efbbbf"), aVar2.a("feff"), aVar2.a("fffe"), aVar2.a("0000ffff"), aVar2.a("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        n.e(timeZone);
        f6930f = timeZone;
        f6931g = new g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f6932h = false;
        String name = z.class.getName();
        n.g(name, "OkHttpClient::class.java.name");
        f6933i = i.x0(i.w0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        n.h(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        n.h(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        n.h(strArr, "<this>");
        n.h(other, "other");
        n.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean F(Socket socket, e9.g source) {
        n.h(socket, "<this>");
        n.h(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.D();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean G(String name) {
        n.h(name, "name");
        return i.B(name, "Authorization", true) || i.B(name, "Cookie", true) || i.B(name, "Proxy-Authorization", true) || i.B(name, "Set-Cookie", true);
    }

    public static final int H(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final Charset I(e9.g gVar, Charset charset) {
        n.h(gVar, "<this>");
        n.h(charset, "default");
        int iM0 = gVar.M0(f6929e);
        if (iM0 == -1) {
            return charset;
        }
        if (iM0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            n.g(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iM0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            n.g(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iM0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            n.g(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iM0 == 3) {
            return E8.d.f1444a.a();
        }
        if (iM0 == 4) {
            return E8.d.f1444a.b();
        }
        throw new AssertionError();
    }

    public static final int J(e9.g gVar) {
        n.h(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int K(C1350e c1350e, byte b10) throws EOFException {
        n.h(c1350e, "<this>");
        int i10 = 0;
        while (!c1350e.D() && c1350e.U(0L) == b10) {
            i10++;
            c1350e.readByte();
        }
        return i10;
    }

    public static final boolean L(B b10, int i10, TimeUnit timeUnit) {
        n.h(b10, "<this>");
        n.h(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = b10.e().e() ? b10.e().c() - jNanoTime : Long.MAX_VALUE;
        b10.e().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            C1350e c1350e = new C1350e();
            while (b10.e1(c1350e, 8192L) != -1) {
                c1350e.j();
            }
            if (jC == Long.MAX_VALUE) {
                b10.e().a();
                return true;
            }
            b10.e().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                b10.e().a();
                return false;
            }
            b10.e().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                b10.e().a();
            } else {
                b10.e().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory M(final String name, final boolean z9) {
        n.h(name, "name");
        return new ThreadFactory() { // from class: Q8.c
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.N(name, z9, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread N(String name, boolean z9, Runnable runnable) {
        n.h(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z9);
        return thread;
    }

    public static final List O(u uVar) {
        n.h(uVar, "<this>");
        B8.g gVarQ = B8.h.q(0, uVar.size());
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(gVarQ, 10));
        Iterator it = gVarQ.iterator();
        while (it.hasNext()) {
            int iA = ((L) it).a();
            arrayList.add(new X8.c(uVar.b(iA), uVar.m(iA)));
        }
        return arrayList;
    }

    public static final u P(List list) {
        n.h(list, "<this>");
        u.a aVar = new u.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X8.c cVar = (X8.c) it.next();
            aVar.d(cVar.a().y(), cVar.b().y());
        }
        return aVar.f();
    }

    public static final String Q(v vVar, boolean z9) {
        String strI;
        n.h(vVar, "<this>");
        if (i.S(vVar.i(), ":", false, 2, null)) {
            strI = '[' + vVar.i() + ']';
        } else {
            strI = vVar.i();
        }
        if (!z9 && vVar.n() == v.f6379k.c(vVar.r())) {
            return strI;
        }
        return strI + ':' + vVar.n();
    }

    public static /* synthetic */ String R(v vVar, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return Q(vVar, z9);
    }

    public static final List S(List list) {
        n.h(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC1444s.u0(list));
        n.g(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final Map T(Map map) {
        n.h(map, "<this>");
        if (map.isEmpty()) {
            return N.g();
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        n.g(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long U(String str, long j9) {
        n.h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j9;
        }
    }

    public static final int V(String str, int i10) {
        if (str != null) {
            try {
                long j9 = Long.parseLong(str);
                if (j9 > 2147483647L) {
                    return SubsamplingScaleImageView.TILE_SIZE_AUTO;
                }
                if (j9 < 0) {
                    return 0;
                }
                return (int) j9;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String W(String str, int i10, int i11) {
        n.h(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        n.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String X(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return W(str, i10, i11);
    }

    public static final Throwable Y(Exception exc, List suppressed) {
        n.h(exc, "<this>");
        n.h(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            AbstractC1388c.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void Z(f fVar, int i10) {
        n.h(fVar, "<this>");
        fVar.F((i10 >>> 16) & 255);
        fVar.F((i10 >>> 8) & 255);
        fVar.F(i10 & 255);
    }

    public static final void c(List list, Object obj) {
        n.h(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s9, int i10) {
        return s9 & i10;
    }

    public static final long f(int i10, long j9) {
        return ((long) i10) & j9;
    }

    public static final P8.r.c g(final P8.r rVar) {
        n.h(rVar, "<this>");
        return new P8.r.c() { // from class: Q8.b
            @Override // P8.r.c
            public final P8.r a(InterfaceC0939e interfaceC0939e) {
                return d.h(rVar, interfaceC0939e);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P8.r h(P8.r this_asFactory, InterfaceC0939e it) {
        n.h(this_asFactory, "$this_asFactory");
        n.h(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        n.h(str, "<this>");
        return f6931g.a(str);
    }

    public static final boolean j(v vVar, v other) {
        n.h(vVar, "<this>");
        n.h(other, "other");
        return n.d(vVar.i(), other.i()) && vVar.n() == other.n() && n.d(vVar.r(), other.r());
    }

    public static final int k(String name, long j9, TimeUnit timeUnit) {
        n.h(name, "name");
        if (j9 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j9);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j9 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final void l(long j9, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j9 || j9 - j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        n.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        n.h(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!n.d(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        n.h(strArr, "<this>");
        n.h(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        n.g(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[AbstractC1439m.H(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        n.h(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        n.h(str, "<this>");
        n.h(delimiters, "delimiters");
        while (i10 < i11) {
            if (i.R(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(B b10, int i10, TimeUnit timeUnit) {
        n.h(b10, "<this>");
        n.h(timeUnit, "timeUnit");
        try {
            return L(b10, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        n.h(format, "format");
        n.h(args, "args");
        H h10 = H.f22782a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        n.g(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        n.h(strArr, "<this>");
        n.h(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = AbstractC1452c.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(D d10) {
        n.h(d10, "<this>");
        String strA = d10.I().a("Content-Length");
        if (strA != null) {
            return U(strA, -1L);
        }
        return -1L;
    }

    public static final List w(Object... elements) {
        n.h(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC1444s.n(Arrays.copyOf(objArr, objArr.length)));
        n.g(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        n.h(strArr, "<this>");
        n.h(value, "value");
        n.h(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        n.h(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (n.i(cCharAt, 31) <= 0 || n.i(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int z(String str, int i10, int i11) {
        n.h(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
