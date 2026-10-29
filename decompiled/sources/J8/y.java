package J8;

import F8.InterfaceC0846x0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final void b(final v vVar, p129m8.i iVar) {
        if (((Number) iVar.U0(0, new p219v8.p() { // from class: J8.x
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(y.c(vVar, ((Integer) obj).intValue(), (m8.i.b) obj2));
            }
        })).intValue() == vVar.f3961s) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f3960r + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(v vVar, int i10, m8.i.b bVar) {
        m8.i.c key = bVar.getKey();
        m8.i.b bVarB = vVar.f3960r.b(key);
        if (key != InterfaceC0846x0.f1901e) {
            if (bVar != bVarB) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) bVarB;
        kotlin.jvm.internal.n.f(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC0846x0 interfaceC0846x0D = d((InterfaceC0846x0) bVar, interfaceC0846x0);
        if (interfaceC0846x0D == interfaceC0846x0) {
            return interfaceC0846x0 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0846x0D + ", expected child of " + interfaceC0846x0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final InterfaceC0846x0 d(InterfaceC0846x0 interfaceC0846x0, InterfaceC0846x0 interfaceC0846x1) {
        while (interfaceC0846x0 != null) {
            if (interfaceC0846x0 == interfaceC0846x1 || !(interfaceC0846x0 instanceof K8.z)) {
                return interfaceC0846x0;
            }
            interfaceC0846x0 = ((K8.z) interfaceC0846x0).Z();
        }
        return null;
    }
}
