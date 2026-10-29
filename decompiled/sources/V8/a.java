package V8;

import P8.B;
import P8.C;
import P8.D;
import P8.E;
import P8.m;
import P8.n;
import P8.w;
import P8.x;
import e9.l;
import e9.o;
import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f8230a;

    public a(n cookieJar) {
        kotlin.jvm.internal.n.h(cookieJar, "cookieJar");
        this.f8230a = cookieJar;
    }

    private final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            m mVar = (m) obj;
            if (i10 > 0) {
                sb.append("; ");
            }
            sb.append(mVar.e());
            sb.append('=');
            sb.append(mVar.g());
            i10 = i11;
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // P8.w
    public D a(w.a chain) {
        E eA;
        kotlin.jvm.internal.n.h(chain, "chain");
        B b10 = chain.b();
        B.a aVarH = b10.h();
        C cA = b10.a();
        if (cA != null) {
            x xVarB = cA.b();
            if (xVarB != null) {
                aVarH.c("Content-Type", xVarB.toString());
            }
            long jA = cA.a();
            if (jA != -1) {
                aVarH.c("Content-Length", String.valueOf(jA));
                aVarH.f("Transfer-Encoding");
            } else {
                aVarH.c("Transfer-Encoding", "chunked");
                aVarH.f("Content-Length");
            }
        }
        boolean z9 = false;
        if (b10.d("Host") == null) {
            aVarH.c("Host", Q8.d.R(b10.j(), false, 1, null));
        }
        if (b10.d("Connection") == null) {
            aVarH.c("Connection", "Keep-Alive");
        }
        if (b10.d("Accept-Encoding") == null && b10.d("Range") == null) {
            aVarH.c("Accept-Encoding", "gzip");
            z9 = true;
        }
        List listB = this.f8230a.b(b10.j());
        if (!listB.isEmpty()) {
            aVarH.c("Cookie", b(listB));
        }
        if (b10.d("User-Agent") == null) {
            aVarH.c("User-Agent", "okhttp/4.12.0");
        }
        D dA = chain.a(aVarH.b());
        e.f(this.f8230a, b10.j(), dA.I());
        D.a aVarR = dA.U().r(b10);
        if (z9 && E8.i.B("gzip", D.G(dA, "Content-Encoding", null, 2, null), true) && e.b(dA) && (eA = dA.a()) != null) {
            l lVar = new l(eA.u());
            aVarR.k(dA.I().f().h("Content-Encoding").h("Content-Length").f());
            aVarR.b(new h(D.G(dA, "Content-Type", null, 2, null), -1L, o.d(lVar)));
        }
        return aVarR.c();
    }
}
