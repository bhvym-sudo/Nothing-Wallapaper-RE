package L;

import H.n;
import I.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(K.f fVar, c cVar) {
        cVar.h(fVar.E().i(), fVar.E().f());
    }

    public static final void b(c cVar, E e10) {
        if (e10 instanceof E.b) {
            E.b bVar = (E.b) e10;
            cVar.R(H.h.a(bVar.b().f(), bVar.b().i()), n.a(bVar.b().j(), bVar.b().e()));
            return;
        }
        if (e10 instanceof E.a) {
            cVar.O(((E.a) e10).b());
            return;
        }
        if (e10 instanceof E.c) {
            E.c cVar2 = (E.c) e10;
            if (cVar2.c() != null) {
                cVar.O(cVar2.c());
            } else {
                H.k kVarB = cVar2.b();
                cVar.W(H.h.a(kVarB.e(), kVarB.g()), n.a(kVarB.j(), kVarB.d()), H.a.d(kVarB.b()));
            }
        }
    }
}
