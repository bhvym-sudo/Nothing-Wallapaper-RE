package V8;

import P8.B;
import P8.C;
import P8.D;
import P8.E;
import P8.w;
import e9.o;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.n;
import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8231a;

    public b(boolean z9) {
        this.f8231a = z9;
    }

    private final boolean b(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[Catch: IOException -> 0x006a, TRY_LEAVE, TryCatch #0 {IOException -> 0x006a, blocks: (B:17:0x0055, B:19:0x005b, B:30:0x0093, B:32:0x0099, B:22:0x006c, B:23:0x007b, B:25:0x0088), top: B:83:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [P8.D$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [P8.D$a] */
    @Override // P8.w
    public D a(w.a chain) throws IOException {
        boolean z9;
        ?? r9;
        ?? Q9;
        D.a aVar;
        n.h(chain, "chain");
        g gVar = (g) chain;
        U8.c cVarH = gVar.h();
        n.e(cVarH);
        B bJ = gVar.j();
        C cA = bJ.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            cVarH.u(bJ);
            ?? A9 = f.a(bJ.g());
            try {
                if (A9 == 0 || cA == null) {
                    cVarH.o();
                    z9 = true;
                    A9 = 0;
                } else {
                    if (E8.i.B("100-continue", bJ.d("Expect"), true)) {
                        cVarH.f();
                        D.a aVarQ = cVarH.q(true);
                        try {
                            cVarH.s();
                            z9 = false;
                            aVar = aVarQ;
                        } catch (IOException e10) {
                            e = e10;
                            z9 = true;
                            r9 = aVarQ;
                            if (e instanceof X8.a) {
                                throw e;
                            }
                            if (!cVarH.k()) {
                                Q9 = r9;
                                throw e;
                            }
                        }
                    } else {
                        z9 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        cVarH.o();
                        if (!cVarH.h().w()) {
                            A9 = aVar;
                            cVarH.n();
                            A9 = aVar;
                        }
                    } else if (cA.e()) {
                        cVarH.f();
                        cA.g(o.c(cVarH.c(bJ, true)));
                    } else {
                        e9.f fVarC = o.c(cVarH.c(bJ, false));
                        cA.g(fVarC);
                        fVarC.close();
                    }
                }
                if (cA != null) {
                    A9 = aVar;
                    if (!cA.e()) {
                        A9 = aVar;
                        A9 = aVar;
                        A9 = aVar;
                        cVarH.e();
                    }
                } else {
                    A9 = aVar;
                    A9 = aVar;
                    A9 = aVar;
                    cVarH.e();
                }
                A9 = aVar;
                e = null;
                Q9 = A9;
            } catch (IOException e11) {
                e = e11;
                r9 = A9;
            }
        } catch (IOException e12) {
            e = e12;
            z9 = true;
            r9 = 0;
        }
        if (Q9 == 0) {
            try {
                Q9 = cVarH.q(false);
                n.e(Q9);
                if (z9) {
                    cVarH.s();
                    z9 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                AbstractC1388c.a(e, e13);
                throw e;
            }
        }
        D dC = Q9.r(bJ).i(cVarH.h().s()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
        int iJ = dC.j();
        if (b(iJ)) {
            D.a aVarQ2 = cVarH.q(false);
            n.e(aVarQ2);
            if (z9) {
                cVarH.s();
            }
            dC = aVarQ2.r(bJ).i(cVarH.h().s()).s(jCurrentTimeMillis).q(System.currentTimeMillis()).c();
            iJ = dC.j();
        }
        cVarH.r(dC);
        D dC2 = (this.f8231a && iJ == 101) ? dC.U().b(Q8.d.f6927c).c() : dC.U().b(cVarH.p(dC)).c();
        if (E8.i.B("close", dC2.t0().d("Connection"), true) || E8.i.B("close", D.G(dC2, "Connection", null, 2, null), true)) {
            cVarH.n();
        }
        if (iJ == 204 || iJ == 205) {
            E eA = dC2.a();
            if ((eA != null ? eA.f() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iJ);
                sb.append(" had non-zero Content-Length: ");
                E eA2 = dC2.a();
                sb.append(eA2 != null ? Long.valueOf(eA2.f()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return dC2;
    }
}
