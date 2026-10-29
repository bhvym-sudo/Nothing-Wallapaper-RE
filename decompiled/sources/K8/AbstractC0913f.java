package K8;

import java.util.Iterator;
import p079h8.AbstractC1388c;

/* JADX INFO: renamed from: K8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0913f {
    public static final void a(p129m8.i iVar, Throwable th) {
        Iterator it = AbstractC0912e.a().iterator();
        while (it.hasNext()) {
            try {
                ((F8.J) it.next()).b0(iVar, th);
            } catch (Throwable th2) {
                AbstractC0912e.b(F8.K.b(th, th2));
            }
        }
        try {
            AbstractC1388c.a(th, new C0914g(iVar));
        } catch (Throwable unused) {
        }
        AbstractC0912e.b(th);
    }
}
