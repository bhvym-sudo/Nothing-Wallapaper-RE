package F8;

import K8.C0915h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(p129m8.e eVar) {
        Object objB;
        if (eVar instanceof C0915h) {
            return ((C0915h) eVar).toString();
        }
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.d(objB) != null) {
            objB = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) objB;
    }
}
