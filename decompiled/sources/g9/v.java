package g9;

import e9.C1350e;
import java.io.EOFException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f21489l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f21490m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P8.v f21492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private P8.v.a f21494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P8.B.a f21495e = new P8.B.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P8.u.a f21496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private P8.x f21497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private P8.y.a f21499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private P8.s.a f21500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private P8.C f21501k;

    private static class a extends P8.C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final P8.C f21502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final P8.x f21503c;

        a(P8.C c10, P8.x xVar) {
            this.f21502b = c10;
            this.f21503c = xVar;
        }

        @Override // P8.C
        public long a() {
            return this.f21502b.a();
        }

        @Override // P8.C
        public P8.x b() {
            return this.f21503c;
        }

        @Override // P8.C
        public void g(e9.f fVar) {
            this.f21502b.g(fVar);
        }
    }

    v(String str, P8.v vVar, String str2, P8.u uVar, P8.x xVar, boolean z9, boolean z10, boolean z11) {
        this.f21491a = str;
        this.f21492b = vVar;
        this.f21493c = str2;
        this.f21497g = xVar;
        this.f21498h = z9;
        if (uVar != null) {
            this.f21496f = uVar.f();
        } else {
            this.f21496f = new P8.u.a();
        }
        if (z10) {
            this.f21500j = new P8.s.a();
        } else if (z11) {
            P8.y.a aVar = new P8.y.a();
            this.f21499i = aVar;
            aVar.d(P8.y.f6412l);
        }
    }

    private static String i(String str, boolean z9) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z9 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C1350e c1350e = new C1350e();
                c1350e.o0(str, 0, iCharCount);
                j(c1350e, str, iCharCount, length, z9);
                return c1350e.P0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(C1350e c1350e, String str, int i10, int i11, boolean z9) throws EOFException {
        C1350e c1350e2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z9 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z9 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (c1350e2 == null) {
                        c1350e2 = new C1350e();
                    }
                    c1350e2.w1(iCodePointAt);
                    while (!c1350e2.D()) {
                        byte b10 = c1350e2.readByte();
                        c1350e.F(37);
                        char[] cArr = f21489l;
                        c1350e.F(cArr[((b10 & 255) >> 4) & 15]);
                        c1350e.F(cArr[b10 & 15]);
                    }
                } else {
                    c1350e.w1(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z9) {
        if (z9) {
            this.f21500j.b(str, str2);
        } else {
            this.f21500j.a(str, str2);
        }
    }

    void b(String str, String str2, boolean z9) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z9) {
                this.f21496f.e(str, str2);
                return;
            } else {
                this.f21496f.a(str, str2);
                return;
            }
        }
        try {
            this.f21497g = P8.x.d(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void c(P8.u uVar) {
        this.f21496f.b(uVar);
    }

    void d(P8.u uVar, P8.C c10) {
        this.f21499i.a(uVar, c10);
    }

    void e(P8.y.c cVar) {
        this.f21499i.b(cVar);
    }

    void f(String str, String str2, boolean z9) throws EOFException {
        if (this.f21493c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z9);
        String strReplace = this.f21493c.replace("{" + str + "}", strI);
        if (!f21490m.matcher(strReplace).matches()) {
            this.f21493c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z9) {
        String str3 = this.f21493c;
        if (str3 != null) {
            P8.v.a aVarL = this.f21492b.l(str3);
            this.f21494d = aVarL;
            if (aVarL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f21492b + ", Relative: " + this.f21493c);
            }
            this.f21493c = null;
        }
        if (z9) {
            this.f21494d.a(str, str2);
        } else {
            this.f21494d.b(str, str2);
        }
    }

    void h(Class cls, Object obj) {
        this.f21495e.g(cls, obj);
    }

    P8.B.a k() {
        P8.v vVarQ;
        P8.v.a aVar = this.f21494d;
        if (aVar != null) {
            vVarQ = aVar.c();
        } else {
            vVarQ = this.f21492b.q(this.f21493c);
            if (vVarQ == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f21492b + ", Relative: " + this.f21493c);
            }
        }
        P8.C aVar2 = this.f21501k;
        if (aVar2 == null) {
            P8.s.a aVar3 = this.f21500j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                P8.y.a aVar4 = this.f21499i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f21498h) {
                    aVar2 = P8.C.d(null, new byte[0]);
                }
            }
        }
        P8.x xVar = this.f21497g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f21496f.a("Content-Type", xVar.toString());
            }
        }
        return this.f21495e.h(vVarQ).d(this.f21496f.f()).e(this.f21491a, aVar2);
    }

    void l(P8.C c10) {
        this.f21501k = c10;
    }

    void m(Object obj) {
        this.f21493c = obj.toString();
    }
}
