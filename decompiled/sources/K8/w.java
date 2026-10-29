package K8;

import p079h8.AbstractC1388c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static final void a(p219v8.l lVar, Object obj, p129m8.i iVar) {
        P pB = b(lVar, obj, null);
        if (pB != null) {
            F8.K.a(iVar, pB);
        }
    }

    public static final P b(p219v8.l lVar, Object obj, P p9) {
        try {
            lVar.f(obj);
            return p9;
        } catch (Throwable th) {
            if (p9 != null && p9.getCause() != th) {
                AbstractC1388c.a(p9, th);
                return p9;
            }
            return new P("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ P c(p219v8.l lVar, Object obj, P p9, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            p9 = null;
        }
        return b(lVar, obj, p9);
    }
}
