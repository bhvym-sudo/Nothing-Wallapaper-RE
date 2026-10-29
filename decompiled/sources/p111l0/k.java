package p111l0;

import p121m0.a;
import p121m0.b;

/* JADX INFO: loaded from: classes.dex */
public interface k {
    float A();

    default float l(long j9) {
        a aVarB;
        if (!w.g(u.g(j9), w.f22847b.b())) {
            l.b("Only Sp can convert to Px");
        }
        b bVar = b.f23088a;
        if (bVar.f(A()) && (aVarB = bVar.b(A())) != null) {
            return h.d(aVarB.a(u.h(j9)));
        }
        return h.d(u.h(j9) * A());
    }
}
