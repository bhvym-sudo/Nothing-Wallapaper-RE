package F8;

/* JADX INFO: renamed from: F8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0822l extends p129m8.e {

    /* JADX INFO: renamed from: F8.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC0822l interfaceC0822l, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC0822l.o(th);
        }
    }

    boolean a();

    void i(p219v8.l lVar);

    void k(Object obj, p219v8.l lVar);

    void m(Object obj, p219v8.q qVar);

    boolean o(Throwable th);

    void q(I i10, Object obj);

    Object r(Object obj, Object obj2, p219v8.q qVar);

    void t(Object obj);
}
