package W;

/* JADX INFO: renamed from: W.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(J j9, U.a aVar) {
        J jL0 = j9.l0();
        if (!(jL0 != null)) {
            T.a.b("Child of " + j9 + " cannot be null when calculating alignment line");
        }
        if (j9.p0().a().containsKey(aVar)) {
            Integer num = (Integer) j9.p0().a().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iK0 = jL0.k0(aVar);
        if (iK0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        jL0.D0(true);
        j9.C0(true);
        j9.B0();
        jL0.D0(false);
        j9.C0(false);
        return iK0 + (aVar instanceof U.g ? p111l0.m.e(jL0.s0()) : p111l0.m.d(jL0.s0()));
    }
}
