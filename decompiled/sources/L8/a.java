package L8;

import F8.X;
import K8.AbstractC0916i;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private static final void a(e eVar, Throwable th) throws Throwable {
        if (th instanceof X) {
            th = ((X) th).getCause();
        }
        q.a aVar = q.f21862r;
        eVar.resumeWith(q.b(r.a(th)));
        throw th;
    }

    public static final void b(e eVar, e eVar2) throws Throwable {
        try {
            e eVarC = p139n8.b.c(eVar);
            q.a aVar = q.f21862r;
            AbstractC0916i.b(eVarC, q.b(A.f21846a));
        } catch (Throwable th) {
            a(eVar2, th);
        }
    }

    public static final void c(p pVar, Object obj, e eVar) {
        try {
            e eVarC = p139n8.b.c(p139n8.b.a(pVar, obj, eVar));
            q.a aVar = q.f21862r;
            AbstractC0916i.b(eVarC, q.b(A.f21846a));
        } catch (Throwable th) {
            a(eVar, th);
        }
    }
}
