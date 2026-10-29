package F;

import U.i;
import U.j;
import W.AbstractC0967i;
import W.q0;
import W.r0;
import W.s0;
import p111l0.q;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(c cVar, long j9) {
        if (!cVar.z().Q()) {
            return false;
        }
        i iVarD = AbstractC0967i.h(cVar).d();
        if (!iVarD.t()) {
            return false;
        }
        long jV = iVarD.v();
        int iE = q.e(jV);
        int iD = q.d(jV);
        long jE = j.e(iVarD);
        float fK = H.g.k(jE);
        float fL = H.g.l(jE);
        float f10 = iE + fK;
        float f11 = iD + fL;
        float fK2 = H.g.k(j9);
        if (fK <= fK2 && fK2 <= f10) {
            float fL2 = H.g.l(j9);
            if (fL <= fL2 && fL2 <= f11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f fVar, a aVar) {
        fVar.x(aVar);
        fVar.t(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(r0 r0Var, l lVar) {
        if (lVar.f(r0Var) != q0.ContinueTraversal) {
            return;
        }
        s0.a(r0Var, lVar);
    }
}
