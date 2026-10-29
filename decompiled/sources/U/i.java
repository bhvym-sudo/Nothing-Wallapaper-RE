package U;

/* JADX INFO: loaded from: classes.dex */
public interface i {
    static /* synthetic */ H.i z(i iVar, i iVar2, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        return iVar.F(iVar2, z9);
    }

    i B();

    long C(i iVar, long j9);

    H.i F(i iVar, boolean z9);

    long I(i iVar, long j9, boolean z9);

    long N(long j9);

    long f(long j9);

    boolean t();

    long v();
}
