package p170r;

import p129m8.e;
import p129m8.i;
import p219v8.l;

/* JADX INFO: renamed from: r.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1671b0 {
    public static final InterfaceC1669a0 a(i iVar) {
        InterfaceC1669a0 interfaceC1669a0 = (InterfaceC1669a0) iVar.b(InterfaceC1669a0.f25429n);
        if (interfaceC1669a0 != null) {
            return interfaceC1669a0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(l lVar, e eVar) {
        return a(eVar.getContext()).u(lVar, eVar);
    }
}
