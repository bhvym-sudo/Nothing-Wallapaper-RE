package p001a0;

import T.a;
import U.i;
import W.U;
import androidx.appcompat.app.o;
import androidx.compose.ui.platform.j0;
import java.util.List;
import p011b0.f;
import p011b0.j;
import p011b0.m;
import p190t.b;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static final boolean a(j jVar) {
        c(jVar);
        o.a(p011b0.h.a(jVar.w(), m.f14629a.F()));
        return false;
    }

    private static final List b(j jVar) {
        return jVar.l(false, false, false);
    }

    public static final p c(j jVar) {
        return (p) p011b0.h.a(jVar.w(), f.f14572a.t());
    }

    private static final void d(j jVar, int i10, l lVar) {
        b bVar = new b(new j[16], 0);
        List listB = b(jVar);
        while (true) {
            bVar.f(bVar.p(), listB);
            while (bVar.s()) {
                j jVar2 = (j) bVar.w(bVar.p() - 1);
                if (j0.g(jVar2) && !jVar2.w().b(m.f14629a.f())) {
                    U uE = jVar2.e();
                    if (uE == null) {
                        a.c("Expected semantics node to have a coordinator.");
                        throw new p079h8.f();
                    }
                    i iVarM0 = uE.m0();
                    p111l0.o oVarA = p111l0.p.a(U.j.c(iVarM0));
                    if (oVarA.j()) {
                        continue;
                    } else if (a(jVar2)) {
                        int i11 = i10 + 1;
                        lVar.f(new g(jVar2, i11, oVarA, iVarM0));
                        d(jVar2, i11, lVar);
                    } else {
                        listB = b(jVar2);
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void e(j jVar, int i10, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(jVar, i10, lVar);
    }
}
