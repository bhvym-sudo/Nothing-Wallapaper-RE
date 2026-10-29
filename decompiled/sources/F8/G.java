package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G {
    private static final p129m8.i d(p129m8.i iVar, p129m8.i iVar2, final boolean z9) {
        boolean zH = h(iVar);
        boolean zH2 = h(iVar2);
        if (!zH && !zH2) {
            return iVar.z(iVar2);
        }
        final kotlin.jvm.internal.E e10 = new kotlin.jvm.internal.E();
        e10.f22779q = iVar2;
        p129m8.j jVar = p129m8.j.f23252q;
        p129m8.i iVar3 = (p129m8.i) iVar.U0(jVar, new p219v8.p() { // from class: F8.E
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return G.e(e10, z9, (p129m8.i) obj, (m8.i.b) obj2);
            }
        });
        if (zH2) {
            e10.f22779q = ((p129m8.i) e10.f22779q).U0(jVar, new p219v8.p() { // from class: F8.F
                @Override // p219v8.p
                public final Object invoke(Object obj, Object obj2) {
                    return G.f((p129m8.i) obj, (m8.i.b) obj2);
                }
            });
        }
        return iVar3.z((p129m8.i) e10.f22779q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p129m8.i e(kotlin.jvm.internal.E e10, boolean z9, p129m8.i iVar, m8.i.b bVar) {
        return iVar.z(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p129m8.i f(p129m8.i iVar, m8.i.b bVar) {
        return iVar.z(bVar);
    }

    public static final String g(p129m8.i iVar) {
        return null;
    }

    private static final boolean h(p129m8.i iVar) {
        return ((Boolean) iVar.U0(Boolean.FALSE, new p219v8.p() { // from class: F8.D
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(G.i(((Boolean) obj).booleanValue(), (m8.i.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z9, m8.i.b bVar) {
        return z9;
    }

    public static final p129m8.i j(L l9, p129m8.i iVar) {
        p129m8.i iVarD = d(l9.w0(), iVar, true);
        return (iVarD == C0803b0.a() || iVarD.b(p129m8.f.f23250l) != null) ? iVarD : iVarD.z(C0803b0.a());
    }

    public static final p129m8.i k(p129m8.i iVar, p129m8.i iVar2) {
        return !h(iVar2) ? iVar.z(iVar2) : d(iVar, iVar2, false);
    }

    public static final a1 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Y) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof a1) {
                return (a1) eVar;
            }
        }
        return null;
    }

    public static final a1 m(p129m8.e eVar, p129m8.i iVar, Object obj) {
        if (!(eVar instanceof kotlin.coroutines.jvm.internal.e) || iVar.b(b1.f1856q) == null) {
            return null;
        }
        a1 a1VarL = l((kotlin.coroutines.jvm.internal.e) eVar);
        if (a1VarL != null) {
            a1VarL.b1(iVar, obj);
        }
        return a1VarL;
    }
}
