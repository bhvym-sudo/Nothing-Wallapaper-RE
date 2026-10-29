package Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final boolean a(t tVar) {
        return !tVar.i() && tVar.g();
    }

    public static final boolean b(t tVar) {
        return tVar.i() && !tVar.g();
    }

    public static final boolean c(t tVar, long j9) {
        long jF = tVar.f();
        float fK = H.g.k(jF);
        float fL = H.g.l(jF);
        return fK < 0.0f || fK > ((float) p111l0.q.e(j9)) || fL < 0.0f || fL > ((float) p111l0.q.d(j9));
    }

    private static final long d(t tVar, boolean z9) {
        return (z9 || !tVar.k()) ? H.g.o(tVar.f(), tVar.h()) : H.g.f2287b.c();
    }

    public static final boolean e(t tVar) {
        return !H.g.i(d(tVar, true), H.g.f2287b.c());
    }
}
