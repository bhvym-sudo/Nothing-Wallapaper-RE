package F8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: F8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0816i {
    public static final T a(L l9, p129m8.i iVar, N n9, p219v8.p pVar) {
        p129m8.i iVarJ = G.j(l9, iVar);
        U f10 = n9.f() ? new F0(iVarJ, pVar) : new U(iVarJ, true);
        f10.W0(n9, f10, pVar);
        return f10;
    }

    public static /* synthetic */ T b(L l9, p129m8.i iVar, N n9, p219v8.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        if ((i10 & 2) != 0) {
            n9 = N.DEFAULT;
        }
        return AbstractC0812g.a(l9, iVar, n9, pVar);
    }

    public static final InterfaceC0846x0 c(L l9, p129m8.i iVar, N n9, p219v8.p pVar) {
        p129m8.i iVarJ = G.j(l9, iVar);
        Q0 g10 = n9.f() ? new G0(iVarJ, pVar) : new Q0(iVarJ, true);
        g10.W0(n9, g10, pVar);
        return g10;
    }

    public static /* synthetic */ InterfaceC0846x0 d(L l9, p129m8.i iVar, N n9, p219v8.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        if ((i10 & 2) != 0) {
            n9 = N.DEFAULT;
        }
        return AbstractC0812g.c(l9, iVar, n9, pVar);
    }

    public static final Object e(p129m8.i iVar, p219v8.p pVar, p129m8.e eVar) {
        Object objZ0;
        p129m8.i context = eVar.getContext();
        p129m8.i iVarK = G.k(context, iVar);
        A0.j(iVarK);
        if (iVarK == context) {
            K8.z zVar = new K8.z(iVarK, eVar);
            objZ0 = L8.b.b(zVar, zVar, pVar);
        } else {
            m8.f.b bVar = p129m8.f.f23250l;
            if (kotlin.jvm.internal.n.d(iVarK.b(bVar), context.b(bVar))) {
                a1 a1Var = new a1(iVarK, eVar);
                p129m8.i context2 = a1Var.getContext();
                Object objI = K8.K.i(context2, null);
                try {
                    Object objB = L8.b.b(a1Var, a1Var, pVar);
                    K8.K.f(context2, objI);
                    objZ0 = objB;
                } catch (Throwable th) {
                    K8.K.f(context2, objI);
                    throw th;
                }
            } else {
                Y y9 = new Y(iVarK, eVar);
                L8.a.c(pVar, y9, y9);
                objZ0 = y9.Z0();
            }
        }
        if (objZ0 == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objZ0;
    }
}
