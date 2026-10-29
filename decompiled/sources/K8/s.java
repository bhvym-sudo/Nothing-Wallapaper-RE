package K8;

import F8.H0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f4192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H0 f4193b;

    static {
        s sVar = new s();
        f4192a = sVar;
        E.f("kotlinx.coroutines.fast.service.loader", true);
        f4193b = sVar.a();
    }

    private s() {
    }

    private final H0 a() {
        Object next;
        H0 h0E;
        try {
            List listC = D8.k.C(D8.k.e(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((r) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (h0E = t.e(rVar, listC)) != null) {
                return h0E;
            }
            t.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            t.b(th, null, 2, null);
            return null;
        }
    }
}
