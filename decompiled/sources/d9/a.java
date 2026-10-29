package d9;

import E8.i;
import P8.B;
import P8.C;
import P8.D;
import P8.E;
import P8.j;
import P8.u;
import P8.w;
import P8.x;
import V8.e;
import e9.C1350e;
import e9.g;
import e9.l;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import p089i8.U;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f19747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f19748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile EnumC0527a f19749c;

    /* JADX INFO: renamed from: d9.a$a, reason: collision with other inner class name */
    public enum EnumC0527a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface b {
        void a(String str);
    }

    public a(b logger) {
        n.h(logger, "logger");
        this.f19747a = logger;
        this.f19748b = U.d();
        this.f19749c = EnumC0527a.NONE;
    }

    private final boolean b(u uVar) {
        String strA = uVar.a("Content-Encoding");
        return (strA == null || i.B(strA, "identity", true) || i.B(strA, "gzip", true)) ? false : true;
    }

    private final void c(u uVar, int i10) {
        String strM = this.f19748b.contains(uVar.b(i10)) ? "██" : uVar.m(i10);
        this.f19747a.a(uVar.b(i10) + ": " + strM);
    }

    @Override // P8.w
    public D a(w.a chain) throws Exception {
        String string;
        long j9;
        char c10;
        String string2;
        Charset UTF_8;
        Charset UTF_9;
        n.h(chain, "chain");
        EnumC0527a enumC0527a = this.f19749c;
        B b10 = chain.b();
        if (enumC0527a == EnumC0527a.NONE) {
            return chain.a(b10);
        }
        boolean z9 = enumC0527a == EnumC0527a.BODY;
        boolean z10 = z9 || enumC0527a == EnumC0527a.HEADERS;
        C cA = b10.a();
        j jVarC = chain.c();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(b10.g());
        sb.append(' ');
        sb.append(b10.j());
        if (jVarC != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(jVarC.a());
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        String string3 = sb.toString();
        if (!z10 && cA != null) {
            string3 = string3 + " (" + cA.a() + "-byte body)";
        }
        this.f19747a.a(string3);
        if (z10) {
            u uVarE = b10.e();
            j9 = -1;
            if (cA != null) {
                x xVarB = cA.b();
                if (xVarB != null && uVarE.a("Content-Type") == null) {
                    this.f19747a.a("Content-Type: " + xVarB);
                }
                if (cA.a() != -1 && uVarE.a("Content-Length") == null) {
                    this.f19747a.a("Content-Length: " + cA.a());
                }
            }
            int size = uVarE.size();
            for (int i10 = 0; i10 < size; i10++) {
                c(uVarE, i10);
            }
            if (!z9 || cA == null) {
                this.f19747a.a("--> END " + b10.g());
            } else if (b(b10.e())) {
                this.f19747a.a("--> END " + b10.g() + " (encoded body omitted)");
            } else if (cA.e()) {
                this.f19747a.a("--> END " + b10.g() + " (duplex request body omitted)");
            } else if (cA.f()) {
                this.f19747a.a("--> END " + b10.g() + " (one-shot body omitted)");
            } else {
                C1350e c1350e = new C1350e();
                cA.g(c1350e);
                x xVarB2 = cA.b();
                if (xVarB2 == null || (UTF_9 = xVarB2.c(StandardCharsets.UTF_8)) == null) {
                    UTF_9 = StandardCharsets.UTF_8;
                    n.g(UTF_9, "UTF_8");
                }
                this.f19747a.a("");
                if (d9.b.a(c1350e)) {
                    this.f19747a.a(c1350e.h0(UTF_9));
                    this.f19747a.a("--> END " + b10.g() + " (" + cA.a() + "-byte body)");
                } else {
                    this.f19747a.a("--> END " + b10.g() + " (binary " + cA.a() + "-byte body omitted)");
                }
            }
        } else {
            j9 = -1;
        }
        long jNanoTime = System.nanoTime();
        try {
            D dA = chain.a(b10);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            E eA = dA.a();
            n.e(eA);
            long jF = eA.f();
            String str = jF != j9 ? jF + "-byte" : "unknown-length";
            b bVar = this.f19747a;
            StringBuilder sb3 = new StringBuilder();
            boolean z11 = z10;
            sb3.append("<-- ");
            sb3.append(dA.j());
            if (dA.K().length() == 0) {
                string2 = "";
                c10 = ' ';
            } else {
                String strK = dA.K();
                StringBuilder sb4 = new StringBuilder();
                c10 = ' ';
                sb4.append(' ');
                sb4.append(strK);
                string2 = sb4.toString();
            }
            sb3.append(string2);
            sb3.append(c10);
            sb3.append(dA.t0().j());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(z11 ? "" : ", " + str + " body");
            sb3.append(')');
            bVar.a(sb3.toString());
            if (z11) {
                u uVarI = dA.I();
                int size2 = uVarI.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c(uVarI, i11);
                }
                if (z9 && e.b(dA)) {
                    if (b(dA.I())) {
                        this.f19747a.a("<-- END HTTP (encoded body omitted)");
                        return dA;
                    }
                    g gVarU = eA.u();
                    gVarU.u0(Long.MAX_VALUE);
                    C1350e c1350eD = gVarU.d();
                    Long l9 = null;
                    if (i.B("gzip", uVarI.a("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(c1350eD.X0());
                        l lVar = new l(c1350eD.clone());
                        try {
                            c1350eD = new C1350e();
                            c1350eD.l1(lVar);
                            p189s8.b.a(lVar, null);
                            l9 = lValueOf;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                p189s8.b.a(lVar, th);
                                throw th2;
                            }
                        }
                    }
                    x xVarG = eA.g();
                    if (xVarG == null || (UTF_8 = xVarG.c(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        n.g(UTF_8, "UTF_8");
                    }
                    if (!d9.b.a(c1350eD)) {
                        this.f19747a.a("");
                        this.f19747a.a("<-- END HTTP (binary " + c1350eD.X0() + "-byte body omitted)");
                        return dA;
                    }
                    if (jF != 0) {
                        this.f19747a.a("");
                        this.f19747a.a(c1350eD.clone().h0(UTF_8));
                    }
                    if (l9 == null) {
                        this.f19747a.a("<-- END HTTP (" + c1350eD.X0() + "-byte body)");
                        return dA;
                    }
                    this.f19747a.a("<-- END HTTP (" + c1350eD.X0() + "-byte, " + l9 + "-gzipped-byte body)");
                    return dA;
                }
                this.f19747a.a("<-- END HTTP");
            }
            return dA;
        } catch (Exception e10) {
            this.f19747a.a("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }

    public final a d(EnumC0527a level) {
        n.h(level, "level");
        this.f19749c = level;
        return this;
    }
}
