package J8;

import I8.InterfaceC0881g;
import K8.K;
import kotlin.jvm.internal.I;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final Object b(p129m8.i iVar, Object obj, Object obj2, p219v8.p pVar, p129m8.e eVar) {
        Object objI = K.i(iVar, obj2);
        try {
            A a10 = new A(eVar, iVar);
            Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? p139n8.b.d(pVar, obj, a10) : ((p219v8.p) I.d(pVar, 2)).invoke(obj, a10);
            K.f(iVar, objI);
            if (objD == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objD;
        } catch (Throwable th) {
            K.f(iVar, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(p129m8.i iVar, Object obj, Object obj2, p219v8.p pVar, p129m8.e eVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = K.g(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0881g d(InterfaceC0881g interfaceC0881g, p129m8.i iVar) {
        return ((interfaceC0881g instanceof z) || (interfaceC0881g instanceof s)) ? interfaceC0881g : new C(interfaceC0881g, iVar);
    }
}
