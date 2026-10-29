package F8;

import K8.AbstractC0916i;
import K8.C0915h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1 {
    public static final Object a(p129m8.e eVar) {
        Object objE;
        p129m8.i context = eVar.getContext();
        A0.j(context);
        p129m8.e eVarC = p139n8.b.c(eVar);
        C0915h c0915h = eVarC instanceof C0915h ? (C0915h) eVarC : null;
        if (c0915h == null) {
            objE = p079h8.A.f21846a;
        } else {
            if (AbstractC0916i.d(c0915h.f4163t, context)) {
                c0915h.n(context, p079h8.A.f21846a);
            } else {
                d1 d1Var = new d1();
                p129m8.i iVarZ = context.z(d1Var);
                p079h8.A a10 = p079h8.A.f21846a;
                c0915h.n(iVarZ, a10);
                objE = (!d1Var.f1860r || AbstractC0916i.e(c0915h)) ? p139n8.b.e() : a10;
            }
            objE = p139n8.b.e();
        }
        if (objE == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objE == p139n8.b.e() ? objE : p079h8.A.f21846a;
    }
}
