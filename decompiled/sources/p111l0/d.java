package p111l0;

import H.m;
import H.n;

/* JADX INFO: loaded from: classes.dex */
public interface d extends k {
    default float D(float f10) {
        return f10 * getDensity();
    }

    default long J(long j9) {
        return j9 != 9205357640488583168L ? n.a(D(j.d(j9)), D(j.c(j9))) : m.f2308a.a();
    }

    default float L(long j9) {
        if (w.g(u.g(j9), w.f22847b.b())) {
            return D(l(j9));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    float getDensity();
}
